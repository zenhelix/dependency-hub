@file:Suppress("UnstableApiUsage")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "dependency-hub"

project("multiplatform-client") {
    project("multiplatform-client-android-platform") {
        include("multiplatform-client-android-bom")
        include("multiplatform-client-android-toml")
    }
    project("multiplatform-client-ios-platform") {
        include("multiplatform-client-ios-bom")
        include("multiplatform-client-ios-toml")
    }
    project("multiplatform-client-web-platform") {
        include("multiplatform-client-web-bom")
        include("multiplatform-client-web-toml")
    }
    project("multiplatform-client-desktop-platform") {
        include("multiplatform-client-desktop-bom")
        include("multiplatform-client-desktop-toml")
    }
    project("multiplatform-client-platform") {
        include("multiplatform-client-bom")
        include("multiplatform-client-toml")
    }
}

project("server-jvm-platform") {
    project("spring-jvm-platform") {
        include("spring-jvm8-bom")
        include("spring-jvm8-toml")
        include("spring-jvm8-plugin-toml")

        include("spring-jvm11-bom")
        include("spring-jvm11-toml")
        include("spring-jvm11-plugin-toml")

        include("spring-jvm17-bom")
        include("spring-jvm17-toml")
        include("spring-jvm17-plugin-toml")

        include("spring-jvm21-bom")
        include("spring-jvm21-toml")
        include("spring-jvm21-plugin-toml")
    }
}

project("gradle-plugins-platform") {
    include("gradle-plugins-bom")
    include("gradle-plugins-toml")
}

project("gradle-plugins-dev-platform") {
    include("gradle-plugins-dev-bom")
    include("gradle-plugins-dev-toml")
}

private fun Settings.project(
    baseProject: String, initializer: IncludeContext.() -> Unit = {}
): IncludeContext = IncludeContext(baseProject, this).apply(initializer)

private class IncludeContext(private val baseProject: String, private val delegate: Settings) {

    fun project(
        baseProject: String, initializer: IncludeContext.() -> Unit = {}
    ): IncludeContext = IncludeContext("${this.baseProject}:$baseProject", this.delegate).apply(initializer)

    fun include(vararg project: String) {
        project.forEach {
            delegate.include("$baseProject:$it")
        }
    }

}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        mavenLocal()
    }

    versionCatalogs {
        create("coreLibs") {
            from(files("gradle/versions/core.versions.toml"))
        }

        create("kotlinLibs") {
            from(files("gradle/versions/kotlin.versions.toml"))
        }

        create("springLibs") {
            from(files("gradle/versions/spring.versions.toml"))
        }

        create("androidLibs") {
            from(files("gradle/versions/android.versions.toml"))
        }

        create("testingLibs") {
            from(files("gradle/versions/testing.versions.toml"))
        }

        create("gradlePlugins") {
            from(files("gradle/versions/plugins.versions.toml"))
        }
    }
}

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
    }

    plugins {
        id("io.github.zenhelix.maven-central-publish") version "0.5.0"
    }
}

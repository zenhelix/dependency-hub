@file:Suppress("UnstableApiUsage")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "dependency-hub"

project("client-platform") {
    project("multiplatform-client") {
        project("multiplatform-client-all-platform") {
            include("multiplatform-client-all-bom")
            include("multiplatform-client-all-toml")
        }
        project("multiplatform-client-android-platform") {
            include("multiplatform-client-android-bom")
            include("multiplatform-client-android-toml")
        }
        project("multiplatform-client-ios-platform") {
            include("multiplatform-client-ios-bom")
            include("multiplatform-client-ios-toml")
        }
        project("multiplatform-client-js-platform") {
            include("multiplatform-client-js-bom")
            include("multiplatform-client-js-toml")
        }
        project("multiplatform-client-wasm-platform") {
            include("multiplatform-client-wasm-bom")
            include("multiplatform-client-wasm-toml")
        }
        project("multiplatform-client-desktop-platform") {
            include("multiplatform-client-desktop-bom")
            include("multiplatform-client-desktop-toml")
        }
    }
}

project("backend-platform") {
    project("spring-jvm-platform") {
        project("spring-jvm8") {
            include("spring-jvm8-bom")
            include("spring-jvm8-toml")
        }

        project("spring-jvm11") {
            include("spring-jvm11-bom")
            include("spring-jvm11-toml")
        }

        project("spring-jvm17") {
            include("spring-jvm17-bom")
            include("spring-jvm17-toml")
        }

        project("spring-jvm21") {
            include("spring-jvm21-bom")
            include("spring-jvm21-toml")
        }
    }
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
        create("kmmClientAll") {
            from(files("gradle/versions/client/kmm-client-all.versions.toml"))
        }
        create("kmmClientAndroid") {
            from(files("gradle/versions/client/kmm-client-android.versions.toml"))
        }
        create("kmmClientDesktop") {
            from(files("gradle/versions/client/kmm-client-desktop.versions.toml"))
        }
        create("kmmClientIos") {
            from(files("gradle/versions/client/kmm-client-ios.versions.toml"))
        }
        create("kmmClientWeb") {
            from(files("gradle/versions/client/kmm-client-web.versions.toml"))
        }

        create("backendSpring5") {
            from(files("gradle/versions/backend/backend-spring5.versions.toml"))
        }
        create("backendSpring") {
            from(files("gradle/versions/backend/backend-spring.versions.toml"))
        }
        create("gradlePluginsDevelopment") {
            from(files("gradle/versions/plugin/gradle-plugins-development.versions.toml"))
        }
    }
}

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
    }

    plugins {
        id("io.github.zenhelix.maven-central-publish") version "0.7.0"
    }
}

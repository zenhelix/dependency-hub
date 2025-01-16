@file:Suppress("UnstableApiUsage")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "dependency-hub"

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

project("server-jvm-platform") {
    include("server-jvm-bom")
    include("server-jvm-toml")
}

project("multiplatform-client-platform") {
    include("multiplatform-client-bom")
    include("multiplatform-client-toml")
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
}

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
    }

    plugins {
        id("io.github.zenhelix.maven-central-publish") version "0.3.0"
    }
}

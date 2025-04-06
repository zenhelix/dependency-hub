catalog {
    versionCatalog {
        library(
            "kotlin-jvm-gradle-plugin",
            "org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:${gradlePluginsDevelopment.versions.kotlin.asProvider().get()}"
        )
        library(
            "compose-compiler-gradle-plugin",
            "org.jetbrains.kotlin:compose-compiler-gradle-plugin:${gradlePluginsDevelopment.versions.kotlin.asProvider().get()}"
        )
        library("kotlin-gradle-plugin", "org.jetbrains.kotlin:kotlin-gradle-plugin:${gradlePluginsDevelopment.versions.kotlin.asProvider().get()}")
        library("kotlin-allopen-gradle-plugin", "org.jetbrains.kotlin:kotlin-allopen:${gradlePluginsDevelopment.versions.kotlin.asProvider().get()}")
        library("kotlin-noarg-gradle-plugin", "org.jetbrains.kotlin:kotlin-noarg:${gradlePluginsDevelopment.versions.kotlin.asProvider().get()}")
        library("kotlin-lombok-gradle-plugin", "org.jetbrains.kotlin:kotlin-lombok:${gradlePluginsDevelopment.versions.kotlin.asProvider().get()}")

        library("lombok-gradle-plugin", "io.freefair.gradle:lombok-plugin:${gradlePluginsDevelopment.versions.lombok.get()}")

        library(
            "spring-boot-gradle-plugin",
            "org.springframework.boot:spring-boot-gradle-plugin:${gradlePluginsDevelopment.versions.spring.boot.get()}"
        )
        library(
            "compose-gradle-plugin",
            "org.jetbrains.compose:compose-gradle-plugin:${gradlePluginsDevelopment.versions.kotlin.compose.plugin.get()}"
        )
        library(
            "android-tools-gradle-plugin",
            "com.android.tools.build:gradle:${gradlePluginsDevelopment.versions.androidGradlePlugin.get()}"
        )
        library("assertj-bom", gradlePluginsDevelopment.assertj.bom.get().toString())
        library("jackson-bom", gradlePluginsDevelopment.jackson.bom.get().toString())

        gradlePluginsDevelopment.plugins.kotlin.jvm.get().also {
            plugin("kotlin-jvm", it.pluginId).version(it.version.toString())
        }
    }
}

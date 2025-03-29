catalog {
    versionCatalog {
        library(
            "kotlin-jvm-gradle-plugin",
            "org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:${libs.versions.kotlin.asProvider().get()}"
        )
        library(
            "compose-compiler-gradle-plugin",
            "org.jetbrains.kotlin:compose-compiler-gradle-plugin:${libs.versions.kotlin.asProvider().get()}"
        )
        library("kotlin-gradle-plugin", "org.jetbrains.kotlin:kotlin-gradle-plugin:${libs.versions.kotlin.asProvider().get()}")
        library("kotlin-allopen-gradle-plugin", "org.jetbrains.kotlin:kotlin-allopen:${libs.versions.kotlin.asProvider().get()}")
        library("kotlin-noarg-gradle-plugin", "org.jetbrains.kotlin:kotlin-noarg:${libs.versions.kotlin.asProvider().get()}")
        library("kotlin-lombok-gradle-plugin", "org.jetbrains.kotlin:kotlin-lombok:${libs.versions.kotlin.asProvider().get()}")

        library("lombok-gradle-plugin", "io.freefair.gradle:lombok-plugin:${libs.versions.lombok.get()}")

        library(
            "spring-boot-gradle-plugin",
            "org.springframework.boot:spring-boot-gradle-plugin:${libs.versions.spring.boot.get()}"
        )
        library(
            "compose-gradle-plugin",
            "org.jetbrains.compose:compose-gradle-plugin:${libs.versions.kotlin.compose.plugin.get()}"
        )
        library(
            "android-tools-gradle-plugin",
            "com.android.tools.build:gradle:${libs.versions.androidGradlePlugin.get()}"
        )

        libs.plugins.kotlin.jvm.asProvider().get().also {
            plugin("kotlin-jvm", it.pluginId).version(it.version.toString())
        }
    }
}

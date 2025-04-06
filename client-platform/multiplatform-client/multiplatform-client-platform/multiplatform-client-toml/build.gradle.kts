catalog {
    versionCatalog {
        library("kotlin-bom", kmmClient.kotlin.bom.get().toString())
        library("kotlinx-serialization-bom", kmmClient.kotlinx.serialization.bom.get().toString())
        library("kotlinx-coroutines-bom", kmmClient.kotlinx.coroutines.bom.get().toString())
        library("androidx-compose-bom", kmmClient.androidx.compose.bom.get().toString())
        library("koin-bom", kmmClient.koin.bom.get().toString())
        library("slf4j-bom", kmmClient.slf4j.bom.get().toString())

        library("kotlin-test", "org.jetbrains.kotlin", "kotlin-test").withoutVersion()
        library("kotlinx-datetime", kmmClient.kotlinx.datetime.get().toString())
        library("kotlin-logging", kmmClient.kotlin.logging.get().toString())
        library("logback-classic", kmmClient.logback.classic.get().toString())
        library("slf4j-api", "org.slf4j", "slf4j-api").version(kmmClient.versions.slf4j.get())

        library("androidx-activity-compose", kmmClient.androidx.activity.compose.get().toString())
        library("androidx-window", kmmClient.androidx.window.asProvider().get().toString())
        library("androidx-window-core", kmmClient.androidx.window.core.get().toString())

        library("kotlin-window-core", kmmClient.kotlin.window.core.get().toString())

        library("kotlin-compose-adaptive", kmmClient.kotlin.compose.adaptive.asProvider().get().toString())
        library("kotlin-compose-adaptive-layout", kmmClient.kotlin.compose.adaptive.layout.get().toString())
        library("kotlin-compose-adaptive-navigation", kmmClient.kotlin.compose.adaptive.navigation.asProvider().get().toString())

        library("kotlin-compose-adaptive-navigation-suite", kmmClient.kotlin.compose.adaptive.navigation.suite.get().toString())

        library("kotlin-navigation-runtime", kmmClient.kotlin.navigation.runtime.get().toString())
        library("kotlin-navigation-common", kmmClient.kotlin.navigation.common.get().toString())
        library("kotlin-navigation-compose", kmmClient.kotlin.navigation.compose.get().toString())

        library(
            "kotlinx-coroutines-core",
            "org.jetbrains.kotlinx", "kotlinx-coroutines-core"
        ).withoutVersion()
        library(
            "kotlinx-coroutines-android",
            "org.jetbrains.kotlinx", "kotlinx-coroutines-android"
        ).withoutVersion()
        library(
            "kotlinx-coroutines-swing",
            "org.jetbrains.kotlinx", "kotlinx-coroutines-swing"
        ).withoutVersion()
        library(
            "kotlinx-coroutines-test",
            "org.jetbrains.kotlinx", "kotlinx-coroutines-test"
        ).withoutVersion()

        library("koin-core", "io.insert-koin", "koin-core").withoutVersion()
        library("koin-compose", "io.insert-koin", "koin-compose").withoutVersion()
        library("koin-android", "io.insert-koin", "koin-android").withoutVersion()
        library("koin-androidx-compose", "io.insert-koin", "koin-androidx-compose").withoutVersion()
        library("koin-test", "io.insert-koin", "koin-test").withoutVersion()

        library("sqldelight-driver-sqlite", kmmClient.sqldelight.driver.sqlite.get().toString())
        library("sqldelight-driver-android", kmmClient.sqldelight.driver.android.get().toString())
        library("sqldelight-driver-native", kmmClient.sqldelight.driver.native.get().toString())
        library("sqldelight-driver-web.worker", kmmClient.sqldelight.driver.web.worker.get().toString())
        library("sqldelight-runtime", kmmClient.sqldelight.runtime.get().toString())
        library("sqldelight-primitive-adapters", kmmClient.sqldelight.primitive.adapters.get().toString())
        library("sqldelight-extensions-coroutine", kmmClient.sqldelight.extensions.coroutine.get().toString())

        library("voyager-navigator", kmmClient.voyager.navigator.get().toString())
        library("voyager-screenModel", kmmClient.voyager.screenModel.get().toString())
        library("voyager-bottomSheetNavigator", kmmClient.voyager.bottomSheetNavigator.get().toString())
        library("voyager-tabNavigator", kmmClient.voyager.tabNavigator.get().toString())
        library("voyager-transitions", kmmClient.voyager.transitions.get().toString())
        library("voyager-koin", kmmClient.voyager.koin.get().toString())

        kmmClient.plugins.kotlin.compose.compiler.get().also {
            plugin("kotlin-compose-compiler", it.pluginId).version(it.version.toString())
        }
        kmmClient.plugins.kotlin.multiplatform.get().also {
            plugin("kotlin-multiplatform", it.pluginId).version(it.version.toString())
        }
        kmmClient.plugins.kotlin.serialization.get().also {
            plugin("kotlin-serialization", it.pluginId).version(it.version.toString())
        }
        kmmClient.plugins.kotlin.cocoapods.get().also {
            plugin("kotlin-cocoapods", it.pluginId).version(it.version.toString())
        }
        kmmClient.plugins.compose.get().also {
            plugin("compose", it.pluginId).version(it.version.toString())
        }
        kmmClient.plugins.android.application.get().also {
            plugin("android-application", it.pluginId).version(it.version.toString())
        }
        kmmClient.plugins.android.library.get().also {
            plugin("android-library", it.pluginId).version(it.version.toString())
        }
        kmmClient.plugins.sqldelight.get().also {
            plugin("sqldelight", it.pluginId).version(it.version.toString())
        }
    }
}

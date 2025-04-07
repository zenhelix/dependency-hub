catalog {
    versionCatalog {
        library("kotlin-bom", kmmClientAll.kotlin.bom.get().toString())
        library("kotlinx-serialization-bom", kmmClientAll.kotlinx.serialization.bom.get().toString())
        library("kotlinx-coroutines-bom", kmmClientAll.kotlinx.coroutines.bom.get().toString())
        library("androidx-compose-bom", kmmClientAll.androidx.compose.bom.get().toString())
        library("koin-bom", kmmClientAll.koin.bom.get().toString())

        library("kotlin-test", "org.jetbrains.kotlin", "kotlin-test").withoutVersion()
        library("kotlinx-datetime", kmmClientAll.kotlinx.datetime.get().toString())
        library("kotlin-logging", kmmClientAll.kotlin.logging.get().toString())

        library("androidx-activity-compose", kmmClientAll.androidx.activity.compose.get().toString())
        library("androidx-window", kmmClientAll.androidx.window.asProvider().get().toString())
        library("androidx-window-core", kmmClientAll.androidx.window.core.get().toString())

        library("kotlin-window-core", kmmClientAll.kotlin.window.core.get().toString())

        library("kotlin-compose-adaptive", kmmClientAll.kotlin.compose.adaptive.asProvider().get().toString())
        library("kotlin-compose-adaptive-layout", kmmClientAll.kotlin.compose.adaptive.layout.get().toString())
        library("kotlin-compose-adaptive-navigation", kmmClientAll.kotlin.compose.adaptive.navigation.asProvider().get().toString())

        library("kotlin-compose-adaptive-navigation-suite", kmmClientAll.kotlin.compose.adaptive.navigation.suite.get().toString())

        library("kotlin-navigation-runtime", kmmClientAll.kotlin.navigation.runtime.get().toString())
        library("kotlin-navigation-common", kmmClientAll.kotlin.navigation.common.get().toString())
        library("kotlin-navigation-compose", kmmClientAll.kotlin.navigation.compose.get().toString())

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

        library("sqldelight-driver-sqlite", kmmClientAll.sqldelight.driver.sqlite.get().toString())
        library("sqldelight-driver-android", kmmClientAll.sqldelight.driver.android.get().toString())
        library("sqldelight-driver-native", kmmClientAll.sqldelight.driver.native.get().toString())
        library("sqldelight-driver-web.worker", kmmClientAll.sqldelight.driver.web.worker.get().toString())
        library("sqldelight-runtime", kmmClientAll.sqldelight.runtime.get().toString())
        library("sqldelight-primitive-adapters", kmmClientAll.sqldelight.primitive.adapters.get().toString())
        library("sqldelight-extensions-coroutine", kmmClientAll.sqldelight.extensions.coroutine.get().toString())

        library("voyager-navigator", kmmClientAll.voyager.navigator.get().toString())
        library("voyager-screenModel", kmmClientAll.voyager.screenModel.get().toString())
        library("voyager-bottomSheetNavigator", kmmClientAll.voyager.bottomSheetNavigator.get().toString())
        library("voyager-tabNavigator", kmmClientAll.voyager.tabNavigator.get().toString())
        library("voyager-transitions", kmmClientAll.voyager.transitions.get().toString())
        library("voyager-koin", kmmClientAll.voyager.koin.get().toString())

        kmmClientAll.plugins.kotlin.compose.compiler.get().also {
            plugin("kotlin-compose-compiler", it.pluginId).version(it.version.toString())
        }
        kmmClientAll.plugins.kotlin.multiplatform.get().also {
            plugin("kotlin-multiplatform", it.pluginId).version(it.version.toString())
        }
        kmmClientAll.plugins.kotlin.serialization.get().also {
            plugin("kotlin-serialization", it.pluginId).version(it.version.toString())
        }
        kmmClientAll.plugins.kotlin.cocoapods.get().also {
            plugin("kotlin-cocoapods", it.pluginId).version(it.version.toString())
        }
        kmmClientAll.plugins.compose.get().also {
            plugin("compose", it.pluginId).version(it.version.toString())
        }
        kmmClientAll.plugins.android.application.get().also {
            plugin("android-application", it.pluginId).version(it.version.toString())
        }
        kmmClientAll.plugins.android.library.get().also {
            plugin("android-library", it.pluginId).version(it.version.toString())
        }
        kmmClientAll.plugins.sqldelight.get().also {
            plugin("sqldelight", it.pluginId).version(it.version.toString())
        }
    }
}

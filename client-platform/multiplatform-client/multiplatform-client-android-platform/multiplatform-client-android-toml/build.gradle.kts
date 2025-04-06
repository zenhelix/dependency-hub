catalog {
    versionCatalog {
        library("kotlin-bom", kmmClientAndroid.kotlin.bom.get().toString())
        library("kotlinx-serialization-bom", kmmClientAndroid.kotlinx.serialization.bom.get().toString())
        library("kotlinx-coroutines-bom", kmmClientAndroid.kotlinx.coroutines.bom.get().toString())
        library("androidx-compose-bom", kmmClientAndroid.androidx.compose.bom.get().toString())
        library("koin-bom", kmmClientAndroid.koin.bom.get().toString())

        library("kotlin-test", "org.jetbrains.kotlin", "kotlin-test").withoutVersion()
        library("kotlinx-datetime", kmmClientAndroid.kotlinx.datetime.get().toString())
        library("kotlin-logging", kmmClientAndroid.kotlin.logging.get().toString())

        library("androidx-activity-compose", kmmClientAndroid.androidx.activity.compose.get().toString())

        library(
            "kotlinx-coroutines-core",
            "org.jetbrains.kotlinx", "kotlinx-coroutines-core"
        ).withoutVersion()
        library(
            "kotlinx-coroutines-android",
            "org.jetbrains.kotlinx", "kotlinx-coroutines-android"
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

        library("sqldelight-driver-sqlite", kmmClientAndroid.sqldelight.driver.sqlite.get().toString())
        library("sqldelight-driver-android", kmmClientAndroid.sqldelight.driver.android.get().toString())
        library("sqldelight-runtime", kmmClientAndroid.sqldelight.runtime.get().toString())
        library("sqldelight-primitive-adapters", kmmClientAndroid.sqldelight.primitive.adapters.get().toString())
        library("sqldelight-extensions-coroutine", kmmClientAndroid.sqldelight.extensions.coroutine.get().toString())

        library("voyager-navigator", kmmClientAndroid.voyager.navigator.get().toString())
        library("voyager-screenModel", kmmClientAndroid.voyager.screenModel.get().toString())
        library("voyager-bottomSheetNavigator", kmmClientAndroid.voyager.bottomSheetNavigator.get().toString())
        library("voyager-tabNavigator", kmmClientAndroid.voyager.tabNavigator.get().toString())
        library("voyager-transitions", kmmClientAndroid.voyager.transitions.get().toString())
        library("voyager-koin", kmmClientAndroid.voyager.koin.get().toString())

        kmmClientAndroid.plugins.kotlin.compose.compiler.get().also {
            plugin("kotlin-compose-compiler", it.pluginId).version(it.version.toString())
        }
        kmmClientAndroid.plugins.kotlin.multiplatform.get().also {
            plugin("kotlin-multiplatform", it.pluginId).version(it.version.toString())
        }
        kmmClientAndroid.plugins.kotlin.serialization.get().also {
            plugin("kotlin-serialization", it.pluginId).version(it.version.toString())
        }
        kmmClientAndroid.plugins.compose.get().also {
            plugin("compose", it.pluginId).version(it.version.toString())
        }
        kmmClientAndroid.plugins.android.application.get().also {
            plugin("android-application", it.pluginId).version(it.version.toString())
        }
        kmmClientAndroid.plugins.android.library.get().also {
            plugin("android-library", it.pluginId).version(it.version.toString())
        }
        kmmClientAndroid.plugins.sqldelight.get().also {
            plugin("sqldelight", it.pluginId).version(it.version.toString())
        }
    }
}

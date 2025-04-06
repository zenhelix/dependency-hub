catalog {
    versionCatalog {
        library("kotlin-bom", kmmClientIos.kotlin.bom.get().toString())
        library("kotlinx-serialization-bom", kmmClientIos.kotlinx.serialization.bom.get().toString())
        library("kotlinx-coroutines-bom", kmmClientIos.kotlinx.coroutines.bom.get().toString())
        library("koin-bom", kmmClientIos.koin.bom.get().toString())

        library("kotlin-test", "org.jetbrains.kotlin", "kotlin-test").withoutVersion()
        library("kotlinx-datetime", kmmClientIos.kotlinx.datetime.get().toString())
        library("kotlin-logging", kmmClientIos.kotlin.logging.get().toString())

        library(
            "kotlinx-coroutines-core",
            "org.jetbrains.kotlinx", "kotlinx-coroutines-core"
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
        library("koin-test", "io.insert-koin", "koin-test").withoutVersion()

        library("sqldelight-driver-sqlite", kmmClientIos.sqldelight.driver.sqlite.get().toString())
        library("sqldelight-driver-native", kmmClientIos.sqldelight.driver.native.get().toString())
        library("sqldelight-runtime", kmmClientIos.sqldelight.runtime.get().toString())
        library("sqldelight-primitive-adapters", kmmClientIos.sqldelight.primitive.adapters.get().toString())
        library("sqldelight-extensions-coroutine", kmmClientIos.sqldelight.extensions.coroutine.get().toString())

        library("voyager-navigator", kmmClientIos.voyager.navigator.get().toString())
        library("voyager-screenModel", kmmClientIos.voyager.screenModel.get().toString())
        library("voyager-bottomSheetNavigator", kmmClientIos.voyager.bottomSheetNavigator.get().toString())
        library("voyager-tabNavigator", kmmClientIos.voyager.tabNavigator.get().toString())
        library("voyager-transitions", kmmClientIos.voyager.transitions.get().toString())
        library("voyager-koin", kmmClientIos.voyager.koin.get().toString())

        kmmClientIos.plugins.kotlin.compose.compiler.get().also {
            plugin("kotlin-compose-compiler", it.pluginId).version(it.version.toString())
        }
        kmmClientIos.plugins.kotlin.multiplatform.get().also {
            plugin("kotlin-multiplatform", it.pluginId).version(it.version.toString())
        }
        kmmClientIos.plugins.kotlin.serialization.get().also {
            plugin("kotlin-serialization", it.pluginId).version(it.version.toString())
        }
        kmmClientIos.plugins.kotlin.cocoapods.get().also {
            plugin("kotlin-cocoapods", it.pluginId).version(it.version.toString())
        }
        kmmClientIos.plugins.compose.get().also {
            plugin("compose", it.pluginId).version(it.version.toString())
        }
        kmmClientIos.plugins.sqldelight.get().also {
            plugin("sqldelight", it.pluginId).version(it.version.toString())
        }
    }
}

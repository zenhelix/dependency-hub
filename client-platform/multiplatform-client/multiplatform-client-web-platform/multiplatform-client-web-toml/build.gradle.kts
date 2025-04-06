catalog {
    versionCatalog {
        library("kotlin-bom", kmmClientWeb.kotlin.bom.get().toString())
        library("kotlinx-serialization-bom", kmmClientWeb.kotlinx.serialization.bom.get().toString())
        library("kotlinx-coroutines-bom", kmmClientWeb.kotlinx.coroutines.bom.get().toString())
        library("koin-bom", kmmClientWeb.koin.bom.get().toString())

        library("kotlin-test", "org.jetbrains.kotlin", "kotlin-test").withoutVersion()
        library("kotlinx-datetime", kmmClientWeb.kotlinx.datetime.get().toString())
        library("kotlin-logging", kmmClientWeb.kotlin.logging.get().toString())

        library(
            "kotlinx-coroutines-core",
            "org.jetbrains.kotlinx", "kotlinx-coroutines-core"
        ).withoutVersion()
        library(
            "kotlinx-coroutines-test",
            "org.jetbrains.kotlinx", "kotlinx-coroutines-test"
        ).withoutVersion()

        library("koin-core", "io.insert-koin", "koin-core").withoutVersion()
        library("koin-compose", "io.insert-koin", "koin-compose").withoutVersion()
        library("koin-test", "io.insert-koin", "koin-test").withoutVersion()

        library("sqldelight-driver-sqlite", kmmClientWeb.sqldelight.driver.sqlite.get().toString())
        library("sqldelight-driver-web.worker", kmmClientWeb.sqldelight.driver.web.worker.get().toString())
        library("sqldelight-runtime", kmmClientWeb.sqldelight.runtime.get().toString())
        library("sqldelight-primitive-adapters", kmmClientWeb.sqldelight.primitive.adapters.get().toString())
        library("sqldelight-extensions-coroutine", kmmClientWeb.sqldelight.extensions.coroutine.get().toString())

        library("voyager-navigator", kmmClientWeb.voyager.navigator.get().toString())
        library("voyager-screenModel", kmmClientWeb.voyager.screenModel.get().toString())
        library("voyager-bottomSheetNavigator", kmmClientWeb.voyager.bottomSheetNavigator.get().toString())
        library("voyager-tabNavigator", kmmClientWeb.voyager.tabNavigator.get().toString())
        library("voyager-transitions", kmmClientWeb.voyager.transitions.get().toString())
        library("voyager-koin", kmmClientWeb.voyager.koin.get().toString())

        kmmClientWeb.plugins.kotlin.compose.compiler.get().also {
            plugin("kotlin-compose-compiler", it.pluginId).version(it.version.toString())
        }
        kmmClientWeb.plugins.kotlin.multiplatform.get().also {
            plugin("kotlin-multiplatform", it.pluginId).version(it.version.toString())
        }
        kmmClientWeb.plugins.kotlin.serialization.get().also {
            plugin("kotlin-serialization", it.pluginId).version(it.version.toString())
        }
        kmmClientWeb.plugins.compose.get().also {
            plugin("compose", it.pluginId).version(it.version.toString())
        }
        kmmClientWeb.plugins.sqldelight.get().also {
            plugin("sqldelight", it.pluginId).version(it.version.toString())
        }
    }
}

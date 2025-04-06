catalog {
    versionCatalog {
        library("kotlin-bom", kmmClientDesktop.kotlin.bom.get().toString())
        library("kotlinx-serialization-bom", kmmClientDesktop.kotlinx.serialization.bom.get().toString())
        library("kotlinx-coroutines-bom", kmmClientDesktop.kotlinx.coroutines.bom.get().toString())
        library("koin-bom", kmmClientDesktop.koin.bom.get().toString())
        library("slf4j-bom", kmmClientDesktop.slf4j.bom.get().toString())

        library("kotlin-test", "org.jetbrains.kotlin", "kotlin-test").withoutVersion()
        library("kotlinx-datetime", kmmClientDesktop.kotlinx.datetime.get().toString())
        library("kotlin-logging", kmmClientDesktop.kotlin.logging.get().toString())
        library("logback-classic", kmmClientDesktop.logback.classic.get().toString())
        library("slf4j-api", "org.slf4j", "slf4j-api").version(kmmClientDesktop.versions.slf4j.get())

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

        library("sqldelight-driver-sqlite", kmmClientDesktop.sqldelight.driver.sqlite.get().toString())
        library("sqldelight-runtime", kmmClientDesktop.sqldelight.runtime.get().toString())
        library("sqldelight-primitive-adapters", kmmClientDesktop.sqldelight.primitive.adapters.get().toString())
        library("sqldelight-extensions-coroutine", kmmClientDesktop.sqldelight.extensions.coroutine.get().toString())

        library("voyager-navigator", kmmClientDesktop.voyager.navigator.get().toString())
        library("voyager-screenModel", kmmClientDesktop.voyager.screenModel.get().toString())
        library("voyager-bottomSheetNavigator", kmmClientDesktop.voyager.bottomSheetNavigator.get().toString())
        library("voyager-tabNavigator", kmmClientDesktop.voyager.tabNavigator.get().toString())
        library("voyager-transitions", kmmClientDesktop.voyager.transitions.get().toString())
        library("voyager-koin", kmmClientDesktop.voyager.koin.get().toString())

        kmmClientDesktop.plugins.kotlin.compose.compiler.get().also {
            plugin("kotlin-compose-compiler", it.pluginId).version(it.version.toString())
        }
        kmmClientDesktop.plugins.kotlin.multiplatform.get().also {
            plugin("kotlin-multiplatform", it.pluginId).version(it.version.toString())
        }
        kmmClientDesktop.plugins.kotlin.serialization.get().also {
            plugin("kotlin-serialization", it.pluginId).version(it.version.toString())
        }
        kmmClientDesktop.plugins.compose.get().also {
            plugin("compose", it.pluginId).version(it.version.toString())
        }
        kmmClientDesktop.plugins.sqldelight.get().also {
            plugin("sqldelight", it.pluginId).version(it.version.toString())
        }
    }
}

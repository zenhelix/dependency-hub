catalog {
    versionCatalog {
        library("kotlin-bom", libs.kotlin.bom.get().toString())
        library("kotlinx-serialization-bom", libs.kotlinx.serialization.bom.get().toString())
        library("kotlinx-coroutines-bom", libs.kotlinx.coroutines.bom.get().toString())
        library("koin-bom", libs.koin.bom.get().toString())
        library("slf4j-bom", libs.slf4j.bom.get().toString())

        library("kotlin-test", "org.jetbrains.kotlin", "kotlin-test").withoutVersion()
        library("kotlinx-datetime", libs.kotlinx.datetime.get().toString())
        library("kotlin-logging", libs.kotlin.logging.asProvider().get().toString())
        library("logback-classic", libs.logback.classic.get().toString())
        library("slf4j-api", "org.slf4j", "slf4j-api").version(libs.versions.slf4j.get())

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

        library("sqldelight-driver-sqlite", libs.sqldelight.driver.sqlite.get().toString())
        library("sqldelight-runtime", libs.sqldelight.runtime.get().toString())
        library("sqldelight-primitive-adapters", libs.sqldelight.primitive.adapters.get().toString())
        library("sqldelight-extensions-coroutine", libs.sqldelight.extensions.coroutine.get().toString())

        library("voyager-navigator", libs.voyager.navigator.get().toString())
        library("voyager-screenModel", libs.voyager.screenModel.get().toString())
        library("voyager-bottomSheetNavigator", libs.voyager.bottomSheetNavigator.get().toString())
        library("voyager-tabNavigator", libs.voyager.tabNavigator.get().toString())
        library("voyager-transitions", libs.voyager.transitions.get().toString())
        library("voyager-koin", libs.voyager.koin.get().toString())

        libs.plugins.kotlin.compose.compiler.get().also {
            plugin("kotlin-compose-compiler", it.pluginId).version(it.version.toString())
        }
        libs.plugins.kotlin.multiplatform.get().also {
            plugin("kotlin-multiplatform", it.pluginId).version(it.version.toString())
        }
        libs.plugins.kotlin.serialization.get().also {
            plugin("kotlin-serialization", it.pluginId).version(it.version.toString())
        }
        libs.plugins.compose.get().also {
            plugin("compose", it.pluginId).version(it.version.toString())
        }
        libs.plugins.sqldelight.get().also {
            plugin("sqldelight", it.pluginId).version(it.version.toString())
        }
    }
}

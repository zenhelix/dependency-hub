catalog {
    versionCatalog {
        libs.versions.kotlin.spring.get().also {
            version("kotlin", it)
        }
        libs.versions.springBoot2.get().also {
            version("springBoot", it)
        }
        libs.versions.lombok.get().also {
            version("lombok", it)
        }
        libs.versions.sonarQube.get().also {
            version("sonarqube", it)
        }
        libs.versions.dokka.get().also {
            version("dokka", it)
        }

        // --> plugins lib
        libs.springBoot2.plugin.also {
            library("springBoot-plugin", it.get().toString())
        }
        libs.kotlin.jvm.plugin.also {
            library("kotlin-jvm-plugin", it.get().toString())
        }
        libs.kotlin.plugin.also {
            library("kotlin-plugin", it.get().toString())
        }
        libs.kotlin.allopen.plugin.also {
            library("kotlin-allopen-plugin", it.get().toString())
        }
        libs.kotlin.noarg.plugin.also {
            library("kotlin-noarg-plugin", it.get().toString())
        }
        libs.kotlin.lombok.plugin.also {
            library("kotlin-lombok-plugin", it.get().toString())
        }

        libs.lombok.plugin.also {
            library("lombok-plugin", it.get().toString())
        }
        libs.sonarqube.plugin.also {
            library("sonarqube-plugin", it.get().toString())
        }
        // <-- plugins lib


        // plugins
        libs.plugins.springBoot2.get().also {
            plugin("spring-boot", it.pluginId).version(it.version.toString())
        }

        libs.plugins.asciidoctor.get().also {
            plugin("asciidoctor", it.pluginId).version(it.version.toString())
        }
        libs.plugins.lombok.get().also {
            plugin("lombok", it.pluginId).version(it.version.toString())
        }
        libs.plugins.sonarqube.get().also {
            plugin("sonarqube", it.pluginId).version(it.version.toString())
        }
        libs.plugins.dokka.get().also {
            plugin("dokka", it.pluginId).version(it.version.toString())
        }
        libs.plugins.wsdl2java.get().also {
            plugin("wsdl2java", it.pluginId).version(it.version.toString())
        }
        libs.plugins.xjc.get().also {
            plugin("xjc", it.pluginId).version(it.version.toString())
        }
        libs.plugins.cyclonedxBom.get().also {
            plugin("cyclonedx-bom", it.pluginId).version(it.version.toString())
        }
        libs.plugins.kotlin.jvm.spring.get().also {
            plugin("kotlin-jvm", it.pluginId).version(it.version.toString())
        }
        libs.plugins.kotlin.kapt.spring.get().also {
            plugin("kotlin-kapt", it.pluginId).version(it.version.toString())
        }
        libs.plugins.kotlin.allopen.spring.get().also {
            plugin("kotlin-allopen", it.pluginId).version(it.version.toString())
        }
        libs.plugins.kotlin.noarg.spring.get().also {
            plugin("kotlin-noarg", it.pluginId).version(it.version.toString())
        }
        libs.plugins.kotlin.jpa.spring.get().also {
            plugin("kotlin-jpa", it.pluginId).version(it.version.toString())
        }
        libs.plugins.kotlin.spring.spring.get().also {
            plugin("kotlin-spring", it.pluginId).version(it.version.toString())
        }
        libs.plugins.kotlin.lombok.spring.get().also {
            plugin("kotlin-lombok", it.pluginId).version(it.version.toString())
        }
    }
}
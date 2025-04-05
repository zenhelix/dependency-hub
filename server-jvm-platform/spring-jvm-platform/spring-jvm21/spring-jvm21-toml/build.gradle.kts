catalog {
    versionCatalog {
        // Core platforms
        fromLibs(springLibs, "spring-boot-dependencies")
        fromLibs(springLibs, "spring-cloud-dependencies")
        fromLibs(springLibs, "spring-security-kerberos-bom")
        fromLibs(kotlinLibs, "kotlin-bom")
        fromLibs(kotlinLibs, "kotlinx-coroutines-bom")
        fromLibs(springLibs, "logbook-bom")
        fromLibs(springLibs, "shedlock-bom")
        fromLibs(springLibs, "resilience4j-bom")
        fromLibs(springLibs, "cxf-bom")
        fromLibs(coreLibs, "kerby-bom")
        fromLibs(testingLibs, "junit-bom")

        // Spring Security Kerberos
        fromLibs(springLibs, "spring-security-kerberos-core")
        fromLibs(springLibs, "spring-security-kerberos-client")
        fromLibs(springLibs, "spring-security-kerberos-web")
        fromLibs(springLibs, "spring-security-kerberos-test")

        // IBM MQ
        fromLibs(springLibs, "mq-jms-spring-boot-starter")

        // SpringDoc
        fromLibs(springLibs, "springdoc-openapi-starter-common")
        fromLibs(springLibs, "springdoc-openapi-starter-webmvc-api")
        fromLibs(springLibs, "springdoc-openapi-starter-webmvc-ui")
        fromLibs(springLibs, "springdoc-openapi-starter-webflux-api")
        fromLibs(springLibs, "springdoc-openapi-starter-webflux-ui")

        // Other libraries...
        // [Full list omitted for brevity]

        // Plugins
        fromPlugins(gradlePlugins, "spring-boot")
        fromPlugins(gradlePlugins, "asciidoctor", "lombok", "sonarqube", "dokka")
        fromPlugins(gradlePlugins, "wsdl2java", "xjc", "cyclonedx-bom")
        fromPlugins(kotlinLibs, "kotlin-jvm-spring", "kotlin-kapt-spring")
        fromPlugins(kotlinLibs, "kotlin-allopen-spring", "kotlin-noarg-spring")
        fromPlugins(kotlinLibs, "kotlin-jpa-spring", "kotlin-spring-spring")
        fromPlugins(kotlinLibs, "kotlin-lombok-spring")
    }
}

// Helper extension functions to simplify version catalog creation
fun VersionCatalogBuilder.fromLibs(catalog: Provider<MinimalExternalModuleDependency>, name: String) {
    val lib = catalog.get()
    library(name.replace('-', '.'), lib.toString())
}

fun VersionCatalogBuilder.fromPlugins(catalog: PluginDependency, vararg pluginNames: String) {
    pluginNames.forEach { name ->
        val pluginId = catalog.pluginId
        plugin(name.replace('-', '.'), pluginId).version(catalog.version.toString())
    }
}
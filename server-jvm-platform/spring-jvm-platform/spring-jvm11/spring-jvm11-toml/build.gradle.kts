catalog {
    versionCatalog {
        // --> spring
        libs.spring.boot.dependencies.spring.boot2.also {
            library("spring-boot-dependencies", it.get().toString())
        }
        libs.spring.cloud.dependencies.spring.boot2.also {
            library("spring-cloud-dependencies", it.get().toString())
        }
        // <-- spring
        // --> kotlin
        libs.kotlin.bom.also {
            library("kotlin-bom", it.get().toString())
        }
        libs.kotlinx.coroutines.bom.also {
            library("kotlinx-coroutines-bom", it.get().toString())
        }
        // <-- kotlin
        libs.logbook.bom.also {
            library("logbook-bom", it.get().toString())
        }
        libs.shedlock.bom.java8.also {
            library("shedlock-bom", it.get().toString())
        }
        libs.resilience4j.bom.java8.also {
            library("resilience4j-bom", it.get().toString())
        }
        libs.cxf.bom.java8.also {
            library("cxf-bom", it.get().toString())
        }
        libs.kerby.bom.also {
            library("kerby-bom", it.get().toString())
        }
        // --> testing
        libs.testcontainers.bom.also {
            library("testcontainers-bom", it.get().toString())
        }
        libs.junit.bom.also {
            library("junit-bom", it.get().toString())
        }
        // <-- testing


        // --> spring
        libs.spring.security.kerberos.core.spring5.also {
            library("spring-security-kerberos-core", it.get().toString())
        }
        libs.spring.security.kerberos.web.spring5.also {
            library("spring-security-kerberos-web", it.get().toString())
        }

        libs.mq.jms.spring.boot.starter.spring.boot2.also {
            library("mq-jms-spring-boot-starter", it.get().toString())
        }

        libs.springdoc.openapi.webmvc.core.spring5.also {
            library("springdoc-openapi-webmvc-core", it.get().toString())
        }
        libs.springdoc.openapi.common.spring5.also {
            library("springdoc-openapi-common", it.get().toString())
        }
        libs.springdoc.openapi.ui.spring5.also {
            library("springdoc-openapi-ui", it.get().toString())
        }
        libs.springdoc.openapi.webflux.ui.spring5.also {
            library("springdoc-openapi-webflux-ui", it.get().toString())
        }
        libs.springdoc.openapi.security.spring5.also {
            library("springdoc-openapi-security", it.get().toString())
        }
        libs.springdoc.openapi.kotlin.spring5.also {
            library("springdoc-openapi-kotlin", it.get().toString())
        }

        libs.kerb4j.server.spring.security.java8.also {
            library("kerb4j-server-spring-security", it.get().toString())
        }

        libs.liquibase.r2dbc.spring.boot.starter.spring.boot2.also {
            library("liquibase-r2dbc-spring-boot-starter", it.get().toString())
        }
        libs.db.scheduler.spring.boot.starter.also {
            library("db-scheduler-spring-boot-starter", it.get().toString())
        }

        libs.transactionoutbox.core.java8.also {
            library("transactionoutbox-core", it.get().toString())
        }
        libs.transactionoutbox.spring.java8.also {
            library("transactionoutbox-spring", it.get().toString())
        }
        libs.transactionoutbox.jackson.java8.also {
            library("transactionoutbox-jackson", it.get().toString())
        }

        libs.jobrunr.asProvider().also {
            library("jobrunr", it.get().toString())
        }
        libs.jobrunr.spring.boot2.starter.also {
            library("jobrunr-spring-boot-starter", it.get().toString())
        }
        libs.jobrunr.kotlin19.support.also {
            library("jobrunr-kotlin-support", it.get().toString())
        }

        // <-- spring
        // --> kotlin
        libs.kotlin.logging.spring.also {
            library("kotlin-logging", it.get().toString())
        }
        // <-- kotlin

        libs.ibm.mq.allclient.also {
            library("ibm-mq-allclient", it.get().toString())
        }
        libs.woodstox.core.also {
            library("woodstox-core", it.get().toString())
        }

        // https://github.com/spring-projects/spring-security/blob/5.8.x/gradle/libs.versions.toml#L25
        libs.oauth2.oidc.sdk.spring5.also {
            library("oauth2-oidc-sdk", it.get().toString())
        }
        libs.nimbus.jose.jwt.spring5.also {
            library("nimbus-jose-jwt", it.get().toString())
        }
        libs.nv.i18n.also {
            library("nv-i18n", it.get().toString())
        }
        libs.threeten.extra.also {
            library("threeten-extra", it.get().toString())
        }
        libs.pdfbox.also {
            library("pdfbox", it.get().toString())
        }
        // https://github.com/spring-projects/spring-data-jpa/blob/2.7.x/pom.xml#L33
        libs.hypersistence.utils.hibernate55.also {
            library("hypersistence-utils-hibernate55", it.get().toString())
        }
        libs.jasperreports.also {
            library("jasperreports", it.get().toString())
        }
        libs.freemarker.also {
            library("freemarker", it.get().toString())
        }
        libs.logstash.logback.encoder.asProvider().also {
            library("logstash-logback-encoder", it.get().toString())
        }
        // Отсутствует в BOM от shedlock
        libs.shedlock.provider.jdbc.java8.also {
            library("shedlock-provider-jdbc", it.get().toString())
        }
        libs.cron.utils.also {
            library("cron-utils", it.get().toString())
        }
        libs.jasypt.also {
            library("jasypt", it.get().toString())
        }
        libs.kafka.avro.serializer.also {
            library("kafka-avro-serializer", it.get().toString())
        }
        libs.poi.asProvider().also {
            library("poi", it.get().toString())
        }
        libs.poi.ooxml.also {
            library("poi-ooxml", it.get().toString())
        }
        libs.fastexcel.asProvider().also {
            library("fastexcel", it.get().toString())
        }
        libs.fastexcel.reader.also {
            library("fastexcel-reader", it.get().toString())
        }
        libs.lettuce.core.also {
            library("lettuce-core", it.get().toString())
        }
        libs.guava.also {
            library("guava", it.get().toString())
        }
        libs.apacheCommonsText.also {
            library("commons-text", it.get().toString())
        }
        libs.juniversalchardet.also {
            library("juniversalchardet", it.get().toString())
        }
        libs.jaxb.plugins.runtime.asProvider().also {
            library("jaxb-plugins-runtime", it.get().toString())
        }
        libs.jaxb.plugins.asProvider().also {
            library("jaxb-plugins", it.get().toString())
        }
        libs.apache.httpclient.also {
            library("apache-httpclient", it.get().toString())
        }
        libs.apache.httpclient5.also {
            library("apache-httpclient5", it.get().toString())
        }
        libs.xstream.also {
            library("xstream", it.get().toString())
        }
        libs.kryo.asProvider().also {
            library("kryo", it.get().toString())
        }
        libs.kryo.library.also {
            library("kryo-library", it.get().toString())
        }

        // --> testing
        libs.testng.asProvider().also {
            library("testng", it.get().toString())
        }
        libs.springmockk.spring5.also {
            library("springmockk", it.get().toString())
        }
        libs.wiremock.asProvider().also {
            library("wiremock", it.get().toString())
        }
        libs.mockito.kotlin.also {
            library("mockito-kotlin", it.get().toString())
        }
        libs.awaitility.also {
            library("awaitility", it.get().toString())
        }
        libs.testcontainers.redis.also {
            library("testcontainers-redis", it.get().toString())
        }
        // <-- testing

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
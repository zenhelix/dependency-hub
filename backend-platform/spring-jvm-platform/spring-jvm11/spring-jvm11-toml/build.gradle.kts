catalog {
    versionCatalog {
        // --> spring
        backendSpring5.spring.boot.dependencies.spring.boot2.also {
            library("spring-boot-dependencies", it.get().toString())
        }
        backendSpring5.spring.cloud.dependencies.spring.boot2.also {
            library("spring-cloud-dependencies", it.get().toString())
        }
        // <-- spring
        // --> kotlin
        backendSpring5.kotlin.bom.also {
            library("kotlin-bom", it.get().toString())
        }
        backendSpring5.kotlinx.coroutines.bom.also {
            library("kotlinx-coroutines-bom", it.get().toString())
        }
        // <-- kotlin
        backendSpring5.logbook.bom.also {
            library("logbook-bom", it.get().toString())
        }
        backendSpring5.shedlock.bom.java8.also {
            library("shedlock-bom", it.get().toString())
        }
        backendSpring5.resilience4j.bom.java8.also {
            library("resilience4j-bom", it.get().toString())
        }
        backendSpring5.cxf.bom.java8.also {
            library("cxf-bom", it.get().toString())
        }
        backendSpring5.kerby.bom.also {
            library("kerby-bom", it.get().toString())
        }
        // --> testing
        backendSpring5.testcontainers.bom.also {
            library("testcontainers-bom", it.get().toString())
        }
        backendSpring5.junit.bom.also {
            library("junit-bom", it.get().toString())
        }
        // <-- testing


        // --> spring
        backendSpring5.spring.security.kerberos.core.spring5.also {
            library("spring-security-kerberos-core", it.get().toString())
        }
        backendSpring5.spring.security.kerberos.web.spring5.also {
            library("spring-security-kerberos-web", it.get().toString())
        }

        backendSpring5.mq.jms.spring.boot.starter.spring.boot2.also {
            library("mq-jms-spring-boot-starter", it.get().toString())
        }

        backendSpring5.springdoc.openapi.webmvc.core.spring5.also {
            library("springdoc-openapi-webmvc-core", it.get().toString())
        }
        backendSpring5.springdoc.openapi.common.spring5.also {
            library("springdoc-openapi-common", it.get().toString())
        }
        backendSpring5.springdoc.openapi.ui.spring5.also {
            library("springdoc-openapi-ui", it.get().toString())
        }
        backendSpring5.springdoc.openapi.webflux.ui.spring5.also {
            library("springdoc-openapi-webflux-ui", it.get().toString())
        }
        backendSpring5.springdoc.openapi.security.spring5.also {
            library("springdoc-openapi-security", it.get().toString())
        }
        backendSpring5.springdoc.openapi.kotlin.spring5.also {
            library("springdoc-openapi-kotlin", it.get().toString())
        }

        backendSpring5.kerb4j.server.spring.security.java8.also {
            library("kerb4j-server-spring-security", it.get().toString())
        }

        backendSpring5.liquibase.r2dbc.spring.boot.starter.spring.boot2.also {
            library("liquibase-r2dbc-spring-boot-starter", it.get().toString())
        }
        backendSpring5.db.scheduler.spring.boot.starter.also {
            library("db-scheduler-spring-boot-starter", it.get().toString())
        }

        backendSpring5.transactionoutbox.core.java8.also {
            library("transactionoutbox-core", it.get().toString())
        }
        backendSpring5.transactionoutbox.spring.java8.also {
            library("transactionoutbox-spring", it.get().toString())
        }
        backendSpring5.transactionoutbox.jackson.java8.also {
            library("transactionoutbox-jackson", it.get().toString())
        }

        backendSpring5.jobrunr.asProvider().also {
            library("jobrunr", it.get().toString())
        }
        backendSpring5.jobrunr.spring.boot2.starter.also {
            library("jobrunr-spring-boot-starter", it.get().toString())
        }
        backendSpring5.jobrunr.kotlin19.support.also {
            library("jobrunr-kotlin-support", it.get().toString())
        }

        // <-- spring
        // --> kotlin
        backendSpring5.kotlin.logging.jvm.also {
            library("kotlin-logging", it.get().toString())
        }
        // <-- kotlin

        backendSpring5.ibm.mq.allclient.also {
            library("ibm-mq-allclient", it.get().toString())
        }
        backendSpring5.woodstox.core.also {
            library("woodstox-core", it.get().toString())
        }

        // https://github.com/spring-projects/spring-security/blob/5.8.x/gradle/backendSpring5.versions.toml#L25
        backendSpring5.oauth2.oidc.sdk.spring5.also {
            library("oauth2-oidc-sdk", it.get().toString())
        }
        backendSpring5.nimbus.jose.jwt.spring5.also {
            library("nimbus-jose-jwt", it.get().toString())
        }
        backendSpring5.nv.i18n.also {
            library("nv-i18n", it.get().toString())
        }
        backendSpring5.threeten.extra.also {
            library("threeten-extra", it.get().toString())
        }
        backendSpring5.pdfbox.also {
            library("pdfbox", it.get().toString())
        }
        // https://github.com/spring-projects/spring-data-jpa/blob/2.7.x/pom.xml#L33
        backendSpring5.hypersistence.utils.hibernate55.also {
            library("hypersistence-utils-hibernate55", it.get().toString())
        }
        backendSpring5.jasperreports.also {
            library("jasperreports", it.get().toString())
        }
        backendSpring5.freemarker.also {
            library("freemarker", it.get().toString())
        }
        backendSpring5.logstash.logback.encoder.asProvider().also {
            library("logstash-logback-encoder", it.get().toString())
        }
        // Отсутствует в BOM от shedlock
        backendSpring5.shedlock.provider.jdbc.java8.also {
            library("shedlock-provider-jdbc", it.get().toString())
        }
        backendSpring5.cron.utils.also {
            library("cron-utils", it.get().toString())
        }
        backendSpring5.jasypt.also {
            library("jasypt", it.get().toString())
        }
        backendSpring5.kafka.avro.serializer.also {
            library("kafka-avro-serializer", it.get().toString())
        }
        backendSpring5.poi.asProvider().also {
            library("poi", it.get().toString())
        }
        backendSpring5.poi.ooxml.also {
            library("poi-ooxml", it.get().toString())
        }
        backendSpring5.fastexcel.asProvider().also {
            library("fastexcel", it.get().toString())
        }
        backendSpring5.fastexcel.reader.also {
            library("fastexcel-reader", it.get().toString())
        }
        backendSpring5.lettuce.core.also {
            library("lettuce-core", it.get().toString())
        }
        backendSpring5.guava.also {
            library("guava", it.get().toString())
        }
        backendSpring5.apacheCommonsText.also {
            library("commons-text", it.get().toString())
        }
        backendSpring5.juniversalchardet.also {
            library("juniversalchardet", it.get().toString())
        }
        backendSpring5.jaxb.plugins.runtime.asProvider().also {
            library("jaxb-plugins-runtime", it.get().toString())
        }
        backendSpring5.jaxb.plugins.asProvider().also {
            library("jaxb-plugins", it.get().toString())
        }
        backendSpring5.apache.httpclient.also {
            library("apache-httpclient", it.get().toString())
        }
        backendSpring5.apache.httpclient5.also {
            library("apache-httpclient5", it.get().toString())
        }
        backendSpring5.xstream.also {
            library("xstream", it.get().toString())
        }
        backendSpring5.kryo.asProvider().also {
            library("kryo", it.get().toString())
        }
        backendSpring5.kryo.library.also {
            library("kryo-library", it.get().toString())
        }

        // --> testing
        backendSpring5.testng.asProvider().also {
            library("testng", it.get().toString())
        }
        backendSpring5.springmockk.spring5.also {
            library("springmockk", it.get().toString())
        }
        backendSpring5.wiremock.asProvider().also {
            library("wiremock", it.get().toString())
        }
        backendSpring5.mockito.kotlin.also {
            library("mockito-kotlin", it.get().toString())
        }
        backendSpring5.awaitility.also {
            library("awaitility", it.get().toString())
        }
        backendSpring5.testcontainers.redis.also {
            library("testcontainers-redis", it.get().toString())
        }
        // <-- testing

        // plugins
        backendSpring5.plugins.springBoot2.get().also {
            plugin("spring-boot", it.pluginId).version(it.version.toString())
        }
        backendSpring5.plugins.asciidoctor.get().also {
            plugin("asciidoctor", it.pluginId).version(it.version.toString())
        }
        backendSpring5.plugins.lombok.get().also {
            plugin("lombok", it.pluginId).version(it.version.toString())
        }
        backendSpring5.plugins.sonarqube.get().also {
            plugin("sonarqube", it.pluginId).version(it.version.toString())
        }
        backendSpring5.plugins.dokka.get().also {
            plugin("dokka", it.pluginId).version(it.version.toString())
        }
        backendSpring5.plugins.cyclonedxBom.get().also {
            plugin("cyclonedx-bom", it.pluginId).version(it.version.toString())
        }
        backendSpring5.plugins.kotlin.jvm.get().also {
            plugin("kotlin-jvm", it.pluginId).version(it.version.toString())
        }
        backendSpring5.plugins.kotlin.kapt.get().also {
            plugin("kotlin-kapt", it.pluginId).version(it.version.toString())
        }
        backendSpring5.plugins.kotlin.allopen.get().also {
            plugin("kotlin-allopen", it.pluginId).version(it.version.toString())
        }
        backendSpring5.plugins.kotlin.noarg.get().also {
            plugin("kotlin-noarg", it.pluginId).version(it.version.toString())
        }
        backendSpring5.plugins.kotlin.jpa.get().also {
            plugin("kotlin-jpa", it.pluginId).version(it.version.toString())
        }
        backendSpring5.plugins.kotlin.spring.get().also {
            plugin("kotlin-spring", it.pluginId).version(it.version.toString())
        }
        backendSpring5.plugins.kotlin.lombok.get().also {
            plugin("kotlin-lombok", it.pluginId).version(it.version.toString())
        }
    }
}
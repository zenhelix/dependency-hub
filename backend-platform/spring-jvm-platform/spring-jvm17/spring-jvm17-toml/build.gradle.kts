catalog {
    versionCatalog {
        // --> spring
        backendSpring.spring.boot.dependencies.also {
            library("spring-boot-dependencies", it.get().toString())
        }
        backendSpring.spring.cloud.dependencies.also {
            library("spring-cloud-dependencies", it.get().toString())
        }
        backendSpring.spring.security.kerberos.bom.also {
            library("spring-security-kerberos-bom", it.get().toString())
        }
        // <-- spring
        // --> kotlin
        backendSpring.kotlin.bom.also {
            library("kotlin-bom", it.get().toString())
        }
        backendSpring.kotlinx.coroutines.bom.also {
            library("kotlinx-coroutines-bom", it.get().toString())
        }
        // <-- kotlin
        backendSpring.logbook.bom.also {
            library("logbook-bom", it.get().toString())
        }
        backendSpring.shedlock.bom.also {
            library("shedlock-bom", it.get().toString())
        }
        backendSpring.resilience4j.bom.also {
            library("resilience4j-bom", it.get().toString())
        }
        backendSpring.cxf.bom.also {
            library("cxf-bom", it.get().toString())
        }
        backendSpring.kerby.bom.also {
            library("kerby-bom", it.get().toString())
        }
        // --> testing
        backendSpring.junit.bom.also {
            library("junit-bom", it.get().toString())
        }
        // <-- testing


        // --> spring
        backendSpring.spring.security.kerberos.core.also {
            library("spring-security-kerberos-core", it.get().toString())
        }
        backendSpring.spring.security.kerberos.client.also {
            library("spring-security-kerberos-client", it.get().toString())
        }
        backendSpring.spring.security.kerberos.web.also {
            library("spring-security-kerberos-web", it.get().toString())
        }
        backendSpring.spring.security.kerberos.test.also {
            library("spring-security-kerberos-test", it.get().toString())
        }

        backendSpring.mq.jms.spring.boot.starter.also {
            library("mq-jms-spring-boot-starter", it.get().toString())
        }

        backendSpring.springdoc.openapi.starter.common.also {
            library("springdoc-openapi-starter-common", it.get().toString())
        }
        backendSpring.springdoc.openapi.starter.webmvc.api.also {
            library("springdoc-openapi-starter-webmvc-api", it.get().toString())
        }
        backendSpring.springdoc.openapi.starter.webmvc.ui.also {
            library("springdoc-openapi-starter-webmvc-ui", it.get().toString())
        }
        backendSpring.springdoc.openapi.starter.webflux.api.also {
            library("springdoc-openapi-starter-webflux-api", it.get().toString())
        }
        backendSpring.springdoc.openapi.starter.webflux.ui.also {
            library("springdoc-openapi-starter-webflux-ui", it.get().toString())
        }

        backendSpring.springwolf.kafka.also { library("springwolf-kafka", it.get().toString()) }
        backendSpring.springwolf.sns.also { library("springwolf-sns", it.get().toString()) }
        backendSpring.springwolf.sqs.also { library("springwolf-sqs", it.get().toString()) }
        backendSpring.springwolf.stomp.also { library("springwolf-stomp", it.get().toString()) }
        backendSpring.springwolf.amqp.also { library("springwolf-amqp", it.get().toString()) }
        backendSpring.springwolf.jms.also { library("springwolf-jms", it.get().toString()) }
        backendSpring.springwolf.cloud.stream.also { library("springwolf-cloud-stream", it.get().toString()) }
        backendSpring.springwolf.ui.also { library("springwolf-ui", it.get().toString()) }
        backendSpring.springwolf.common.model.converters.also { library("springwolf-common-model-converters", it.get().toString()) }
        backendSpring.springwolf.generic.binding.also { library("springwolf-generic-binding", it.get().toString()) }
        backendSpring.springwolf.json.schema.also { library("springwolf-json-schema", it.get().toString()) }

        backendSpring.kerb4j.server.spring.security.also {
            library("kerb4j-server-spring-security", it.get().toString())
        }

        backendSpring.liquibase.r2dbc.spring.boot.starter.also {
            library("liquibase-r2dbc-spring-boot-starter", it.get().toString())
        }
        backendSpring.db.scheduler.spring.boot.starter.also {
            library("db-scheduler-spring-boot-starter", it.get().toString())
        }

        backendSpring.transactionoutbox.core.also {
            library("transactionoutbox-core", it.get().toString())
        }
        backendSpring.transactionoutbox.spring.also {
            library("transactionoutbox-spring", it.get().toString())
        }
        backendSpring.transactionoutbox.jackson.also {
            library("transactionoutbox-jackson", it.get().toString())
        }

        backendSpring.jobrunr.asProvider().also {
            library("jobrunr", it.get().toString())
        }
        backendSpring.jobrunr.spring.boot3.starter.also {
            library("jobrunr-spring-boot-starter", it.get().toString())
        }
        backendSpring.jobrunr.kotlin19.support.also {
            library("jobrunr-kotlin-support", it.get().toString())
        }

        backendSpring.wiremock.spring.boot.also {
            library("wiremock-spring-boot", it.get().toString())
        }

        // <-- spring
        // --> kotlin
        backendSpring.kotlin.logging.jvm.also {
            library("kotlin-logging", it.get().toString())
        }
        // <-- kotlin

        backendSpring.jakarta.jws.api.also {
            library("jakarta-jws-api", it.get().toString())
        }
        backendSpring.ibm.mq.jakarta.client.also {
            library("ibm-mq-jakarta-client", it.get().toString())
        }
        backendSpring.woodstox.core.also {
            library("woodstox-core", it.get().toString())
        }

        // https://github.com/spring-projects/spring-security/blob/main/gradle/backendSpring.versions.toml#L23
        backendSpring.oauth2.oidc.sdk.also {
            library("oauth2-oidc-sdk", it.get().toString())
        }
        backendSpring.nimbus.jose.jwt.also {
            library("nimbus-jose-jwt", it.get().toString())
        }
        backendSpring.nv.i18n.also {
            library("nv-i18n", it.get().toString())
        }
        backendSpring.threeten.extra.also {
            library("threeten-extra", it.get().toString())
        }
        backendSpring.pdfbox.also {
            library("pdfbox", it.get().toString())
        }
        // https://github.com/spring-projects/spring-data-jpa/blob/main/pom.xml#L33
        backendSpring.hypersistence.utils.hibernate63.also {
            library("hypersistence-utils-hibernate63", it.get().toString())
        }
        backendSpring.jasperreports.also {
            library("jasperreports", it.get().toString())
        }
        backendSpring.freemarker.also {
            library("freemarker", it.get().toString())
        }
        backendSpring.logstash.logback.encoder.also {
            library("logstash-logback-encoder", it.get().toString())
        }
        // Отсутствует в BOM от shedlock
        backendSpring.shedlock.provider.jdbc.also {
            library("shedlock-provider-jdbc", it.get().toString())
        }
        backendSpring.cron.utils.also {
            library("cron-utils", it.get().toString())
        }
        backendSpring.jasypt.also {
            library("jasypt", it.get().toString())
        }
        backendSpring.micrometer.context.propagation.also {
            library("micrometer-context-propagation", it.get().toString())
        }
        backendSpring.kafka.avro.serializer.also {
            library("kafka-avro-serializer", it.get().toString())
        }
        backendSpring.poi.asProvider().also {
            library("poi", it.get().toString())
        }
        backendSpring.poi.ooxml.also {
            library("poi-ooxml", it.get().toString())
        }
        backendSpring.fastexcel.asProvider().also {
            library("fastexcel", it.get().toString())
        }
        backendSpring.fastexcel.reader.also {
            library("fastexcel-reader", it.get().toString())
        }
        backendSpring.lettuce.core.also {
            library("lettuce-core", it.get().toString())
        }
        backendSpring.guava.also {
            library("guava", it.get().toString())
        }
        backendSpring.apacheCommonsText.also {
            library("commons-text", it.get().toString())
        }
        backendSpring.juniversalchardet.also {
            library("juniversalchardet", it.get().toString())
        }
        backendSpring.jaxb.plugins.runtime.also {
            library("jaxb-plugins-runtime", it.get().toString())
        }
        backendSpring.jaxb.plugins.asProvider().also {
            library("jaxb-plugins", it.get().toString())
        }
        backendSpring.apache.httpclient.also {
            library("apache-httpclient", it.get().toString())
        }
        backendSpring.apache.httpclient5.also {
            library("apache-httpclient5", it.get().toString())
        }

        backendSpring.xstream.also {
            library("xstream", it.get().toString())
        }

        backendSpring.quartz.scheduler.also {
            library("quartz", it.get().toString())
        }

        backendSpring.kryo.asProvider().also {
            library("kryo", it.get().toString())
        }
        backendSpring.kryo.library.also {
            library("kryo-library", it.get().toString())
        }

        // --> testing
        backendSpring.testng.also {
            library("testng", it.get().toString())
        }
        backendSpring.springmockk.also {
            library("springmockk", it.get().toString())
        }
        backendSpring.wiremock.asProvider().also {
            library("wiremock", it.get().toString())
        }
        backendSpring.mockito.kotlin.also {
            library("mockito-kotlin", it.get().toString())
        }
        backendSpring.testcontainers.redis.also {
            library("testcontainers-redis", it.get().toString())
        }
        backendSpring.greenmail.asProvider().also {
            library("greenmail", it.get().toString())
        }
        backendSpring.greenmail.spring.also {
            library("greenmail-spring", it.get().toString())
        }
        backendSpring.greenmail.junit5.also {
            library("greenmail-junit5", it.get().toString())
        }
        // <-- testing

        // plugins
        backendSpring.plugins.springBoot.get().also {
            plugin("spring-boot", it.pluginId).version(it.version.toString())
        }
        backendSpring.plugins.asciidoctor.get().also {
            plugin("asciidoctor", it.pluginId).version(it.version.toString())
        }
        backendSpring.plugins.lombok.get().also {
            plugin("lombok", it.pluginId).version(it.version.toString())
        }
        backendSpring.plugins.sonarqube.get().also {
            plugin("sonarqube", it.pluginId).version(it.version.toString())
        }
        backendSpring.plugins.dokka.get().also {
            plugin("dokka", it.pluginId).version(it.version.toString())
        }
        backendSpring.plugins.wsdl2java.get().also {
            plugin("wsdl2java", it.pluginId).version(it.version.toString())
        }
        backendSpring.plugins.xjc.get().also {
            plugin("xjc", it.pluginId).version(it.version.toString())
        }
        backendSpring.plugins.cyclonedxBom.get().also {
            plugin("cyclonedx-bom", it.pluginId).version(it.version.toString())
        }
        backendSpring.plugins.kotlin.jvm.get().also {
            plugin("kotlin-jvm", it.pluginId).version(it.version.toString())
        }
        backendSpring.plugins.kotlin.kapt.get().also {
            plugin("kotlin-kapt", it.pluginId).version(it.version.toString())
        }
        backendSpring.plugins.kotlin.allopen.get().also {
            plugin("kotlin-allopen", it.pluginId).version(it.version.toString())
        }
        backendSpring.plugins.kotlin.noarg.get().also {
            plugin("kotlin-noarg", it.pluginId).version(it.version.toString())
        }
        backendSpring.plugins.kotlin.jpa.get().also {
            plugin("kotlin-jpa", it.pluginId).version(it.version.toString())
        }
        backendSpring.plugins.kotlin.spring.get().also {
            plugin("kotlin-spring", it.pluginId).version(it.version.toString())
        }
        backendSpring.plugins.kotlin.lombok.get().also {
            plugin("kotlin-lombok", it.pluginId).version(it.version.toString())
        }
    }
}
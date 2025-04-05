// spring-platform/spring-jvm21-bom/build.gradle.kts
dependencies {
    // Core Spring platforms
    api(platform(springLibs.spring.boot.dependencies))
    api(platform(springLibs.spring.cloud.dependencies))
    api(platform(springLibs.spring.security.kerberos.bom))

    // Core Kotlin platforms
    api(platform(kotlinLibs.kotlin.bom))
    api(platform(kotlinLibs.kotlinx.coroutines.bom))

    // Other platforms
    api(platform(springLibs.logbook.bom))
    api(platform(springLibs.shedlock.bom))
    api(platform(springLibs.resilience4j.bom))
    api(platform(springLibs.cxf.bom))
    api(platform(coreLibs.kerby.bom))
    api(platform(testingLibs.junit.bom))

    constraints {
        // Spring Security Kerberos
        api(springLibs.spring.security.kerberos.core)
        api(springLibs.spring.security.kerberos.client)
        api(springLibs.spring.security.kerberos.web)
        api(springLibs.spring.security.kerberos.test)

        // IBM MQ
        api(springLibs.mq.jms.spring.boot.starter)

        // Spring Doc
        api(springLibs.springdoc.openapi.starter.common)
        api(springLibs.springdoc.openapi.starter.webmvc.api)
        api(springLibs.springdoc.openapi.starter.webmvc.ui)
        api(springLibs.springdoc.openapi.starter.webflux.api)
        api(springLibs.springdoc.openapi.starter.webflux.ui)

        // Spring Wolf
        springwolfModules()

        // Other Spring dependencies
        api(springLibs.kerb4j.server.spring.security)
        api(springLibs.liquibase.r2dbc.spring.boot.starter)
        api(springLibs.db.scheduler.spring.boot.starter)
        api(springLibs.transactionoutbox.core)
        api(springLibs.transactionoutbox.spring)
        api(springLibs.transactionoutbox.jackson)
        api(springLibs.jobrunr)
        api(springLibs.jobrunr.spring.boot3.starter)
        api(springLibs.jobrunr.kotlin19.support)
        api(springLibs.wiremock.spring.boot)

        // Jakarta & Misc
        api(kotlinLibs.kotlin.logging.spring)
        api(springLibs.jakarta.jws.api)
        api(springLibs.ibm.mq.jakarta.client)
        api(coreLibs.woodstox.core)
        api(springLibs.oauth2.oidc.sdk)
        api(springLibs.nimbus.jose.jwt)
        api(coreLibs.nv.i18n)
        api(coreLibs.threeten.extra)
        api(coreLibs.pdfbox)
        api(springLibs.hypersistence.utils.hibernate63)
        api(coreLibs.jasperreports)
        api(coreLibs.freemarker)
        api(coreLibs.logstash.logback.encoder)
        api(springLibs.shedlock.provider.jdbc)
        api(coreLibs.cron.utils)
        api(coreLibs.jasypt)
        api(springLibs.micrometer.context.propagation)
        api(springLibs.kafka.avro.serializer)

        // Document processing
        api(coreLibs.poi)
        api(coreLibs.poi.ooxml)
        api(coreLibs.fastexcel)
        api(coreLibs.fastexcel.reader)

        // Other utilities
        api(springLibs.lettuce.core)
        api(coreLibs.guava)
        api(coreLibs.apacheCommonsText)
        api(coreLibs.juniversalchardet)
        api(springLibs.jaxb.plugins.runtime)
        api(springLibs.jaxb.plugins)
        api(coreLibs.apache.httpclient)
        api(coreLibs.apache.httpclient5)
        api(coreLibs.xstream)
        api(springLibs.quartz.scheduler)
        api(coreLibs.kryo)
        api(coreLibs.kryo.library)

        // Testing libraries
        api(testingLibs.testng)
        api(testingLibs.springmockk)
        api(testingLibs.wiremock)
        api(testingLibs.mockito.kotlin)
        api(testingLibs.testcontainers.redis)
        api(testingLibs.greenmail)
        api(testingLibs.greenmail.spring)
        api(testingLibs.greenmail.junit5)
    }
}

// Helper function to add all Springwolf modules
fun DependencyConstraintHandler.springwolfModules() {
    api(springLibs.springwolf.kafka)
    api(springLibs.springwolf.sns)
    api(springLibs.springwolf.sqs)
    api(springLibs.springwolf.stomp)
    api(springLibs.springwolf.amqp)
    api(springLibs.springwolf.jms)
    api(springLibs.springwolf.cloud.stream)
    api(springLibs.springwolf.ui)
    api(springLibs.springwolf.common.model.converters)
    api(springLibs.springwolf.generic.binding)
    api(springLibs.springwolf.json.schema)
}
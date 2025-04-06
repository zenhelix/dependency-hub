dependencies {
    // --> spring
    api(platform(backendSpring.spring.boot.dependencies))
    api(platform(backendSpring.spring.cloud.dependencies))
    api(platform(backendSpring.spring.security.kerberos.bom))
    // <-- spring
    // --> kotlin
    api(platform(backendSpring.kotlin.bom))
    api(platform(backendSpring.kotlinx.coroutines.bom))
    // <-- kotlin
    api(platform(backendSpring.logbook.bom))
    api(platform(backendSpring.shedlock.bom))
    api(platform(backendSpring.resilience4j.bom))
    api(platform(backendSpring.cxf.bom))
    api(platform(backendSpring.kerby.bom))
    // --> testing
    api(platform(backendSpring.junit.bom))
    // <-- testing

    constraints {
        // --> spring
        api(backendSpring.spring.security.kerberos.core)
        api(backendSpring.spring.security.kerberos.client)
        api(backendSpring.spring.security.kerberos.web)
        api(backendSpring.spring.security.kerberos.test)

        api(backendSpring.mq.jms.spring.boot.starter)

        api(backendSpring.springdoc.openapi.starter.common)
        api(backendSpring.springdoc.openapi.starter.webmvc.api)
        api(backendSpring.springdoc.openapi.starter.webmvc.ui)
        api(backendSpring.springdoc.openapi.starter.webflux.api)
        api(backendSpring.springdoc.openapi.starter.webflux.ui)

        api(backendSpring.springwolf.kafka)
        api(backendSpring.springwolf.sns)
        api(backendSpring.springwolf.sqs)
        api(backendSpring.springwolf.stomp)
        api(backendSpring.springwolf.amqp)
        api(backendSpring.springwolf.jms)
        api(backendSpring.springwolf.cloud.stream)
        api(backendSpring.springwolf.ui)
        api(backendSpring.springwolf.common.model.converters)
        api(backendSpring.springwolf.generic.binding)
        api(backendSpring.springwolf.json.schema)

        api(backendSpring.kerb4j.server.spring.security)

        api(backendSpring.liquibase.r2dbc.spring.boot.starter)
        api(backendSpring.db.scheduler.spring.boot.starter)

        api(backendSpring.transactionoutbox.core)
        api(backendSpring.transactionoutbox.spring)
        api(backendSpring.transactionoutbox.jackson)

        api(backendSpring.jobrunr)
        api(backendSpring.jobrunr.spring.boot3.starter)
        api(backendSpring.jobrunr.kotlin19.support)

        api(backendSpring.wiremock.spring.boot)
        // <-- spring
        // --> kotlin
        api(backendSpring.kotlin.logging.jvm)
        // <-- kotlin

        api(backendSpring.jakarta.jws.api)
        api(backendSpring.ibm.mq.jakarta.client)
        api(backendSpring.woodstox.core)

        // https://github.com/spring-projects/spring-security/blob/main/gradle/backendSpring.versions.toml#L23
        api(backendSpring.oauth2.oidc.sdk)
        api(backendSpring.nimbus.jose.jwt)
        api(backendSpring.nv.i18n)
        api(backendSpring.threeten.extra)
        api(backendSpring.pdfbox)
        // https://github.com/spring-projects/spring-data-jpa/blob/main/pom.xml#L33
        api(backendSpring.hypersistence.utils.hibernate63)
        api(backendSpring.jasperreports)
        api(backendSpring.freemarker)
        api(backendSpring.logstash.logback.encoder)
        api(backendSpring.shedlock.provider.jdbc) // Отсутствует в BOM от shedlock
        api(backendSpring.cron.utils)
        api(backendSpring.jasypt)
        api(backendSpring.micrometer.context.propagation)
        api(backendSpring.kafka.avro.serializer)
        api(backendSpring.poi)
        api(backendSpring.poi.ooxml)
        api(backendSpring.fastexcel)
        api(backendSpring.fastexcel.reader)
        api(backendSpring.lettuce.core)
        api(backendSpring.guava)
        api(backendSpring.apacheCommonsText)
        api(backendSpring.juniversalchardet)
        api(backendSpring.jaxb.plugins.runtime)
        api(backendSpring.jaxb.plugins.asProvider())
        api(backendSpring.apache.httpclient)
        api(backendSpring.apache.httpclient5)

        api(backendSpring.xstream)

        api(backendSpring.quartz.scheduler)
        api(backendSpring.kryo.asProvider())
        api(backendSpring.kryo.library)

        // --> testing
        api(backendSpring.testng)
        api(backendSpring.springmockk)
        api(backendSpring.wiremock)
        api(backendSpring.mockito.kotlin)
        api(backendSpring.testcontainers.redis)
        api(backendSpring.greenmail.asProvider())
        api(backendSpring.greenmail.spring)
        api(backendSpring.greenmail.junit5)
        // <-- testing
    }
}
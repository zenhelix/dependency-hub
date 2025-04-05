dependencies {
    // --> spring
    api(platform(libs.spring.boot.dependencies))
    api(platform(libs.spring.cloud.dependencies))
    api(platform(libs.spring.security.kerberos.bom))
    // <-- spring
    // --> kotlin
    api(platform(libs.kotlin.bom))
    api(platform(libs.kotlinx.coroutines.bom))
    // <-- kotlin
    api(platform(libs.logbook.bom))
    api(platform(libs.shedlock.bom))
    api(platform(libs.resilience4j.bom))
    api(platform(libs.cxf.bom))
    api(platform(libs.kerby.bom))
    // --> testing
    api(platform(libs.junit.bom))
    // <-- testing

    constraints {
        // --> spring
        api(libs.spring.security.kerberos.core)
        api(libs.spring.security.kerberos.client)
        api(libs.spring.security.kerberos.web)
        api(libs.spring.security.kerberos.test)

        api(libs.mq.jms.spring.boot.starter)

        api(libs.springdoc.openapi.starter.common)
        api(libs.springdoc.openapi.starter.webmvc.api)
        api(libs.springdoc.openapi.starter.webmvc.ui)
        api(libs.springdoc.openapi.starter.webflux.api)
        api(libs.springdoc.openapi.starter.webflux.ui)

        api(libs.springwolf.kafka)
        api(libs.springwolf.sns)
        api(libs.springwolf.sqs)
        api(libs.springwolf.stomp)
        api(libs.springwolf.amqp)
        api(libs.springwolf.jms)
        api(libs.springwolf.cloud.stream)
        api(libs.springwolf.ui)
        api(libs.springwolf.common.model.converters)
        api(libs.springwolf.generic.binding)
        api(libs.springwolf.json.schema)

        api(libs.kerb4j.server.spring.security)

        api(libs.liquibase.r2dbc.spring.boot.starter)
        api(libs.db.scheduler.spring.boot.starter)

        api(libs.transactionoutbox.core)
        api(libs.transactionoutbox.spring)
        api(libs.transactionoutbox.jackson)

        api(libs.jobrunr)
        api(libs.jobrunr.spring.boot3.starter)
        api(libs.jobrunr.kotlin19.support)

        api(libs.wiremock.spring.boot)
        // <-- spring
        // --> kotlin
        api(libs.kotlin.logging.spring)
        // <-- kotlin

        api(libs.jakarta.jws.api)
        api(libs.ibm.mq.jakarta.client)
        api(libs.woodstox.core)

        // https://github.com/spring-projects/spring-security/blob/main/gradle/libs.versions.toml#L23
        api(libs.oauth2.oidc.sdk)
        api(libs.nimbus.jose.jwt)
        api(libs.nv.i18n)
        api(libs.threeten.extra)
        api(libs.pdfbox)
        // https://github.com/spring-projects/spring-data-jpa/blob/main/pom.xml#L33
        api(libs.hypersistence.utils.hibernate63)
        api(libs.jasperreports)
        api(libs.freemarker)
        api(libs.logstash.logback.encoder)
        api(libs.shedlock.provider.jdbc) // Отсутствует в BOM от shedlock
        api(libs.cron.utils)
        api(libs.jasypt)
        api(libs.micrometer.context.propagation)
        api(libs.kafka.avro.serializer)
        api(libs.poi)
        api(libs.poi.ooxml)
        api(libs.fastexcel)
        api(libs.fastexcel.reader)
        api(libs.lettuce.core)
        api(libs.guava)
        api(libs.apacheCommonsText)
        api(libs.juniversalchardet)
        api(libs.jaxb.plugins.runtime.asProvider())
        api(libs.jaxb.plugins.asProvider())
        api(libs.apache.httpclient)
        api(libs.apache.httpclient5)

        api(libs.xstream)

        api(libs.quartz.scheduler)
        api(libs.kryo.asProvider())
        api(libs.kryo.library)

        // --> testing
        api(libs.testng)
        api(libs.springmockk)
        api(libs.wiremock)
        api(libs.mockito.kotlin)
        api(libs.testcontainers.redis)
        api(libs.greenmail.asProvider())
        api(libs.greenmail.spring)
        api(libs.greenmail.junit5)
        // <-- testing
    }
}
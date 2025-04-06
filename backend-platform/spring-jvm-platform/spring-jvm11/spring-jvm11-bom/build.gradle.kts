
dependencies {
    // --> spring
    api(platform(backendSpring5.spring.boot.dependencies.spring.boot2))
    api(platform(backendSpring5.spring.cloud.dependencies.spring.boot2))
    // <-- spring
    // --> kotlin
    api(platform(backendSpring5.kotlin.bom))
    api(platform(backendSpring5.kotlinx.coroutines.bom))
    // <-- kotlin
    api(platform(backendSpring5.logbook.bom))
    api(platform(backendSpring5.shedlock.bom.java8))
    api(platform(backendSpring5.resilience4j.bom.java8))
    api(platform(backendSpring5.cxf.bom.java8))
    api(platform(backendSpring5.kerby.bom))
    // --> testing
    api(platform(backendSpring5.testcontainers.bom))
    api(platform(backendSpring5.junit.bom))
    // <-- testing

    constraints {
        // --> spring
        api(backendSpring5.spring.security.kerberos.core.spring5)
        api(backendSpring5.spring.security.kerberos.web.spring5)

        api(backendSpring5.mq.jms.spring.boot.starter.spring.boot2)

        api(backendSpring5.springdoc.openapi.webmvc.core.spring5)
        api(backendSpring5.springdoc.openapi.common.spring5)
        api(backendSpring5.springdoc.openapi.ui.spring5)
        api(backendSpring5.springdoc.openapi.webflux.ui.spring5)
        api(backendSpring5.springdoc.openapi.security.spring5)
        api(backendSpring5.springdoc.openapi.kotlin.spring5)

        api(backendSpring5.kerb4j.server.spring.security.java8)

        api(backendSpring5.liquibase.r2dbc.spring.boot.starter.spring.boot2)
        api(backendSpring5.db.scheduler.spring.boot.starter)

        api(backendSpring5.transactionoutbox.core.java8)
        api(backendSpring5.transactionoutbox.spring.java8)
        api(backendSpring5.transactionoutbox.jackson.java8)

        api(backendSpring5.jobrunr)
        api(backendSpring5.jobrunr.spring.boot2.starter)
        api(backendSpring5.jobrunr.kotlin19.support)
        // <-- spring
        // --> kotlin
        api(backendSpring5.kotlin.logging.jvm)
        // <-- kotlin

        api(backendSpring5.ibm.mq.allclient)
        api(backendSpring5.woodstox.core)

        // https://github.com/spring-projects/spring-security/blob/5.8.x/gradle/backendSpring5.versions.toml#L25
        api(backendSpring5.oauth2.oidc.sdk.spring5)
        api(backendSpring5.nimbus.jose.jwt.spring5)
        api(backendSpring5.nv.i18n)
        api(backendSpring5.threeten.extra)
        api(backendSpring5.pdfbox)
        // https://github.com/spring-projects/spring-data-jpa/blob/2.7.x/pom.xml#L33
        api(backendSpring5.hypersistence.utils.hibernate55)
        api(backendSpring5.jasperreports)
        api(backendSpring5.freemarker)
        api(backendSpring5.logstash.logback.encoder)
        api(backendSpring5.shedlock.provider.jdbc.java8) // Отсутствует в BOM от shedlock
        api(backendSpring5.cron.utils)
        api(backendSpring5.jasypt)
        api(backendSpring5.kafka.avro.serializer)
        api(backendSpring5.poi)
        api(backendSpring5.poi.ooxml)
        api(backendSpring5.fastexcel)
        api(backendSpring5.fastexcel.reader)
        api(backendSpring5.lettuce.core)
        api(backendSpring5.guava)
        api(backendSpring5.apacheCommonsText)
        api(backendSpring5.juniversalchardet)
        api(backendSpring5.jaxb.plugins.runtime.asProvider())
        api(backendSpring5.jaxb.plugins.asProvider())
        api(backendSpring5.apache.httpclient)
        api(backendSpring5.apache.httpclient5)

        api(backendSpring5.xstream)
        api(backendSpring5.kryo.asProvider())
        api(backendSpring5.kryo.library)

        // --> testing
        api(backendSpring5.testng)
        api(backendSpring5.springmockk.spring5)
        api(backendSpring5.wiremock)
        api(backendSpring5.mockito.kotlin)
        api(backendSpring5.awaitility)
        api(backendSpring5.testcontainers.redis)
        // <-- testing
    }
}
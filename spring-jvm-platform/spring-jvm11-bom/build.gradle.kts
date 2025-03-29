
dependencies {
    // --> spring
    api(platform(libs.spring.boot.dependencies.spring.boot2))
    api(platform(libs.spring.cloud.dependencies.spring.boot2))
    // <-- spring
    // --> kotlin
    api(platform(libs.kotlin.bom))
    api(platform(libs.kotlinx.coroutines.bom))
    // <-- kotlin
    api(platform(libs.logbook.bom))
    api(platform(libs.shedlock.bom.java8))
    api(platform(libs.resilience4j.bom.java8))
    api(platform(libs.cxf.bom.java8))
    api(platform(libs.kerby.bom))
    // --> testing
    api(platform(libs.testcontainers.bom))
    api(platform(libs.junit.bom))
    // <-- testing

    constraints {
        // --> spring
        api(libs.spring.security.kerberos.core.spring5)
        api(libs.spring.security.kerberos.web.spring5)

        api(libs.mq.jms.spring.boot.starter.spring.boot2)

        api(libs.springdoc.openapi.webmvc.core.spring5)
        api(libs.springdoc.openapi.common.spring5)
        api(libs.springdoc.openapi.ui.spring5)
        api(libs.springdoc.openapi.webflux.ui.spring5)
        api(libs.springdoc.openapi.security.spring5)
        api(libs.springdoc.openapi.kotlin.spring5)

        api(libs.kerb4j.server.spring.security.java8)

        api(libs.liquibase.r2dbc.spring.boot.starter.spring.boot2)
        api(libs.db.scheduler.spring.boot.starter)

        api(libs.transactionoutbox.core.java8)
        api(libs.transactionoutbox.spring.java8)
        api(libs.transactionoutbox.jackson.java8)

        api(libs.jobrunr)
        api(libs.jobrunr.spring.boot2.starter)
        api(libs.jobrunr.kotlin19.support)
        // <-- spring
        // --> kotlin
        api(libs.kotlin.logging.spring)
        // <-- kotlin

        api(libs.ibm.mq.allclient)
        api(libs.woodstox.core)

        // https://github.com/spring-projects/spring-security/blob/5.8.x/gradle/libs.versions.toml#L25
        api(libs.oauth2.oidc.sdk.spring5)
        api(libs.nimbus.jose.jwt.spring5)
        api(libs.nv.i18n)
        api(libs.threeten.extra)
        api(libs.pdfbox)
        // https://github.com/spring-projects/spring-data-jpa/blob/2.7.x/pom.xml#L33
        api(libs.hypersistence.utils.hibernate55)
        api(libs.jasperreports)
        api(libs.freemarker)
        api(libs.logstash.logback.encoder)
        api(libs.shedlock.provider.jdbc.java8) // Отсутствует в BOM от shedlock
        api(libs.cron.utils)
        api(libs.jasypt)
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
        api(libs.kryo.asProvider())
        api(libs.kryo.library)

        // --> testing
        api(libs.testng)
        api(libs.springmockk.spring5)
        api(libs.wiremock)
        api(libs.mockito.kotlin)
        api(libs.awaitility)
        api(libs.testcontainers.redis)
        // <-- testing
    }
}
dependencies {
    api(platform(libs.assertj.bom))

    constraints {
        api(
            "org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:${libs.versions.kotlin.asProvider().get()}"
        )

        api("org.jetbrains.kotlin:kotlin-gradle-plugin:${libs.versions.kotlin.asProvider().get()}")
        api("org.jetbrains.kotlin:kotlin-allopen:${libs.versions.kotlin.asProvider().get()}")
        api("org.jetbrains.kotlin:kotlin-noarg:${libs.versions.kotlin.asProvider().get()}")
        api("org.jetbrains.kotlin:kotlin-lombok:${libs.versions.kotlin.asProvider().get()}")
        api("org.jetbrains.kotlin:compose-compiler-gradle-plugin:${libs.versions.kotlin.asProvider().get()}")

        api("io.freefair.gradle:lombok-plugin:${libs.versions.lombok.get()}")

        api("org.springframework.boot:spring-boot-gradle-plugin:${libs.versions.spring.boot.get()}")

        api("org.jetbrains.compose:compose-gradle-plugin:${libs.versions.kotlin.compose.plugin.get()}")
        api("com.android.tools.build:gradle:${libs.versions.androidGradlePlugin.get()}")
    }
}

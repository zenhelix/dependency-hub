dependencies {
    api(platform(gradlePluginsDevelopment.assertj.bom))

    constraints {
        api(
            "org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:${gradlePluginsDevelopment.versions.kotlin.asProvider().get()}"
        )

        api("org.jetbrains.kotlin:kotlin-gradle-plugin:${gradlePluginsDevelopment.versions.kotlin.asProvider().get()}")
        api("org.jetbrains.kotlin:kotlin-allopen:${gradlePluginsDevelopment.versions.kotlin.asProvider().get()}")
        api("org.jetbrains.kotlin:kotlin-noarg:${gradlePluginsDevelopment.versions.kotlin.asProvider().get()}")
        api("org.jetbrains.kotlin:kotlin-lombok:${gradlePluginsDevelopment.versions.kotlin.asProvider().get()}")
        api("org.jetbrains.kotlin:compose-compiler-gradle-plugin:${gradlePluginsDevelopment.versions.kotlin.asProvider().get()}")

        api("io.freefair.gradle:lombok-plugin:${gradlePluginsDevelopment.versions.lombok.get()}")

        api("org.springframework.boot:spring-boot-gradle-plugin:${gradlePluginsDevelopment.versions.spring.boot.get()}")

        api("org.jetbrains.compose:compose-gradle-plugin:${gradlePluginsDevelopment.versions.kotlin.compose.plugin.get()}")
        api("com.android.tools.build:gradle:${gradlePluginsDevelopment.versions.androidGradlePlugin.get()}")
    }
}

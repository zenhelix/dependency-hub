dependencies {
    api(platform(libs.kotlin.bom))
    api(platform(libs.kotlinx.serialization.bom))
    api(platform(libs.kotlinx.coroutines.bom))

    api(platform(libs.androidx.compose.bom))
    api(platform(libs.koin.bom))

    api(platform(libs.slf4j.bom))

    constraints {
        api(libs.kotlinx.datetime)

        api(libs.kotlin.logging)
        api(libs.logback.classic)

        api(libs.androidx.activity.compose)
        api(libs.androidx.window)
        api(libs.androidx.window.core)

        api(libs.kotlin.window.core)

        api(libs.kotlin.compose.adaptive.asProvider())
        api(libs.kotlin.compose.adaptive.layout)
        api(libs.kotlin.compose.adaptive.navigation.asProvider())

        api(libs.kotlin.compose.adaptive.navigation.suite)

        api(libs.kotlin.navigation.runtime)
        api(libs.kotlin.navigation.common)
        api(libs.kotlin.navigation.compose)

        api(libs.sqldelight.driver.sqlite)
        api(libs.sqldelight.driver.android)
        api(libs.sqldelight.driver.native)
        api(libs.sqldelight.driver.web.worker)
        api(libs.sqldelight.runtime)
        api(libs.sqldelight.primitive.adapters)
        api(libs.sqldelight.extensions.coroutine)

        api(libs.voyager.navigator)
        api(libs.voyager.screenModel)
        api(libs.voyager.bottomSheetNavigator)
        api(libs.voyager.tabNavigator)
        api(libs.voyager.transitions)
        api(libs.voyager.koin)
    }
}

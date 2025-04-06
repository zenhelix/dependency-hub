dependencies {
    api(platform(kmmClient.kotlin.bom))
    api(platform(kmmClient.kotlinx.serialization.bom))
    api(platform(kmmClient.kotlinx.coroutines.bom))

    api(platform(kmmClient.androidx.compose.bom))
    api(platform(kmmClient.koin.bom))

    api(platform(kmmClient.slf4j.bom))

    constraints {
        api(kmmClient.kotlinx.datetime)

        api(kmmClient.kotlin.logging)
        api(kmmClient.logback.classic)

        api(kmmClient.androidx.activity.compose)
        api(kmmClient.androidx.window)
        api(kmmClient.androidx.window.core)

        api(kmmClient.kotlin.window.core)

        api(kmmClient.kotlin.compose.adaptive.asProvider())
        api(kmmClient.kotlin.compose.adaptive.layout)
        api(kmmClient.kotlin.compose.adaptive.navigation.asProvider())

        api(kmmClient.kotlin.compose.adaptive.navigation.suite)

        api(kmmClient.kotlin.navigation.runtime)
        api(kmmClient.kotlin.navigation.common)
        api(kmmClient.kotlin.navigation.compose)

        api(kmmClient.sqldelight.driver.sqlite)
        api(kmmClient.sqldelight.driver.android)
        api(kmmClient.sqldelight.driver.native)
        api(kmmClient.sqldelight.driver.web.worker)
        api(kmmClient.sqldelight.runtime)
        api(kmmClient.sqldelight.primitive.adapters)
        api(kmmClient.sqldelight.extensions.coroutine)

        api(kmmClient.voyager.navigator)
        api(kmmClient.voyager.screenModel)
        api(kmmClient.voyager.bottomSheetNavigator)
        api(kmmClient.voyager.tabNavigator)
        api(kmmClient.voyager.transitions)
        api(kmmClient.voyager.koin)
    }
}

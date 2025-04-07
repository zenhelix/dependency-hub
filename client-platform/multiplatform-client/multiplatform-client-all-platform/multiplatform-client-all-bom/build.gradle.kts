dependencies {
    api(platform(kmmClientAll.kotlin.bom))
    api(platform(kmmClientAll.kotlinx.serialization.bom))
    api(platform(kmmClientAll.kotlinx.coroutines.bom))

    api(platform(kmmClientAll.androidx.compose.bom))
    api(platform(kmmClientAll.koin.bom))

    api(platform(kmmClientAll.slf4j.bom))

    constraints {
        api(kmmClientAll.kotlinx.datetime)

        api(kmmClientAll.kotlin.logging)
        api(kmmClientAll.logback.classic)

        api(kmmClientAll.androidx.activity.compose)
        api(kmmClientAll.androidx.window)
        api(kmmClientAll.androidx.window.core)

        api(kmmClientAll.kotlin.window.core)

        api(kmmClientAll.kotlin.compose.adaptive.asProvider())
        api(kmmClientAll.kotlin.compose.adaptive.layout)
        api(kmmClientAll.kotlin.compose.adaptive.navigation.asProvider())

        api(kmmClientAll.kotlin.compose.adaptive.navigation.suite)

        api(kmmClientAll.kotlin.navigation.runtime)
        api(kmmClientAll.kotlin.navigation.common)
        api(kmmClientAll.kotlin.navigation.compose)

        api(kmmClientAll.sqldelight.driver.sqlite)
        api(kmmClientAll.sqldelight.driver.android)
        api(kmmClientAll.sqldelight.driver.native)
        api(kmmClientAll.sqldelight.driver.web.worker)
        api(kmmClientAll.sqldelight.runtime)
        api(kmmClientAll.sqldelight.primitive.adapters)
        api(kmmClientAll.sqldelight.extensions.coroutine)

        api(kmmClientAll.voyager.navigator)
        api(kmmClientAll.voyager.screenModel)
        api(kmmClientAll.voyager.bottomSheetNavigator)
        api(kmmClientAll.voyager.tabNavigator)
        api(kmmClientAll.voyager.transitions)
        api(kmmClientAll.voyager.koin)
    }
}

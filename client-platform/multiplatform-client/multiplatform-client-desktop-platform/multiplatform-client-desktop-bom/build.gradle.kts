dependencies {
    api(platform(kmmClientDesktop.kotlin.bom))
    api(platform(kmmClientDesktop.kotlinx.serialization.bom))
    api(platform(kmmClientDesktop.kotlinx.coroutines.bom))

    api(platform(kmmClientDesktop.koin.bom))

    api(platform(kmmClientDesktop.slf4j.bom))

    constraints {
        api(kmmClientDesktop.kotlinx.datetime)

        api(kmmClientDesktop.kotlin.logging)
        api(kmmClientDesktop.logback.classic)

        api(kmmClientDesktop.sqldelight.driver.sqlite)
        api(kmmClientDesktop.sqldelight.runtime)
        api(kmmClientDesktop.sqldelight.primitive.adapters)
        api(kmmClientDesktop.sqldelight.extensions.coroutine)

        api(kmmClientDesktop.voyager.navigator)
        api(kmmClientDesktop.voyager.screenModel)
        api(kmmClientDesktop.voyager.bottomSheetNavigator)
        api(kmmClientDesktop.voyager.tabNavigator)
        api(kmmClientDesktop.voyager.transitions)
        api(kmmClientDesktop.voyager.koin)
    }
}

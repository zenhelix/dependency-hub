dependencies {
    api(platform(kmmClientIos.kotlin.bom))
    api(platform(kmmClientIos.kotlinx.serialization.bom))
    api(platform(kmmClientIos.kotlinx.coroutines.bom))

    api(platform(kmmClientIos.koin.bom))

    constraints {
        api(kmmClientIos.kotlinx.datetime)

        api(kmmClientIos.kotlin.logging)

        api(kmmClientIos.sqldelight.driver.sqlite)
        api(kmmClientIos.sqldelight.driver.native)
        api(kmmClientIos.sqldelight.runtime)
        api(kmmClientIos.sqldelight.primitive.adapters)
        api(kmmClientIos.sqldelight.extensions.coroutine)

        api(kmmClientIos.voyager.navigator)
        api(kmmClientIos.voyager.screenModel)
        api(kmmClientIos.voyager.bottomSheetNavigator)
        api(kmmClientIos.voyager.tabNavigator)
        api(kmmClientIos.voyager.transitions)
        api(kmmClientIos.voyager.koin)
    }
}

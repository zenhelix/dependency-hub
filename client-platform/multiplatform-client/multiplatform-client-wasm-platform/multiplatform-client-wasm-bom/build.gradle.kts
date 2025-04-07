dependencies {
    api(platform(kmmClientWeb.kotlin.bom))
    api(platform(kmmClientWeb.kotlinx.serialization.bom))
    api(platform(kmmClientWeb.kotlinx.coroutines.bom))

    api(platform(kmmClientWeb.koin.bom))

    constraints {
        api(kmmClientWeb.kotlinx.datetime)

        api(kmmClientWeb.kotlin.logging)

        api(kmmClientWeb.sqldelight.driver.sqlite)
        api(kmmClientWeb.sqldelight.driver.web.worker)
        api(kmmClientWeb.sqldelight.runtime)
        api(kmmClientWeb.sqldelight.primitive.adapters)
        api(kmmClientWeb.sqldelight.extensions.coroutine)

        api(kmmClientWeb.voyager.navigator)
        api(kmmClientWeb.voyager.screenModel)
        api(kmmClientWeb.voyager.bottomSheetNavigator)
        api(kmmClientWeb.voyager.tabNavigator)
        api(kmmClientWeb.voyager.transitions)
        api(kmmClientWeb.voyager.koin)
    }
}

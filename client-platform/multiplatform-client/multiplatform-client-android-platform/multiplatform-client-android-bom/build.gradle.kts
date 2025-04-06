dependencies {
    api(platform(kmmClientAndroid.kotlin.bom))
    api(platform(kmmClientAndroid.kotlinx.serialization.bom))
    api(platform(kmmClientAndroid.kotlinx.coroutines.bom))

    api(platform(kmmClientAndroid.androidx.compose.bom))
    api(platform(kmmClientAndroid.koin.bom))

    constraints {
        api(kmmClientAndroid.kotlinx.datetime)

        api(kmmClientAndroid.kotlin.logging)

        api(kmmClientAndroid.androidx.activity.compose)

        api(kmmClientAndroid.sqldelight.driver.sqlite)
        api(kmmClientAndroid.sqldelight.driver.android)
        api(kmmClientAndroid.sqldelight.runtime)
        api(kmmClientAndroid.sqldelight.primitive.adapters)
        api(kmmClientAndroid.sqldelight.extensions.coroutine)

        api(kmmClientAndroid.voyager.navigator)
        api(kmmClientAndroid.voyager.screenModel)
        api(kmmClientAndroid.voyager.bottomSheetNavigator)
        api(kmmClientAndroid.voyager.tabNavigator)
        api(kmmClientAndroid.voyager.transitions)
        api(kmmClientAndroid.voyager.koin)
    }
}

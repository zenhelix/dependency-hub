enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "zenhelix-dependencies"

include(
    ":multiplatform-client-android-platform:multiplatform-client-android-bom",
    ":multiplatform-client-android-platform:multiplatform-client-android-toml"
)
include(
    ":multiplatform-client-ios-platform:multiplatform-client-ios-bom",
    ":multiplatform-client-ios-platform:multiplatform-client-ios-toml"
)
include(
    ":multiplatform-client-web-platform:multiplatform-client-web-bom",
    ":multiplatform-client-web-platform:multiplatform-client-web-toml"
)
include(
    ":multiplatform-client-desktop-platform:multiplatform-client-desktop-bom",
    ":multiplatform-client-desktop-platform:multiplatform-client-desktop-toml"
)
include(
    ":server-jvm-platform:server-jvm-bom",
    ":server-jvm-platform:server-jvm-toml"
)

include(
    ":multiplatform-client-platform:multiplatform-client-bom",
    ":multiplatform-client-platform:multiplatform-client-toml"
)
include(
    ":gradle-plugins-platform:gradle-plugins-bom",
    ":gradle-plugins-platform:gradle-plugins-toml"
)
include(
    ":gradle-plugins-dev-platform:gradle-plugins-dev-bom",
    ":gradle-plugins-dev-platform:gradle-plugins-dev-toml"
)

plugins {
    `maven-publish`
    `java-platform`
    `version-catalog`
}

allprojects {
    group = "io.zenhelix.platform"
}

subprojects {
    apply { plugin("maven-publish") }

    publishing {
        repositories {
            mavenLocal()
        }
    }
}

val platformComponentName: String = "javaPlatform"
val catalogComponentName: String = "versionCatalog"

configure(subprojects.filter { it.name.contains("-bom") }) {
    apply { plugin("java-platform") }

    javaPlatform {
        allowDependencies()
    }

    publishing {
        publications {
            create<MavenPublication>("javaPlatform") {
                from(components[platformComponentName])
            }
        }
    }
}

configure(subprojects.filter { it.name.contains("-toml") }) {
    apply { plugin("version-catalog") }

    publishing {
        publications {
            create<MavenPublication>("versionCatalog") {
                from(components[catalogComponentName])
            }
        }
    }
}
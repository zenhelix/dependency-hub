val platformComponentName: String = "javaPlatform"
val catalogComponentName: String = "versionCatalog"

plugins {
    `java-platform`
    `version-catalog`
    id("io.github.zenhelix.maven-central-publish")
}

allprojects {
    group = "io.github.zenhelix"
}

configure(subprojects.filter { it.childProjects.isEmpty() }.filter { it.name.contains("-bom") || it.name.contains("-toml") }) {
    apply { plugin("io.github.zenhelix.maven-central-publish") }

    publishing {
        repositories {
            mavenLocal()
            mavenCentralPortal {
                credentials {
                    username = System.getProperty("MAVEN_SONATYPE_USERNAME") ?: System.getenv("MAVEN_SONATYPE_USERNAME")
                    password = System.getProperty("MAVEN_SONATYPE_TOKEN") ?: System.getenv("MAVEN_SONATYPE_TOKEN")
                }
            }
        }
    }

    signing {
        val signingKeyId: String? by project
        val signingKey: String? by project
        val signingPassword: String? by project

        useInMemoryPgpKeys(signingKeyId, signingKey, signingPassword)
        sign(publishing.publications)
    }

    publishing.publications.withType<MavenPublication> {
        pom {
            description = "A set of common dependencies"
            url = "https://github.com/zenhelix/zenhelix-dependencies"
            licenses {
                license {
                    name = "The Apache License, Version 2.0"
                    url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
                }
            }
            scm {
                connection = "scm:git:git://github.com/zenhelix/zenhelix-dependencies.git"
                developerConnection = "scm:git:ssh://github.com/zenhelix/zenhelix-dependencies.git"
                url = "https://github.com/zenhelix/zenhelix-dependencies"
            }
            developers {
                developer {
                    id = "dm.medakin"
                    name = "Dmitrii Medakin"
                    email = "dm.medakin.online@gmail.com"
                }
            }
        }
    }

}

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

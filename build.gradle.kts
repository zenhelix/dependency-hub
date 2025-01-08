plugins {
    `maven-publish`
    `java-platform`
    `version-catalog`
    signing
}

allprojects {
    group = "io.github.zenhelix"
}

subprojects {
    apply { plugin("maven-publish") }

    publishing {
        repositories {
            maven("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/") {
                name = "central-release"
                credentials {
                    this.username = System.getProperty("MAVEN_SONATYPE_USERNAME") ?: System.getenv("MAVEN_SONATYPE_USERNAME")
                    this.password = System.getProperty("MAVEN_SONATYPE_TOKEN") ?: System.getenv("MAVEN_SONATYPE_TOKEN")
                }
            }
            mavenLocal()
        }
    }
}

val platformComponentName: String = "javaPlatform"
val catalogComponentName: String = "versionCatalog"

configure(subprojects.filter { it.name.contains("-bom") }) {
    apply {
        plugin("java-platform")
        plugin("signing")
    }

    javaPlatform {
        allowDependencies()
    }

    publishing {
        publications {
            create<MavenPublication>("javaPlatform") {
                from(components[platformComponentName])

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
                }
            }
        }
    }

    signing {
        // ORG_GRADLE_PROJECT_signingKeyId
        val signingKeyId: String? by project
        // ascii-armored format
        // ORG_GRADLE_PROJECT_signingKey
        val signingKey: String? by project
        // ORG_GRADLE_PROJECT_signingPassword
        val signingPassword: String? by project
        useInMemoryPgpKeys(signingKeyId, signingKey, signingPassword)

        sign(publishing.publications["javaPlatform"])
    }
}

configure(subprojects.filter { it.name.contains("-toml") }) {
    apply {
        plugin("version-catalog")
        plugin("signing")
    }

    publishing {
        publications {
            create<MavenPublication>("versionCatalog") {
                from(components[catalogComponentName])

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
                }
            }
        }
    }

    signing {
        // ORG_GRADLE_PROJECT_signingKeyId
        val signingKeyId: String? by project
        // ascii-armored format
        // ORG_GRADLE_PROJECT_signingKey
        val signingKey: String? by project
        // ORG_GRADLE_PROJECT_signingPassword
        val signingPassword: String? by project
        useInMemoryPgpKeys(signingKeyId, signingKey, signingPassword)

        sign(publishing.publications["versionCatalog"])
    }
}
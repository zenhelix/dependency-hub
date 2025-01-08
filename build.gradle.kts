import org.jreleaser.model.Active
import org.jreleaser.model.Http
import org.jreleaser.model.Signing.Mode

plugins {
    `maven-publish`
    `java-platform`
    `version-catalog`
    signing
    id("org.jreleaser") version "1.16.0"
}

// ORG_GRADLE_PROJECT_signingKeyId
val signingKeyId: String? by project
// ascii-armored format
// ORG_GRADLE_PROJECT_signingPublicKey
val signingPublicKey: String? by project
// ascii-armored format
// ORG_GRADLE_PROJECT_signingKey
val signingKey: String? by project
// ORG_GRADLE_PROJECT_signingPassword
val signingPassword: String? by project

val sonatypeUser = System.getProperty("MAVEN_SONATYPE_USERNAME") ?: System.getenv("MAVEN_SONATYPE_USERNAME")
val sonatypePassword = System.getProperty("MAVEN_SONATYPE_TOKEN") ?: System.getenv("MAVEN_SONATYPE_TOKEN")

allprojects {
    group = "io.github.zenhelix"
}

val platformComponentName: String = "javaPlatform"
val catalogComponentName: String = "versionCatalog"

tasks.all {
    //hotfix jreleaser
    doFirst {
        val outputDir = file("build/jreleaser")

        if (!outputDir.exists()) {
            outputDir.mkdirs()
        }
    }
}

configure(subprojects.filter { it.name.contains("-bom") || it.name.contains("-toml") }) {
    apply {
        plugin("maven-publish")
        plugin("org.jreleaser")
    }

    tasks.all {
        //hotfix jreleaser
        doFirst {
            val outputDir = file("build/jreleaser")

            if (!outputDir.exists()) {
                outputDir.mkdirs()
            }
        }
    }

    publishing {
        repositories {
            maven { setUrl(layout.buildDirectory.dir("staging-deploy")) }
            mavenLocal()
        }
    }

    jreleaser {
        signing {
            active = Active.ALWAYS
            artifacts = true
            checksums = true

            armored = true
            verify = true
            mode = Mode.MEMORY

            passphrase = signingPassword
            publicKey = signingPublicKey
            secretKey = signingKey
        }

        deploy {
            maven {
                mavenCentral {
                    create("sonatype") {
                        active = Active.ALWAYS
                        url = "https://central.sonatype.com/api/v1/publisher"
                        username = sonatypeUser
                        password = sonatypePassword
                        authorization = Http.Authorization.BEARER
                        snapshotSupported = true
                        stagingRepository("build/staging-deploy")
                        verifyPom = true
                        applyMavenCentralRules = true
                    }
                }
            }
        }
    }
}

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

    //    signing {
    //        useInMemoryPgpKeys(signingKeyId, signingKey, signingPassword)
    //        sign(publishing.publications["javaPlatform"])
    //    }
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

    //    signing {
    //        useInMemoryPgpKeys(signingKeyId, signingKey, signingPassword)
    //        sign(publishing.publications["versionCatalog"])
    //    }
}

plugins {
    id("version-catalog")
    id("io.github.zenhelix.maven-central-publish")
}

group = "io.github.zenhelix"

val catalogComponentName: String = "versionCatalog"

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

    publications {
        create<MavenPublication>("versionCatalog") {
            from(components[catalogComponentName])

            pom { configurePom() }
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
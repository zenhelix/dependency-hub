import org.gradle.api.publish.maven.MavenPom

fun MavenPom.configurePom() {
    description.set("A set of common dependencies")
    url.set("https://github.com/zenhelix/zenhelix-dependencies")
    licenses {
        license {
            name.set("The Apache License, Version 2.0")
            url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
        }
    }
    scm {
        connection.set("scm:git:git://github.com/zenhelix/zenhelix-dependencies.git")
        developerConnection.set("scm:git:ssh://github.com/zenhelix/zenhelix-dependencies.git")
        url.set("https://github.com/zenhelix/zenhelix-dependencies")
    }
    developers {
        developer {
            id.set("dm.medakin")
            name.set("Dmitrii Medakin")
            email.set("dm.medakin.online@gmail.com")
        }
    }
}
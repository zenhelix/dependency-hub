val platformComponentName: String = "javaPlatform"
val catalogComponentName: String = "versionCatalog"

plugins {
    id("io.github.zenhelix.maven-central-publish") apply false
}

allprojects {
    group = "io.github.zenhelix"
}

configure(subprojects.filter { it.childProjects.isEmpty() && (it.name.contains("-bom") || it.name.contains("-toml")) }) {
    when {
        project.name.contains("-bom") -> apply(plugin = "io.github.zenhelix.bom-convention")
        project.name.contains("-toml") -> apply(plugin = "io.github.zenhelix.toml-convention")
    }
}

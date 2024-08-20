plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"

    // See https://jmfayard.github.io/refreshVersions
    id("de.fayard.refreshVersions") version "0.60.5"
}
rootProject.name = "MySubProject"

refreshVersions {
    @Suppress("UnstableApiUsage")
    rejectVersionIf {
        println("Hello sub rejectVersionIf")
        candidate.value == "2.0.20-Beta2"
    }
}
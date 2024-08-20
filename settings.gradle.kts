plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"

    // See https://jmfayard.github.io/refreshVersions
    id("de.fayard.refreshVersions") version "0.60.5"
}
rootProject.name = "CompositeRefreshVersions"

refreshVersions {
    @Suppress("UnstableApiUsage")
    rejectVersionIf {
        println("Hello main rejectVersionIf")
        candidate.value == "2.0.20-Beta1"
    }
}

includeBuild("MySubProject")

plugins {
    alias(libs.plugins.org.jetbrains.kotlin.jvm)
}

group = "lunabee.rlatapy"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}

tasks.named("refreshVersions") {
    dependsOn(gradle.includedBuild("MySubProject").task(":refreshVersions"))
}
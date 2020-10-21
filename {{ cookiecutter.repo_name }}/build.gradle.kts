import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
    tasktree version Versions.TASK_TREE
    detekt version Versions.DETEKT
    testlogger version Versions.TEST_LOGGER
    noCopyPlugin version Versions.NO_COPY_PLUGIN
    idea
}

group = "{{ cookiecutter.maven_group }}"
version = "0.1"

detekt {
    toolVersion = Versions.DETEKT
    config = files("config/detekt/detekt.yml")
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("bom"))
    implementation(kotlin("stdlib"))

    testImplementation(kotest("runner-junit5-jvm"))
    testImplementation(kotest("assertions-core-jvm"))
    testImplementation(kotest("property-jvm"))
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = listOf("-Xinline-classes")
    }
}

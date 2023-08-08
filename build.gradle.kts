plugins {
    kotlin("jvm") version "1.9.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.javalin:javalin:5.6.0")
    implementation("org.slf4j:slf4j-simple:2.0.7")

    implementation("io.javalin:javalin-rendering:5.6.0")
    implementation("gg.jte:jte:3.0.2")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}
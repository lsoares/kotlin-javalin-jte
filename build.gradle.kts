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
    implementation("org.webjars.npm:htmx.org:1.9.4")

    testImplementation(kotlin("test"))
    testImplementation("com.luissoares:selenium-testing-library:3.6")
    testImplementation("io.github.bonigarcia:webdrivermanager:5.4.1")
    testImplementation("org.seleniumhq.selenium:selenium-chrome-driver:4.11.0")
}

tasks.test {
    useJUnitPlatform()
}

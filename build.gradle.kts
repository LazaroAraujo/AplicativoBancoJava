plugins {
    id("java")
    application
    id("com.gradleup.shadow") version "9.0.1"
}

application {
    mainClass.set("br.com.dio.Main")
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

group = "br.com.dio"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    compileOnly ("org.projectlombok:lombok:1.18.32") // Use the latest version
    annotationProcessor ("org.projectlombok:lombok:1.18.32")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
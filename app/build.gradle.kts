plugins {
    id("java")
    id ("com.github.ben-manes.versions") version ("0.47.0")
    application
    checkstyle
    jacoco
}
tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
application {
    mainClass = "hexlet.code.App"
}
group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
jacoco {
    toolVersion = "0.8.10"
}
tasks.jacocoTestReport { reports { xml.required.set(true) } }


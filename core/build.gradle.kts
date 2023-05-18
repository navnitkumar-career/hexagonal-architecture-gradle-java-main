plugins {
    id("shared-config")
}

dependencies {
    implementation(project(":ports"))
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.7.0")
}

tasks.test {
    useJUnitPlatform()
}

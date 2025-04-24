plugins {
    id("java")
}

group = "com.universeprojects"
version = "1.0-SNAPSHOT"

repositories {
    flatDir {
        dirs("libs")
    }
    mavenCentral()
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
}
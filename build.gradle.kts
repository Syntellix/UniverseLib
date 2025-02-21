plugins {
    id("java")
    //id("com.github.johnrengelman.shadow") version("7.1.2")
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
    compileOnly("net.kyori:adventure-api:4.19.0")
}
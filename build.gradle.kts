plugins {
    `kotlin-dsl`
    `maven-publish`
    java
}

group = "fr.bretzel.minestom.utils"
version = "1.0.0"

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")
}

dependencies {
    //Minestom
    implementation("net.minestom:minestom-snapshots:2f5bb97908")

    //ALS Lib
    implementation("com.github.ALS-Project:Minestom-States:d42b0086f1")
}

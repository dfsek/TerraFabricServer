plugins {
    java
    id("fabric-loom").version("0.6-SNAPSHOT")
}

group = "com.dfsek"
version = "0.1.0"

repositories {
    mavenCentral()
    flatDir {
        dirs("../libs")
    }
}

dependencies {
    testCompile("junit", "junit", "4.12")
    compileOnly(fileTree("./libs/"))

    "minecraft"("com.mojang:minecraft:1.16.5")
    "mappings"("net.fabricmc:yarn:1.16.5+build.5:v2")
    "modImplementation"("net.fabricmc:fabric-loader:0.11.2")

    "modImplementation"("net.fabricmc.fabric-api:fabric-api:0.31.0+1.16")
}

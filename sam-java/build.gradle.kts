plugins {
    id("sam.kotlin")
    id("sam.publish")
}

dependencies {
    api(project(":sam-java-client-okhttp"))
}

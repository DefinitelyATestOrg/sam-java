plugins {
    id("sam.kotlin")
    id("java")
    application
}

dependencies {
    implementation(project(":sam-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    mainClass = "me.elborai.api.example.Main"
}

plugins {
    id("sam.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":sam-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :sam-java-example:run` to run `Main`
    // Use `./gradlew :sam-java-example:run -Dexample=Something` to run `SomethingExample`
    mainClass = "me.elborai.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.7.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:2.0.20")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        {{#each gradle_repositories}}
        maven { url = uri("{{this}}") }
        {{/each}}
    }
}

tasks.register("clean").configure {
    delete("build")
}


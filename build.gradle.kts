plugins {
	id("java")
    id("org.springframework.boot") version "3.1.3" apply false
    id("io.spring.dependency-management") version "1.1.3" apply false
}

group = "xyz.quirkstudios.modalytics"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

subprojects {
    apply<JavaPlugin>()
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")

    group = "xyz.quirkstudios.modalytics"
    version = "0.0.1-SNAPSHOT"

    tasks.withType(JavaCompile::class.java) {
        options.encoding = "UTF-8"
        options.release.set(17)
    }

    java {
        withSourcesJar()
    }

    repositories {
        mavenCentral()
    }

    //configurations {
    //    compileOnly {
    //        extendsFrom(configurations.annotationProcessor.get())
    //    }
    //}

    dependencies {
        //developmentOnly("org.springframework.boot:spring-boot-devtools")
    }
}
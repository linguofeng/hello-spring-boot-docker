buildscript {
    val springBootVersion = "1.4.3.RELEASE"
	val kotlinVersion = "1.0.6"
    extra["kotlinVersion"] = kotlinVersion
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion")
		classpath("org.jetbrains.kotlin:kotlin-noarg:$kotlinVersion")
		classpath("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
		classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}
apply {
	plugin("idea")
	plugin("kotlin")
	plugin("kotlin-spring")
	plugin("org.springframework.boot")
}

version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

configure<JavaPluginConvention> {
	setSourceCompatibility(1.8)
	setTargetCompatibility(1.8)
}

val kotlinVersion = extra["kotlinVersion"] as String

dependencies {
    compile("org.springframework.boot:spring-boot-starter-web")
    compile("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
	compile("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
	compile("com.fasterxml.jackson.module:jackson-module-kotlin:2.8.4")
    testCompile("org.springframework.boot:spring-boot-starter-test")
}

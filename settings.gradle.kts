rootProject.name = "architecturedemo"

include(":application:deal-api")
include(":core:deal")
include(":core:production")

pluginManagement {
    val springBootVersion: String by settings
    val kotlinVersion: String by settings
    val springDependencyManagementVersion: String by settings
    val graalvmBuildToolVersion: String by settings

    plugins {
        id("org.springframework.boot") version springBootVersion
        id("io.spring.dependency-management") version springDependencyManagementVersion
        id("org.graalvm.buildtools.native") version graalvmBuildToolVersion
        kotlin("jvm") version kotlinVersion
        kotlin("plugin.spring") version kotlinVersion
        kotlin("plugin.jpa") version kotlinVersion apply false
        kotlin("plugin.allopen") version kotlinVersion apply false
        kotlin("plugin.noarg") version kotlinVersion apply false
    }
}

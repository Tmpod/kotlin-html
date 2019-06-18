object Versions {
    const val kotlin = "1.3.31"
    const val ktor = "1.2.1"
}

object Plugins {
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object Libs {
    val kotlin = KotlinDeps()
    val ktorServerCore = "io.ktor:ktor-server-core:${Versions.ktor}"
}

class KotlinDeps internal constructor() {
    val stdlib = KotlinStdLibLibs()
    val test = KotlinTestLibs()
}

class KotlinStdLibLibs internal constructor() {
    val common = "org.jetbrains.kotlin:kotlin-stdlib-common:${Versions.kotlin}"
    val jvm = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
}

class KotlinTestLibs internal constructor() {
    val common: List<String> = listOf(
        "org.jetbrains.kotlin:kotlin-test-common:${Versions.kotlin}",
        "org.jetbrains.kotlin:kotlin-test-annotations-common:${Versions.kotlin}"
    )

    val jvm = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
}

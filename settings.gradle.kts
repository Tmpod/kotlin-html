enableFeaturePreview("GRADLE_METADATA")

rootProject.name = "html-builder"

include(
    ":html-builder",
    ":ktor-html-builder",
    ":html-builder-generator"
)
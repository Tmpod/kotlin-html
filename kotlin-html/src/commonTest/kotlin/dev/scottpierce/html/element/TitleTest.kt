package dev.scottpierce.html.element

import kotlin.test.Test

class TitleTest {
    @Test
    fun title() {
        createWriter().apply {
            head {
                title("Test Title")
            }
        } assertEquals {
            """
            <head>
                <title>Test Title</title>
            </head>
            """.trimIndent()
        }
    }
}
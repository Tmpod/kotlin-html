package dev.scottpierce.html.element

import dev.scottpierce.html.write.StringBuilderHtmlWriter
import dev.scottpierce.html.write.WriteOptions
import kotlin.test.Test

class DivTest {
    @Test
    fun writerNoCustomAttributeTest() {
        createWriter().apply {
            div(id = "test-id", classes = "test-class")
        } assertEquals {
            """
            <div id="test-id" class="test-class">
            </div>
            """.trimIndent()
        }
    }

    @Test
    fun writerVarArgAttributeTest() {
        createWriter().apply {
            div("custom-attr" to "custom-attr-value", id = "test-id", classes = "test-class")
        } assertEquals {
            """
            <div id="test-id" class="test-class" custom-attr="custom-attr-value">
            </div>
            """.trimIndent()
        }
    }

    @Test
    fun writerListAttributeTest() {
        createWriter().apply {
            div(attrs = listOf("custom-attr" to "custom-attr-value"), id = "test-id", classes = "test-class")
        } assertEquals {
            """
            <div id="test-id" class="test-class" custom-attr="custom-attr-value">
            </div>
            """.trimIndent()
        }
    }

    @Test
    fun contextNoCustomAttributeTest() {
        val writer = createWriter()

        BodyContext(writer).div(id = "test-id", classes = "test-class")

        writer assertEquals {
            """
            <div id="test-id" class="test-class">
            </div>
            """.trimIndent()
        }
    }

    @Test
    fun contextVarArgAttributeTest() {
        val writer = createWriter()

        BodyContext(writer).div("custom-attr" to "custom-attr-value", id = "test-id", classes = "test-class")

        writer assertEquals {
            """
            <div id="test-id" class="test-class" custom-attr="custom-attr-value">
            </div>
            """.trimIndent()
        }
    }

    @Test
    fun contextListAttributeTest() {
        val writer = createWriter()

        BodyContext(writer).div(attrs = listOf("custom-attr" to "custom-attr-value"), id = "test-id", classes = "test-class")

        writer assertEquals {
            """
            <div id="test-id" class="test-class" custom-attr="custom-attr-value">
            </div>
            """.trimIndent()
        }
    }

    private fun createWriter(): StringBuilderHtmlWriter {
        return StringBuilderHtmlWriter(options = WriteOptions(indent = "    "))
    }

    private infix fun StringBuilderHtmlWriter.assertEquals(expected: () -> String) {
        kotlin.test.assertEquals(expected(), this.toString())
    }
}

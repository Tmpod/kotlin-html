package dev.scottpierce.html.element

import dev.scottpierce.html.write.StringBuilderHtmlWriter
import dev.scottpierce.html.write.WriteOptions
import kotlin.test.Test

class H2Test {
    @Test
    fun writerNoCustomAttributeTest() {
        createWriter().apply {
            h2(id = "test-id", classes = "test-class")
        } assertEquals {
            """
            <h2 id="test-id" class="test-class">
            </h2>
            """.trimIndent()
        }
    }

    @Test
    fun writerVarArgAttributeTest() {
        createWriter().apply {
            h2("custom-attr" to "custom-attr-value", id = "test-id", classes = "test-class")
        } assertEquals {
            """
            <h2 id="test-id" class="test-class" custom-attr="custom-attr-value">
            </h2>
            """.trimIndent()
        }
    }

    @Test
    fun writerListAttributeTest() {
        createWriter().apply {
            h2(attrs = listOf("custom-attr" to "custom-attr-value"), id = "test-id", classes = "test-class")
        } assertEquals {
            """
            <h2 id="test-id" class="test-class" custom-attr="custom-attr-value">
            </h2>
            """.trimIndent()
        }
    }

    @Test
    fun contextNoCustomAttributeTest() {
        val writer = createWriter()

        BodyContext(writer).h2(id = "test-id", classes = "test-class")

        writer assertEquals {
            """
            <h2 id="test-id" class="test-class">
            </h2>
            """.trimIndent()
        }
    }

    @Test
    fun contextVarArgAttributeTest() {
        val writer = createWriter()

        BodyContext(writer).h2("custom-attr" to "custom-attr-value", id = "test-id", classes = "test-class")

        writer assertEquals {
            """
            <h2 id="test-id" class="test-class" custom-attr="custom-attr-value">
            </h2>
            """.trimIndent()
        }
    }

    @Test
    fun contextListAttributeTest() {
        val writer = createWriter()

        BodyContext(writer).h2(attrs = listOf("custom-attr" to "custom-attr-value"), id = "test-id", classes = "test-class")

        writer assertEquals {
            """
            <h2 id="test-id" class="test-class" custom-attr="custom-attr-value">
            </h2>
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

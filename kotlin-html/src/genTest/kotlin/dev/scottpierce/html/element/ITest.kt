package dev.scottpierce.html.element

import dev.scottpierce.html.write.StringBuilderHtmlWriter
import dev.scottpierce.html.write.WriteOptions
import kotlin.test.Test

class ITest {
    @Test
    fun writerNoCustomAttributeTest() {
        createWriter().apply {
            i(id = "test-id", classes = "test-class")
        } assertEquals {
            """
            <i id="test-id" class="test-class">
            </i>
            """.trimIndent()
        }
    }

    @Test
    fun writerVarArgAttributeTest() {
        createWriter().apply {
            i("custom-attr" to "custom-attr-value", id = "test-id", classes = "test-class")
        } assertEquals {
            """
            <i id="test-id" class="test-class" custom-attr="custom-attr-value">
            </i>
            """.trimIndent()
        }
    }

    @Test
    fun writerListAttributeTest() {
        createWriter().apply {
            i(attrs = listOf("custom-attr" to "custom-attr-value"), id = "test-id", classes = "test-class")
        } assertEquals {
            """
            <i id="test-id" class="test-class" custom-attr="custom-attr-value">
            </i>
            """.trimIndent()
        }
    }

    @Test
    fun contextNoCustomAttributeTest() {
        val writer = createWriter()

        BodyContext(writer).i(id = "test-id", classes = "test-class")

        writer assertEquals {
            """
            <i id="test-id" class="test-class">
            </i>
            """.trimIndent()
        }
    }

    @Test
    fun contextVarArgAttributeTest() {
        val writer = createWriter()

        BodyContext(writer).i("custom-attr" to "custom-attr-value", id = "test-id", classes = "test-class")

        writer assertEquals {
            """
            <i id="test-id" class="test-class" custom-attr="custom-attr-value">
            </i>
            """.trimIndent()
        }
    }

    @Test
    fun contextListAttributeTest() {
        val writer = createWriter()

        BodyContext(writer).i(attrs = listOf("custom-attr" to "custom-attr-value"), id = "test-id", classes = "test-class")

        writer assertEquals {
            """
            <i id="test-id" class="test-class" custom-attr="custom-attr-value">
            </i>
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

package dev.scottpierce.html.element

import kotlin.test.Test

class ScriptTest {
    @Test
    fun basic() {
        createWriter().apply {
            script(async = true, defer = true, src = "test")
        } assertEquals {
            """
            <script async defer src="test">
            </script>
            """.trimIndent()
        }
    }

    @Test
    fun context() {
        createWriter().apply {
            html {
                head {
                    script(async = true, src = "test")
                }
            }
        } assertEquals {
            """
            <html>
                <head>
                    <script async src="test">
                    </script>
                </head>
            </html>
            """.trimIndent()
        }
    }
}

// This file was generated using the `kotlin-html-generator` module. Instead of modifying it, modify the
// `html-builder-generator` and run it again.
package dev.scottpierce.html.element

import dev.scottpierce.html.style.Style
import dev.scottpierce.html.write.HtmlWriter
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

@HtmlDsl
inline fun HtmlWriter.footer(
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    this.writeNormalElementStart("footer", id, classes, style)
    BodyContext(this).apply(func)
    this.writeNormalElementEnd("footer")
}

@HtmlDsl
inline fun HtmlWriter.footer(
    vararg attrs: Pair<String, String?>,
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    this.writeNormalElementStart("footer", id, classes, style, attrs)
    BodyContext(this).apply(func)
    this.writeNormalElementEnd("footer")
}

@HtmlDsl
inline fun HtmlWriter.footer(
    attrs: List<Pair<String, String?>>,
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    this.writeNormalElementStart("footer", id, classes, style, attrs)
    BodyContext(this).apply(func)
    this.writeNormalElementEnd("footer")
}

@HtmlDsl
inline fun BodyContext.footer(
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    writer.writeNormalElementStart("footer", id, classes, style)
    func()
    writer.writeNormalElementEnd("footer")
}

@HtmlDsl
inline fun BodyContext.footer(
    vararg attrs: Pair<String, String?>,
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    writer.writeNormalElementStart("footer", id, classes, style, attrs)
    func()
    writer.writeNormalElementEnd("footer")
}

@HtmlDsl
inline fun BodyContext.footer(
    attrs: List<Pair<String, String?>>,
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    writer.writeNormalElementStart("footer", id, classes, style, attrs)
    func()
    writer.writeNormalElementEnd("footer")
}

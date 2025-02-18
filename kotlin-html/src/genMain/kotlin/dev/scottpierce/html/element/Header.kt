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
inline fun HtmlWriter.header(
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    this.writeNormalElementStart("header", id, classes, style)
    BodyContext(this).apply(func)
    this.writeNormalElementEnd("header")
}

@HtmlDsl
inline fun HtmlWriter.header(
    vararg attrs: Pair<String, String?>,
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    this.writeNormalElementStart("header", id, classes, style, attrs)
    BodyContext(this).apply(func)
    this.writeNormalElementEnd("header")
}

@HtmlDsl
inline fun HtmlWriter.header(
    attrs: List<Pair<String, String?>>,
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    this.writeNormalElementStart("header", id, classes, style, attrs)
    BodyContext(this).apply(func)
    this.writeNormalElementEnd("header")
}

@HtmlDsl
inline fun BodyContext.header(
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    writer.writeNormalElementStart("header", id, classes, style)
    func()
    writer.writeNormalElementEnd("header")
}

@HtmlDsl
inline fun BodyContext.header(
    vararg attrs: Pair<String, String?>,
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    writer.writeNormalElementStart("header", id, classes, style, attrs)
    func()
    writer.writeNormalElementEnd("header")
}

@HtmlDsl
inline fun BodyContext.header(
    attrs: List<Pair<String, String?>>,
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    writer.writeNormalElementStart("header", id, classes, style, attrs)
    func()
    writer.writeNormalElementEnd("header")
}

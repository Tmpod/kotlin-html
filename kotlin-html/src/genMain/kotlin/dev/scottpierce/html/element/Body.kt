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
inline fun HtmlWriter.body(
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    this.writeNormalElementStart("body", id, classes, style)
    BodyContext(this).apply(func)
    this.writeNormalElementEnd("body")
}

@HtmlDsl
inline fun HtmlWriter.body(
    vararg attrs: Pair<String, String?>,
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    this.writeNormalElementStart("body", id, classes, style, attrs)
    BodyContext(this).apply(func)
    this.writeNormalElementEnd("body")
}

@HtmlDsl
inline fun HtmlWriter.body(
    attrs: List<Pair<String, String?>>,
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    this.writeNormalElementStart("body", id, classes, style, attrs)
    BodyContext(this).apply(func)
    this.writeNormalElementEnd("body")
}

@HtmlDsl
inline fun HtmlContext.body(
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    writer.writeNormalElementStart("body", id, classes, style)
    BodyContext(writer).apply(func)
    writer.writeNormalElementEnd("body")
}

@HtmlDsl
inline fun HtmlContext.body(
    vararg attrs: Pair<String, String?>,
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    writer.writeNormalElementStart("body", id, classes, style, attrs)
    BodyContext(writer).apply(func)
    writer.writeNormalElementEnd("body")
}

@HtmlDsl
inline fun HtmlContext.body(
    attrs: List<Pair<String, String?>>,
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    writer.writeNormalElementStart("body", id, classes, style, attrs)
    BodyContext(writer).apply(func)
    writer.writeNormalElementEnd("body")
}

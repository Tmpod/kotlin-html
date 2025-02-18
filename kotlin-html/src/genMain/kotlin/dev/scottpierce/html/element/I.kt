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
inline fun HtmlWriter.i(
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    this.writeNormalElementStart("i", id, classes, style)
    BodyContext(this).apply(func)
    this.writeNormalElementEnd("i")
}

@HtmlDsl
inline fun HtmlWriter.i(
    vararg attrs: Pair<String, String?>,
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    this.writeNormalElementStart("i", id, classes, style, attrs)
    BodyContext(this).apply(func)
    this.writeNormalElementEnd("i")
}

@HtmlDsl
inline fun HtmlWriter.i(
    attrs: List<Pair<String, String?>>,
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    this.writeNormalElementStart("i", id, classes, style, attrs)
    BodyContext(this).apply(func)
    this.writeNormalElementEnd("i")
}

@HtmlDsl
inline fun BodyContext.i(
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    writer.writeNormalElementStart("i", id, classes, style)
    func()
    writer.writeNormalElementEnd("i")
}

@HtmlDsl
inline fun BodyContext.i(
    vararg attrs: Pair<String, String?>,
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    writer.writeNormalElementStart("i", id, classes, style, attrs)
    func()
    writer.writeNormalElementEnd("i")
}

@HtmlDsl
inline fun BodyContext.i(
    attrs: List<Pair<String, String?>>,
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    writer.writeNormalElementStart("i", id, classes, style, attrs)
    func()
    writer.writeNormalElementEnd("i")
}

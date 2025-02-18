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
inline fun HtmlWriter.h4(
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    this.writeNormalElementStart("h4", id, classes, style)
    BodyContext(this).apply(func)
    this.writeNormalElementEnd("h4")
}

@HtmlDsl
inline fun HtmlWriter.h4(
    vararg attrs: Pair<String, String?>,
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    this.writeNormalElementStart("h4", id, classes, style, attrs)
    BodyContext(this).apply(func)
    this.writeNormalElementEnd("h4")
}

@HtmlDsl
inline fun HtmlWriter.h4(
    attrs: List<Pair<String, String?>>,
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    this.writeNormalElementStart("h4", id, classes, style, attrs)
    BodyContext(this).apply(func)
    this.writeNormalElementEnd("h4")
}

@HtmlDsl
inline fun BodyContext.h4(
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    writer.writeNormalElementStart("h4", id, classes, style)
    func()
    writer.writeNormalElementEnd("h4")
}

@HtmlDsl
inline fun BodyContext.h4(
    vararg attrs: Pair<String, String?>,
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    writer.writeNormalElementStart("h4", id, classes, style, attrs)
    func()
    writer.writeNormalElementEnd("h4")
}

@HtmlDsl
inline fun BodyContext.h4(
    attrs: List<Pair<String, String?>>,
    id: String? = null,
    classes: String? = null,
    style: Style? = null,
    func: BodyContext.() -> Unit = {}
) {
    writer.writeNormalElementStart("h4", id, classes, style, attrs)
    func()
    writer.writeNormalElementEnd("h4")
}

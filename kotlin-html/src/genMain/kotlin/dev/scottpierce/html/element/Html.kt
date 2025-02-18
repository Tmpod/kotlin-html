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
inline fun HtmlWriter.html(
    classes: String? = null,
    style: Style? = null,
    lang: String? = null,
    func: HtmlContext.() -> Unit = {}
) {
    this.writeTag("html")
    this.writeStandardAttributes(null, classes, style)
    if (lang != null) this.write(" lang=\"").write(lang).write('"')
    this.write('>')
    this.indent()
    HtmlContext(this).apply(func)
    this.writeNormalElementEnd("html")
}

@HtmlDsl
inline fun HtmlWriter.html(
    vararg attrs: Pair<String, String?>,
    classes: String? = null,
    style: Style? = null,
    lang: String? = null,
    func: HtmlContext.() -> Unit = {}
) {
    this.writeTag("html")
    this.writeStandardAttributes(null, classes, style)
    if (lang != null) this.write(" lang=\"").write(lang).write('"')
    this.writeAttributes(attrs)
    this.write('>')
    this.indent()
    HtmlContext(this).apply(func)
    this.writeNormalElementEnd("html")
}

@HtmlDsl
inline fun HtmlWriter.html(
    attrs: List<Pair<String, String?>>,
    classes: String? = null,
    style: Style? = null,
    lang: String? = null,
    func: HtmlContext.() -> Unit = {}
) {
    this.writeTag("html")
    this.writeStandardAttributes(null, classes, style)
    if (lang != null) this.write(" lang=\"").write(lang).write('"')
    this.writeAttributes(attrs)
    this.write('>')
    this.indent()
    HtmlContext(this).apply(func)
    this.writeNormalElementEnd("html")
}

@HtmlDsl
inline fun FileContext.html(
    classes: String? = null,
    style: Style? = null,
    lang: String? = null,
    func: HtmlContext.() -> Unit = {}
) {
    writer.writeTag("html")
    writer.writeStandardAttributes(null, classes, style)
    if (lang != null) writer.write(" lang=\"").write(lang).write('"')
    writer.write('>')
    writer.indent()
    HtmlContext(writer).apply(func)
    writer.writeNormalElementEnd("html")
}

@HtmlDsl
inline fun FileContext.html(
    vararg attrs: Pair<String, String?>,
    classes: String? = null,
    style: Style? = null,
    lang: String? = null,
    func: HtmlContext.() -> Unit = {}
) {
    writer.writeTag("html")
    writer.writeStandardAttributes(null, classes, style)
    if (lang != null) writer.write(" lang=\"").write(lang).write('"')
    writer.writeAttributes(attrs)
    writer.write('>')
    writer.indent()
    HtmlContext(writer).apply(func)
    writer.writeNormalElementEnd("html")
}

@HtmlDsl
inline fun FileContext.html(
    attrs: List<Pair<String, String?>>,
    classes: String? = null,
    style: Style? = null,
    lang: String? = null,
    func: HtmlContext.() -> Unit = {}
) {
    writer.writeTag("html")
    writer.writeStandardAttributes(null, classes, style)
    if (lang != null) writer.write(" lang=\"").write(lang).write('"')
    writer.writeAttributes(attrs)
    writer.write('>')
    writer.indent()
    HtmlContext(writer).apply(func)
    writer.writeNormalElementEnd("html")
}

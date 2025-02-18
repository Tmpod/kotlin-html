package dev.scottpierce.html.element

import dev.scottpierce.html.style.Style
import dev.scottpierce.html.style.writeStyle
import dev.scottpierce.html.write.HtmlWriter

fun HtmlWriter.writeNormalElementStart(
    tag: String,
    id: String?,
    classes: String?,
    style: Style?
) {
    writeTag(tag)
    writeStandardAttributes(id, classes, style)
    write('>')
    indent()
}

fun HtmlWriter.writeNormalElementStart(
    tag: String,
    id: String?,
    classes: String?,
    style: Style?,
    attrs: Array<out Pair<String, String?>>
) {
    writeTag(tag)
    writeStandardAttributes(id, classes, style)
    writeAttributes(attrs)

    write('>')
    indent()
}

fun HtmlWriter.writeNormalElementStart(
    tag: String,
    id: String?,
    classes: String?,
    style: Style?,
    attrs: List<Pair<String, String?>>
) {
    writeTag(tag)
    writeStandardAttributes(id, classes, style)
    writeAttributes(attrs)

    write('>')
    indent()
}

fun HtmlWriter.writeNormalElementEnd(tag: String) {
    deindent()
    newLine()
    write("</").write(tag).write('>')
}

fun HtmlWriter.writeVoidElement(
    tag: String,
    id: String?,
    classes: String?,
    style: Style?
) {
    writeTag(tag)
    writeStandardAttributes(id, classes, style)
    write('>')
}

fun HtmlWriter.writeVoidElement(
    tag: String,
    id: String?,
    classes: String?,
    style: Style?,
    attrs: Array<out Pair<String, String?>>
) {
    writeTag(tag)
    writeStandardAttributes(id, classes, style)
    writeAttributes(attrs)
    write('>')
}

fun HtmlWriter.writeVoidElement(
    tag: String,
    id: String?,
    classes: String?,
    style: Style?,
    attrs: List<Pair<String, String?>>
) {
    writeTag(tag)
    writeStandardAttributes(id, classes, style)
    writeAttributes(attrs)
    write('>')
}

fun HtmlWriter.writeTag(tag: String) {
    if (!isEmpty) newLine()
    write('<').write(tag)
}

fun HtmlWriter.writeStandardAttributes(id: String?, classes: String?, style: Style?) {
    if (id != null) write(" id=\"").write(id).write('"')
    if (classes != null) write(" class=\"").write(classes).write('"')
    if (style != null) {
        write(" style=\"")
        writeStyle(style, true)
        write('"')
    }
}

fun HtmlWriter.writeAttributes(attrs: Array<out Pair<String, String?>>) {
    for (attr in attrs) {
        attr.checkAttributeKey()
        write(' ').write(attr.first)
        val value: String? = attr.second
        if (value != null) {
            write("=\"").write(value.escapeForHtml()).write('"')
        }
    }
}

fun HtmlWriter.writeAttributes(attrs: List<Pair<String, String?>>) {
    for (attr in attrs) {
        attr.checkAttributeKey()
        write(' ').write(attr.first)
        val value: String? = attr.second
        if (value != null) {
            write("=\"").write(value.escapeForHtml()).write('"')
        }
    }
}

fun Pair<String, String?>.checkAttributeKey() {
    val attributeKey = first

    if (attributeKey.isEmpty()) {
        throw IllegalArgumentException("Attribute name must not be empty. Has value: '$second'")
    }

    for (c in attributeKey) {
        if (c.isWhitespace()) {
            throw IllegalArgumentException("Attribute name must not contain whitespace character. Attribute: " +
                    "'$attributeKey' with value: '$second'")
        }
    }
}

fun String.escapeForHtml(): String {
    return if (this.needsToBeEscapedForHtml()) {
        val sb = StringBuilder(length + 16)

        for (c in this) {
            if (c == '"') {
                sb.append("&quot;")
            } else {
                sb.append(c)
            }
        }

        sb.toString()
    } else {
        this
    }
}

fun String.needsToBeEscapedForHtml(): Boolean {
    for (c in this) {
        if (c == '"') {
            return true
        }
    }

    return false
}
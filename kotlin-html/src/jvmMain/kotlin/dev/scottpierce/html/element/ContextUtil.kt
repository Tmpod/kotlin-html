package dev.scottpierce.html.element

import dev.scottpierce.html.FileCache
import dev.scottpierce.html.write.HtmlWriter
import dev.scottpierce.html.write.PlatformWriter
import java.io.File

fun HtmlWriter.inlineFile(file: File) {
    val fileLines = FileCache.get(file)

    val writerUsesLineSeparator = options.newLine == System.lineSeparator()
    val lastIndex = fileLines.lastIndex

    newLine()

    for (i in fileLines.indices) {
        val line = fileLines[i]

        write(line)

        if (i != lastIndex) {
            if (writerUsesLineSeparator) {
                newLine()
            } else {
                write(PlatformWriter.lineSeparator)
            }
        }
    }
}

fun Context.inlineFile(file: File) {
    writer.inlineFile(file)
}

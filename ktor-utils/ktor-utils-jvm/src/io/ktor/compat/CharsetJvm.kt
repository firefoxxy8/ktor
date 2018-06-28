package io.ktor.compat

import kotlinx.io.charsets.*
import java.util.*

actual fun Char.isLowerCase(): Boolean = Character.isLowerCase(this)

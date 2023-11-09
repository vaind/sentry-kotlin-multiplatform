@file:OptIn(ExperimentalForeignApi::class, UnsafeNumber::class)

package io.sentry.kotlin.multiplatform.extensions

import io.sentry.kotlin.multiplatform.SentryLevel
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.UnsafeNumber
import kotlinx.cinterop.convert
import cocoapods.Sentry.SentryLevel as CocoaSentryLevel

internal fun SentryLevel.toCocoaSentryLevel() = this.toInt().convert<CocoaSentryLevel>()

internal fun CocoaSentryLevel.toKmpSentryLevel() = SentryLevel.fromInt(this.toInt())

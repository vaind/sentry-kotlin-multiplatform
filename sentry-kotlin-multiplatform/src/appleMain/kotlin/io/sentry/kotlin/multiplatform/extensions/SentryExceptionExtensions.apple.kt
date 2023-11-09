@file:OptIn(ExperimentalForeignApi::class)

package io.sentry.kotlin.multiplatform.extensions

import io.sentry.kotlin.multiplatform.CocoaSentryException
import io.sentry.kotlin.multiplatform.protocol.SentryException
import kotlinx.cinterop.ExperimentalForeignApi

internal fun CocoaSentryException.toKmpSentryException() = SentryException(
    type = type,
    value = value,
    module = module,
    threadId = threadId?.longLongValue // longLong represents a 64-bit integer like Kotlin Long
)

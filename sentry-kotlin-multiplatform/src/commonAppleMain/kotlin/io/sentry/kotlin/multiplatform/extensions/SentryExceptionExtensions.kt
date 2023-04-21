package io.sentry.kotlin.multiplatform.extensions

import io.sentry.kotlin.multiplatform.CocoaSentryException
import io.sentry.kotlin.multiplatform.protocol.SentryException

internal fun CocoaSentryException.toKmpSentryException() = SentryException(
    type = type,
    value = value,
    module = module,
    threadId = threadId as Long?
)

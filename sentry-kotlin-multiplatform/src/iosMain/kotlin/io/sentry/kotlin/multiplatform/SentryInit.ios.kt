package io.sentry.kotlin.multiplatform

import cocoapods.Sentry.SentrySDK
import io.sentry.kotlin.multiplatform.extensions.toIosOptionsConfiguration

internal actual fun initSentry(configuration: OptionsConfiguration) {
  val options = SentryOptions()
  configuration.invoke(options)
  SentrySDK.start(options.toIosOptionsConfiguration())
}

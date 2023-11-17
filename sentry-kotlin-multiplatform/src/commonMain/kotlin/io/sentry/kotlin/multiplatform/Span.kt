package io.sentry.kotlin.multiplatform

public expect interface ISpan {
    /**
     * Starts a child Span.
     *
     * @param operation - new span operation name
     * @return a new transaction span
     */
    public fun startChild(operation: String): ISpan

    /**
     * Starts a child Span.
     *
     * @param operation - new span operation name
     * @param description - new span description name
     * @return a new transaction span
     */
    public fun startChild(operation: String, description: String?): ISpan

    /** Sets span timestamp marking this span as finished.  */
    public fun finish()

    /**
     * Sets span timestamp marking this span as finished.
     *
     * @param status - the status
     */
    public fun finish(status: SpanStatus2?)

    /**
     * Sets span timestamp marking this span as finished.
     *
     * @param status - the status
     * @param timestamp - the end timestamp
     */
    public fun finish(status: SpanStatus2?, timestamp: SentryDate?)

    /**
     * Sets span operation.
     *
     * @param operation - the operation
     */
    public fun setOperation(operation: String)

    /**
     * Returns the span operation.
     *
     * @return the operation
     */
    public fun getOperation(): String

    /**
     * Sets span description.
     *
     * @param description - the description.
     */
    public fun setDescription(description: String?)

    /**
     * Returns the span description.
     *
     * @return the description
     */
    public fun getDescription(): String?

    /**
     * Sets span status.
     *
     * @param status - the status.
     */
    public fun setStatus(status: SpanStatus2?)

    /**
     * Returns the span status
     *
     * @return the status
     */
    public fun getStatus(): SpanStatus2?

    /**
     * Sets extra data on span or transaction.
     *
     * @param key the data key
     * @param value the data value
     */
    public fun setData(key: String, value: Any)

    /**
     * Returns extra data from span or transaction.
     *
     * @return the data
     */
    public fun getData(key: String): Any?

    /**
     * Returns if span has finished.
     *
     * @return if span has finished.
     */
    public fun isFinished(): Boolean
}

public expect class Span internal constructor() : ISpan {
    /**
     * Starts a child Span.
     *
     * @param operation - new span operation name
     * @return a new transaction span
     */
    public override fun startChild(operation: String): ISpan

    /**
     * Starts a child Span.
     *
     * @param operation - new span operation name
     * @param description - new span description name
     * @return a new transaction span
     */
    public override fun startChild(operation: String, description: String?): ISpan

    /** Sets span timestamp marking this span as finished.  */
    public override fun finish()

    /**
     * Sets span timestamp marking this span as finished.
     *
     * @param status - the status
     */
    public override fun finish(status: SpanStatus2?)

    /**
     * Sets span timestamp marking this span as finished.
     *
     * @param status - the status
     * @param timestamp - the end timestamp
     */
    public override fun finish(status: SpanStatus2?, timestamp: SentryDate?)

    /**
     * Sets span operation.
     *
     * @param operation - the operation
     */
    public override fun setOperation(operation: String)

    /**
     * Returns the span operation.
     *
     * @return the operation
     */
    public override fun getOperation(): String

    /**
     * Sets span description.
     *
     * @param description - the description.
     */
    public override fun setDescription(description: String?)

    /**
     * Returns the span description.
     *
     * @return the description
     */
    public override fun getDescription(): String?

    /**
     * Sets span status.
     *
     * @param status - the status.
     */
    public override fun setStatus(status: SpanStatus2?)

    /**
     * Returns the span status
     *
     * @return the status
     */
    public override fun getStatus(): SpanStatus2?

    /**
     * Sets extra data on span or transaction.
     *
     * @param key the data key
     * @param value the data value
     */
    public override fun setData(key: String, value: Any)

    /**
     * Returns extra data from span or transaction.
     *
     * @return the data
     */
    public override fun getData(key: String): Any?

    /**
     * Returns if span has finished.
     *
     * @return if span has finished.
     */
    public override fun isFinished(): Boolean
}
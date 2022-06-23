//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/abci/v1beta1/abci.proto

package cosmos.base.abci.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun result(block: cosmos.base.abci.v1beta1.ResultKt.Dsl.() -> kotlin.Unit): cosmos.base.abci.v1beta1.Abci.Result =
  cosmos.base.abci.v1beta1.ResultKt.Dsl._create(cosmos.base.abci.v1beta1.Abci.Result.newBuilder()).apply { block() }._build()
public object ResultKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.abci.v1beta1.Abci.Result.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.abci.v1beta1.Abci.Result.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.abci.v1beta1.Abci.Result = _builder.build()

    /**
     * <pre>
     * Data is any data returned from message or handler execution. It MUST be
     * length prefixed in order to separate data from multiple message executions.
     * </pre>
     *
     * <code>bytes data = 1;</code>
     */
    public var data: com.google.protobuf.ByteString
      @JvmName("getData")
      get() = _builder.getData()
      @JvmName("setData")
      set(value) {
        _builder.setData(value)
      }
    /**
     * <pre>
     * Data is any data returned from message or handler execution. It MUST be
     * length prefixed in order to separate data from multiple message executions.
     * </pre>
     *
     * <code>bytes data = 1;</code>
     */
    public fun clearData() {
      _builder.clearData()
    }

    /**
     * <pre>
     * Log contains the log information from message or handler execution.
     * </pre>
     *
     * <code>string log = 2;</code>
     */
    public var log: kotlin.String
      @JvmName("getLog")
      get() = _builder.getLog()
      @JvmName("setLog")
      set(value) {
        _builder.setLog(value)
      }
    /**
     * <pre>
     * Log contains the log information from message or handler execution.
     * </pre>
     *
     * <code>string log = 2;</code>
     */
    public fun clearLog() {
      _builder.clearLog()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class EventsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * Events contains a slice of Event objects that were emitted during message
     * or handler execution.
     * </pre>
     *
     * <code>repeated .tendermint.abci.Event events = 3 [(.gogoproto.nullable) = false];</code>
     */
     public val events: com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Event, EventsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getEventsList()
      )
    /**
     * <pre>
     * Events contains a slice of Event objects that were emitted during message
     * or handler execution.
     * </pre>
     *
     * <code>repeated .tendermint.abci.Event events = 3 [(.gogoproto.nullable) = false];</code>
     * @param value The events to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addEvents")
    public fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Event, EventsProxy>.add(value: tendermint.abci.Types.Event) {
      _builder.addEvents(value)
    }/**
     * <pre>
     * Events contains a slice of Event objects that were emitted during message
     * or handler execution.
     * </pre>
     *
     * <code>repeated .tendermint.abci.Event events = 3 [(.gogoproto.nullable) = false];</code>
     * @param value The events to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignEvents")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Event, EventsProxy>.plusAssign(value: tendermint.abci.Types.Event) {
      add(value)
    }/**
     * <pre>
     * Events contains a slice of Event objects that were emitted during message
     * or handler execution.
     * </pre>
     *
     * <code>repeated .tendermint.abci.Event events = 3 [(.gogoproto.nullable) = false];</code>
     * @param values The events to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllEvents")
    public fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Event, EventsProxy>.addAll(values: kotlin.collections.Iterable<tendermint.abci.Types.Event>) {
      _builder.addAllEvents(values)
    }/**
     * <pre>
     * Events contains a slice of Event objects that were emitted during message
     * or handler execution.
     * </pre>
     *
     * <code>repeated .tendermint.abci.Event events = 3 [(.gogoproto.nullable) = false];</code>
     * @param values The events to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllEvents")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Event, EventsProxy>.plusAssign(values: kotlin.collections.Iterable<tendermint.abci.Types.Event>) {
      addAll(values)
    }/**
     * <pre>
     * Events contains a slice of Event objects that were emitted during message
     * or handler execution.
     * </pre>
     *
     * <code>repeated .tendermint.abci.Event events = 3 [(.gogoproto.nullable) = false];</code>
     * @param index The index to set the value at.
     * @param value The events to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setEvents")
    public operator fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Event, EventsProxy>.set(index: kotlin.Int, value: tendermint.abci.Types.Event) {
      _builder.setEvents(index, value)
    }/**
     * <pre>
     * Events contains a slice of Event objects that were emitted during message
     * or handler execution.
     * </pre>
     *
     * <code>repeated .tendermint.abci.Event events = 3 [(.gogoproto.nullable) = false];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearEvents")
    public fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Event, EventsProxy>.clear() {
      _builder.clearEvents()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.abci.v1beta1.Abci.Result.copy(block: cosmos.base.abci.v1beta1.ResultKt.Dsl.() -> kotlin.Unit): cosmos.base.abci.v1beta1.Abci.Result =
  cosmos.base.abci.v1beta1.ResultKt.Dsl._create(this.toBuilder()).apply { block() }._build()

//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

@kotlin.jvm.JvmSynthetic
public inline fun responseBeginBlock(block: tendermint.abci.ResponseBeginBlockKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.ResponseBeginBlock =
  tendermint.abci.ResponseBeginBlockKt.Dsl._create(tendermint.abci.Types.ResponseBeginBlock.newBuilder()).apply { block() }._build()
public object ResponseBeginBlockKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.abci.Types.ResponseBeginBlock.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.abci.Types.ResponseBeginBlock.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.abci.Types.ResponseBeginBlock = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class EventsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .tendermint.abci.Event events = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "events,omitempty"];</code>
     */
     public val events: com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Event, EventsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getEventsList()
      )
    /**
     * <code>repeated .tendermint.abci.Event events = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "events,omitempty"];</code>
     * @param value The events to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addEvents")
    public fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Event, EventsProxy>.add(value: tendermint.abci.Types.Event) {
      _builder.addEvents(value)
    }/**
     * <code>repeated .tendermint.abci.Event events = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "events,omitempty"];</code>
     * @param value The events to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignEvents")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Event, EventsProxy>.plusAssign(value: tendermint.abci.Types.Event) {
      add(value)
    }/**
     * <code>repeated .tendermint.abci.Event events = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "events,omitempty"];</code>
     * @param values The events to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllEvents")
    public fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Event, EventsProxy>.addAll(values: kotlin.collections.Iterable<tendermint.abci.Types.Event>) {
      _builder.addAllEvents(values)
    }/**
     * <code>repeated .tendermint.abci.Event events = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "events,omitempty"];</code>
     * @param values The events to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllEvents")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Event, EventsProxy>.plusAssign(values: kotlin.collections.Iterable<tendermint.abci.Types.Event>) {
      addAll(values)
    }/**
     * <code>repeated .tendermint.abci.Event events = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "events,omitempty"];</code>
     * @param index The index to set the value at.
     * @param value The events to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setEvents")
    public operator fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Event, EventsProxy>.set(index: kotlin.Int, value: tendermint.abci.Types.Event) {
      _builder.setEvents(index, value)
    }/**
     * <code>repeated .tendermint.abci.Event events = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "events,omitempty"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearEvents")
    public fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Event, EventsProxy>.clear() {
      _builder.clearEvents()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.abci.Types.ResponseBeginBlock.copy(block: tendermint.abci.ResponseBeginBlockKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.ResponseBeginBlock =
  tendermint.abci.ResponseBeginBlockKt.Dsl._create(this.toBuilder()).apply { block() }._build()

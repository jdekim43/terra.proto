//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/channel/v1/query.proto

package ibc.core.channel.v1;

@kotlin.jvm.JvmSynthetic
public inline fun queryUnreceivedAcksRequest(block: ibc.core.channel.v1.QueryUnreceivedAcksRequestKt.Dsl.() -> kotlin.Unit): ibc.core.channel.v1.QueryOuterClass.QueryUnreceivedAcksRequest =
  ibc.core.channel.v1.QueryUnreceivedAcksRequestKt.Dsl._create(ibc.core.channel.v1.QueryOuterClass.QueryUnreceivedAcksRequest.newBuilder()).apply { block() }._build()
public object QueryUnreceivedAcksRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.channel.v1.QueryOuterClass.QueryUnreceivedAcksRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.channel.v1.QueryOuterClass.QueryUnreceivedAcksRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.channel.v1.QueryOuterClass.QueryUnreceivedAcksRequest = _builder.build()

    /**
     * <pre>
     * port unique identifier
     * </pre>
     *
     * <code>string port_id = 1;</code>
     */
    public var portId: kotlin.String
      @JvmName("getPortId")
      get() = _builder.getPortId()
      @JvmName("setPortId")
      set(value) {
        _builder.setPortId(value)
      }
    /**
     * <pre>
     * port unique identifier
     * </pre>
     *
     * <code>string port_id = 1;</code>
     */
    public fun clearPortId() {
      _builder.clearPortId()
    }

    /**
     * <pre>
     * channel unique identifier
     * </pre>
     *
     * <code>string channel_id = 2;</code>
     */
    public var channelId: kotlin.String
      @JvmName("getChannelId")
      get() = _builder.getChannelId()
      @JvmName("setChannelId")
      set(value) {
        _builder.setChannelId(value)
      }
    /**
     * <pre>
     * channel unique identifier
     * </pre>
     *
     * <code>string channel_id = 2;</code>
     */
    public fun clearChannelId() {
      _builder.clearChannelId()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class PacketAckSequencesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * list of acknowledgement sequences
     * </pre>
     *
     * <code>repeated uint64 packet_ack_sequences = 3;</code>
     */
     public val packetAckSequences: com.google.protobuf.kotlin.DslList<kotlin.Long, PacketAckSequencesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getPacketAckSequencesList()
      )
    /**
     * <pre>
     * list of acknowledgement sequences
     * </pre>
     *
     * <code>repeated uint64 packet_ack_sequences = 3;</code>
     * @param value The packetAckSequences to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addPacketAckSequences")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, PacketAckSequencesProxy>.add(value: kotlin.Long) {
      _builder.addPacketAckSequences(value)
    }/**
     * <pre>
     * list of acknowledgement sequences
     * </pre>
     *
     * <code>repeated uint64 packet_ack_sequences = 3;</code>
     * @param value The packetAckSequences to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignPacketAckSequences")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, PacketAckSequencesProxy>.plusAssign(value: kotlin.Long) {
      add(value)
    }/**
     * <pre>
     * list of acknowledgement sequences
     * </pre>
     *
     * <code>repeated uint64 packet_ack_sequences = 3;</code>
     * @param values The packetAckSequences to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllPacketAckSequences")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, PacketAckSequencesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Long>) {
      _builder.addAllPacketAckSequences(values)
    }/**
     * <pre>
     * list of acknowledgement sequences
     * </pre>
     *
     * <code>repeated uint64 packet_ack_sequences = 3;</code>
     * @param values The packetAckSequences to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllPacketAckSequences")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, PacketAckSequencesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Long>) {
      addAll(values)
    }/**
     * <pre>
     * list of acknowledgement sequences
     * </pre>
     *
     * <code>repeated uint64 packet_ack_sequences = 3;</code>
     * @param index The index to set the value at.
     * @param value The packetAckSequences to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setPacketAckSequences")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, PacketAckSequencesProxy>.set(index: kotlin.Int, value: kotlin.Long) {
      _builder.setPacketAckSequences(index, value)
    }/**
     * <pre>
     * list of acknowledgement sequences
     * </pre>
     *
     * <code>repeated uint64 packet_ack_sequences = 3;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearPacketAckSequences")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, PacketAckSequencesProxy>.clear() {
      _builder.clearPacketAckSequences()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.channel.v1.QueryOuterClass.QueryUnreceivedAcksRequest.copy(block: ibc.core.channel.v1.QueryUnreceivedAcksRequestKt.Dsl.() -> kotlin.Unit): ibc.core.channel.v1.QueryOuterClass.QueryUnreceivedAcksRequest =
  ibc.core.channel.v1.QueryUnreceivedAcksRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

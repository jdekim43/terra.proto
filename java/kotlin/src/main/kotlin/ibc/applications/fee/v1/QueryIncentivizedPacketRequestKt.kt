//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/applications/fee/v1/query.proto

package ibc.applications.fee.v1;

@kotlin.jvm.JvmSynthetic
public inline fun queryIncentivizedPacketRequest(block: ibc.applications.fee.v1.QueryIncentivizedPacketRequestKt.Dsl.() -> kotlin.Unit): ibc.applications.fee.v1.QueryOuterClass.QueryIncentivizedPacketRequest =
  ibc.applications.fee.v1.QueryIncentivizedPacketRequestKt.Dsl._create(ibc.applications.fee.v1.QueryOuterClass.QueryIncentivizedPacketRequest.newBuilder()).apply { block() }._build()
public object QueryIncentivizedPacketRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.applications.fee.v1.QueryOuterClass.QueryIncentivizedPacketRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.applications.fee.v1.QueryOuterClass.QueryIncentivizedPacketRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.applications.fee.v1.QueryOuterClass.QueryIncentivizedPacketRequest = _builder.build()

    /**
     * <pre>
     * unique packet identifier comprised of channel ID, port ID and sequence
     * </pre>
     *
     * <code>.ibc.core.channel.v1.PacketId packet_id = 1 [(.gogoproto.nullable) = false];</code>
     */
    public var packetId: ibc.core.channel.v1.ChannelOuterClass.PacketId
      @JvmName("getPacketId")
      get() = _builder.getPacketId()
      @JvmName("setPacketId")
      set(value) {
        _builder.setPacketId(value)
      }
    /**
     * <pre>
     * unique packet identifier comprised of channel ID, port ID and sequence
     * </pre>
     *
     * <code>.ibc.core.channel.v1.PacketId packet_id = 1 [(.gogoproto.nullable) = false];</code>
     */
    public fun clearPacketId() {
      _builder.clearPacketId()
    }
    /**
     * <pre>
     * unique packet identifier comprised of channel ID, port ID and sequence
     * </pre>
     *
     * <code>.ibc.core.channel.v1.PacketId packet_id = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the packetId field is set.
     */
    public fun hasPacketId(): kotlin.Boolean {
      return _builder.hasPacketId()
    }

    /**
     * <pre>
     * block height at which to query
     * </pre>
     *
     * <code>uint64 query_height = 2;</code>
     */
    public var queryHeight: kotlin.Long
      @JvmName("getQueryHeight")
      get() = _builder.getQueryHeight()
      @JvmName("setQueryHeight")
      set(value) {
        _builder.setQueryHeight(value)
      }
    /**
     * <pre>
     * block height at which to query
     * </pre>
     *
     * <code>uint64 query_height = 2;</code>
     */
    public fun clearQueryHeight() {
      _builder.clearQueryHeight()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.applications.fee.v1.QueryOuterClass.QueryIncentivizedPacketRequest.copy(block: ibc.applications.fee.v1.QueryIncentivizedPacketRequestKt.Dsl.() -> kotlin.Unit): ibc.applications.fee.v1.QueryOuterClass.QueryIncentivizedPacketRequest =
  ibc.applications.fee.v1.QueryIncentivizedPacketRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

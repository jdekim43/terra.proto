//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/applications/fee/v1/tx.proto

package ibc.applications.fee.v1;

@kotlin.jvm.JvmSynthetic
public inline fun msgPayPacketFeeAsync(block: ibc.applications.fee.v1.MsgPayPacketFeeAsyncKt.Dsl.() -> kotlin.Unit): ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsync =
  ibc.applications.fee.v1.MsgPayPacketFeeAsyncKt.Dsl._create(ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsync.newBuilder()).apply { block() }._build()
public object MsgPayPacketFeeAsyncKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsync.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsync.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsync = _builder.build()

    /**
     * <pre>
     * unique packet identifier comprised of the channel ID, port ID and sequence
     * </pre>
     *
     * <code>.ibc.core.channel.v1.PacketId packet_id = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"packet_id&#92;""];</code>
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
     * unique packet identifier comprised of the channel ID, port ID and sequence
     * </pre>
     *
     * <code>.ibc.core.channel.v1.PacketId packet_id = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"packet_id&#92;""];</code>
     */
    public fun clearPacketId() {
      _builder.clearPacketId()
    }
    /**
     * <pre>
     * unique packet identifier comprised of the channel ID, port ID and sequence
     * </pre>
     *
     * <code>.ibc.core.channel.v1.PacketId packet_id = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"packet_id&#92;""];</code>
     * @return Whether the packetId field is set.
     */
    public fun hasPacketId(): kotlin.Boolean {
      return _builder.hasPacketId()
    }

    /**
     * <pre>
     * the packet fee associated with a particular IBC packet
     * </pre>
     *
     * <code>.ibc.applications.fee.v1.PacketFee packet_fee = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"packet_fee&#92;""];</code>
     */
    public var packetFee: ibc.applications.fee.v1.FeeOuterClass.PacketFee
      @JvmName("getPacketFee")
      get() = _builder.getPacketFee()
      @JvmName("setPacketFee")
      set(value) {
        _builder.setPacketFee(value)
      }
    /**
     * <pre>
     * the packet fee associated with a particular IBC packet
     * </pre>
     *
     * <code>.ibc.applications.fee.v1.PacketFee packet_fee = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"packet_fee&#92;""];</code>
     */
    public fun clearPacketFee() {
      _builder.clearPacketFee()
    }
    /**
     * <pre>
     * the packet fee associated with a particular IBC packet
     * </pre>
     *
     * <code>.ibc.applications.fee.v1.PacketFee packet_fee = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"packet_fee&#92;""];</code>
     * @return Whether the packetFee field is set.
     */
    public fun hasPacketFee(): kotlin.Boolean {
      return _builder.hasPacketFee()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsync.copy(block: ibc.applications.fee.v1.MsgPayPacketFeeAsyncKt.Dsl.() -> kotlin.Unit): ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsync =
  ibc.applications.fee.v1.MsgPayPacketFeeAsyncKt.Dsl._create(this.toBuilder()).apply { block() }._build()
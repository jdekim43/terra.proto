//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/applications/fee/v1/genesis.proto

package ibc.applications.fee.v1;

@kotlin.jvm.JvmSynthetic
public inline fun forwardRelayerAddress(block: ibc.applications.fee.v1.ForwardRelayerAddressKt.Dsl.() -> kotlin.Unit): ibc.applications.fee.v1.Genesis.ForwardRelayerAddress =
  ibc.applications.fee.v1.ForwardRelayerAddressKt.Dsl._create(ibc.applications.fee.v1.Genesis.ForwardRelayerAddress.newBuilder()).apply { block() }._build()
public object ForwardRelayerAddressKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.applications.fee.v1.Genesis.ForwardRelayerAddress.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.applications.fee.v1.Genesis.ForwardRelayerAddress.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.applications.fee.v1.Genesis.ForwardRelayerAddress = _builder.build()

    /**
     * <pre>
     * the forward relayer address
     * </pre>
     *
     * <code>string address = 1;</code>
     */
    public var address: kotlin.String
      @JvmName("getAddress")
      get() = _builder.getAddress()
      @JvmName("setAddress")
      set(value) {
        _builder.setAddress(value)
      }
    /**
     * <pre>
     * the forward relayer address
     * </pre>
     *
     * <code>string address = 1;</code>
     */
    public fun clearAddress() {
      _builder.clearAddress()
    }

    /**
     * <pre>
     * unique packet identifer comprised of the channel ID, port ID and sequence
     * </pre>
     *
     * <code>.ibc.core.channel.v1.PacketId packet_id = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"packet_id&#92;""];</code>
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
     * unique packet identifer comprised of the channel ID, port ID and sequence
     * </pre>
     *
     * <code>.ibc.core.channel.v1.PacketId packet_id = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"packet_id&#92;""];</code>
     */
    public fun clearPacketId() {
      _builder.clearPacketId()
    }
    /**
     * <pre>
     * unique packet identifer comprised of the channel ID, port ID and sequence
     * </pre>
     *
     * <code>.ibc.core.channel.v1.PacketId packet_id = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"packet_id&#92;""];</code>
     * @return Whether the packetId field is set.
     */
    public fun hasPacketId(): kotlin.Boolean {
      return _builder.hasPacketId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.applications.fee.v1.Genesis.ForwardRelayerAddress.copy(block: ibc.applications.fee.v1.ForwardRelayerAddressKt.Dsl.() -> kotlin.Unit): ibc.applications.fee.v1.Genesis.ForwardRelayerAddress =
  ibc.applications.fee.v1.ForwardRelayerAddressKt.Dsl._create(this.toBuilder()).apply { block() }._build()
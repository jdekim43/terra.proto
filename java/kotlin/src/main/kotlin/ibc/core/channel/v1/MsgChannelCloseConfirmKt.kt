//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/channel/v1/tx.proto

package ibc.core.channel.v1;

@kotlin.jvm.JvmSynthetic
public inline fun msgChannelCloseConfirm(block: ibc.core.channel.v1.MsgChannelCloseConfirmKt.Dsl.() -> kotlin.Unit): ibc.core.channel.v1.Tx.MsgChannelCloseConfirm =
  ibc.core.channel.v1.MsgChannelCloseConfirmKt.Dsl._create(ibc.core.channel.v1.Tx.MsgChannelCloseConfirm.newBuilder()).apply { block() }._build()
public object MsgChannelCloseConfirmKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.channel.v1.Tx.MsgChannelCloseConfirm.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.channel.v1.Tx.MsgChannelCloseConfirm.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.channel.v1.Tx.MsgChannelCloseConfirm = _builder.build()

    /**
     * <code>string port_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
     */
    public var portId: kotlin.String
      @JvmName("getPortId")
      get() = _builder.getPortId()
      @JvmName("setPortId")
      set(value) {
        _builder.setPortId(value)
      }
    /**
     * <code>string port_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
     */
    public fun clearPortId() {
      _builder.clearPortId()
    }

    /**
     * <code>string channel_id = 2 [(.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
     */
    public var channelId: kotlin.String
      @JvmName("getChannelId")
      get() = _builder.getChannelId()
      @JvmName("setChannelId")
      set(value) {
        _builder.setChannelId(value)
      }
    /**
     * <code>string channel_id = 2 [(.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
     */
    public fun clearChannelId() {
      _builder.clearChannelId()
    }

    /**
     * <code>bytes proof_init = 3 [(.gogoproto.moretags) = "yaml:&#92;"proof_init&#92;""];</code>
     */
    public var proofInit: com.google.protobuf.ByteString
      @JvmName("getProofInit")
      get() = _builder.getProofInit()
      @JvmName("setProofInit")
      set(value) {
        _builder.setProofInit(value)
      }
    /**
     * <code>bytes proof_init = 3 [(.gogoproto.moretags) = "yaml:&#92;"proof_init&#92;""];</code>
     */
    public fun clearProofInit() {
      _builder.clearProofInit()
    }

    /**
     * <code>.ibc.core.client.v1.Height proof_height = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     */
    public var proofHeight: ibc.core.client.v1.Client.Height
      @JvmName("getProofHeight")
      get() = _builder.getProofHeight()
      @JvmName("setProofHeight")
      set(value) {
        _builder.setProofHeight(value)
      }
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     */
    public fun clearProofHeight() {
      _builder.clearProofHeight()
    }
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     * @return Whether the proofHeight field is set.
     */
    public fun hasProofHeight(): kotlin.Boolean {
      return _builder.hasProofHeight()
    }

    /**
     * <code>string signer = 5;</code>
     */
    public var signer: kotlin.String
      @JvmName("getSigner")
      get() = _builder.getSigner()
      @JvmName("setSigner")
      set(value) {
        _builder.setSigner(value)
      }
    /**
     * <code>string signer = 5;</code>
     */
    public fun clearSigner() {
      _builder.clearSigner()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.channel.v1.Tx.MsgChannelCloseConfirm.copy(block: ibc.core.channel.v1.MsgChannelCloseConfirmKt.Dsl.() -> kotlin.Unit): ibc.core.channel.v1.Tx.MsgChannelCloseConfirm =
  ibc.core.channel.v1.MsgChannelCloseConfirmKt.Dsl._create(this.toBuilder()).apply { block() }._build()

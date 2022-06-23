//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmwasm/wasm/v1/ibc.proto

package cosmwasm.wasm.v1;

@kotlin.jvm.JvmSynthetic
public inline fun msgIBCSend(block: cosmwasm.wasm.v1.MsgIBCSendKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.Ibc.MsgIBCSend =
  cosmwasm.wasm.v1.MsgIBCSendKt.Dsl._create(cosmwasm.wasm.v1.Ibc.MsgIBCSend.newBuilder()).apply { block() }._build()
public object MsgIBCSendKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmwasm.wasm.v1.Ibc.MsgIBCSend.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmwasm.wasm.v1.Ibc.MsgIBCSend.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmwasm.wasm.v1.Ibc.MsgIBCSend = _builder.build()

    /**
     * <pre>
     * the channel by which the packet will be sent
     * </pre>
     *
     * <code>string channel = 2 [(.gogoproto.moretags) = "yaml:&#92;"source_channel&#92;""];</code>
     */
    public var channel: kotlin.String
      @JvmName("getChannel")
      get() = _builder.getChannel()
      @JvmName("setChannel")
      set(value) {
        _builder.setChannel(value)
      }
    /**
     * <pre>
     * the channel by which the packet will be sent
     * </pre>
     *
     * <code>string channel = 2 [(.gogoproto.moretags) = "yaml:&#92;"source_channel&#92;""];</code>
     */
    public fun clearChannel() {
      _builder.clearChannel()
    }

    /**
     * <pre>
     * Timeout height relative to the current block height.
     * The timeout is disabled when set to 0.
     * </pre>
     *
     * <code>uint64 timeout_height = 4 [(.gogoproto.moretags) = "yaml:&#92;"timeout_height&#92;""];</code>
     */
    public var timeoutHeight: kotlin.Long
      @JvmName("getTimeoutHeight")
      get() = _builder.getTimeoutHeight()
      @JvmName("setTimeoutHeight")
      set(value) {
        _builder.setTimeoutHeight(value)
      }
    /**
     * <pre>
     * Timeout height relative to the current block height.
     * The timeout is disabled when set to 0.
     * </pre>
     *
     * <code>uint64 timeout_height = 4 [(.gogoproto.moretags) = "yaml:&#92;"timeout_height&#92;""];</code>
     */
    public fun clearTimeoutHeight() {
      _builder.clearTimeoutHeight()
    }

    /**
     * <pre>
     * Timeout timestamp (in nanoseconds) relative to the current block timestamp.
     * The timeout is disabled when set to 0.
     * </pre>
     *
     * <code>uint64 timeout_timestamp = 5 [(.gogoproto.moretags) = "yaml:&#92;"timeout_timestamp&#92;""];</code>
     */
    public var timeoutTimestamp: kotlin.Long
      @JvmName("getTimeoutTimestamp")
      get() = _builder.getTimeoutTimestamp()
      @JvmName("setTimeoutTimestamp")
      set(value) {
        _builder.setTimeoutTimestamp(value)
      }
    /**
     * <pre>
     * Timeout timestamp (in nanoseconds) relative to the current block timestamp.
     * The timeout is disabled when set to 0.
     * </pre>
     *
     * <code>uint64 timeout_timestamp = 5 [(.gogoproto.moretags) = "yaml:&#92;"timeout_timestamp&#92;""];</code>
     */
    public fun clearTimeoutTimestamp() {
      _builder.clearTimeoutTimestamp()
    }

    /**
     * <pre>
     * Data is the payload to transfer. We must not make assumption what format or
     * content is in here.
     * </pre>
     *
     * <code>bytes data = 6;</code>
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
     * Data is the payload to transfer. We must not make assumption what format or
     * content is in here.
     * </pre>
     *
     * <code>bytes data = 6;</code>
     */
    public fun clearData() {
      _builder.clearData()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmwasm.wasm.v1.Ibc.MsgIBCSend.copy(block: cosmwasm.wasm.v1.MsgIBCSendKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.Ibc.MsgIBCSend =
  cosmwasm.wasm.v1.MsgIBCSendKt.Dsl._create(this.toBuilder()).apply { block() }._build()

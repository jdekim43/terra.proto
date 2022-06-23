//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/tx/v1beta1/service.proto

package cosmos.tx.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun broadcastTxRequest(block: cosmos.tx.v1beta1.BroadcastTxRequestKt.Dsl.() -> kotlin.Unit): cosmos.tx.v1beta1.ServiceOuterClass.BroadcastTxRequest =
  cosmos.tx.v1beta1.BroadcastTxRequestKt.Dsl._create(cosmos.tx.v1beta1.ServiceOuterClass.BroadcastTxRequest.newBuilder()).apply { block() }._build()
public object BroadcastTxRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.tx.v1beta1.ServiceOuterClass.BroadcastTxRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.tx.v1beta1.ServiceOuterClass.BroadcastTxRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.tx.v1beta1.ServiceOuterClass.BroadcastTxRequest = _builder.build()

    /**
     * <pre>
     * tx_bytes is the raw transaction.
     * </pre>
     *
     * <code>bytes tx_bytes = 1;</code>
     */
    public var txBytes: com.google.protobuf.ByteString
      @JvmName("getTxBytes")
      get() = _builder.getTxBytes()
      @JvmName("setTxBytes")
      set(value) {
        _builder.setTxBytes(value)
      }
    /**
     * <pre>
     * tx_bytes is the raw transaction.
     * </pre>
     *
     * <code>bytes tx_bytes = 1;</code>
     */
    public fun clearTxBytes() {
      _builder.clearTxBytes()
    }

    /**
     * <code>.cosmos.tx.v1beta1.BroadcastMode mode = 2;</code>
     */
    public var mode: cosmos.tx.v1beta1.ServiceOuterClass.BroadcastMode
      @JvmName("getMode")
      get() = _builder.getMode()
      @JvmName("setMode")
      set(value) {
        _builder.setMode(value)
      }
    /**
     * <code>.cosmos.tx.v1beta1.BroadcastMode mode = 2;</code>
     */
    public fun clearMode() {
      _builder.clearMode()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.tx.v1beta1.ServiceOuterClass.BroadcastTxRequest.copy(block: cosmos.tx.v1beta1.BroadcastTxRequestKt.Dsl.() -> kotlin.Unit): cosmos.tx.v1beta1.ServiceOuterClass.BroadcastTxRequest =
  cosmos.tx.v1beta1.BroadcastTxRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

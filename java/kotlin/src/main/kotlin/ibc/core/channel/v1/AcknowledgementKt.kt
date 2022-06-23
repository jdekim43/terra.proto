//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/channel/v1/channel.proto

package ibc.core.channel.v1;

@kotlin.jvm.JvmSynthetic
public inline fun acknowledgement(block: ibc.core.channel.v1.AcknowledgementKt.Dsl.() -> kotlin.Unit): ibc.core.channel.v1.ChannelOuterClass.Acknowledgement =
  ibc.core.channel.v1.AcknowledgementKt.Dsl._create(ibc.core.channel.v1.ChannelOuterClass.Acknowledgement.newBuilder()).apply { block() }._build()
public object AcknowledgementKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.channel.v1.ChannelOuterClass.Acknowledgement.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.channel.v1.ChannelOuterClass.Acknowledgement.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.channel.v1.ChannelOuterClass.Acknowledgement = _builder.build()

    /**
     * <code>bytes result = 21;</code>
     */
    public var result: com.google.protobuf.ByteString
      @JvmName("getResult")
      get() = _builder.getResult()
      @JvmName("setResult")
      set(value) {
        _builder.setResult(value)
      }
    /**
     * <code>bytes result = 21;</code>
     */
    public fun clearResult() {
      _builder.clearResult()
    }
    /**
     * <code>bytes result = 21;</code>
     * @return Whether the result field is set.
     */
    public fun hasResult(): kotlin.Boolean {
      return _builder.hasResult()
    }

    /**
     * <code>string error = 22;</code>
     */
    public var error: kotlin.String
      @JvmName("getError")
      get() = _builder.getError()
      @JvmName("setError")
      set(value) {
        _builder.setError(value)
      }
    /**
     * <code>string error = 22;</code>
     */
    public fun clearError() {
      _builder.clearError()
    }
    /**
     * <code>string error = 22;</code>
     * @return Whether the error field is set.
     */
    public fun hasError(): kotlin.Boolean {
      return _builder.hasError()
    }
    public val responseCase: ibc.core.channel.v1.ChannelOuterClass.Acknowledgement.ResponseCase
      @JvmName("getResponseCase")
      get() = _builder.getResponseCase()

    public fun clearResponse() {
      _builder.clearResponse()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.channel.v1.ChannelOuterClass.Acknowledgement.copy(block: ibc.core.channel.v1.AcknowledgementKt.Dsl.() -> kotlin.Unit): ibc.core.channel.v1.ChannelOuterClass.Acknowledgement =
  ibc.core.channel.v1.AcknowledgementKt.Dsl._create(this.toBuilder()).apply { block() }._build()

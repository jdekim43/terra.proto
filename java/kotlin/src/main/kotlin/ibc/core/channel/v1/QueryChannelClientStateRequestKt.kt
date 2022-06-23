//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/channel/v1/query.proto

package ibc.core.channel.v1;

@kotlin.jvm.JvmSynthetic
public inline fun queryChannelClientStateRequest(block: ibc.core.channel.v1.QueryChannelClientStateRequestKt.Dsl.() -> kotlin.Unit): ibc.core.channel.v1.QueryOuterClass.QueryChannelClientStateRequest =
  ibc.core.channel.v1.QueryChannelClientStateRequestKt.Dsl._create(ibc.core.channel.v1.QueryOuterClass.QueryChannelClientStateRequest.newBuilder()).apply { block() }._build()
public object QueryChannelClientStateRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.channel.v1.QueryOuterClass.QueryChannelClientStateRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.channel.v1.QueryOuterClass.QueryChannelClientStateRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.channel.v1.QueryOuterClass.QueryChannelClientStateRequest = _builder.build()

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
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.channel.v1.QueryOuterClass.QueryChannelClientStateRequest.copy(block: ibc.core.channel.v1.QueryChannelClientStateRequestKt.Dsl.() -> kotlin.Unit): ibc.core.channel.v1.QueryOuterClass.QueryChannelClientStateRequest =
  ibc.core.channel.v1.QueryChannelClientStateRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

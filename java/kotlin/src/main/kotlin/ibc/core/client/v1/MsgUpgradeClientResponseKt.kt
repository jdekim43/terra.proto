//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/client/v1/tx.proto

package ibc.core.client.v1;

@kotlin.jvm.JvmSynthetic
public inline fun msgUpgradeClientResponse(block: ibc.core.client.v1.MsgUpgradeClientResponseKt.Dsl.() -> kotlin.Unit): ibc.core.client.v1.Tx.MsgUpgradeClientResponse =
  ibc.core.client.v1.MsgUpgradeClientResponseKt.Dsl._create(ibc.core.client.v1.Tx.MsgUpgradeClientResponse.newBuilder()).apply { block() }._build()
public object MsgUpgradeClientResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.client.v1.Tx.MsgUpgradeClientResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.client.v1.Tx.MsgUpgradeClientResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.client.v1.Tx.MsgUpgradeClientResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.client.v1.Tx.MsgUpgradeClientResponse.copy(block: ibc.core.client.v1.MsgUpgradeClientResponseKt.Dsl.() -> kotlin.Unit): ibc.core.client.v1.Tx.MsgUpgradeClientResponse =
  ibc.core.client.v1.MsgUpgradeClientResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

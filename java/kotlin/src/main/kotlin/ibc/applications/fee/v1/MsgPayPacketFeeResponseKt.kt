//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/applications/fee/v1/tx.proto

package ibc.applications.fee.v1;

@kotlin.jvm.JvmSynthetic
public inline fun msgPayPacketFeeResponse(block: ibc.applications.fee.v1.MsgPayPacketFeeResponseKt.Dsl.() -> kotlin.Unit): ibc.applications.fee.v1.Tx.MsgPayPacketFeeResponse =
  ibc.applications.fee.v1.MsgPayPacketFeeResponseKt.Dsl._create(ibc.applications.fee.v1.Tx.MsgPayPacketFeeResponse.newBuilder()).apply { block() }._build()
public object MsgPayPacketFeeResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.applications.fee.v1.Tx.MsgPayPacketFeeResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.applications.fee.v1.Tx.MsgPayPacketFeeResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.applications.fee.v1.Tx.MsgPayPacketFeeResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.applications.fee.v1.Tx.MsgPayPacketFeeResponse.copy(block: ibc.applications.fee.v1.MsgPayPacketFeeResponseKt.Dsl.() -> kotlin.Unit): ibc.applications.fee.v1.Tx.MsgPayPacketFeeResponse =
  ibc.applications.fee.v1.MsgPayPacketFeeResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
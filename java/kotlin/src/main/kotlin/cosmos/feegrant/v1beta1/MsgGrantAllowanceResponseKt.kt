//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/feegrant/v1beta1/tx.proto

package cosmos.feegrant.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun msgGrantAllowanceResponse(block: cosmos.feegrant.v1beta1.MsgGrantAllowanceResponseKt.Dsl.() -> kotlin.Unit): cosmos.feegrant.v1beta1.Tx.MsgGrantAllowanceResponse =
  cosmos.feegrant.v1beta1.MsgGrantAllowanceResponseKt.Dsl._create(cosmos.feegrant.v1beta1.Tx.MsgGrantAllowanceResponse.newBuilder()).apply { block() }._build()
public object MsgGrantAllowanceResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.feegrant.v1beta1.Tx.MsgGrantAllowanceResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.feegrant.v1beta1.Tx.MsgGrantAllowanceResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.feegrant.v1beta1.Tx.MsgGrantAllowanceResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.feegrant.v1beta1.Tx.MsgGrantAllowanceResponse.copy(block: cosmos.feegrant.v1beta1.MsgGrantAllowanceResponseKt.Dsl.() -> kotlin.Unit): cosmos.feegrant.v1beta1.Tx.MsgGrantAllowanceResponse =
  cosmos.feegrant.v1beta1.MsgGrantAllowanceResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

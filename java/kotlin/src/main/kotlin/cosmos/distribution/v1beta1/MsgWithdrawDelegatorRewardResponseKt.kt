//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/distribution/v1beta1/tx.proto

package cosmos.distribution.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun msgWithdrawDelegatorRewardResponse(block: cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardResponseKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Tx.MsgWithdrawDelegatorRewardResponse =
  cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardResponseKt.Dsl._create(cosmos.distribution.v1beta1.Tx.MsgWithdrawDelegatorRewardResponse.newBuilder()).apply { block() }._build()
public object MsgWithdrawDelegatorRewardResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.distribution.v1beta1.Tx.MsgWithdrawDelegatorRewardResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.distribution.v1beta1.Tx.MsgWithdrawDelegatorRewardResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.distribution.v1beta1.Tx.MsgWithdrawDelegatorRewardResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.distribution.v1beta1.Tx.MsgWithdrawDelegatorRewardResponse.copy(block: cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardResponseKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Tx.MsgWithdrawDelegatorRewardResponse =
  cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

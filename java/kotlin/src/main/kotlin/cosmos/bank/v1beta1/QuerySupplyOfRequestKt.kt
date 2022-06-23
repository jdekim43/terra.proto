//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/bank/v1beta1/query.proto

package cosmos.bank.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun querySupplyOfRequest(block: cosmos.bank.v1beta1.QuerySupplyOfRequestKt.Dsl.() -> kotlin.Unit): cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest =
  cosmos.bank.v1beta1.QuerySupplyOfRequestKt.Dsl._create(cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest.newBuilder()).apply { block() }._build()
public object QuerySupplyOfRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest = _builder.build()

    /**
     * <pre>
     * denom is the coin denom to query balances for.
     * </pre>
     *
     * <code>string denom = 1;</code>
     */
    public var denom: kotlin.String
      @JvmName("getDenom")
      get() = _builder.getDenom()
      @JvmName("setDenom")
      set(value) {
        _builder.setDenom(value)
      }
    /**
     * <pre>
     * denom is the coin denom to query balances for.
     * </pre>
     *
     * <code>string denom = 1;</code>
     */
    public fun clearDenom() {
      _builder.clearDenom()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest.copy(block: cosmos.bank.v1beta1.QuerySupplyOfRequestKt.Dsl.() -> kotlin.Unit): cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest =
  cosmos.bank.v1beta1.QuerySupplyOfRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

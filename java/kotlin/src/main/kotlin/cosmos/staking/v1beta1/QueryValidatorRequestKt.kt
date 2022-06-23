//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package cosmos.staking.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryValidatorRequest(block: cosmos.staking.v1beta1.QueryValidatorRequestKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.QueryOuterClass.QueryValidatorRequest =
  cosmos.staking.v1beta1.QueryValidatorRequestKt.Dsl._create(cosmos.staking.v1beta1.QueryOuterClass.QueryValidatorRequest.newBuilder()).apply { block() }._build()
public object QueryValidatorRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.staking.v1beta1.QueryOuterClass.QueryValidatorRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.staking.v1beta1.QueryOuterClass.QueryValidatorRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.staking.v1beta1.QueryOuterClass.QueryValidatorRequest = _builder.build()

    /**
     * <pre>
     * validator_addr defines the validator address to query for.
     * </pre>
     *
     * <code>string validator_addr = 1;</code>
     */
    public var validatorAddr: kotlin.String
      @JvmName("getValidatorAddr")
      get() = _builder.getValidatorAddr()
      @JvmName("setValidatorAddr")
      set(value) {
        _builder.setValidatorAddr(value)
      }
    /**
     * <pre>
     * validator_addr defines the validator address to query for.
     * </pre>
     *
     * <code>string validator_addr = 1;</code>
     */
    public fun clearValidatorAddr() {
      _builder.clearValidatorAddr()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.staking.v1beta1.QueryOuterClass.QueryValidatorRequest.copy(block: cosmos.staking.v1beta1.QueryValidatorRequestKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.QueryOuterClass.QueryValidatorRequest =
  cosmos.staking.v1beta1.QueryValidatorRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

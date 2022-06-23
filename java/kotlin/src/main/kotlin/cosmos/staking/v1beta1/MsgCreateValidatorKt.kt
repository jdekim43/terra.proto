//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/staking/v1beta1/tx.proto

package cosmos.staking.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun msgCreateValidator(block: cosmos.staking.v1beta1.MsgCreateValidatorKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.Tx.MsgCreateValidator =
  cosmos.staking.v1beta1.MsgCreateValidatorKt.Dsl._create(cosmos.staking.v1beta1.Tx.MsgCreateValidator.newBuilder()).apply { block() }._build()
public object MsgCreateValidatorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.staking.v1beta1.Tx.MsgCreateValidator.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.staking.v1beta1.Tx.MsgCreateValidator.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.staking.v1beta1.Tx.MsgCreateValidator = _builder.build()

    /**
     * <code>.cosmos.staking.v1beta1.Description description = 1 [(.gogoproto.nullable) = false];</code>
     */
    public var description: cosmos.staking.v1beta1.Staking.Description
      @JvmName("getDescription")
      get() = _builder.getDescription()
      @JvmName("setDescription")
      set(value) {
        _builder.setDescription(value)
      }
    /**
     * <code>.cosmos.staking.v1beta1.Description description = 1 [(.gogoproto.nullable) = false];</code>
     */
    public fun clearDescription() {
      _builder.clearDescription()
    }
    /**
     * <code>.cosmos.staking.v1beta1.Description description = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the description field is set.
     */
    public fun hasDescription(): kotlin.Boolean {
      return _builder.hasDescription()
    }

    /**
     * <code>.cosmos.staking.v1beta1.CommissionRates commission = 2 [(.gogoproto.nullable) = false];</code>
     */
    public var commission: cosmos.staking.v1beta1.Staking.CommissionRates
      @JvmName("getCommission")
      get() = _builder.getCommission()
      @JvmName("setCommission")
      set(value) {
        _builder.setCommission(value)
      }
    /**
     * <code>.cosmos.staking.v1beta1.CommissionRates commission = 2 [(.gogoproto.nullable) = false];</code>
     */
    public fun clearCommission() {
      _builder.clearCommission()
    }
    /**
     * <code>.cosmos.staking.v1beta1.CommissionRates commission = 2 [(.gogoproto.nullable) = false];</code>
     * @return Whether the commission field is set.
     */
    public fun hasCommission(): kotlin.Boolean {
      return _builder.hasCommission()
    }

    /**
     * <code>string min_self_delegation = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"min_self_delegation&#92;""];</code>
     */
    public var minSelfDelegation: kotlin.String
      @JvmName("getMinSelfDelegation")
      get() = _builder.getMinSelfDelegation()
      @JvmName("setMinSelfDelegation")
      set(value) {
        _builder.setMinSelfDelegation(value)
      }
    /**
     * <code>string min_self_delegation = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"min_self_delegation&#92;""];</code>
     */
    public fun clearMinSelfDelegation() {
      _builder.clearMinSelfDelegation()
    }

    /**
     * <code>string delegator_address = 4 [(.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
     */
    public var delegatorAddress: kotlin.String
      @JvmName("getDelegatorAddress")
      get() = _builder.getDelegatorAddress()
      @JvmName("setDelegatorAddress")
      set(value) {
        _builder.setDelegatorAddress(value)
      }
    /**
     * <code>string delegator_address = 4 [(.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
     */
    public fun clearDelegatorAddress() {
      _builder.clearDelegatorAddress()
    }

    /**
     * <code>string validator_address = 5 [(.gogoproto.moretags) = "yaml:&#92;"validator_address&#92;""];</code>
     */
    public var validatorAddress: kotlin.String
      @JvmName("getValidatorAddress")
      get() = _builder.getValidatorAddress()
      @JvmName("setValidatorAddress")
      set(value) {
        _builder.setValidatorAddress(value)
      }
    /**
     * <code>string validator_address = 5 [(.gogoproto.moretags) = "yaml:&#92;"validator_address&#92;""];</code>
     */
    public fun clearValidatorAddress() {
      _builder.clearValidatorAddress()
    }

    /**
     * <code>.google.protobuf.Any pubkey = 6 [(.cosmos_proto.accepts_interface) = "cosmos.crypto.PubKey"];</code>
     */
    public var pubkey: com.google.protobuf.Any
      @JvmName("getPubkey")
      get() = _builder.getPubkey()
      @JvmName("setPubkey")
      set(value) {
        _builder.setPubkey(value)
      }
    /**
     * <code>.google.protobuf.Any pubkey = 6 [(.cosmos_proto.accepts_interface) = "cosmos.crypto.PubKey"];</code>
     */
    public fun clearPubkey() {
      _builder.clearPubkey()
    }
    /**
     * <code>.google.protobuf.Any pubkey = 6 [(.cosmos_proto.accepts_interface) = "cosmos.crypto.PubKey"];</code>
     * @return Whether the pubkey field is set.
     */
    public fun hasPubkey(): kotlin.Boolean {
      return _builder.hasPubkey()
    }

    /**
     * <code>.cosmos.base.v1beta1.Coin value = 7 [(.gogoproto.nullable) = false];</code>
     */
    public var value: cosmos.base.v1beta1.CoinOuterClass.Coin
      @JvmName("getValue")
      get() = _builder.getValue()
      @JvmName("setValue")
      set(value) {
        _builder.setValue(value)
      }
    /**
     * <code>.cosmos.base.v1beta1.Coin value = 7 [(.gogoproto.nullable) = false];</code>
     */
    public fun clearValue() {
      _builder.clearValue()
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin value = 7 [(.gogoproto.nullable) = false];</code>
     * @return Whether the value field is set.
     */
    public fun hasValue(): kotlin.Boolean {
      return _builder.hasValue()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.staking.v1beta1.Tx.MsgCreateValidator.copy(block: cosmos.staking.v1beta1.MsgCreateValidatorKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.Tx.MsgCreateValidator =
  cosmos.staking.v1beta1.MsgCreateValidatorKt.Dsl._create(this.toBuilder()).apply { block() }._build()

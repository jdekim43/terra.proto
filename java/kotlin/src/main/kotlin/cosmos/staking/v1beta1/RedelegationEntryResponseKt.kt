//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/staking/v1beta1/staking.proto

package cosmos.staking.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun redelegationEntryResponse(block: cosmos.staking.v1beta1.RedelegationEntryResponseKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.Staking.RedelegationEntryResponse =
  cosmos.staking.v1beta1.RedelegationEntryResponseKt.Dsl._create(cosmos.staking.v1beta1.Staking.RedelegationEntryResponse.newBuilder()).apply { block() }._build()
public object RedelegationEntryResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.staking.v1beta1.Staking.RedelegationEntryResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.staking.v1beta1.Staking.RedelegationEntryResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.staking.v1beta1.Staking.RedelegationEntryResponse = _builder.build()

    /**
     * <code>.cosmos.staking.v1beta1.RedelegationEntry redelegation_entry = 1 [(.gogoproto.nullable) = false];</code>
     */
    public var redelegationEntry: cosmos.staking.v1beta1.Staking.RedelegationEntry
      @JvmName("getRedelegationEntry")
      get() = _builder.getRedelegationEntry()
      @JvmName("setRedelegationEntry")
      set(value) {
        _builder.setRedelegationEntry(value)
      }
    /**
     * <code>.cosmos.staking.v1beta1.RedelegationEntry redelegation_entry = 1 [(.gogoproto.nullable) = false];</code>
     */
    public fun clearRedelegationEntry() {
      _builder.clearRedelegationEntry()
    }
    /**
     * <code>.cosmos.staking.v1beta1.RedelegationEntry redelegation_entry = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the redelegationEntry field is set.
     */
    public fun hasRedelegationEntry(): kotlin.Boolean {
      return _builder.hasRedelegationEntry()
    }

    /**
     * <code>string balance = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     */
    public var balance: kotlin.String
      @JvmName("getBalance")
      get() = _builder.getBalance()
      @JvmName("setBalance")
      set(value) {
        _builder.setBalance(value)
      }
    /**
     * <code>string balance = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     */
    public fun clearBalance() {
      _builder.clearBalance()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.staking.v1beta1.Staking.RedelegationEntryResponse.copy(block: cosmos.staking.v1beta1.RedelegationEntryResponseKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.Staking.RedelegationEntryResponse =
  cosmos.staking.v1beta1.RedelegationEntryResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

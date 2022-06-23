//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/distribution/v1beta1/distribution.proto

package cosmos.distribution.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun communityPoolSpendProposal(block: cosmos.distribution.v1beta1.CommunityPoolSpendProposalKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Distribution.CommunityPoolSpendProposal =
  cosmos.distribution.v1beta1.CommunityPoolSpendProposalKt.Dsl._create(cosmos.distribution.v1beta1.Distribution.CommunityPoolSpendProposal.newBuilder()).apply { block() }._build()
public object CommunityPoolSpendProposalKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.distribution.v1beta1.Distribution.CommunityPoolSpendProposal.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.distribution.v1beta1.Distribution.CommunityPoolSpendProposal.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.distribution.v1beta1.Distribution.CommunityPoolSpendProposal = _builder.build()

    /**
     * <code>string title = 1;</code>
     */
    public var title: kotlin.String
      @JvmName("getTitle")
      get() = _builder.getTitle()
      @JvmName("setTitle")
      set(value) {
        _builder.setTitle(value)
      }
    /**
     * <code>string title = 1;</code>
     */
    public fun clearTitle() {
      _builder.clearTitle()
    }

    /**
     * <code>string description = 2;</code>
     */
    public var description: kotlin.String
      @JvmName("getDescription")
      get() = _builder.getDescription()
      @JvmName("setDescription")
      set(value) {
        _builder.setDescription(value)
      }
    /**
     * <code>string description = 2;</code>
     */
    public fun clearDescription() {
      _builder.clearDescription()
    }

    /**
     * <code>string recipient = 3;</code>
     */
    public var recipient: kotlin.String
      @JvmName("getRecipient")
      get() = _builder.getRecipient()
      @JvmName("setRecipient")
      set(value) {
        _builder.setRecipient(value)
      }
    /**
     * <code>string recipient = 3;</code>
     */
    public fun clearRecipient() {
      _builder.clearRecipient()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class AmountProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 4 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
     public val amount: com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getAmountList()
      )
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 4 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param value The amount to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAmount")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.add(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.addAmount(value)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 4 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param value The amount to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAmount")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.plusAssign(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      add(value)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 4 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param values The amount to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllAmount")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      _builder.addAllAmount(values)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 4 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param values The amount to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllAmount")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      addAll(values)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 4 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param index The index to set the value at.
     * @param value The amount to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setAmount")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.set(index: kotlin.Int, value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.setAmount(index, value)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 4 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearAmount")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.clear() {
      _builder.clearAmount()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.distribution.v1beta1.Distribution.CommunityPoolSpendProposal.copy(block: cosmos.distribution.v1beta1.CommunityPoolSpendProposalKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Distribution.CommunityPoolSpendProposal =
  cosmos.distribution.v1beta1.CommunityPoolSpendProposalKt.Dsl._create(this.toBuilder()).apply { block() }._build()

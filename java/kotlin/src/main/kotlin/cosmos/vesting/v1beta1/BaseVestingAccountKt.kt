//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/vesting/v1beta1/vesting.proto

package cosmos.vesting.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun baseVestingAccount(block: cosmos.vesting.v1beta1.BaseVestingAccountKt.Dsl.() -> kotlin.Unit): cosmos.vesting.v1beta1.Vesting.BaseVestingAccount =
  cosmos.vesting.v1beta1.BaseVestingAccountKt.Dsl._create(cosmos.vesting.v1beta1.Vesting.BaseVestingAccount.newBuilder()).apply { block() }._build()
public object BaseVestingAccountKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.vesting.v1beta1.Vesting.BaseVestingAccount.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.vesting.v1beta1.Vesting.BaseVestingAccount.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.vesting.v1beta1.Vesting.BaseVestingAccount = _builder.build()

    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true];</code>
     */
    public var baseAccount: cosmos.auth.v1beta1.Auth.BaseAccount
      @JvmName("getBaseAccount")
      get() = _builder.getBaseAccount()
      @JvmName("setBaseAccount")
      set(value) {
        _builder.setBaseAccount(value)
      }
    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true];</code>
     */
    public fun clearBaseAccount() {
      _builder.clearBaseAccount()
    }
    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true];</code>
     * @return Whether the baseAccount field is set.
     */
    public fun hasBaseAccount(): kotlin.Boolean {
      return _builder.hasBaseAccount()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class OriginalVestingProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin original_vesting = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"original_vesting&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
     public val originalVesting: com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, OriginalVestingProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getOriginalVestingList()
      )
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin original_vesting = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"original_vesting&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param value The originalVesting to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addOriginalVesting")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, OriginalVestingProxy>.add(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.addOriginalVesting(value)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin original_vesting = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"original_vesting&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param value The originalVesting to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignOriginalVesting")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, OriginalVestingProxy>.plusAssign(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      add(value)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin original_vesting = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"original_vesting&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param values The originalVesting to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllOriginalVesting")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, OriginalVestingProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      _builder.addAllOriginalVesting(values)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin original_vesting = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"original_vesting&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param values The originalVesting to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllOriginalVesting")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, OriginalVestingProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      addAll(values)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin original_vesting = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"original_vesting&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param index The index to set the value at.
     * @param value The originalVesting to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setOriginalVesting")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, OriginalVestingProxy>.set(index: kotlin.Int, value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.setOriginalVesting(index, value)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin original_vesting = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"original_vesting&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearOriginalVesting")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, OriginalVestingProxy>.clear() {
      _builder.clearOriginalVesting()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class DelegatedFreeProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin delegated_free = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"delegated_free&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
     public val delegatedFree: com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, DelegatedFreeProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getDelegatedFreeList()
      )
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin delegated_free = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"delegated_free&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param value The delegatedFree to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addDelegatedFree")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, DelegatedFreeProxy>.add(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.addDelegatedFree(value)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin delegated_free = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"delegated_free&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param value The delegatedFree to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignDelegatedFree")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, DelegatedFreeProxy>.plusAssign(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      add(value)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin delegated_free = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"delegated_free&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param values The delegatedFree to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllDelegatedFree")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, DelegatedFreeProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      _builder.addAllDelegatedFree(values)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin delegated_free = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"delegated_free&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param values The delegatedFree to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllDelegatedFree")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, DelegatedFreeProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      addAll(values)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin delegated_free = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"delegated_free&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param index The index to set the value at.
     * @param value The delegatedFree to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setDelegatedFree")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, DelegatedFreeProxy>.set(index: kotlin.Int, value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.setDelegatedFree(index, value)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin delegated_free = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"delegated_free&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearDelegatedFree")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, DelegatedFreeProxy>.clear() {
      _builder.clearDelegatedFree()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class DelegatedVestingProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin delegated_vesting = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"delegated_vesting&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
     public val delegatedVesting: com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, DelegatedVestingProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getDelegatedVestingList()
      )
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin delegated_vesting = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"delegated_vesting&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param value The delegatedVesting to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addDelegatedVesting")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, DelegatedVestingProxy>.add(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.addDelegatedVesting(value)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin delegated_vesting = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"delegated_vesting&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param value The delegatedVesting to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignDelegatedVesting")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, DelegatedVestingProxy>.plusAssign(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      add(value)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin delegated_vesting = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"delegated_vesting&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param values The delegatedVesting to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllDelegatedVesting")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, DelegatedVestingProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      _builder.addAllDelegatedVesting(values)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin delegated_vesting = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"delegated_vesting&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param values The delegatedVesting to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllDelegatedVesting")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, DelegatedVestingProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      addAll(values)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin delegated_vesting = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"delegated_vesting&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param index The index to set the value at.
     * @param value The delegatedVesting to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setDelegatedVesting")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, DelegatedVestingProxy>.set(index: kotlin.Int, value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.setDelegatedVesting(index, value)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin delegated_vesting = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"delegated_vesting&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearDelegatedVesting")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, DelegatedVestingProxy>.clear() {
      _builder.clearDelegatedVesting()
    }
    /**
     * <code>int64 end_time = 5 [(.gogoproto.moretags) = "yaml:&#92;"end_time&#92;""];</code>
     */
    public var endTime: kotlin.Long
      @JvmName("getEndTime")
      get() = _builder.getEndTime()
      @JvmName("setEndTime")
      set(value) {
        _builder.setEndTime(value)
      }
    /**
     * <code>int64 end_time = 5 [(.gogoproto.moretags) = "yaml:&#92;"end_time&#92;""];</code>
     */
    public fun clearEndTime() {
      _builder.clearEndTime()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.vesting.v1beta1.Vesting.BaseVestingAccount.copy(block: cosmos.vesting.v1beta1.BaseVestingAccountKt.Dsl.() -> kotlin.Unit): cosmos.vesting.v1beta1.Vesting.BaseVestingAccount =
  cosmos.vesting.v1beta1.BaseVestingAccountKt.Dsl._create(this.toBuilder()).apply { block() }._build()

//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/applications/interchain_accounts/v1/genesis.proto

package ibc.applications.interchain_accounts.v1;

@kotlin.jvm.JvmSynthetic
public inline fun hostGenesisState(block: ibc.applications.interchain_accounts.v1.HostGenesisStateKt.Dsl.() -> kotlin.Unit): ibc.applications.interchain_accounts.v1.Genesis.HostGenesisState =
  ibc.applications.interchain_accounts.v1.HostGenesisStateKt.Dsl._create(ibc.applications.interchain_accounts.v1.Genesis.HostGenesisState.newBuilder()).apply { block() }._build()
public object HostGenesisStateKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.applications.interchain_accounts.v1.Genesis.HostGenesisState.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.applications.interchain_accounts.v1.Genesis.HostGenesisState.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.applications.interchain_accounts.v1.Genesis.HostGenesisState = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ActiveChannelsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .ibc.applications.interchain_accounts.v1.ActiveChannel active_channels = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"active_channels&#92;""];</code>
     */
     public val activeChannels: com.google.protobuf.kotlin.DslList<ibc.applications.interchain_accounts.v1.Genesis.ActiveChannel, ActiveChannelsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getActiveChannelsList()
      )
    /**
     * <code>repeated .ibc.applications.interchain_accounts.v1.ActiveChannel active_channels = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"active_channels&#92;""];</code>
     * @param value The activeChannels to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addActiveChannels")
    public fun com.google.protobuf.kotlin.DslList<ibc.applications.interchain_accounts.v1.Genesis.ActiveChannel, ActiveChannelsProxy>.add(value: ibc.applications.interchain_accounts.v1.Genesis.ActiveChannel) {
      _builder.addActiveChannels(value)
    }/**
     * <code>repeated .ibc.applications.interchain_accounts.v1.ActiveChannel active_channels = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"active_channels&#92;""];</code>
     * @param value The activeChannels to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignActiveChannels")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ibc.applications.interchain_accounts.v1.Genesis.ActiveChannel, ActiveChannelsProxy>.plusAssign(value: ibc.applications.interchain_accounts.v1.Genesis.ActiveChannel) {
      add(value)
    }/**
     * <code>repeated .ibc.applications.interchain_accounts.v1.ActiveChannel active_channels = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"active_channels&#92;""];</code>
     * @param values The activeChannels to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllActiveChannels")
    public fun com.google.protobuf.kotlin.DslList<ibc.applications.interchain_accounts.v1.Genesis.ActiveChannel, ActiveChannelsProxy>.addAll(values: kotlin.collections.Iterable<ibc.applications.interchain_accounts.v1.Genesis.ActiveChannel>) {
      _builder.addAllActiveChannels(values)
    }/**
     * <code>repeated .ibc.applications.interchain_accounts.v1.ActiveChannel active_channels = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"active_channels&#92;""];</code>
     * @param values The activeChannels to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllActiveChannels")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ibc.applications.interchain_accounts.v1.Genesis.ActiveChannel, ActiveChannelsProxy>.plusAssign(values: kotlin.collections.Iterable<ibc.applications.interchain_accounts.v1.Genesis.ActiveChannel>) {
      addAll(values)
    }/**
     * <code>repeated .ibc.applications.interchain_accounts.v1.ActiveChannel active_channels = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"active_channels&#92;""];</code>
     * @param index The index to set the value at.
     * @param value The activeChannels to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setActiveChannels")
    public operator fun com.google.protobuf.kotlin.DslList<ibc.applications.interchain_accounts.v1.Genesis.ActiveChannel, ActiveChannelsProxy>.set(index: kotlin.Int, value: ibc.applications.interchain_accounts.v1.Genesis.ActiveChannel) {
      _builder.setActiveChannels(index, value)
    }/**
     * <code>repeated .ibc.applications.interchain_accounts.v1.ActiveChannel active_channels = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"active_channels&#92;""];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearActiveChannels")
    public fun com.google.protobuf.kotlin.DslList<ibc.applications.interchain_accounts.v1.Genesis.ActiveChannel, ActiveChannelsProxy>.clear() {
      _builder.clearActiveChannels()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class InterchainAccountsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount interchain_accounts = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"interchain_accounts&#92;""];</code>
     */
     public val interchainAccounts: com.google.protobuf.kotlin.DslList<ibc.applications.interchain_accounts.v1.Genesis.RegisteredInterchainAccount, InterchainAccountsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getInterchainAccountsList()
      )
    /**
     * <code>repeated .ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount interchain_accounts = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"interchain_accounts&#92;""];</code>
     * @param value The interchainAccounts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addInterchainAccounts")
    public fun com.google.protobuf.kotlin.DslList<ibc.applications.interchain_accounts.v1.Genesis.RegisteredInterchainAccount, InterchainAccountsProxy>.add(value: ibc.applications.interchain_accounts.v1.Genesis.RegisteredInterchainAccount) {
      _builder.addInterchainAccounts(value)
    }/**
     * <code>repeated .ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount interchain_accounts = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"interchain_accounts&#92;""];</code>
     * @param value The interchainAccounts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignInterchainAccounts")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ibc.applications.interchain_accounts.v1.Genesis.RegisteredInterchainAccount, InterchainAccountsProxy>.plusAssign(value: ibc.applications.interchain_accounts.v1.Genesis.RegisteredInterchainAccount) {
      add(value)
    }/**
     * <code>repeated .ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount interchain_accounts = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"interchain_accounts&#92;""];</code>
     * @param values The interchainAccounts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllInterchainAccounts")
    public fun com.google.protobuf.kotlin.DslList<ibc.applications.interchain_accounts.v1.Genesis.RegisteredInterchainAccount, InterchainAccountsProxy>.addAll(values: kotlin.collections.Iterable<ibc.applications.interchain_accounts.v1.Genesis.RegisteredInterchainAccount>) {
      _builder.addAllInterchainAccounts(values)
    }/**
     * <code>repeated .ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount interchain_accounts = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"interchain_accounts&#92;""];</code>
     * @param values The interchainAccounts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllInterchainAccounts")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ibc.applications.interchain_accounts.v1.Genesis.RegisteredInterchainAccount, InterchainAccountsProxy>.plusAssign(values: kotlin.collections.Iterable<ibc.applications.interchain_accounts.v1.Genesis.RegisteredInterchainAccount>) {
      addAll(values)
    }/**
     * <code>repeated .ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount interchain_accounts = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"interchain_accounts&#92;""];</code>
     * @param index The index to set the value at.
     * @param value The interchainAccounts to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setInterchainAccounts")
    public operator fun com.google.protobuf.kotlin.DslList<ibc.applications.interchain_accounts.v1.Genesis.RegisteredInterchainAccount, InterchainAccountsProxy>.set(index: kotlin.Int, value: ibc.applications.interchain_accounts.v1.Genesis.RegisteredInterchainAccount) {
      _builder.setInterchainAccounts(index, value)
    }/**
     * <code>repeated .ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount interchain_accounts = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"interchain_accounts&#92;""];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearInterchainAccounts")
    public fun com.google.protobuf.kotlin.DslList<ibc.applications.interchain_accounts.v1.Genesis.RegisteredInterchainAccount, InterchainAccountsProxy>.clear() {
      _builder.clearInterchainAccounts()
    }
    /**
     * <code>string port = 3;</code>
     */
    public var port: kotlin.String
      @JvmName("getPort")
      get() = _builder.getPort()
      @JvmName("setPort")
      set(value) {
        _builder.setPort(value)
      }
    /**
     * <code>string port = 3;</code>
     */
    public fun clearPort() {
      _builder.clearPort()
    }

    /**
     * <code>.ibc.applications.interchain_accounts.host.v1.Params params = 4 [(.gogoproto.nullable) = false];</code>
     */
    public var params: ibc.applications.interchain_accounts.host.v1.Host.Params
      @JvmName("getParams")
      get() = _builder.getParams()
      @JvmName("setParams")
      set(value) {
        _builder.setParams(value)
      }
    /**
     * <code>.ibc.applications.interchain_accounts.host.v1.Params params = 4 [(.gogoproto.nullable) = false];</code>
     */
    public fun clearParams() {
      _builder.clearParams()
    }
    /**
     * <code>.ibc.applications.interchain_accounts.host.v1.Params params = 4 [(.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    public fun hasParams(): kotlin.Boolean {
      return _builder.hasParams()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.applications.interchain_accounts.v1.Genesis.HostGenesisState.copy(block: ibc.applications.interchain_accounts.v1.HostGenesisStateKt.Dsl.() -> kotlin.Unit): ibc.applications.interchain_accounts.v1.Genesis.HostGenesisState =
  ibc.applications.interchain_accounts.v1.HostGenesisStateKt.Dsl._create(this.toBuilder()).apply { block() }._build()
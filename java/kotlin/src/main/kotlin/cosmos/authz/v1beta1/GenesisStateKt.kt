//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/authz/v1beta1/genesis.proto

package cosmos.authz.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun genesisState(block: cosmos.authz.v1beta1.GenesisStateKt.Dsl.() -> kotlin.Unit): cosmos.authz.v1beta1.Genesis.GenesisState =
  cosmos.authz.v1beta1.GenesisStateKt.Dsl._create(cosmos.authz.v1beta1.Genesis.GenesisState.newBuilder()).apply { block() }._build()
public object GenesisStateKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.authz.v1beta1.Genesis.GenesisState.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.authz.v1beta1.Genesis.GenesisState.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.authz.v1beta1.Genesis.GenesisState = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class AuthorizationProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmos.authz.v1beta1.GrantAuthorization authorization = 1 [(.gogoproto.nullable) = false];</code>
     */
     public val authorization: com.google.protobuf.kotlin.DslList<cosmos.authz.v1beta1.Authz.GrantAuthorization, AuthorizationProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getAuthorizationList()
      )
    /**
     * <code>repeated .cosmos.authz.v1beta1.GrantAuthorization authorization = 1 [(.gogoproto.nullable) = false];</code>
     * @param value The authorization to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAuthorization")
    public fun com.google.protobuf.kotlin.DslList<cosmos.authz.v1beta1.Authz.GrantAuthorization, AuthorizationProxy>.add(value: cosmos.authz.v1beta1.Authz.GrantAuthorization) {
      _builder.addAuthorization(value)
    }/**
     * <code>repeated .cosmos.authz.v1beta1.GrantAuthorization authorization = 1 [(.gogoproto.nullable) = false];</code>
     * @param value The authorization to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAuthorization")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.authz.v1beta1.Authz.GrantAuthorization, AuthorizationProxy>.plusAssign(value: cosmos.authz.v1beta1.Authz.GrantAuthorization) {
      add(value)
    }/**
     * <code>repeated .cosmos.authz.v1beta1.GrantAuthorization authorization = 1 [(.gogoproto.nullable) = false];</code>
     * @param values The authorization to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllAuthorization")
    public fun com.google.protobuf.kotlin.DslList<cosmos.authz.v1beta1.Authz.GrantAuthorization, AuthorizationProxy>.addAll(values: kotlin.collections.Iterable<cosmos.authz.v1beta1.Authz.GrantAuthorization>) {
      _builder.addAllAuthorization(values)
    }/**
     * <code>repeated .cosmos.authz.v1beta1.GrantAuthorization authorization = 1 [(.gogoproto.nullable) = false];</code>
     * @param values The authorization to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllAuthorization")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.authz.v1beta1.Authz.GrantAuthorization, AuthorizationProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.authz.v1beta1.Authz.GrantAuthorization>) {
      addAll(values)
    }/**
     * <code>repeated .cosmos.authz.v1beta1.GrantAuthorization authorization = 1 [(.gogoproto.nullable) = false];</code>
     * @param index The index to set the value at.
     * @param value The authorization to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setAuthorization")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.authz.v1beta1.Authz.GrantAuthorization, AuthorizationProxy>.set(index: kotlin.Int, value: cosmos.authz.v1beta1.Authz.GrantAuthorization) {
      _builder.setAuthorization(index, value)
    }/**
     * <code>repeated .cosmos.authz.v1beta1.GrantAuthorization authorization = 1 [(.gogoproto.nullable) = false];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearAuthorization")
    public fun com.google.protobuf.kotlin.DslList<cosmos.authz.v1beta1.Authz.GrantAuthorization, AuthorizationProxy>.clear() {
      _builder.clearAuthorization()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.authz.v1beta1.Genesis.GenesisState.copy(block: cosmos.authz.v1beta1.GenesisStateKt.Dsl.() -> kotlin.Unit): cosmos.authz.v1beta1.Genesis.GenesisState =
  cosmos.authz.v1beta1.GenesisStateKt.Dsl._create(this.toBuilder()).apply { block() }._build()

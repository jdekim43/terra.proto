//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google/api/http.proto

package com.google.api;

@kotlin.jvm.JvmSynthetic
public inline fun http(block: com.google.api.HttpKt.Dsl.() -> kotlin.Unit): com.google.api.Http =
  com.google.api.HttpKt.Dsl._create(com.google.api.Http.newBuilder()).apply { block() }._build()
public object HttpKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.google.api.Http.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.google.api.Http.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.google.api.Http = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class RulesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * A list of HTTP configuration rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     */
     public val rules: com.google.protobuf.kotlin.DslList<com.google.api.HttpRule, RulesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getRulesList()
      )
    /**
     * <pre>
     * A list of HTTP configuration rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     * @param value The rules to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addRules")
    public fun com.google.protobuf.kotlin.DslList<com.google.api.HttpRule, RulesProxy>.add(value: com.google.api.HttpRule) {
      _builder.addRules(value)
    }/**
     * <pre>
     * A list of HTTP configuration rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     * @param value The rules to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignRules")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.api.HttpRule, RulesProxy>.plusAssign(value: com.google.api.HttpRule) {
      add(value)
    }/**
     * <pre>
     * A list of HTTP configuration rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     * @param values The rules to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllRules")
    public fun com.google.protobuf.kotlin.DslList<com.google.api.HttpRule, RulesProxy>.addAll(values: kotlin.collections.Iterable<com.google.api.HttpRule>) {
      _builder.addAllRules(values)
    }/**
     * <pre>
     * A list of HTTP configuration rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     * @param values The rules to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllRules")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.api.HttpRule, RulesProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.api.HttpRule>) {
      addAll(values)
    }/**
     * <pre>
     * A list of HTTP configuration rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     * @param index The index to set the value at.
     * @param value The rules to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setRules")
    public operator fun com.google.protobuf.kotlin.DslList<com.google.api.HttpRule, RulesProxy>.set(index: kotlin.Int, value: com.google.api.HttpRule) {
      _builder.setRules(index, value)
    }/**
     * <pre>
     * A list of HTTP configuration rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.HttpRule rules = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearRules")
    public fun com.google.protobuf.kotlin.DslList<com.google.api.HttpRule, RulesProxy>.clear() {
      _builder.clearRules()
    }
    /**
     * <pre>
     * When set to true, URL path parmeters will be fully URI-decoded except in
     * cases of single segment matches in reserved expansion, where "%2F" will be
     * left encoded.
     * The default behavior is to not decode RFC 6570 reserved characters in multi
     * segment matches.
     * </pre>
     *
     * <code>bool fully_decode_reserved_expansion = 2;</code>
     */
    public var fullyDecodeReservedExpansion: kotlin.Boolean
      @JvmName("getFullyDecodeReservedExpansion")
      get() = _builder.getFullyDecodeReservedExpansion()
      @JvmName("setFullyDecodeReservedExpansion")
      set(value) {
        _builder.setFullyDecodeReservedExpansion(value)
      }
    /**
     * <pre>
     * When set to true, URL path parmeters will be fully URI-decoded except in
     * cases of single segment matches in reserved expansion, where "%2F" will be
     * left encoded.
     * The default behavior is to not decode RFC 6570 reserved characters in multi
     * segment matches.
     * </pre>
     *
     * <code>bool fully_decode_reserved_expansion = 2;</code>
     */
    public fun clearFullyDecodeReservedExpansion() {
      _builder.clearFullyDecodeReservedExpansion()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.google.api.Http.copy(block: com.google.api.HttpKt.Dsl.() -> kotlin.Unit): com.google.api.Http =
  com.google.api.HttpKt.Dsl._create(this.toBuilder()).apply { block() }._build()

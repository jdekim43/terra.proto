//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/feegrant/v1beta1/query.proto

package cosmos.feegrant.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryAllowancesResponse(block: cosmos.feegrant.v1beta1.QueryAllowancesResponseKt.Dsl.() -> kotlin.Unit): cosmos.feegrant.v1beta1.QueryOuterClass.QueryAllowancesResponse =
  cosmos.feegrant.v1beta1.QueryAllowancesResponseKt.Dsl._create(cosmos.feegrant.v1beta1.QueryOuterClass.QueryAllowancesResponse.newBuilder()).apply { block() }._build()
public object QueryAllowancesResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.feegrant.v1beta1.QueryOuterClass.QueryAllowancesResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.feegrant.v1beta1.QueryOuterClass.QueryAllowancesResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.feegrant.v1beta1.QueryOuterClass.QueryAllowancesResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class AllowancesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * allowances are allowance's granted for grantee by granter.
     * </pre>
     *
     * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1;</code>
     */
     public val allowances: com.google.protobuf.kotlin.DslList<cosmos.feegrant.v1beta1.Feegrant.Grant, AllowancesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getAllowancesList()
      )
    /**
     * <pre>
     * allowances are allowance's granted for grantee by granter.
     * </pre>
     *
     * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1;</code>
     * @param value The allowances to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllowances")
    public fun com.google.protobuf.kotlin.DslList<cosmos.feegrant.v1beta1.Feegrant.Grant, AllowancesProxy>.add(value: cosmos.feegrant.v1beta1.Feegrant.Grant) {
      _builder.addAllowances(value)
    }/**
     * <pre>
     * allowances are allowance's granted for grantee by granter.
     * </pre>
     *
     * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1;</code>
     * @param value The allowances to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllowances")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.feegrant.v1beta1.Feegrant.Grant, AllowancesProxy>.plusAssign(value: cosmos.feegrant.v1beta1.Feegrant.Grant) {
      add(value)
    }/**
     * <pre>
     * allowances are allowance's granted for grantee by granter.
     * </pre>
     *
     * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1;</code>
     * @param values The allowances to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllAllowances")
    public fun com.google.protobuf.kotlin.DslList<cosmos.feegrant.v1beta1.Feegrant.Grant, AllowancesProxy>.addAll(values: kotlin.collections.Iterable<cosmos.feegrant.v1beta1.Feegrant.Grant>) {
      _builder.addAllAllowances(values)
    }/**
     * <pre>
     * allowances are allowance's granted for grantee by granter.
     * </pre>
     *
     * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1;</code>
     * @param values The allowances to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllAllowances")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.feegrant.v1beta1.Feegrant.Grant, AllowancesProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.feegrant.v1beta1.Feegrant.Grant>) {
      addAll(values)
    }/**
     * <pre>
     * allowances are allowance's granted for grantee by granter.
     * </pre>
     *
     * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1;</code>
     * @param index The index to set the value at.
     * @param value The allowances to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setAllowances")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.feegrant.v1beta1.Feegrant.Grant, AllowancesProxy>.set(index: kotlin.Int, value: cosmos.feegrant.v1beta1.Feegrant.Grant) {
      _builder.setAllowances(index, value)
    }/**
     * <pre>
     * allowances are allowance's granted for grantee by granter.
     * </pre>
     *
     * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearAllowances")
    public fun com.google.protobuf.kotlin.DslList<cosmos.feegrant.v1beta1.Feegrant.Grant, AllowancesProxy>.clear() {
      _builder.clearAllowances()
    }
    /**
     * <pre>
     * pagination defines an pagination for the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public var pagination: cosmos.base.query.v1beta1.Pagination.PageResponse
      @JvmName("getPagination")
      get() = _builder.getPagination()
      @JvmName("setPagination")
      set(value) {
        _builder.setPagination(value)
      }
    /**
     * <pre>
     * pagination defines an pagination for the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines an pagination for the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     * @return Whether the pagination field is set.
     */
    public fun hasPagination(): kotlin.Boolean {
      return _builder.hasPagination()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.feegrant.v1beta1.QueryOuterClass.QueryAllowancesResponse.copy(block: cosmos.feegrant.v1beta1.QueryAllowancesResponseKt.Dsl.() -> kotlin.Unit): cosmos.feegrant.v1beta1.QueryOuterClass.QueryAllowancesResponse =
  cosmos.feegrant.v1beta1.QueryAllowancesResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/applications/transfer/v1/query.proto

package ibc.applications.transfer.v1;

@kotlin.jvm.JvmSynthetic
public inline fun queryDenomTracesResponse(block: ibc.applications.transfer.v1.QueryDenomTracesResponseKt.Dsl.() -> kotlin.Unit): ibc.applications.transfer.v1.QueryOuterClass.QueryDenomTracesResponse =
  ibc.applications.transfer.v1.QueryDenomTracesResponseKt.Dsl._create(ibc.applications.transfer.v1.QueryOuterClass.QueryDenomTracesResponse.newBuilder()).apply { block() }._build()
public object QueryDenomTracesResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.applications.transfer.v1.QueryOuterClass.QueryDenomTracesResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.applications.transfer.v1.QueryOuterClass.QueryDenomTracesResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.applications.transfer.v1.QueryOuterClass.QueryDenomTracesResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class DenomTracesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     */
     public val denomTraces: com.google.protobuf.kotlin.DslList<ibc.applications.transfer.v1.Transfer.DenomTrace, DenomTracesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getDenomTracesList()
      )
    /**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     * @param value The denomTraces to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addDenomTraces")
    public fun com.google.protobuf.kotlin.DslList<ibc.applications.transfer.v1.Transfer.DenomTrace, DenomTracesProxy>.add(value: ibc.applications.transfer.v1.Transfer.DenomTrace) {
      _builder.addDenomTraces(value)
    }/**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     * @param value The denomTraces to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignDenomTraces")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ibc.applications.transfer.v1.Transfer.DenomTrace, DenomTracesProxy>.plusAssign(value: ibc.applications.transfer.v1.Transfer.DenomTrace) {
      add(value)
    }/**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     * @param values The denomTraces to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllDenomTraces")
    public fun com.google.protobuf.kotlin.DslList<ibc.applications.transfer.v1.Transfer.DenomTrace, DenomTracesProxy>.addAll(values: kotlin.collections.Iterable<ibc.applications.transfer.v1.Transfer.DenomTrace>) {
      _builder.addAllDenomTraces(values)
    }/**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     * @param values The denomTraces to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllDenomTraces")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ibc.applications.transfer.v1.Transfer.DenomTrace, DenomTracesProxy>.plusAssign(values: kotlin.collections.Iterable<ibc.applications.transfer.v1.Transfer.DenomTrace>) {
      addAll(values)
    }/**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     * @param index The index to set the value at.
     * @param value The denomTraces to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setDenomTraces")
    public operator fun com.google.protobuf.kotlin.DslList<ibc.applications.transfer.v1.Transfer.DenomTrace, DenomTracesProxy>.set(index: kotlin.Int, value: ibc.applications.transfer.v1.Transfer.DenomTrace) {
      _builder.setDenomTraces(index, value)
    }/**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearDenomTraces")
    public fun com.google.protobuf.kotlin.DslList<ibc.applications.transfer.v1.Transfer.DenomTrace, DenomTracesProxy>.clear() {
      _builder.clearDenomTraces()
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
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
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
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
public inline fun ibc.applications.transfer.v1.QueryOuterClass.QueryDenomTracesResponse.copy(block: ibc.applications.transfer.v1.QueryDenomTracesResponseKt.Dsl.() -> kotlin.Unit): ibc.applications.transfer.v1.QueryOuterClass.QueryDenomTracesResponse =
  ibc.applications.transfer.v1.QueryDenomTracesResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmwasm/wasm/v1/query.proto

package cosmwasm.wasm.v1;

@kotlin.jvm.JvmSynthetic
public inline fun queryContractHistoryResponse(block: cosmwasm.wasm.v1.QueryContractHistoryResponseKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse =
  cosmwasm.wasm.v1.QueryContractHistoryResponseKt.Dsl._create(cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse.newBuilder()).apply { block() }._build()
public object QueryContractHistoryResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class EntriesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmwasm.wasm.v1.ContractCodeHistoryEntry entries = 1 [(.gogoproto.nullable) = false];</code>
     */
     public val entries: com.google.protobuf.kotlin.DslList<cosmwasm.wasm.v1.Types.ContractCodeHistoryEntry, EntriesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getEntriesList()
      )
    /**
     * <code>repeated .cosmwasm.wasm.v1.ContractCodeHistoryEntry entries = 1 [(.gogoproto.nullable) = false];</code>
     * @param value The entries to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addEntries")
    public fun com.google.protobuf.kotlin.DslList<cosmwasm.wasm.v1.Types.ContractCodeHistoryEntry, EntriesProxy>.add(value: cosmwasm.wasm.v1.Types.ContractCodeHistoryEntry) {
      _builder.addEntries(value)
    }/**
     * <code>repeated .cosmwasm.wasm.v1.ContractCodeHistoryEntry entries = 1 [(.gogoproto.nullable) = false];</code>
     * @param value The entries to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignEntries")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmwasm.wasm.v1.Types.ContractCodeHistoryEntry, EntriesProxy>.plusAssign(value: cosmwasm.wasm.v1.Types.ContractCodeHistoryEntry) {
      add(value)
    }/**
     * <code>repeated .cosmwasm.wasm.v1.ContractCodeHistoryEntry entries = 1 [(.gogoproto.nullable) = false];</code>
     * @param values The entries to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllEntries")
    public fun com.google.protobuf.kotlin.DslList<cosmwasm.wasm.v1.Types.ContractCodeHistoryEntry, EntriesProxy>.addAll(values: kotlin.collections.Iterable<cosmwasm.wasm.v1.Types.ContractCodeHistoryEntry>) {
      _builder.addAllEntries(values)
    }/**
     * <code>repeated .cosmwasm.wasm.v1.ContractCodeHistoryEntry entries = 1 [(.gogoproto.nullable) = false];</code>
     * @param values The entries to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllEntries")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmwasm.wasm.v1.Types.ContractCodeHistoryEntry, EntriesProxy>.plusAssign(values: kotlin.collections.Iterable<cosmwasm.wasm.v1.Types.ContractCodeHistoryEntry>) {
      addAll(values)
    }/**
     * <code>repeated .cosmwasm.wasm.v1.ContractCodeHistoryEntry entries = 1 [(.gogoproto.nullable) = false];</code>
     * @param index The index to set the value at.
     * @param value The entries to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setEntries")
    public operator fun com.google.protobuf.kotlin.DslList<cosmwasm.wasm.v1.Types.ContractCodeHistoryEntry, EntriesProxy>.set(index: kotlin.Int, value: cosmwasm.wasm.v1.Types.ContractCodeHistoryEntry) {
      _builder.setEntries(index, value)
    }/**
     * <code>repeated .cosmwasm.wasm.v1.ContractCodeHistoryEntry entries = 1 [(.gogoproto.nullable) = false];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearEntries")
    public fun com.google.protobuf.kotlin.DslList<cosmwasm.wasm.v1.Types.ContractCodeHistoryEntry, EntriesProxy>.clear() {
      _builder.clearEntries()
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
public inline fun cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse.copy(block: cosmwasm.wasm.v1.QueryContractHistoryResponseKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse =
  cosmwasm.wasm.v1.QueryContractHistoryResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

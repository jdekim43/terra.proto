//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmwasm/wasm/v1/query.proto

package cosmwasm.wasm.v1;

@kotlin.jvm.JvmSynthetic
public inline fun queryContractHistoryRequest(block: cosmwasm.wasm.v1.QueryContractHistoryRequestKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest =
  cosmwasm.wasm.v1.QueryContractHistoryRequestKt.Dsl._create(cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest.newBuilder()).apply { block() }._build()
public object QueryContractHistoryRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest = _builder.build()

    /**
     * <pre>
     * address is the address of the contract to query
     * </pre>
     *
     * <code>string address = 1;</code>
     */
    public var address: kotlin.String
      @JvmName("getAddress")
      get() = _builder.getAddress()
      @JvmName("setAddress")
      set(value) {
        _builder.setAddress(value)
      }
    /**
     * <pre>
     * address is the address of the contract to query
     * </pre>
     *
     * <code>string address = 1;</code>
     */
    public fun clearAddress() {
      _builder.clearAddress()
    }

    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
     */
    public var pagination: cosmos.base.query.v1beta1.Pagination.PageRequest
      @JvmName("getPagination")
      get() = _builder.getPagination()
      @JvmName("setPagination")
      set(value) {
        _builder.setPagination(value)
      }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
     */
    public fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
     * @return Whether the pagination field is set.
     */
    public fun hasPagination(): kotlin.Boolean {
      return _builder.hasPagination()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest.copy(block: cosmwasm.wasm.v1.QueryContractHistoryRequestKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest =
  cosmwasm.wasm.v1.QueryContractHistoryRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
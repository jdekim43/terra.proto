//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/tx/v1beta1/service.proto

package cosmos.tx.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun getBlockWithTxsRequest(block: cosmos.tx.v1beta1.GetBlockWithTxsRequestKt.Dsl.() -> kotlin.Unit): cosmos.tx.v1beta1.ServiceOuterClass.GetBlockWithTxsRequest =
  cosmos.tx.v1beta1.GetBlockWithTxsRequestKt.Dsl._create(cosmos.tx.v1beta1.ServiceOuterClass.GetBlockWithTxsRequest.newBuilder()).apply { block() }._build()
public object GetBlockWithTxsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.tx.v1beta1.ServiceOuterClass.GetBlockWithTxsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.tx.v1beta1.ServiceOuterClass.GetBlockWithTxsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.tx.v1beta1.ServiceOuterClass.GetBlockWithTxsRequest = _builder.build()

    /**
     * <pre>
     * height is the height of the block to query.
     * </pre>
     *
     * <code>int64 height = 1;</code>
     */
    public var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <pre>
     * height is the height of the block to query.
     * </pre>
     *
     * <code>int64 height = 1;</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }

    /**
     * <pre>
     * pagination defines a pagination for the request.
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
     * pagination defines a pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
     */
    public fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines a pagination for the request.
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
public inline fun cosmos.tx.v1beta1.ServiceOuterClass.GetBlockWithTxsRequest.copy(block: cosmos.tx.v1beta1.GetBlockWithTxsRequestKt.Dsl.() -> kotlin.Unit): cosmos.tx.v1beta1.ServiceOuterClass.GetBlockWithTxsRequest =
  cosmos.tx.v1beta1.GetBlockWithTxsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

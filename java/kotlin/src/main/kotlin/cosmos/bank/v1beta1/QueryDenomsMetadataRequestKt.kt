//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/bank/v1beta1/query.proto

package cosmos.bank.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryDenomsMetadataRequest(block: cosmos.bank.v1beta1.QueryDenomsMetadataRequestKt.Dsl.() -> kotlin.Unit): cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataRequest =
  cosmos.bank.v1beta1.QueryDenomsMetadataRequestKt.Dsl._create(cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataRequest.newBuilder()).apply { block() }._build()
public object QueryDenomsMetadataRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataRequest = _builder.build()

    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
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
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
     */
    public fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
     * @return Whether the pagination field is set.
     */
    public fun hasPagination(): kotlin.Boolean {
      return _builder.hasPagination()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataRequest.copy(block: cosmos.bank.v1beta1.QueryDenomsMetadataRequestKt.Dsl.() -> kotlin.Unit): cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataRequest =
  cosmos.bank.v1beta1.QueryDenomsMetadataRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

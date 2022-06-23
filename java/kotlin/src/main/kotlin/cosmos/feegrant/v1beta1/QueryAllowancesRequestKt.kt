//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/feegrant/v1beta1/query.proto

package cosmos.feegrant.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryAllowancesRequest(block: cosmos.feegrant.v1beta1.QueryAllowancesRequestKt.Dsl.() -> kotlin.Unit): cosmos.feegrant.v1beta1.QueryOuterClass.QueryAllowancesRequest =
  cosmos.feegrant.v1beta1.QueryAllowancesRequestKt.Dsl._create(cosmos.feegrant.v1beta1.QueryOuterClass.QueryAllowancesRequest.newBuilder()).apply { block() }._build()
public object QueryAllowancesRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.feegrant.v1beta1.QueryOuterClass.QueryAllowancesRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.feegrant.v1beta1.QueryOuterClass.QueryAllowancesRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.feegrant.v1beta1.QueryOuterClass.QueryAllowancesRequest = _builder.build()

    /**
     * <code>string grantee = 1;</code>
     */
    public var grantee: kotlin.String
      @JvmName("getGrantee")
      get() = _builder.getGrantee()
      @JvmName("setGrantee")
      set(value) {
        _builder.setGrantee(value)
      }
    /**
     * <code>string grantee = 1;</code>
     */
    public fun clearGrantee() {
      _builder.clearGrantee()
    }

    /**
     * <pre>
     * pagination defines an pagination for the request.
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
     * pagination defines an pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
     */
    public fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines an pagination for the request.
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
public inline fun cosmos.feegrant.v1beta1.QueryOuterClass.QueryAllowancesRequest.copy(block: cosmos.feegrant.v1beta1.QueryAllowancesRequestKt.Dsl.() -> kotlin.Unit): cosmos.feegrant.v1beta1.QueryOuterClass.QueryAllowancesRequest =
  cosmos.feegrant.v1beta1.QueryAllowancesRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

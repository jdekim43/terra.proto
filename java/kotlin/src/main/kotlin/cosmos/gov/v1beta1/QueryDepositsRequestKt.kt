//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/gov/v1beta1/query.proto

package cosmos.gov.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryDepositsRequest(block: cosmos.gov.v1beta1.QueryDepositsRequestKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1beta1.QueryOuterClass.QueryDepositsRequest =
  cosmos.gov.v1beta1.QueryDepositsRequestKt.Dsl._create(cosmos.gov.v1beta1.QueryOuterClass.QueryDepositsRequest.newBuilder()).apply { block() }._build()
public object QueryDepositsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.gov.v1beta1.QueryOuterClass.QueryDepositsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.gov.v1beta1.QueryOuterClass.QueryDepositsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.gov.v1beta1.QueryOuterClass.QueryDepositsRequest = _builder.build()

    /**
     * <pre>
     * proposal_id defines the unique id of the proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1;</code>
     */
    public var proposalId: kotlin.Long
      @JvmName("getProposalId")
      get() = _builder.getProposalId()
      @JvmName("setProposalId")
      set(value) {
        _builder.setProposalId(value)
      }
    /**
     * <pre>
     * proposal_id defines the unique id of the proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1;</code>
     */
    public fun clearProposalId() {
      _builder.clearProposalId()
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
public inline fun cosmos.gov.v1beta1.QueryOuterClass.QueryDepositsRequest.copy(block: cosmos.gov.v1beta1.QueryDepositsRequestKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1beta1.QueryOuterClass.QueryDepositsRequest =
  cosmos.gov.v1beta1.QueryDepositsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/applications/fee/v1/query.proto

package ibc.applications.fee.v1;

@kotlin.jvm.JvmSynthetic
public inline fun queryFeeEnabledChannelResponse(block: ibc.applications.fee.v1.QueryFeeEnabledChannelResponseKt.Dsl.() -> kotlin.Unit): ibc.applications.fee.v1.QueryOuterClass.QueryFeeEnabledChannelResponse =
  ibc.applications.fee.v1.QueryFeeEnabledChannelResponseKt.Dsl._create(ibc.applications.fee.v1.QueryOuterClass.QueryFeeEnabledChannelResponse.newBuilder()).apply { block() }._build()
public object QueryFeeEnabledChannelResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.applications.fee.v1.QueryOuterClass.QueryFeeEnabledChannelResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.applications.fee.v1.QueryOuterClass.QueryFeeEnabledChannelResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.applications.fee.v1.QueryOuterClass.QueryFeeEnabledChannelResponse = _builder.build()

    /**
     * <pre>
     * boolean flag representing the fee enabled channel status
     * </pre>
     *
     * <code>bool fee_enabled = 1 [(.gogoproto.moretags) = "yaml:&#92;"fee_enabled&#92;""];</code>
     */
    public var feeEnabled: kotlin.Boolean
      @JvmName("getFeeEnabled")
      get() = _builder.getFeeEnabled()
      @JvmName("setFeeEnabled")
      set(value) {
        _builder.setFeeEnabled(value)
      }
    /**
     * <pre>
     * boolean flag representing the fee enabled channel status
     * </pre>
     *
     * <code>bool fee_enabled = 1 [(.gogoproto.moretags) = "yaml:&#92;"fee_enabled&#92;""];</code>
     */
    public fun clearFeeEnabled() {
      _builder.clearFeeEnabled()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.applications.fee.v1.QueryOuterClass.QueryFeeEnabledChannelResponse.copy(block: ibc.applications.fee.v1.QueryFeeEnabledChannelResponseKt.Dsl.() -> kotlin.Unit): ibc.applications.fee.v1.QueryOuterClass.QueryFeeEnabledChannelResponse =
  ibc.applications.fee.v1.QueryFeeEnabledChannelResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
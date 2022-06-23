//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/connection/v1/connection.proto

package ibc.core.connection.v1;

@kotlin.jvm.JvmSynthetic
public inline fun params(block: ibc.core.connection.v1.ParamsKt.Dsl.() -> kotlin.Unit): ibc.core.connection.v1.Connection.Params =
  ibc.core.connection.v1.ParamsKt.Dsl._create(ibc.core.connection.v1.Connection.Params.newBuilder()).apply { block() }._build()
public object ParamsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.connection.v1.Connection.Params.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.connection.v1.Connection.Params.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.connection.v1.Connection.Params = _builder.build()

    /**
     * <pre>
     * maximum expected time per block (in nanoseconds), used to enforce block delay. This parameter should reflect the
     * largest amount of time that the chain might reasonably take to produce the next block under normal operating
     * conditions. A safe choice is 3-5x the expected time per block.
     * </pre>
     *
     * <code>uint64 max_expected_time_per_block = 1 [(.gogoproto.moretags) = "yaml:&#92;"max_expected_time_per_block&#92;""];</code>
     */
    public var maxExpectedTimePerBlock: kotlin.Long
      @JvmName("getMaxExpectedTimePerBlock")
      get() = _builder.getMaxExpectedTimePerBlock()
      @JvmName("setMaxExpectedTimePerBlock")
      set(value) {
        _builder.setMaxExpectedTimePerBlock(value)
      }
    /**
     * <pre>
     * maximum expected time per block (in nanoseconds), used to enforce block delay. This parameter should reflect the
     * largest amount of time that the chain might reasonably take to produce the next block under normal operating
     * conditions. A safe choice is 3-5x the expected time per block.
     * </pre>
     *
     * <code>uint64 max_expected_time_per_block = 1 [(.gogoproto.moretags) = "yaml:&#92;"max_expected_time_per_block&#92;""];</code>
     */
    public fun clearMaxExpectedTimePerBlock() {
      _builder.clearMaxExpectedTimePerBlock()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.connection.v1.Connection.Params.copy(block: ibc.core.connection.v1.ParamsKt.Dsl.() -> kotlin.Unit): ibc.core.connection.v1.Connection.Params =
  ibc.core.connection.v1.ParamsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

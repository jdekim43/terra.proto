//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/slashing/v1beta1/query.proto

package cosmos.slashing.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryParamsResponse(block: cosmos.slashing.v1beta1.QueryParamsResponseKt.Dsl.() -> kotlin.Unit): cosmos.slashing.v1beta1.QueryOuterClass.QueryParamsResponse =
  cosmos.slashing.v1beta1.QueryParamsResponseKt.Dsl._create(cosmos.slashing.v1beta1.QueryOuterClass.QueryParamsResponse.newBuilder()).apply { block() }._build()
public object QueryParamsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.slashing.v1beta1.QueryOuterClass.QueryParamsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.slashing.v1beta1.QueryOuterClass.QueryParamsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.slashing.v1beta1.QueryOuterClass.QueryParamsResponse = _builder.build()

    /**
     * <code>.cosmos.slashing.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     */
    public var params: cosmos.slashing.v1beta1.Slashing.Params
      @JvmName("getParams")
      get() = _builder.getParams()
      @JvmName("setParams")
      set(value) {
        _builder.setParams(value)
      }
    /**
     * <code>.cosmos.slashing.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     */
    public fun clearParams() {
      _builder.clearParams()
    }
    /**
     * <code>.cosmos.slashing.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    public fun hasParams(): kotlin.Boolean {
      return _builder.hasParams()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.slashing.v1beta1.QueryOuterClass.QueryParamsResponse.copy(block: cosmos.slashing.v1beta1.QueryParamsResponseKt.Dsl.() -> kotlin.Unit): cosmos.slashing.v1beta1.QueryOuterClass.QueryParamsResponse =
  cosmos.slashing.v1beta1.QueryParamsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

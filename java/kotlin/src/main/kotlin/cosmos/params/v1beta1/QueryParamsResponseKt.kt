//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/params/v1beta1/query.proto

package cosmos.params.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryParamsResponse(block: cosmos.params.v1beta1.QueryParamsResponseKt.Dsl.() -> kotlin.Unit): cosmos.params.v1beta1.QueryOuterClass.QueryParamsResponse =
  cosmos.params.v1beta1.QueryParamsResponseKt.Dsl._create(cosmos.params.v1beta1.QueryOuterClass.QueryParamsResponse.newBuilder()).apply { block() }._build()
public object QueryParamsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.params.v1beta1.QueryOuterClass.QueryParamsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.params.v1beta1.QueryOuterClass.QueryParamsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.params.v1beta1.QueryOuterClass.QueryParamsResponse = _builder.build()

    /**
     * <pre>
     * param defines the queried parameter.
     * </pre>
     *
     * <code>.cosmos.params.v1beta1.ParamChange param = 1 [(.gogoproto.nullable) = false];</code>
     */
    public var param: cosmos.params.v1beta1.Params.ParamChange
      @JvmName("getParam")
      get() = _builder.getParam()
      @JvmName("setParam")
      set(value) {
        _builder.setParam(value)
      }
    /**
     * <pre>
     * param defines the queried parameter.
     * </pre>
     *
     * <code>.cosmos.params.v1beta1.ParamChange param = 1 [(.gogoproto.nullable) = false];</code>
     */
    public fun clearParam() {
      _builder.clearParam()
    }
    /**
     * <pre>
     * param defines the queried parameter.
     * </pre>
     *
     * <code>.cosmos.params.v1beta1.ParamChange param = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the param field is set.
     */
    public fun hasParam(): kotlin.Boolean {
      return _builder.hasParam()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.params.v1beta1.QueryOuterClass.QueryParamsResponse.copy(block: cosmos.params.v1beta1.QueryParamsResponseKt.Dsl.() -> kotlin.Unit): cosmos.params.v1beta1.QueryOuterClass.QueryParamsResponse =
  cosmos.params.v1beta1.QueryParamsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

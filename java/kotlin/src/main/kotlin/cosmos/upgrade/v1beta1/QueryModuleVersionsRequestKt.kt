//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/upgrade/v1beta1/query.proto

package cosmos.upgrade.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryModuleVersionsRequest(block: cosmos.upgrade.v1beta1.QueryModuleVersionsRequestKt.Dsl.() -> kotlin.Unit): cosmos.upgrade.v1beta1.QueryOuterClass.QueryModuleVersionsRequest =
  cosmos.upgrade.v1beta1.QueryModuleVersionsRequestKt.Dsl._create(cosmos.upgrade.v1beta1.QueryOuterClass.QueryModuleVersionsRequest.newBuilder()).apply { block() }._build()
public object QueryModuleVersionsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.upgrade.v1beta1.QueryOuterClass.QueryModuleVersionsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.upgrade.v1beta1.QueryOuterClass.QueryModuleVersionsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.upgrade.v1beta1.QueryOuterClass.QueryModuleVersionsRequest = _builder.build()

    /**
     * <pre>
     * module_name is a field to query a specific module
     * consensus version from state. Leaving this empty will
     * fetch the full list of module versions from state
     * </pre>
     *
     * <code>string module_name = 1;</code>
     */
    public var moduleName: kotlin.String
      @JvmName("getModuleName")
      get() = _builder.getModuleName()
      @JvmName("setModuleName")
      set(value) {
        _builder.setModuleName(value)
      }
    /**
     * <pre>
     * module_name is a field to query a specific module
     * consensus version from state. Leaving this empty will
     * fetch the full list of module versions from state
     * </pre>
     *
     * <code>string module_name = 1;</code>
     */
    public fun clearModuleName() {
      _builder.clearModuleName()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.upgrade.v1beta1.QueryOuterClass.QueryModuleVersionsRequest.copy(block: cosmos.upgrade.v1beta1.QueryModuleVersionsRequestKt.Dsl.() -> kotlin.Unit): cosmos.upgrade.v1beta1.QueryOuterClass.QueryModuleVersionsRequest =
  cosmos.upgrade.v1beta1.QueryModuleVersionsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/reflection/v2alpha1/reflection.proto

package cosmos.base.reflection.v2alpha1;

@kotlin.jvm.JvmSynthetic
public inline fun queryMethodDescriptor(block: cosmos.base.reflection.v2alpha1.QueryMethodDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.base.reflection.v2alpha1.Reflection.QueryMethodDescriptor =
  cosmos.base.reflection.v2alpha1.QueryMethodDescriptorKt.Dsl._create(cosmos.base.reflection.v2alpha1.Reflection.QueryMethodDescriptor.newBuilder()).apply { block() }._build()
public object QueryMethodDescriptorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.reflection.v2alpha1.Reflection.QueryMethodDescriptor.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.reflection.v2alpha1.Reflection.QueryMethodDescriptor.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.reflection.v2alpha1.Reflection.QueryMethodDescriptor = _builder.build()

    /**
     * <pre>
     * name is the protobuf name (not fullname) of the method
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <pre>
     * name is the protobuf name (not fullname) of the method
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * <pre>
     * full_query_path is the path that can be used to query
     * this method via tendermint abci.Query
     * </pre>
     *
     * <code>string full_query_path = 2;</code>
     */
    public var fullQueryPath: kotlin.String
      @JvmName("getFullQueryPath")
      get() = _builder.getFullQueryPath()
      @JvmName("setFullQueryPath")
      set(value) {
        _builder.setFullQueryPath(value)
      }
    /**
     * <pre>
     * full_query_path is the path that can be used to query
     * this method via tendermint abci.Query
     * </pre>
     *
     * <code>string full_query_path = 2;</code>
     */
    public fun clearFullQueryPath() {
      _builder.clearFullQueryPath()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.reflection.v2alpha1.Reflection.QueryMethodDescriptor.copy(block: cosmos.base.reflection.v2alpha1.QueryMethodDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.base.reflection.v2alpha1.Reflection.QueryMethodDescriptor =
  cosmos.base.reflection.v2alpha1.QueryMethodDescriptorKt.Dsl._create(this.toBuilder()).apply { block() }._build()

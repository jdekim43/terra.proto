//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/reflection/v2alpha1/reflection.proto

package cosmos.base.reflection.v2alpha1;

@kotlin.jvm.JvmSynthetic
public inline fun interfaceImplementerDescriptor(block: cosmos.base.reflection.v2alpha1.InterfaceImplementerDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.base.reflection.v2alpha1.Reflection.InterfaceImplementerDescriptor =
  cosmos.base.reflection.v2alpha1.InterfaceImplementerDescriptorKt.Dsl._create(cosmos.base.reflection.v2alpha1.Reflection.InterfaceImplementerDescriptor.newBuilder()).apply { block() }._build()
public object InterfaceImplementerDescriptorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.reflection.v2alpha1.Reflection.InterfaceImplementerDescriptor.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.reflection.v2alpha1.Reflection.InterfaceImplementerDescriptor.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.reflection.v2alpha1.Reflection.InterfaceImplementerDescriptor = _builder.build()

    /**
     * <pre>
     * fullname is the protobuf queryable name of the interface implementer
     * </pre>
     *
     * <code>string fullname = 1;</code>
     */
    public var fullname: kotlin.String
      @JvmName("getFullname")
      get() = _builder.getFullname()
      @JvmName("setFullname")
      set(value) {
        _builder.setFullname(value)
      }
    /**
     * <pre>
     * fullname is the protobuf queryable name of the interface implementer
     * </pre>
     *
     * <code>string fullname = 1;</code>
     */
    public fun clearFullname() {
      _builder.clearFullname()
    }

    /**
     * <pre>
     * type_url defines the type URL used when marshalling the type as any
     * this is required so we can provide type safe google.protobuf.Any marshalling and
     * unmarshalling, making sure that we don't accept just 'any' type
     * in our interface fields
     * </pre>
     *
     * <code>string type_url = 2;</code>
     */
    public var typeUrl: kotlin.String
      @JvmName("getTypeUrl")
      get() = _builder.getTypeUrl()
      @JvmName("setTypeUrl")
      set(value) {
        _builder.setTypeUrl(value)
      }
    /**
     * <pre>
     * type_url defines the type URL used when marshalling the type as any
     * this is required so we can provide type safe google.protobuf.Any marshalling and
     * unmarshalling, making sure that we don't accept just 'any' type
     * in our interface fields
     * </pre>
     *
     * <code>string type_url = 2;</code>
     */
    public fun clearTypeUrl() {
      _builder.clearTypeUrl()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.reflection.v2alpha1.Reflection.InterfaceImplementerDescriptor.copy(block: cosmos.base.reflection.v2alpha1.InterfaceImplementerDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.base.reflection.v2alpha1.Reflection.InterfaceImplementerDescriptor =
  cosmos.base.reflection.v2alpha1.InterfaceImplementerDescriptorKt.Dsl._create(this.toBuilder()).apply { block() }._build()

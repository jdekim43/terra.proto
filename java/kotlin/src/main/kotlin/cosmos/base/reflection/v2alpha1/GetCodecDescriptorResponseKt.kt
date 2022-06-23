//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/reflection/v2alpha1/reflection.proto

package cosmos.base.reflection.v2alpha1;

@kotlin.jvm.JvmSynthetic
public inline fun getCodecDescriptorResponse(block: cosmos.base.reflection.v2alpha1.GetCodecDescriptorResponseKt.Dsl.() -> kotlin.Unit): cosmos.base.reflection.v2alpha1.Reflection.GetCodecDescriptorResponse =
  cosmos.base.reflection.v2alpha1.GetCodecDescriptorResponseKt.Dsl._create(cosmos.base.reflection.v2alpha1.Reflection.GetCodecDescriptorResponse.newBuilder()).apply { block() }._build()
public object GetCodecDescriptorResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.reflection.v2alpha1.Reflection.GetCodecDescriptorResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.reflection.v2alpha1.Reflection.GetCodecDescriptorResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.reflection.v2alpha1.Reflection.GetCodecDescriptorResponse = _builder.build()

    /**
     * <pre>
     * codec describes the application codec such as registered interfaces and implementations
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.CodecDescriptor codec = 1;</code>
     */
    public var codec: cosmos.base.reflection.v2alpha1.Reflection.CodecDescriptor
      @JvmName("getCodec")
      get() = _builder.getCodec()
      @JvmName("setCodec")
      set(value) {
        _builder.setCodec(value)
      }
    /**
     * <pre>
     * codec describes the application codec such as registered interfaces and implementations
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.CodecDescriptor codec = 1;</code>
     */
    public fun clearCodec() {
      _builder.clearCodec()
    }
    /**
     * <pre>
     * codec describes the application codec such as registered interfaces and implementations
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.CodecDescriptor codec = 1;</code>
     * @return Whether the codec field is set.
     */
    public fun hasCodec(): kotlin.Boolean {
      return _builder.hasCodec()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.reflection.v2alpha1.Reflection.GetCodecDescriptorResponse.copy(block: cosmos.base.reflection.v2alpha1.GetCodecDescriptorResponseKt.Dsl.() -> kotlin.Unit): cosmos.base.reflection.v2alpha1.Reflection.GetCodecDescriptorResponse =
  cosmos.base.reflection.v2alpha1.GetCodecDescriptorResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

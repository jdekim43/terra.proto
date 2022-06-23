//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/reflection/v2alpha1/reflection.proto

package cosmos.base.reflection.v2alpha1;

@kotlin.jvm.JvmSynthetic
public inline fun authnDescriptor(block: cosmos.base.reflection.v2alpha1.AuthnDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.base.reflection.v2alpha1.Reflection.AuthnDescriptor =
  cosmos.base.reflection.v2alpha1.AuthnDescriptorKt.Dsl._create(cosmos.base.reflection.v2alpha1.Reflection.AuthnDescriptor.newBuilder()).apply { block() }._build()
public object AuthnDescriptorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.reflection.v2alpha1.Reflection.AuthnDescriptor.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.reflection.v2alpha1.Reflection.AuthnDescriptor.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.reflection.v2alpha1.Reflection.AuthnDescriptor = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class SignModesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1;</code>
     */
     public val signModes: com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.SigningModeDescriptor, SignModesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getSignModesList()
      )
    /**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1;</code>
     * @param value The signModes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addSignModes")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.SigningModeDescriptor, SignModesProxy>.add(value: cosmos.base.reflection.v2alpha1.Reflection.SigningModeDescriptor) {
      _builder.addSignModes(value)
    }/**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1;</code>
     * @param value The signModes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignSignModes")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.SigningModeDescriptor, SignModesProxy>.plusAssign(value: cosmos.base.reflection.v2alpha1.Reflection.SigningModeDescriptor) {
      add(value)
    }/**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1;</code>
     * @param values The signModes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllSignModes")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.SigningModeDescriptor, SignModesProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.reflection.v2alpha1.Reflection.SigningModeDescriptor>) {
      _builder.addAllSignModes(values)
    }/**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1;</code>
     * @param values The signModes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllSignModes")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.SigningModeDescriptor, SignModesProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.reflection.v2alpha1.Reflection.SigningModeDescriptor>) {
      addAll(values)
    }/**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1;</code>
     * @param index The index to set the value at.
     * @param value The signModes to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setSignModes")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.SigningModeDescriptor, SignModesProxy>.set(index: kotlin.Int, value: cosmos.base.reflection.v2alpha1.Reflection.SigningModeDescriptor) {
      _builder.setSignModes(index, value)
    }/**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearSignModes")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.SigningModeDescriptor, SignModesProxy>.clear() {
      _builder.clearSignModes()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.reflection.v2alpha1.Reflection.AuthnDescriptor.copy(block: cosmos.base.reflection.v2alpha1.AuthnDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.base.reflection.v2alpha1.Reflection.AuthnDescriptor =
  cosmos.base.reflection.v2alpha1.AuthnDescriptorKt.Dsl._create(this.toBuilder()).apply { block() }._build()

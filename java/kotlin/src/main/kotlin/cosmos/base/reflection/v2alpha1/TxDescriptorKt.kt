//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/reflection/v2alpha1/reflection.proto

package cosmos.base.reflection.v2alpha1;

@kotlin.jvm.JvmSynthetic
public inline fun txDescriptor(block: cosmos.base.reflection.v2alpha1.TxDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.base.reflection.v2alpha1.Reflection.TxDescriptor =
  cosmos.base.reflection.v2alpha1.TxDescriptorKt.Dsl._create(cosmos.base.reflection.v2alpha1.Reflection.TxDescriptor.newBuilder()).apply { block() }._build()
public object TxDescriptorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.reflection.v2alpha1.Reflection.TxDescriptor.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.reflection.v2alpha1.Reflection.TxDescriptor.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.reflection.v2alpha1.Reflection.TxDescriptor = _builder.build()

    /**
     * <pre>
     * fullname is the protobuf fullname of the raw transaction type (for instance the tx.Tx type)
     * it is not meant to support polymorphism of transaction types, it is supposed to be used by
     * reflection clients to understand if they can handle a specific transaction type in an application.
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
     * fullname is the protobuf fullname of the raw transaction type (for instance the tx.Tx type)
     * it is not meant to support polymorphism of transaction types, it is supposed to be used by
     * reflection clients to understand if they can handle a specific transaction type in an application.
     * </pre>
     *
     * <code>string fullname = 1;</code>
     */
    public fun clearFullname() {
      _builder.clearFullname()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class MsgsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * msgs lists the accepted application messages (sdk.Msg)
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.MsgDescriptor msgs = 2;</code>
     */
     public val msgs: com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.MsgDescriptor, MsgsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getMsgsList()
      )
    /**
     * <pre>
     * msgs lists the accepted application messages (sdk.Msg)
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.MsgDescriptor msgs = 2;</code>
     * @param value The msgs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addMsgs")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.MsgDescriptor, MsgsProxy>.add(value: cosmos.base.reflection.v2alpha1.Reflection.MsgDescriptor) {
      _builder.addMsgs(value)
    }/**
     * <pre>
     * msgs lists the accepted application messages (sdk.Msg)
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.MsgDescriptor msgs = 2;</code>
     * @param value The msgs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignMsgs")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.MsgDescriptor, MsgsProxy>.plusAssign(value: cosmos.base.reflection.v2alpha1.Reflection.MsgDescriptor) {
      add(value)
    }/**
     * <pre>
     * msgs lists the accepted application messages (sdk.Msg)
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.MsgDescriptor msgs = 2;</code>
     * @param values The msgs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllMsgs")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.MsgDescriptor, MsgsProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.reflection.v2alpha1.Reflection.MsgDescriptor>) {
      _builder.addAllMsgs(values)
    }/**
     * <pre>
     * msgs lists the accepted application messages (sdk.Msg)
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.MsgDescriptor msgs = 2;</code>
     * @param values The msgs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllMsgs")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.MsgDescriptor, MsgsProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.reflection.v2alpha1.Reflection.MsgDescriptor>) {
      addAll(values)
    }/**
     * <pre>
     * msgs lists the accepted application messages (sdk.Msg)
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.MsgDescriptor msgs = 2;</code>
     * @param index The index to set the value at.
     * @param value The msgs to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setMsgs")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.MsgDescriptor, MsgsProxy>.set(index: kotlin.Int, value: cosmos.base.reflection.v2alpha1.Reflection.MsgDescriptor) {
      _builder.setMsgs(index, value)
    }/**
     * <pre>
     * msgs lists the accepted application messages (sdk.Msg)
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.MsgDescriptor msgs = 2;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearMsgs")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.MsgDescriptor, MsgsProxy>.clear() {
      _builder.clearMsgs()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.reflection.v2alpha1.Reflection.TxDescriptor.copy(block: cosmos.base.reflection.v2alpha1.TxDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.base.reflection.v2alpha1.Reflection.TxDescriptor =
  cosmos.base.reflection.v2alpha1.TxDescriptorKt.Dsl._create(this.toBuilder()).apply { block() }._build()

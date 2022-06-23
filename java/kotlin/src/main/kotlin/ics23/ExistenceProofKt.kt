//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: confio/proofs.proto

package ics23;

@kotlin.jvm.JvmSynthetic
public inline fun existenceProof(block: ics23.ExistenceProofKt.Dsl.() -> kotlin.Unit): ics23.Proofs.ExistenceProof =
  ics23.ExistenceProofKt.Dsl._create(ics23.Proofs.ExistenceProof.newBuilder()).apply { block() }._build()
public object ExistenceProofKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ics23.Proofs.ExistenceProof.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ics23.Proofs.ExistenceProof.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ics23.Proofs.ExistenceProof = _builder.build()

    /**
     * <code>bytes key = 1;</code>
     */
    public var key: com.google.protobuf.ByteString
      @JvmName("getKey")
      get() = _builder.getKey()
      @JvmName("setKey")
      set(value) {
        _builder.setKey(value)
      }
    /**
     * <code>bytes key = 1;</code>
     */
    public fun clearKey() {
      _builder.clearKey()
    }

    /**
     * <code>bytes value = 2;</code>
     */
    public var value: com.google.protobuf.ByteString
      @JvmName("getValue")
      get() = _builder.getValue()
      @JvmName("setValue")
      set(value) {
        _builder.setValue(value)
      }
    /**
     * <code>bytes value = 2;</code>
     */
    public fun clearValue() {
      _builder.clearValue()
    }

    /**
     * <code>.ics23.LeafOp leaf = 3;</code>
     */
    public var leaf: ics23.Proofs.LeafOp
      @JvmName("getLeaf")
      get() = _builder.getLeaf()
      @JvmName("setLeaf")
      set(value) {
        _builder.setLeaf(value)
      }
    /**
     * <code>.ics23.LeafOp leaf = 3;</code>
     */
    public fun clearLeaf() {
      _builder.clearLeaf()
    }
    /**
     * <code>.ics23.LeafOp leaf = 3;</code>
     * @return Whether the leaf field is set.
     */
    public fun hasLeaf(): kotlin.Boolean {
      return _builder.hasLeaf()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class PathProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .ics23.InnerOp path = 4;</code>
     */
     public val path: com.google.protobuf.kotlin.DslList<ics23.Proofs.InnerOp, PathProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getPathList()
      )
    /**
     * <code>repeated .ics23.InnerOp path = 4;</code>
     * @param value The path to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addPath")
    public fun com.google.protobuf.kotlin.DslList<ics23.Proofs.InnerOp, PathProxy>.add(value: ics23.Proofs.InnerOp) {
      _builder.addPath(value)
    }/**
     * <code>repeated .ics23.InnerOp path = 4;</code>
     * @param value The path to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignPath")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ics23.Proofs.InnerOp, PathProxy>.plusAssign(value: ics23.Proofs.InnerOp) {
      add(value)
    }/**
     * <code>repeated .ics23.InnerOp path = 4;</code>
     * @param values The path to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllPath")
    public fun com.google.protobuf.kotlin.DslList<ics23.Proofs.InnerOp, PathProxy>.addAll(values: kotlin.collections.Iterable<ics23.Proofs.InnerOp>) {
      _builder.addAllPath(values)
    }/**
     * <code>repeated .ics23.InnerOp path = 4;</code>
     * @param values The path to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllPath")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ics23.Proofs.InnerOp, PathProxy>.plusAssign(values: kotlin.collections.Iterable<ics23.Proofs.InnerOp>) {
      addAll(values)
    }/**
     * <code>repeated .ics23.InnerOp path = 4;</code>
     * @param index The index to set the value at.
     * @param value The path to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setPath")
    public operator fun com.google.protobuf.kotlin.DslList<ics23.Proofs.InnerOp, PathProxy>.set(index: kotlin.Int, value: ics23.Proofs.InnerOp) {
      _builder.setPath(index, value)
    }/**
     * <code>repeated .ics23.InnerOp path = 4;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearPath")
    public fun com.google.protobuf.kotlin.DslList<ics23.Proofs.InnerOp, PathProxy>.clear() {
      _builder.clearPath()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun ics23.Proofs.ExistenceProof.copy(block: ics23.ExistenceProofKt.Dsl.() -> kotlin.Unit): ics23.Proofs.ExistenceProof =
  ics23.ExistenceProofKt.Dsl._create(this.toBuilder()).apply { block() }._build()

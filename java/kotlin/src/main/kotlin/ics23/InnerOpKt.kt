//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: confio/proofs.proto

package ics23;

@kotlin.jvm.JvmSynthetic
public inline fun innerOp(block: ics23.InnerOpKt.Dsl.() -> kotlin.Unit): ics23.Proofs.InnerOp =
  ics23.InnerOpKt.Dsl._create(ics23.Proofs.InnerOp.newBuilder()).apply { block() }._build()
public object InnerOpKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ics23.Proofs.InnerOp.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ics23.Proofs.InnerOp.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ics23.Proofs.InnerOp = _builder.build()

    /**
     * <code>.ics23.HashOp hash = 1;</code>
     */
    public var hash: ics23.Proofs.HashOp
      @JvmName("getHash")
      get() = _builder.getHash()
      @JvmName("setHash")
      set(value) {
        _builder.setHash(value)
      }
    /**
     * <code>.ics23.HashOp hash = 1;</code>
     */
    public fun clearHash() {
      _builder.clearHash()
    }

    /**
     * <code>bytes prefix = 2;</code>
     */
    public var prefix: com.google.protobuf.ByteString
      @JvmName("getPrefix")
      get() = _builder.getPrefix()
      @JvmName("setPrefix")
      set(value) {
        _builder.setPrefix(value)
      }
    /**
     * <code>bytes prefix = 2;</code>
     */
    public fun clearPrefix() {
      _builder.clearPrefix()
    }

    /**
     * <code>bytes suffix = 3;</code>
     */
    public var suffix: com.google.protobuf.ByteString
      @JvmName("getSuffix")
      get() = _builder.getSuffix()
      @JvmName("setSuffix")
      set(value) {
        _builder.setSuffix(value)
      }
    /**
     * <code>bytes suffix = 3;</code>
     */
    public fun clearSuffix() {
      _builder.clearSuffix()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ics23.Proofs.InnerOp.copy(block: ics23.InnerOpKt.Dsl.() -> kotlin.Unit): ics23.Proofs.InnerOp =
  ics23.InnerOpKt.Dsl._create(this.toBuilder()).apply { block() }._build()

//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/types/types.proto

package tendermint.types;

@kotlin.jvm.JvmSynthetic
public inline fun part(block: tendermint.types.PartKt.Dsl.() -> kotlin.Unit): tendermint.types.Types.Part =
  tendermint.types.PartKt.Dsl._create(tendermint.types.Types.Part.newBuilder()).apply { block() }._build()
public object PartKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.types.Types.Part.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.types.Types.Part.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.types.Types.Part = _builder.build()

    /**
     * <code>uint32 index = 1;</code>
     */
    public var index: kotlin.Int
      @JvmName("getIndex")
      get() = _builder.getIndex()
      @JvmName("setIndex")
      set(value) {
        _builder.setIndex(value)
      }
    /**
     * <code>uint32 index = 1;</code>
     */
    public fun clearIndex() {
      _builder.clearIndex()
    }

    /**
     * <code>bytes bytes = 2;</code>
     */
    public var bytes: com.google.protobuf.ByteString
      @JvmName("getBytes")
      get() = _builder.getBytes()
      @JvmName("setBytes")
      set(value) {
        _builder.setBytes(value)
      }
    /**
     * <code>bytes bytes = 2;</code>
     */
    public fun clearBytes() {
      _builder.clearBytes()
    }

    /**
     * <code>.tendermint.crypto.Proof proof = 3 [(.gogoproto.nullable) = false];</code>
     */
    public var proof: tendermint.crypto.ProofOuterClass.Proof
      @JvmName("getProof")
      get() = _builder.getProof()
      @JvmName("setProof")
      set(value) {
        _builder.setProof(value)
      }
    /**
     * <code>.tendermint.crypto.Proof proof = 3 [(.gogoproto.nullable) = false];</code>
     */
    public fun clearProof() {
      _builder.clearProof()
    }
    /**
     * <code>.tendermint.crypto.Proof proof = 3 [(.gogoproto.nullable) = false];</code>
     * @return Whether the proof field is set.
     */
    public fun hasProof(): kotlin.Boolean {
      return _builder.hasProof()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.types.Types.Part.copy(block: tendermint.types.PartKt.Dsl.() -> kotlin.Unit): tendermint.types.Types.Part =
  tendermint.types.PartKt.Dsl._create(this.toBuilder()).apply { block() }._build()

//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

@kotlin.jvm.JvmSynthetic
public inline fun requestApplySnapshotChunk(block: tendermint.abci.RequestApplySnapshotChunkKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.RequestApplySnapshotChunk =
  tendermint.abci.RequestApplySnapshotChunkKt.Dsl._create(tendermint.abci.Types.RequestApplySnapshotChunk.newBuilder()).apply { block() }._build()
public object RequestApplySnapshotChunkKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.abci.Types.RequestApplySnapshotChunk.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.abci.Types.RequestApplySnapshotChunk.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.abci.Types.RequestApplySnapshotChunk = _builder.build()

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
     * <code>bytes chunk = 2;</code>
     */
    public var chunk: com.google.protobuf.ByteString
      @JvmName("getChunk")
      get() = _builder.getChunk()
      @JvmName("setChunk")
      set(value) {
        _builder.setChunk(value)
      }
    /**
     * <code>bytes chunk = 2;</code>
     */
    public fun clearChunk() {
      _builder.clearChunk()
    }

    /**
     * <code>string sender = 3;</code>
     */
    public var sender: kotlin.String
      @JvmName("getSender")
      get() = _builder.getSender()
      @JvmName("setSender")
      set(value) {
        _builder.setSender(value)
      }
    /**
     * <code>string sender = 3;</code>
     */
    public fun clearSender() {
      _builder.clearSender()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.abci.Types.RequestApplySnapshotChunk.copy(block: tendermint.abci.RequestApplySnapshotChunkKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.RequestApplySnapshotChunk =
  tendermint.abci.RequestApplySnapshotChunkKt.Dsl._create(this.toBuilder()).apply { block() }._build()

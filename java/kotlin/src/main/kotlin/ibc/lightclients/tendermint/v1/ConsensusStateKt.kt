//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/lightclients/tendermint/v1/tendermint.proto

package ibc.lightclients.tendermint.v1;

@kotlin.jvm.JvmSynthetic
public inline fun consensusState(block: ibc.lightclients.tendermint.v1.ConsensusStateKt.Dsl.() -> kotlin.Unit): ibc.lightclients.tendermint.v1.Tendermint.ConsensusState =
  ibc.lightclients.tendermint.v1.ConsensusStateKt.Dsl._create(ibc.lightclients.tendermint.v1.Tendermint.ConsensusState.newBuilder()).apply { block() }._build()
public object ConsensusStateKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.lightclients.tendermint.v1.Tendermint.ConsensusState.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.lightclients.tendermint.v1.Tendermint.ConsensusState.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.lightclients.tendermint.v1.Tendermint.ConsensusState = _builder.build()

    /**
     * <pre>
     * timestamp that corresponds to the block height in which the ConsensusState
     * was stored.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 1 [(.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public var timestamp: com.google.protobuf.Timestamp
      @JvmName("getTimestamp")
      get() = _builder.getTimestamp()
      @JvmName("setTimestamp")
      set(value) {
        _builder.setTimestamp(value)
      }
    /**
     * <pre>
     * timestamp that corresponds to the block height in which the ConsensusState
     * was stored.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 1 [(.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public fun clearTimestamp() {
      _builder.clearTimestamp()
    }
    /**
     * <pre>
     * timestamp that corresponds to the block height in which the ConsensusState
     * was stored.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 1 [(.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the timestamp field is set.
     */
    public fun hasTimestamp(): kotlin.Boolean {
      return _builder.hasTimestamp()
    }

    /**
     * <pre>
     * commitment root (i.e app hash)
     * </pre>
     *
     * <code>.ibc.core.commitment.v1.MerkleRoot root = 2 [(.gogoproto.nullable) = false];</code>
     */
    public var root: ibc.core.commitment.v1.Commitment.MerkleRoot
      @JvmName("getRoot")
      get() = _builder.getRoot()
      @JvmName("setRoot")
      set(value) {
        _builder.setRoot(value)
      }
    /**
     * <pre>
     * commitment root (i.e app hash)
     * </pre>
     *
     * <code>.ibc.core.commitment.v1.MerkleRoot root = 2 [(.gogoproto.nullable) = false];</code>
     */
    public fun clearRoot() {
      _builder.clearRoot()
    }
    /**
     * <pre>
     * commitment root (i.e app hash)
     * </pre>
     *
     * <code>.ibc.core.commitment.v1.MerkleRoot root = 2 [(.gogoproto.nullable) = false];</code>
     * @return Whether the root field is set.
     */
    public fun hasRoot(): kotlin.Boolean {
      return _builder.hasRoot()
    }

    /**
     * <code>bytes next_validators_hash = 3 [(.gogoproto.moretags) = "yaml:&#92;"next_validators_hash&#92;"", (.gogoproto.casttype) = "github.com/tendermint/tendermint/libs/bytes.HexBytes"];</code>
     */
    public var nextValidatorsHash: com.google.protobuf.ByteString
      @JvmName("getNextValidatorsHash")
      get() = _builder.getNextValidatorsHash()
      @JvmName("setNextValidatorsHash")
      set(value) {
        _builder.setNextValidatorsHash(value)
      }
    /**
     * <code>bytes next_validators_hash = 3 [(.gogoproto.moretags) = "yaml:&#92;"next_validators_hash&#92;"", (.gogoproto.casttype) = "github.com/tendermint/tendermint/libs/bytes.HexBytes"];</code>
     */
    public fun clearNextValidatorsHash() {
      _builder.clearNextValidatorsHash()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.lightclients.tendermint.v1.Tendermint.ConsensusState.copy(block: ibc.lightclients.tendermint.v1.ConsensusStateKt.Dsl.() -> kotlin.Unit): ibc.lightclients.tendermint.v1.Tendermint.ConsensusState =
  ibc.lightclients.tendermint.v1.ConsensusStateKt.Dsl._create(this.toBuilder()).apply { block() }._build()

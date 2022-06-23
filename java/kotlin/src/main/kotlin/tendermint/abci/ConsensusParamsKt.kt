//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

@kotlin.jvm.JvmSynthetic
public inline fun consensusParams(block: tendermint.abci.ConsensusParamsKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.ConsensusParams =
  tendermint.abci.ConsensusParamsKt.Dsl._create(tendermint.abci.Types.ConsensusParams.newBuilder()).apply { block() }._build()
public object ConsensusParamsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.abci.Types.ConsensusParams.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.abci.Types.ConsensusParams.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.abci.Types.ConsensusParams = _builder.build()

    /**
     * <code>.tendermint.abci.BlockParams block = 1;</code>
     */
    public var block: tendermint.abci.Types.BlockParams
      @JvmName("getBlock")
      get() = _builder.getBlock()
      @JvmName("setBlock")
      set(value) {
        _builder.setBlock(value)
      }
    /**
     * <code>.tendermint.abci.BlockParams block = 1;</code>
     */
    public fun clearBlock() {
      _builder.clearBlock()
    }
    /**
     * <code>.tendermint.abci.BlockParams block = 1;</code>
     * @return Whether the block field is set.
     */
    public fun hasBlock(): kotlin.Boolean {
      return _builder.hasBlock()
    }

    /**
     * <code>.tendermint.types.EvidenceParams evidence = 2;</code>
     */
    public var evidence: tendermint.types.Params.EvidenceParams
      @JvmName("getEvidence")
      get() = _builder.getEvidence()
      @JvmName("setEvidence")
      set(value) {
        _builder.setEvidence(value)
      }
    /**
     * <code>.tendermint.types.EvidenceParams evidence = 2;</code>
     */
    public fun clearEvidence() {
      _builder.clearEvidence()
    }
    /**
     * <code>.tendermint.types.EvidenceParams evidence = 2;</code>
     * @return Whether the evidence field is set.
     */
    public fun hasEvidence(): kotlin.Boolean {
      return _builder.hasEvidence()
    }

    /**
     * <code>.tendermint.types.ValidatorParams validator = 3;</code>
     */
    public var validator: tendermint.types.Params.ValidatorParams
      @JvmName("getValidator")
      get() = _builder.getValidator()
      @JvmName("setValidator")
      set(value) {
        _builder.setValidator(value)
      }
    /**
     * <code>.tendermint.types.ValidatorParams validator = 3;</code>
     */
    public fun clearValidator() {
      _builder.clearValidator()
    }
    /**
     * <code>.tendermint.types.ValidatorParams validator = 3;</code>
     * @return Whether the validator field is set.
     */
    public fun hasValidator(): kotlin.Boolean {
      return _builder.hasValidator()
    }

    /**
     * <code>.tendermint.types.VersionParams version = 4;</code>
     */
    public var version: tendermint.types.Params.VersionParams
      @JvmName("getVersion")
      get() = _builder.getVersion()
      @JvmName("setVersion")
      set(value) {
        _builder.setVersion(value)
      }
    /**
     * <code>.tendermint.types.VersionParams version = 4;</code>
     */
    public fun clearVersion() {
      _builder.clearVersion()
    }
    /**
     * <code>.tendermint.types.VersionParams version = 4;</code>
     * @return Whether the version field is set.
     */
    public fun hasVersion(): kotlin.Boolean {
      return _builder.hasVersion()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.abci.Types.ConsensusParams.copy(block: tendermint.abci.ConsensusParamsKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.ConsensusParams =
  tendermint.abci.ConsensusParamsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

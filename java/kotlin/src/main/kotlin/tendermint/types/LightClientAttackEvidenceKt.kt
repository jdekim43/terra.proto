//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/types/evidence.proto

package tendermint.types;

@kotlin.jvm.JvmSynthetic
public inline fun lightClientAttackEvidence(block: tendermint.types.LightClientAttackEvidenceKt.Dsl.() -> kotlin.Unit): tendermint.types.EvidenceOuterClass.LightClientAttackEvidence =
  tendermint.types.LightClientAttackEvidenceKt.Dsl._create(tendermint.types.EvidenceOuterClass.LightClientAttackEvidence.newBuilder()).apply { block() }._build()
public object LightClientAttackEvidenceKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.types.EvidenceOuterClass.LightClientAttackEvidence.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.types.EvidenceOuterClass.LightClientAttackEvidence.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.types.EvidenceOuterClass.LightClientAttackEvidence = _builder.build()

    /**
     * <code>.tendermint.types.LightBlock conflicting_block = 1;</code>
     */
    public var conflictingBlock: tendermint.types.Types.LightBlock
      @JvmName("getConflictingBlock")
      get() = _builder.getConflictingBlock()
      @JvmName("setConflictingBlock")
      set(value) {
        _builder.setConflictingBlock(value)
      }
    /**
     * <code>.tendermint.types.LightBlock conflicting_block = 1;</code>
     */
    public fun clearConflictingBlock() {
      _builder.clearConflictingBlock()
    }
    /**
     * <code>.tendermint.types.LightBlock conflicting_block = 1;</code>
     * @return Whether the conflictingBlock field is set.
     */
    public fun hasConflictingBlock(): kotlin.Boolean {
      return _builder.hasConflictingBlock()
    }

    /**
     * <code>int64 common_height = 2;</code>
     */
    public var commonHeight: kotlin.Long
      @JvmName("getCommonHeight")
      get() = _builder.getCommonHeight()
      @JvmName("setCommonHeight")
      set(value) {
        _builder.setCommonHeight(value)
      }
    /**
     * <code>int64 common_height = 2;</code>
     */
    public fun clearCommonHeight() {
      _builder.clearCommonHeight()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ByzantineValidatorsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .tendermint.types.Validator byzantine_validators = 3;</code>
     */
     public val byzantineValidators: com.google.protobuf.kotlin.DslList<tendermint.types.ValidatorOuterClass.Validator, ByzantineValidatorsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getByzantineValidatorsList()
      )
    /**
     * <code>repeated .tendermint.types.Validator byzantine_validators = 3;</code>
     * @param value The byzantineValidators to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addByzantineValidators")
    public fun com.google.protobuf.kotlin.DslList<tendermint.types.ValidatorOuterClass.Validator, ByzantineValidatorsProxy>.add(value: tendermint.types.ValidatorOuterClass.Validator) {
      _builder.addByzantineValidators(value)
    }/**
     * <code>repeated .tendermint.types.Validator byzantine_validators = 3;</code>
     * @param value The byzantineValidators to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignByzantineValidators")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<tendermint.types.ValidatorOuterClass.Validator, ByzantineValidatorsProxy>.plusAssign(value: tendermint.types.ValidatorOuterClass.Validator) {
      add(value)
    }/**
     * <code>repeated .tendermint.types.Validator byzantine_validators = 3;</code>
     * @param values The byzantineValidators to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllByzantineValidators")
    public fun com.google.protobuf.kotlin.DslList<tendermint.types.ValidatorOuterClass.Validator, ByzantineValidatorsProxy>.addAll(values: kotlin.collections.Iterable<tendermint.types.ValidatorOuterClass.Validator>) {
      _builder.addAllByzantineValidators(values)
    }/**
     * <code>repeated .tendermint.types.Validator byzantine_validators = 3;</code>
     * @param values The byzantineValidators to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllByzantineValidators")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<tendermint.types.ValidatorOuterClass.Validator, ByzantineValidatorsProxy>.plusAssign(values: kotlin.collections.Iterable<tendermint.types.ValidatorOuterClass.Validator>) {
      addAll(values)
    }/**
     * <code>repeated .tendermint.types.Validator byzantine_validators = 3;</code>
     * @param index The index to set the value at.
     * @param value The byzantineValidators to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setByzantineValidators")
    public operator fun com.google.protobuf.kotlin.DslList<tendermint.types.ValidatorOuterClass.Validator, ByzantineValidatorsProxy>.set(index: kotlin.Int, value: tendermint.types.ValidatorOuterClass.Validator) {
      _builder.setByzantineValidators(index, value)
    }/**
     * <code>repeated .tendermint.types.Validator byzantine_validators = 3;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearByzantineValidators")
    public fun com.google.protobuf.kotlin.DslList<tendermint.types.ValidatorOuterClass.Validator, ByzantineValidatorsProxy>.clear() {
      _builder.clearByzantineValidators()
    }
    /**
     * <code>int64 total_voting_power = 4;</code>
     */
    public var totalVotingPower: kotlin.Long
      @JvmName("getTotalVotingPower")
      get() = _builder.getTotalVotingPower()
      @JvmName("setTotalVotingPower")
      set(value) {
        _builder.setTotalVotingPower(value)
      }
    /**
     * <code>int64 total_voting_power = 4;</code>
     */
    public fun clearTotalVotingPower() {
      _builder.clearTotalVotingPower()
    }

    /**
     * <code>.google.protobuf.Timestamp timestamp = 5 [(.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public var timestamp: com.google.protobuf.Timestamp
      @JvmName("getTimestamp")
      get() = _builder.getTimestamp()
      @JvmName("setTimestamp")
      set(value) {
        _builder.setTimestamp(value)
      }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 5 [(.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public fun clearTimestamp() {
      _builder.clearTimestamp()
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 5 [(.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the timestamp field is set.
     */
    public fun hasTimestamp(): kotlin.Boolean {
      return _builder.hasTimestamp()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.types.EvidenceOuterClass.LightClientAttackEvidence.copy(block: tendermint.types.LightClientAttackEvidenceKt.Dsl.() -> kotlin.Unit): tendermint.types.EvidenceOuterClass.LightClientAttackEvidence =
  tendermint.types.LightClientAttackEvidenceKt.Dsl._create(this.toBuilder()).apply { block() }._build()

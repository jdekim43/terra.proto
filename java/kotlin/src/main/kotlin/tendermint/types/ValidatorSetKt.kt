//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/types/validator.proto

package tendermint.types;

@kotlin.jvm.JvmSynthetic
public inline fun validatorSet(block: tendermint.types.ValidatorSetKt.Dsl.() -> kotlin.Unit): tendermint.types.ValidatorOuterClass.ValidatorSet =
  tendermint.types.ValidatorSetKt.Dsl._create(tendermint.types.ValidatorOuterClass.ValidatorSet.newBuilder()).apply { block() }._build()
public object ValidatorSetKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.types.ValidatorOuterClass.ValidatorSet.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.types.ValidatorOuterClass.ValidatorSet.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.types.ValidatorOuterClass.ValidatorSet = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ValidatorsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     */
     public val validators: com.google.protobuf.kotlin.DslList<tendermint.types.ValidatorOuterClass.Validator, ValidatorsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getValidatorsList()
      )
    /**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     * @param value The validators to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addValidators")
    public fun com.google.protobuf.kotlin.DslList<tendermint.types.ValidatorOuterClass.Validator, ValidatorsProxy>.add(value: tendermint.types.ValidatorOuterClass.Validator) {
      _builder.addValidators(value)
    }/**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     * @param value The validators to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignValidators")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<tendermint.types.ValidatorOuterClass.Validator, ValidatorsProxy>.plusAssign(value: tendermint.types.ValidatorOuterClass.Validator) {
      add(value)
    }/**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     * @param values The validators to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllValidators")
    public fun com.google.protobuf.kotlin.DslList<tendermint.types.ValidatorOuterClass.Validator, ValidatorsProxy>.addAll(values: kotlin.collections.Iterable<tendermint.types.ValidatorOuterClass.Validator>) {
      _builder.addAllValidators(values)
    }/**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     * @param values The validators to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllValidators")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<tendermint.types.ValidatorOuterClass.Validator, ValidatorsProxy>.plusAssign(values: kotlin.collections.Iterable<tendermint.types.ValidatorOuterClass.Validator>) {
      addAll(values)
    }/**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     * @param index The index to set the value at.
     * @param value The validators to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setValidators")
    public operator fun com.google.protobuf.kotlin.DslList<tendermint.types.ValidatorOuterClass.Validator, ValidatorsProxy>.set(index: kotlin.Int, value: tendermint.types.ValidatorOuterClass.Validator) {
      _builder.setValidators(index, value)
    }/**
     * <code>repeated .tendermint.types.Validator validators = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearValidators")
    public fun com.google.protobuf.kotlin.DslList<tendermint.types.ValidatorOuterClass.Validator, ValidatorsProxy>.clear() {
      _builder.clearValidators()
    }
    /**
     * <code>.tendermint.types.Validator proposer = 2;</code>
     */
    public var proposer: tendermint.types.ValidatorOuterClass.Validator
      @JvmName("getProposer")
      get() = _builder.getProposer()
      @JvmName("setProposer")
      set(value) {
        _builder.setProposer(value)
      }
    /**
     * <code>.tendermint.types.Validator proposer = 2;</code>
     */
    public fun clearProposer() {
      _builder.clearProposer()
    }
    /**
     * <code>.tendermint.types.Validator proposer = 2;</code>
     * @return Whether the proposer field is set.
     */
    public fun hasProposer(): kotlin.Boolean {
      return _builder.hasProposer()
    }

    /**
     * <code>int64 total_voting_power = 3;</code>
     */
    public var totalVotingPower: kotlin.Long
      @JvmName("getTotalVotingPower")
      get() = _builder.getTotalVotingPower()
      @JvmName("setTotalVotingPower")
      set(value) {
        _builder.setTotalVotingPower(value)
      }
    /**
     * <code>int64 total_voting_power = 3;</code>
     */
    public fun clearTotalVotingPower() {
      _builder.clearTotalVotingPower()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.types.ValidatorOuterClass.ValidatorSet.copy(block: tendermint.types.ValidatorSetKt.Dsl.() -> kotlin.Unit): tendermint.types.ValidatorOuterClass.ValidatorSet =
  tendermint.types.ValidatorSetKt.Dsl._create(this.toBuilder()).apply { block() }._build()

//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/tendermint/v1beta1/query.proto

package cosmos.base.tendermint.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun validator(block: cosmos.base.tendermint.v1beta1.ValidatorKt.Dsl.() -> kotlin.Unit): cosmos.base.tendermint.v1beta1.Query.Validator =
  cosmos.base.tendermint.v1beta1.ValidatorKt.Dsl._create(cosmos.base.tendermint.v1beta1.Query.Validator.newBuilder()).apply { block() }._build()
public object ValidatorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.tendermint.v1beta1.Query.Validator.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.tendermint.v1beta1.Query.Validator.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.tendermint.v1beta1.Query.Validator = _builder.build()

    /**
     * <code>string address = 1;</code>
     */
    public var address: kotlin.String
      @JvmName("getAddress")
      get() = _builder.getAddress()
      @JvmName("setAddress")
      set(value) {
        _builder.setAddress(value)
      }
    /**
     * <code>string address = 1;</code>
     */
    public fun clearAddress() {
      _builder.clearAddress()
    }

    /**
     * <code>.google.protobuf.Any pub_key = 2;</code>
     */
    public var pubKey: com.google.protobuf.Any
      @JvmName("getPubKey")
      get() = _builder.getPubKey()
      @JvmName("setPubKey")
      set(value) {
        _builder.setPubKey(value)
      }
    /**
     * <code>.google.protobuf.Any pub_key = 2;</code>
     */
    public fun clearPubKey() {
      _builder.clearPubKey()
    }
    /**
     * <code>.google.protobuf.Any pub_key = 2;</code>
     * @return Whether the pubKey field is set.
     */
    public fun hasPubKey(): kotlin.Boolean {
      return _builder.hasPubKey()
    }

    /**
     * <code>int64 voting_power = 3;</code>
     */
    public var votingPower: kotlin.Long
      @JvmName("getVotingPower")
      get() = _builder.getVotingPower()
      @JvmName("setVotingPower")
      set(value) {
        _builder.setVotingPower(value)
      }
    /**
     * <code>int64 voting_power = 3;</code>
     */
    public fun clearVotingPower() {
      _builder.clearVotingPower()
    }

    /**
     * <code>int64 proposer_priority = 4;</code>
     */
    public var proposerPriority: kotlin.Long
      @JvmName("getProposerPriority")
      get() = _builder.getProposerPriority()
      @JvmName("setProposerPriority")
      set(value) {
        _builder.setProposerPriority(value)
      }
    /**
     * <code>int64 proposer_priority = 4;</code>
     */
    public fun clearProposerPriority() {
      _builder.clearProposerPriority()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.tendermint.v1beta1.Query.Validator.copy(block: cosmos.base.tendermint.v1beta1.ValidatorKt.Dsl.() -> kotlin.Unit): cosmos.base.tendermint.v1beta1.Query.Validator =
  cosmos.base.tendermint.v1beta1.ValidatorKt.Dsl._create(this.toBuilder()).apply { block() }._build()

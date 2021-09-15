//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/channel/v1/query.proto

package ibc.core.channel.v1;

@kotlin.jvm.JvmSynthetic
inline fun queryPacketCommitmentResponse(block: ibc.core.channel.v1.QueryPacketCommitmentResponseKt.Dsl.() -> Unit): ibc.core.channel.v1.QueryOuterClass.QueryPacketCommitmentResponse =
  ibc.core.channel.v1.QueryPacketCommitmentResponseKt.Dsl._create(ibc.core.channel.v1.QueryOuterClass.QueryPacketCommitmentResponse.newBuilder()).apply { block() }._build()
object QueryPacketCommitmentResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: ibc.core.channel.v1.QueryOuterClass.QueryPacketCommitmentResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.channel.v1.QueryOuterClass.QueryPacketCommitmentResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.channel.v1.QueryOuterClass.QueryPacketCommitmentResponse = _builder.build()

    /**
     * <pre>
     * packet associated with the request fields
     * </pre>
     *
     * <code>bytes commitment = 1;</code>
     */
    var commitment: com.google.protobuf.ByteString
      @JvmName("getCommitment")
      get() = _builder.getCommitment()
      @JvmName("setCommitment")
      set(value) {
        _builder.setCommitment(value)
      }
    /**
     * <pre>
     * packet associated with the request fields
     * </pre>
     *
     * <code>bytes commitment = 1;</code>
     */
    fun clearCommitment() {
      _builder.clearCommitment()
    }

    /**
     * <pre>
     * merkle proof of existence
     * </pre>
     *
     * <code>bytes proof = 2;</code>
     */
    var proof: com.google.protobuf.ByteString
      @JvmName("getProof")
      get() = _builder.getProof()
      @JvmName("setProof")
      set(value) {
        _builder.setProof(value)
      }
    /**
     * <pre>
     * merkle proof of existence
     * </pre>
     *
     * <code>bytes proof = 2;</code>
     */
    fun clearProof() {
      _builder.clearProof()
    }

    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false];</code>
     */
    var proofHeight: ibc.core.client.v1.Client.Height
      @JvmName("getProofHeight")
      get() = _builder.getProofHeight()
      @JvmName("setProofHeight")
      set(value) {
        _builder.setProofHeight(value)
      }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false];</code>
     */
    fun clearProofHeight() {
      _builder.clearProofHeight()
    }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false];</code>
     * @return Whether the proofHeight field is set.
     */
    fun hasProofHeight(): kotlin.Boolean {
      return _builder.hasProofHeight()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun ibc.core.channel.v1.QueryOuterClass.QueryPacketCommitmentResponse.copy(block: ibc.core.channel.v1.QueryPacketCommitmentResponseKt.Dsl.() -> Unit): ibc.core.channel.v1.QueryOuterClass.QueryPacketCommitmentResponse =
  ibc.core.channel.v1.QueryPacketCommitmentResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmwasm/wasm/v1/proposal.proto

package cosmwasm.wasm.v1;

@kotlin.jvm.JvmSynthetic
public inline fun updateAdminProposal(block: cosmwasm.wasm.v1.UpdateAdminProposalKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.Proposal.UpdateAdminProposal =
  cosmwasm.wasm.v1.UpdateAdminProposalKt.Dsl._create(cosmwasm.wasm.v1.Proposal.UpdateAdminProposal.newBuilder()).apply { block() }._build()
public object UpdateAdminProposalKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmwasm.wasm.v1.Proposal.UpdateAdminProposal.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmwasm.wasm.v1.Proposal.UpdateAdminProposal.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmwasm.wasm.v1.Proposal.UpdateAdminProposal = _builder.build()

    /**
     * <pre>
     * Title is a short summary
     * </pre>
     *
     * <code>string title = 1;</code>
     */
    public var title: kotlin.String
      @JvmName("getTitle")
      get() = _builder.getTitle()
      @JvmName("setTitle")
      set(value) {
        _builder.setTitle(value)
      }
    /**
     * <pre>
     * Title is a short summary
     * </pre>
     *
     * <code>string title = 1;</code>
     */
    public fun clearTitle() {
      _builder.clearTitle()
    }

    /**
     * <pre>
     * Description is a human readable text
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public var description: kotlin.String
      @JvmName("getDescription")
      get() = _builder.getDescription()
      @JvmName("setDescription")
      set(value) {
        _builder.setDescription(value)
      }
    /**
     * <pre>
     * Description is a human readable text
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public fun clearDescription() {
      _builder.clearDescription()
    }

    /**
     * <pre>
     * NewAdmin address to be set
     * </pre>
     *
     * <code>string new_admin = 3 [(.gogoproto.moretags) = "yaml:&#92;"new_admin&#92;""];</code>
     */
    public var newAdmin: kotlin.String
      @JvmName("getNewAdmin")
      get() = _builder.getNewAdmin()
      @JvmName("setNewAdmin")
      set(value) {
        _builder.setNewAdmin(value)
      }
    /**
     * <pre>
     * NewAdmin address to be set
     * </pre>
     *
     * <code>string new_admin = 3 [(.gogoproto.moretags) = "yaml:&#92;"new_admin&#92;""];</code>
     */
    public fun clearNewAdmin() {
      _builder.clearNewAdmin()
    }

    /**
     * <pre>
     * Contract is the address of the smart contract
     * </pre>
     *
     * <code>string contract = 4;</code>
     */
    public var contract: kotlin.String
      @JvmName("getContract")
      get() = _builder.getContract()
      @JvmName("setContract")
      set(value) {
        _builder.setContract(value)
      }
    /**
     * <pre>
     * Contract is the address of the smart contract
     * </pre>
     *
     * <code>string contract = 4;</code>
     */
    public fun clearContract() {
      _builder.clearContract()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmwasm.wasm.v1.Proposal.UpdateAdminProposal.copy(block: cosmwasm.wasm.v1.UpdateAdminProposalKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.Proposal.UpdateAdminProposal =
  cosmwasm.wasm.v1.UpdateAdminProposalKt.Dsl._create(this.toBuilder()).apply { block() }._build()
//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmwasm/wasm/v1/types.proto

package cosmwasm.wasm.v1;

@kotlin.jvm.JvmSynthetic
public inline fun contractInfo(block: cosmwasm.wasm.v1.ContractInfoKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.Types.ContractInfo =
  cosmwasm.wasm.v1.ContractInfoKt.Dsl._create(cosmwasm.wasm.v1.Types.ContractInfo.newBuilder()).apply { block() }._build()
public object ContractInfoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmwasm.wasm.v1.Types.ContractInfo.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmwasm.wasm.v1.Types.ContractInfo.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmwasm.wasm.v1.Types.ContractInfo = _builder.build()

    /**
     * <pre>
     * CodeID is the reference to the stored Wasm code
     * </pre>
     *
     * <code>uint64 code_id = 1 [(.gogoproto.customname) = "CodeID"];</code>
     */
    public var codeId: kotlin.Long
      @JvmName("getCodeId")
      get() = _builder.getCodeId()
      @JvmName("setCodeId")
      set(value) {
        _builder.setCodeId(value)
      }
    /**
     * <pre>
     * CodeID is the reference to the stored Wasm code
     * </pre>
     *
     * <code>uint64 code_id = 1 [(.gogoproto.customname) = "CodeID"];</code>
     */
    public fun clearCodeId() {
      _builder.clearCodeId()
    }

    /**
     * <pre>
     * Creator address who initially instantiated the contract
     * </pre>
     *
     * <code>string creator = 2;</code>
     */
    public var creator: kotlin.String
      @JvmName("getCreator")
      get() = _builder.getCreator()
      @JvmName("setCreator")
      set(value) {
        _builder.setCreator(value)
      }
    /**
     * <pre>
     * Creator address who initially instantiated the contract
     * </pre>
     *
     * <code>string creator = 2;</code>
     */
    public fun clearCreator() {
      _builder.clearCreator()
    }

    /**
     * <pre>
     * Admin is an optional address that can execute migrations
     * </pre>
     *
     * <code>string admin = 3;</code>
     */
    public var admin: kotlin.String
      @JvmName("getAdmin")
      get() = _builder.getAdmin()
      @JvmName("setAdmin")
      set(value) {
        _builder.setAdmin(value)
      }
    /**
     * <pre>
     * Admin is an optional address that can execute migrations
     * </pre>
     *
     * <code>string admin = 3;</code>
     */
    public fun clearAdmin() {
      _builder.clearAdmin()
    }

    /**
     * <pre>
     * Label is optional metadata to be stored with a contract instance.
     * </pre>
     *
     * <code>string label = 4;</code>
     */
    public var label: kotlin.String
      @JvmName("getLabel")
      get() = _builder.getLabel()
      @JvmName("setLabel")
      set(value) {
        _builder.setLabel(value)
      }
    /**
     * <pre>
     * Label is optional metadata to be stored with a contract instance.
     * </pre>
     *
     * <code>string label = 4;</code>
     */
    public fun clearLabel() {
      _builder.clearLabel()
    }

    /**
     * <pre>
     * Created Tx position when the contract was instantiated.
     * This data should kept internal and not be exposed via query results. Just
     * use for sorting
     * </pre>
     *
     * <code>.cosmwasm.wasm.v1.AbsoluteTxPosition created = 5;</code>
     */
    public var created: cosmwasm.wasm.v1.Types.AbsoluteTxPosition
      @JvmName("getCreated")
      get() = _builder.getCreated()
      @JvmName("setCreated")
      set(value) {
        _builder.setCreated(value)
      }
    /**
     * <pre>
     * Created Tx position when the contract was instantiated.
     * This data should kept internal and not be exposed via query results. Just
     * use for sorting
     * </pre>
     *
     * <code>.cosmwasm.wasm.v1.AbsoluteTxPosition created = 5;</code>
     */
    public fun clearCreated() {
      _builder.clearCreated()
    }
    /**
     * <pre>
     * Created Tx position when the contract was instantiated.
     * This data should kept internal and not be exposed via query results. Just
     * use for sorting
     * </pre>
     *
     * <code>.cosmwasm.wasm.v1.AbsoluteTxPosition created = 5;</code>
     * @return Whether the created field is set.
     */
    public fun hasCreated(): kotlin.Boolean {
      return _builder.hasCreated()
    }

    /**
     * <code>string ibc_port_id = 6 [(.gogoproto.customname) = "IBCPortID"];</code>
     */
    public var ibcPortId: kotlin.String
      @JvmName("getIbcPortId")
      get() = _builder.getIbcPortId()
      @JvmName("setIbcPortId")
      set(value) {
        _builder.setIbcPortId(value)
      }
    /**
     * <code>string ibc_port_id = 6 [(.gogoproto.customname) = "IBCPortID"];</code>
     */
    public fun clearIbcPortId() {
      _builder.clearIbcPortId()
    }

    /**
     * <pre>
     * Extension is an extension point to store custom metadata within the
     * persistence model.
     * </pre>
     *
     * <code>.google.protobuf.Any extension = 7 [(.cosmos_proto.accepts_interface) = "ContractInfoExtension"];</code>
     */
    public var extension: com.google.protobuf.Any
      @JvmName("getExtension")
      get() = _builder.getExtension()
      @JvmName("setExtension")
      set(value) {
        _builder.setExtension(value)
      }
    /**
     * <pre>
     * Extension is an extension point to store custom metadata within the
     * persistence model.
     * </pre>
     *
     * <code>.google.protobuf.Any extension = 7 [(.cosmos_proto.accepts_interface) = "ContractInfoExtension"];</code>
     */
    public fun clearExtension() {
      _builder.clearExtension()
    }
    /**
     * <pre>
     * Extension is an extension point to store custom metadata within the
     * persistence model.
     * </pre>
     *
     * <code>.google.protobuf.Any extension = 7 [(.cosmos_proto.accepts_interface) = "ContractInfoExtension"];</code>
     * @return Whether the extension field is set.
     */
    public fun hasExtension(): kotlin.Boolean {
      return _builder.hasExtension()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmwasm.wasm.v1.Types.ContractInfo.copy(block: cosmwasm.wasm.v1.ContractInfoKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.Types.ContractInfo =
  cosmwasm.wasm.v1.ContractInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()

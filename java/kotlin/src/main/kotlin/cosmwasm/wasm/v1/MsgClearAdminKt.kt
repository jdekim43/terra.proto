//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmwasm/wasm/v1/tx.proto

package cosmwasm.wasm.v1;

@kotlin.jvm.JvmSynthetic
public inline fun msgClearAdmin(block: cosmwasm.wasm.v1.MsgClearAdminKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.Tx.MsgClearAdmin =
  cosmwasm.wasm.v1.MsgClearAdminKt.Dsl._create(cosmwasm.wasm.v1.Tx.MsgClearAdmin.newBuilder()).apply { block() }._build()
public object MsgClearAdminKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmwasm.wasm.v1.Tx.MsgClearAdmin.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmwasm.wasm.v1.Tx.MsgClearAdmin.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmwasm.wasm.v1.Tx.MsgClearAdmin = _builder.build()

    /**
     * <pre>
     * Sender is the that actor that signed the messages
     * </pre>
     *
     * <code>string sender = 1;</code>
     */
    public var sender: kotlin.String
      @JvmName("getSender")
      get() = _builder.getSender()
      @JvmName("setSender")
      set(value) {
        _builder.setSender(value)
      }
    /**
     * <pre>
     * Sender is the that actor that signed the messages
     * </pre>
     *
     * <code>string sender = 1;</code>
     */
    public fun clearSender() {
      _builder.clearSender()
    }

    /**
     * <pre>
     * Contract is the address of the smart contract
     * </pre>
     *
     * <code>string contract = 3;</code>
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
     * <code>string contract = 3;</code>
     */
    public fun clearContract() {
      _builder.clearContract()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmwasm.wasm.v1.Tx.MsgClearAdmin.copy(block: cosmwasm.wasm.v1.MsgClearAdminKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.Tx.MsgClearAdmin =
  cosmwasm.wasm.v1.MsgClearAdminKt.Dsl._create(this.toBuilder()).apply { block() }._build()
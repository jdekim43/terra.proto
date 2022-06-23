//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmwasm/wasm/v1/query.proto

package cosmwasm.wasm.v1;

@kotlin.jvm.JvmSynthetic
public inline fun querySmartContractStateResponse(block: cosmwasm.wasm.v1.QuerySmartContractStateResponseKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse =
  cosmwasm.wasm.v1.QuerySmartContractStateResponseKt.Dsl._create(cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse.newBuilder()).apply { block() }._build()
public object QuerySmartContractStateResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse = _builder.build()

    /**
     * <pre>
     * Data contains the json data returned from the smart contract
     * </pre>
     *
     * <code>bytes data = 1 [(.gogoproto.casttype) = "RawContractMessage"];</code>
     */
    public var data: com.google.protobuf.ByteString
      @JvmName("getData")
      get() = _builder.getData()
      @JvmName("setData")
      set(value) {
        _builder.setData(value)
      }
    /**
     * <pre>
     * Data contains the json data returned from the smart contract
     * </pre>
     *
     * <code>bytes data = 1 [(.gogoproto.casttype) = "RawContractMessage"];</code>
     */
    public fun clearData() {
      _builder.clearData()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse.copy(block: cosmwasm.wasm.v1.QuerySmartContractStateResponseKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse =
  cosmwasm.wasm.v1.QuerySmartContractStateResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/tx/v1beta1/service.proto

package cosmos.tx.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun simulateResponse(block: cosmos.tx.v1beta1.SimulateResponseKt.Dsl.() -> kotlin.Unit): cosmos.tx.v1beta1.ServiceOuterClass.SimulateResponse =
  cosmos.tx.v1beta1.SimulateResponseKt.Dsl._create(cosmos.tx.v1beta1.ServiceOuterClass.SimulateResponse.newBuilder()).apply { block() }._build()
public object SimulateResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.tx.v1beta1.ServiceOuterClass.SimulateResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.tx.v1beta1.ServiceOuterClass.SimulateResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.tx.v1beta1.ServiceOuterClass.SimulateResponse = _builder.build()

    /**
     * <pre>
     * gas_info is the information about gas used in the simulation.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.GasInfo gas_info = 1;</code>
     */
    public var gasInfo: cosmos.base.abci.v1beta1.Abci.GasInfo
      @JvmName("getGasInfo")
      get() = _builder.getGasInfo()
      @JvmName("setGasInfo")
      set(value) {
        _builder.setGasInfo(value)
      }
    /**
     * <pre>
     * gas_info is the information about gas used in the simulation.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.GasInfo gas_info = 1;</code>
     */
    public fun clearGasInfo() {
      _builder.clearGasInfo()
    }
    /**
     * <pre>
     * gas_info is the information about gas used in the simulation.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.GasInfo gas_info = 1;</code>
     * @return Whether the gasInfo field is set.
     */
    public fun hasGasInfo(): kotlin.Boolean {
      return _builder.hasGasInfo()
    }

    /**
     * <pre>
     * result is the result of the simulation.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.Result result = 2;</code>
     */
    public var result: cosmos.base.abci.v1beta1.Abci.Result
      @JvmName("getResult")
      get() = _builder.getResult()
      @JvmName("setResult")
      set(value) {
        _builder.setResult(value)
      }
    /**
     * <pre>
     * result is the result of the simulation.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.Result result = 2;</code>
     */
    public fun clearResult() {
      _builder.clearResult()
    }
    /**
     * <pre>
     * result is the result of the simulation.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.Result result = 2;</code>
     * @return Whether the result field is set.
     */
    public fun hasResult(): kotlin.Boolean {
      return _builder.hasResult()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.tx.v1beta1.ServiceOuterClass.SimulateResponse.copy(block: cosmos.tx.v1beta1.SimulateResponseKt.Dsl.() -> kotlin.Unit): cosmos.tx.v1beta1.ServiceOuterClass.SimulateResponse =
  cosmos.tx.v1beta1.SimulateResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

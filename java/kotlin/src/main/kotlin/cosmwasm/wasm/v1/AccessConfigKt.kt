//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmwasm/wasm/v1/types.proto

package cosmwasm.wasm.v1;

@kotlin.jvm.JvmSynthetic
public inline fun accessConfig(block: cosmwasm.wasm.v1.AccessConfigKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.Types.AccessConfig =
  cosmwasm.wasm.v1.AccessConfigKt.Dsl._create(cosmwasm.wasm.v1.Types.AccessConfig.newBuilder()).apply { block() }._build()
public object AccessConfigKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmwasm.wasm.v1.Types.AccessConfig.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmwasm.wasm.v1.Types.AccessConfig.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmwasm.wasm.v1.Types.AccessConfig = _builder.build()

    /**
     * <code>.cosmwasm.wasm.v1.AccessType permission = 1 [(.gogoproto.moretags) = "yaml:&#92;"permission&#92;""];</code>
     */
    public var permission: cosmwasm.wasm.v1.Types.AccessType
      @JvmName("getPermission")
      get() = _builder.getPermission()
      @JvmName("setPermission")
      set(value) {
        _builder.setPermission(value)
      }
    /**
     * <code>.cosmwasm.wasm.v1.AccessType permission = 1 [(.gogoproto.moretags) = "yaml:&#92;"permission&#92;""];</code>
     */
    public fun clearPermission() {
      _builder.clearPermission()
    }

    /**
     * <code>string address = 2 [(.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
     */
    public var address: kotlin.String
      @JvmName("getAddress")
      get() = _builder.getAddress()
      @JvmName("setAddress")
      set(value) {
        _builder.setAddress(value)
      }
    /**
     * <code>string address = 2 [(.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
     */
    public fun clearAddress() {
      _builder.clearAddress()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmwasm.wasm.v1.Types.AccessConfig.copy(block: cosmwasm.wasm.v1.AccessConfigKt.Dsl.() -> kotlin.Unit): cosmwasm.wasm.v1.Types.AccessConfig =
  cosmwasm.wasm.v1.AccessConfigKt.Dsl._create(this.toBuilder()).apply { block() }._build()

//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/crisis/v1beta1/tx.proto

package cosmos.crisis.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun msgVerifyInvariant(block: cosmos.crisis.v1beta1.MsgVerifyInvariantKt.Dsl.() -> kotlin.Unit): cosmos.crisis.v1beta1.Tx.MsgVerifyInvariant =
  cosmos.crisis.v1beta1.MsgVerifyInvariantKt.Dsl._create(cosmos.crisis.v1beta1.Tx.MsgVerifyInvariant.newBuilder()).apply { block() }._build()
public object MsgVerifyInvariantKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.crisis.v1beta1.Tx.MsgVerifyInvariant.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.crisis.v1beta1.Tx.MsgVerifyInvariant.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.crisis.v1beta1.Tx.MsgVerifyInvariant = _builder.build()

    /**
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
     * <code>string sender = 1;</code>
     */
    public fun clearSender() {
      _builder.clearSender()
    }

    /**
     * <code>string invariant_module_name = 2 [(.gogoproto.moretags) = "yaml:&#92;"invariant_module_name&#92;""];</code>
     */
    public var invariantModuleName: kotlin.String
      @JvmName("getInvariantModuleName")
      get() = _builder.getInvariantModuleName()
      @JvmName("setInvariantModuleName")
      set(value) {
        _builder.setInvariantModuleName(value)
      }
    /**
     * <code>string invariant_module_name = 2 [(.gogoproto.moretags) = "yaml:&#92;"invariant_module_name&#92;""];</code>
     */
    public fun clearInvariantModuleName() {
      _builder.clearInvariantModuleName()
    }

    /**
     * <code>string invariant_route = 3 [(.gogoproto.moretags) = "yaml:&#92;"invariant_route&#92;""];</code>
     */
    public var invariantRoute: kotlin.String
      @JvmName("getInvariantRoute")
      get() = _builder.getInvariantRoute()
      @JvmName("setInvariantRoute")
      set(value) {
        _builder.setInvariantRoute(value)
      }
    /**
     * <code>string invariant_route = 3 [(.gogoproto.moretags) = "yaml:&#92;"invariant_route&#92;""];</code>
     */
    public fun clearInvariantRoute() {
      _builder.clearInvariantRoute()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.crisis.v1beta1.Tx.MsgVerifyInvariant.copy(block: cosmos.crisis.v1beta1.MsgVerifyInvariantKt.Dsl.() -> kotlin.Unit): cosmos.crisis.v1beta1.Tx.MsgVerifyInvariant =
  cosmos.crisis.v1beta1.MsgVerifyInvariantKt.Dsl._create(this.toBuilder()).apply { block() }._build()

//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/lightclients/solomachine/v1/solomachine.proto

package ibc.lightclients.solomachine.v1;

@kotlin.jvm.JvmSynthetic
public inline fun clientStateData(block: ibc.lightclients.solomachine.v1.ClientStateDataKt.Dsl.() -> kotlin.Unit): ibc.lightclients.solomachine.v1.Solomachine.ClientStateData =
  ibc.lightclients.solomachine.v1.ClientStateDataKt.Dsl._create(ibc.lightclients.solomachine.v1.Solomachine.ClientStateData.newBuilder()).apply { block() }._build()
public object ClientStateDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.lightclients.solomachine.v1.Solomachine.ClientStateData.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.lightclients.solomachine.v1.Solomachine.ClientStateData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.lightclients.solomachine.v1.Solomachine.ClientStateData = _builder.build()

    /**
     * <code>bytes path = 1;</code>
     */
    public var path: com.google.protobuf.ByteString
      @JvmName("getPath")
      get() = _builder.getPath()
      @JvmName("setPath")
      set(value) {
        _builder.setPath(value)
      }
    /**
     * <code>bytes path = 1;</code>
     */
    public fun clearPath() {
      _builder.clearPath()
    }

    /**
     * <code>.google.protobuf.Any client_state = 2 [(.gogoproto.moretags) = "yaml:&#92;"client_state&#92;""];</code>
     */
    public var clientState: com.google.protobuf.Any
      @JvmName("getClientState")
      get() = _builder.getClientState()
      @JvmName("setClientState")
      set(value) {
        _builder.setClientState(value)
      }
    /**
     * <code>.google.protobuf.Any client_state = 2 [(.gogoproto.moretags) = "yaml:&#92;"client_state&#92;""];</code>
     */
    public fun clearClientState() {
      _builder.clearClientState()
    }
    /**
     * <code>.google.protobuf.Any client_state = 2 [(.gogoproto.moretags) = "yaml:&#92;"client_state&#92;""];</code>
     * @return Whether the clientState field is set.
     */
    public fun hasClientState(): kotlin.Boolean {
      return _builder.hasClientState()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.lightclients.solomachine.v1.Solomachine.ClientStateData.copy(block: ibc.lightclients.solomachine.v1.ClientStateDataKt.Dsl.() -> kotlin.Unit): ibc.lightclients.solomachine.v1.Solomachine.ClientStateData =
  ibc.lightclients.solomachine.v1.ClientStateDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()

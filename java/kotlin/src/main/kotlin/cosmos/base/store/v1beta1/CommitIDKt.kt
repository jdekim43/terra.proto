//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/store/v1beta1/commit_info.proto

package cosmos.base.store.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun commitID(block: cosmos.base.store.v1beta1.CommitIDKt.Dsl.() -> kotlin.Unit): cosmos.base.store.v1beta1.CommitInfoOuterClass.CommitID =
  cosmos.base.store.v1beta1.CommitIDKt.Dsl._create(cosmos.base.store.v1beta1.CommitInfoOuterClass.CommitID.newBuilder()).apply { block() }._build()
public object CommitIDKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.store.v1beta1.CommitInfoOuterClass.CommitID.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.store.v1beta1.CommitInfoOuterClass.CommitID.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.store.v1beta1.CommitInfoOuterClass.CommitID = _builder.build()

    /**
     * <code>int64 version = 1;</code>
     */
    public var version: kotlin.Long
      @JvmName("getVersion")
      get() = _builder.getVersion()
      @JvmName("setVersion")
      set(value) {
        _builder.setVersion(value)
      }
    /**
     * <code>int64 version = 1;</code>
     */
    public fun clearVersion() {
      _builder.clearVersion()
    }

    /**
     * <code>bytes hash = 2;</code>
     */
    public var hash: com.google.protobuf.ByteString
      @JvmName("getHash")
      get() = _builder.getHash()
      @JvmName("setHash")
      set(value) {
        _builder.setHash(value)
      }
    /**
     * <code>bytes hash = 2;</code>
     */
    public fun clearHash() {
      _builder.clearHash()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.store.v1beta1.CommitInfoOuterClass.CommitID.copy(block: cosmos.base.store.v1beta1.CommitIDKt.Dsl.() -> kotlin.Unit): cosmos.base.store.v1beta1.CommitInfoOuterClass.CommitID =
  cosmos.base.store.v1beta1.CommitIDKt.Dsl._create(this.toBuilder()).apply { block() }._build()

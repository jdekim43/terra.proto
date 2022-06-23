//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/client/v1/client.proto

package ibc.core.client.v1;

@kotlin.jvm.JvmSynthetic
public inline fun height(block: ibc.core.client.v1.HeightKt.Dsl.() -> kotlin.Unit): ibc.core.client.v1.Client.Height =
  ibc.core.client.v1.HeightKt.Dsl._create(ibc.core.client.v1.Client.Height.newBuilder()).apply { block() }._build()
public object HeightKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.client.v1.Client.Height.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.client.v1.Client.Height.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.client.v1.Client.Height = _builder.build()

    /**
     * <pre>
     * the revision that the client is currently on
     * </pre>
     *
     * <code>uint64 revision_number = 1 [(.gogoproto.moretags) = "yaml:&#92;"revision_number&#92;""];</code>
     */
    public var revisionNumber: kotlin.Long
      @JvmName("getRevisionNumber")
      get() = _builder.getRevisionNumber()
      @JvmName("setRevisionNumber")
      set(value) {
        _builder.setRevisionNumber(value)
      }
    /**
     * <pre>
     * the revision that the client is currently on
     * </pre>
     *
     * <code>uint64 revision_number = 1 [(.gogoproto.moretags) = "yaml:&#92;"revision_number&#92;""];</code>
     */
    public fun clearRevisionNumber() {
      _builder.clearRevisionNumber()
    }

    /**
     * <pre>
     * the height within the given revision
     * </pre>
     *
     * <code>uint64 revision_height = 2 [(.gogoproto.moretags) = "yaml:&#92;"revision_height&#92;""];</code>
     */
    public var revisionHeight: kotlin.Long
      @JvmName("getRevisionHeight")
      get() = _builder.getRevisionHeight()
      @JvmName("setRevisionHeight")
      set(value) {
        _builder.setRevisionHeight(value)
      }
    /**
     * <pre>
     * the height within the given revision
     * </pre>
     *
     * <code>uint64 revision_height = 2 [(.gogoproto.moretags) = "yaml:&#92;"revision_height&#92;""];</code>
     */
    public fun clearRevisionHeight() {
      _builder.clearRevisionHeight()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.client.v1.Client.Height.copy(block: ibc.core.client.v1.HeightKt.Dsl.() -> kotlin.Unit): ibc.core.client.v1.Client.Height =
  ibc.core.client.v1.HeightKt.Dsl._create(this.toBuilder()).apply { block() }._build()

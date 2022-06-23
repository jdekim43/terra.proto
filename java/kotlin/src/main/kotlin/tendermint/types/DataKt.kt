//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/types/types.proto

package tendermint.types;

@kotlin.jvm.JvmSynthetic
public inline fun data(block: tendermint.types.DataKt.Dsl.() -> kotlin.Unit): tendermint.types.Types.Data =
  tendermint.types.DataKt.Dsl._create(tendermint.types.Types.Data.newBuilder()).apply { block() }._build()
public object DataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.types.Types.Data.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.types.Types.Data.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.types.Types.Data = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class TxsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * Txs that will be applied by state &#64; block.Height+1.
     * NOTE: not all txs here are valid.  We're just agreeing on the order first.
     * This means that block.AppHash does not include these txs.
     * </pre>
     *
     * <code>repeated bytes txs = 1;</code>
     */
     public val txs: com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, TxsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getTxsList()
      )
    /**
     * <pre>
     * Txs that will be applied by state &#64; block.Height+1.
     * NOTE: not all txs here are valid.  We're just agreeing on the order first.
     * This means that block.AppHash does not include these txs.
     * </pre>
     *
     * <code>repeated bytes txs = 1;</code>
     * @param value The txs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addTxs")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, TxsProxy>.add(value: com.google.protobuf.ByteString) {
      _builder.addTxs(value)
    }/**
     * <pre>
     * Txs that will be applied by state &#64; block.Height+1.
     * NOTE: not all txs here are valid.  We're just agreeing on the order first.
     * This means that block.AppHash does not include these txs.
     * </pre>
     *
     * <code>repeated bytes txs = 1;</code>
     * @param value The txs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignTxs")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, TxsProxy>.plusAssign(value: com.google.protobuf.ByteString) {
      add(value)
    }/**
     * <pre>
     * Txs that will be applied by state &#64; block.Height+1.
     * NOTE: not all txs here are valid.  We're just agreeing on the order first.
     * This means that block.AppHash does not include these txs.
     * </pre>
     *
     * <code>repeated bytes txs = 1;</code>
     * @param values The txs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllTxs")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, TxsProxy>.addAll(values: kotlin.collections.Iterable<com.google.protobuf.ByteString>) {
      _builder.addAllTxs(values)
    }/**
     * <pre>
     * Txs that will be applied by state &#64; block.Height+1.
     * NOTE: not all txs here are valid.  We're just agreeing on the order first.
     * This means that block.AppHash does not include these txs.
     * </pre>
     *
     * <code>repeated bytes txs = 1;</code>
     * @param values The txs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllTxs")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, TxsProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.protobuf.ByteString>) {
      addAll(values)
    }/**
     * <pre>
     * Txs that will be applied by state &#64; block.Height+1.
     * NOTE: not all txs here are valid.  We're just agreeing on the order first.
     * This means that block.AppHash does not include these txs.
     * </pre>
     *
     * <code>repeated bytes txs = 1;</code>
     * @param index The index to set the value at.
     * @param value The txs to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setTxs")
    public operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, TxsProxy>.set(index: kotlin.Int, value: com.google.protobuf.ByteString) {
      _builder.setTxs(index, value)
    }/**
     * <pre>
     * Txs that will be applied by state &#64; block.Height+1.
     * NOTE: not all txs here are valid.  We're just agreeing on the order first.
     * This means that block.AppHash does not include these txs.
     * </pre>
     *
     * <code>repeated bytes txs = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearTxs")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, TxsProxy>.clear() {
      _builder.clearTxs()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.types.Types.Data.copy(block: tendermint.types.DataKt.Dsl.() -> kotlin.Unit): tendermint.types.Types.Data =
  tendermint.types.DataKt.Dsl._create(this.toBuilder()).apply { block() }._build()

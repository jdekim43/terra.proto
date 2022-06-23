//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/applications/fee/v1/fee.proto

package ibc.applications.fee.v1;

@kotlin.jvm.JvmSynthetic
public inline fun fee(block: ibc.applications.fee.v1.FeeKt.Dsl.() -> kotlin.Unit): ibc.applications.fee.v1.FeeOuterClass.Fee =
  ibc.applications.fee.v1.FeeKt.Dsl._create(ibc.applications.fee.v1.FeeOuterClass.Fee.newBuilder()).apply { block() }._build()
public object FeeKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.applications.fee.v1.FeeOuterClass.Fee.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.applications.fee.v1.FeeOuterClass.Fee.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.applications.fee.v1.FeeOuterClass.Fee = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class RecvFeeProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * the packet receive fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin recv_fee = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"recv_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
     public val recvFee: com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, RecvFeeProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getRecvFeeList()
      )
    /**
     * <pre>
     * the packet receive fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin recv_fee = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"recv_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param value The recvFee to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addRecvFee")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, RecvFeeProxy>.add(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.addRecvFee(value)
    }/**
     * <pre>
     * the packet receive fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin recv_fee = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"recv_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param value The recvFee to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignRecvFee")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, RecvFeeProxy>.plusAssign(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      add(value)
    }/**
     * <pre>
     * the packet receive fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin recv_fee = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"recv_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param values The recvFee to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllRecvFee")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, RecvFeeProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      _builder.addAllRecvFee(values)
    }/**
     * <pre>
     * the packet receive fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin recv_fee = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"recv_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param values The recvFee to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllRecvFee")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, RecvFeeProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      addAll(values)
    }/**
     * <pre>
     * the packet receive fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin recv_fee = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"recv_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param index The index to set the value at.
     * @param value The recvFee to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setRecvFee")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, RecvFeeProxy>.set(index: kotlin.Int, value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.setRecvFee(index, value)
    }/**
     * <pre>
     * the packet receive fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin recv_fee = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"recv_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearRecvFee")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, RecvFeeProxy>.clear() {
      _builder.clearRecvFee()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class AckFeeProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * the packet acknowledgement fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fee = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"ack_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
     public val ackFee: com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AckFeeProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getAckFeeList()
      )
    /**
     * <pre>
     * the packet acknowledgement fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fee = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"ack_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param value The ackFee to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAckFee")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AckFeeProxy>.add(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.addAckFee(value)
    }/**
     * <pre>
     * the packet acknowledgement fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fee = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"ack_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param value The ackFee to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAckFee")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AckFeeProxy>.plusAssign(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      add(value)
    }/**
     * <pre>
     * the packet acknowledgement fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fee = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"ack_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param values The ackFee to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllAckFee")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AckFeeProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      _builder.addAllAckFee(values)
    }/**
     * <pre>
     * the packet acknowledgement fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fee = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"ack_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param values The ackFee to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllAckFee")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AckFeeProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      addAll(values)
    }/**
     * <pre>
     * the packet acknowledgement fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fee = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"ack_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param index The index to set the value at.
     * @param value The ackFee to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setAckFee")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AckFeeProxy>.set(index: kotlin.Int, value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.setAckFee(index, value)
    }/**
     * <pre>
     * the packet acknowledgement fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fee = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"ack_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearAckFee")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AckFeeProxy>.clear() {
      _builder.clearAckFee()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class TimeoutFeeProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * the packet timeout fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin timeout_fee = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"timeout_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
     public val timeoutFee: com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, TimeoutFeeProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getTimeoutFeeList()
      )
    /**
     * <pre>
     * the packet timeout fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin timeout_fee = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"timeout_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param value The timeoutFee to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addTimeoutFee")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, TimeoutFeeProxy>.add(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.addTimeoutFee(value)
    }/**
     * <pre>
     * the packet timeout fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin timeout_fee = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"timeout_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param value The timeoutFee to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignTimeoutFee")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, TimeoutFeeProxy>.plusAssign(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      add(value)
    }/**
     * <pre>
     * the packet timeout fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin timeout_fee = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"timeout_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param values The timeoutFee to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllTimeoutFee")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, TimeoutFeeProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      _builder.addAllTimeoutFee(values)
    }/**
     * <pre>
     * the packet timeout fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin timeout_fee = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"timeout_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param values The timeoutFee to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllTimeoutFee")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, TimeoutFeeProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      addAll(values)
    }/**
     * <pre>
     * the packet timeout fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin timeout_fee = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"timeout_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param index The index to set the value at.
     * @param value The timeoutFee to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setTimeoutFee")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, TimeoutFeeProxy>.set(index: kotlin.Int, value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.setTimeoutFee(index, value)
    }/**
     * <pre>
     * the packet timeout fee
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin timeout_fee = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"timeout_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearTimeoutFee")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, TimeoutFeeProxy>.clear() {
      _builder.clearTimeoutFee()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.applications.fee.v1.FeeOuterClass.Fee.copy(block: ibc.applications.fee.v1.FeeKt.Dsl.() -> kotlin.Unit): ibc.applications.fee.v1.FeeOuterClass.Fee =
  ibc.applications.fee.v1.FeeKt.Dsl._create(this.toBuilder()).apply { block() }._build()
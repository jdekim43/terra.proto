//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/feegrant/v1beta1/tx.proto

package cosmos.feegrant.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun msgGrantAllowance(block: cosmos.feegrant.v1beta1.MsgGrantAllowanceKt.Dsl.() -> kotlin.Unit): cosmos.feegrant.v1beta1.Tx.MsgGrantAllowance =
  cosmos.feegrant.v1beta1.MsgGrantAllowanceKt.Dsl._create(cosmos.feegrant.v1beta1.Tx.MsgGrantAllowance.newBuilder()).apply { block() }._build()
public object MsgGrantAllowanceKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.feegrant.v1beta1.Tx.MsgGrantAllowance.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.feegrant.v1beta1.Tx.MsgGrantAllowance.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.feegrant.v1beta1.Tx.MsgGrantAllowance = _builder.build()

    /**
     * <pre>
     * granter is the address of the user granting an allowance of their funds.
     * </pre>
     *
     * <code>string granter = 1;</code>
     */
    public var granter: kotlin.String
      @JvmName("getGranter")
      get() = _builder.getGranter()
      @JvmName("setGranter")
      set(value) {
        _builder.setGranter(value)
      }
    /**
     * <pre>
     * granter is the address of the user granting an allowance of their funds.
     * </pre>
     *
     * <code>string granter = 1;</code>
     */
    public fun clearGranter() {
      _builder.clearGranter()
    }

    /**
     * <pre>
     * grantee is the address of the user being granted an allowance of another user's funds.
     * </pre>
     *
     * <code>string grantee = 2;</code>
     */
    public var grantee: kotlin.String
      @JvmName("getGrantee")
      get() = _builder.getGrantee()
      @JvmName("setGrantee")
      set(value) {
        _builder.setGrantee(value)
      }
    /**
     * <pre>
     * grantee is the address of the user being granted an allowance of another user's funds.
     * </pre>
     *
     * <code>string grantee = 2;</code>
     */
    public fun clearGrantee() {
      _builder.clearGrantee()
    }

    /**
     * <pre>
     * allowance can be any of basic and filtered fee allowance.
     * </pre>
     *
     * <code>.google.protobuf.Any allowance = 3 [(.cosmos_proto.accepts_interface) = "FeeAllowanceI"];</code>
     */
    public var allowance: com.google.protobuf.Any
      @JvmName("getAllowance")
      get() = _builder.getAllowance()
      @JvmName("setAllowance")
      set(value) {
        _builder.setAllowance(value)
      }
    /**
     * <pre>
     * allowance can be any of basic and filtered fee allowance.
     * </pre>
     *
     * <code>.google.protobuf.Any allowance = 3 [(.cosmos_proto.accepts_interface) = "FeeAllowanceI"];</code>
     */
    public fun clearAllowance() {
      _builder.clearAllowance()
    }
    /**
     * <pre>
     * allowance can be any of basic and filtered fee allowance.
     * </pre>
     *
     * <code>.google.protobuf.Any allowance = 3 [(.cosmos_proto.accepts_interface) = "FeeAllowanceI"];</code>
     * @return Whether the allowance field is set.
     */
    public fun hasAllowance(): kotlin.Boolean {
      return _builder.hasAllowance()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.feegrant.v1beta1.Tx.MsgGrantAllowance.copy(block: cosmos.feegrant.v1beta1.MsgGrantAllowanceKt.Dsl.() -> kotlin.Unit): cosmos.feegrant.v1beta1.Tx.MsgGrantAllowance =
  cosmos.feegrant.v1beta1.MsgGrantAllowanceKt.Dsl._create(this.toBuilder()).apply { block() }._build()

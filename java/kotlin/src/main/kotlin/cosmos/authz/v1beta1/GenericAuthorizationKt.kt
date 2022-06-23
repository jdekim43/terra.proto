//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/authz/v1beta1/authz.proto

package cosmos.authz.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun genericAuthorization(block: cosmos.authz.v1beta1.GenericAuthorizationKt.Dsl.() -> kotlin.Unit): cosmos.authz.v1beta1.Authz.GenericAuthorization =
  cosmos.authz.v1beta1.GenericAuthorizationKt.Dsl._create(cosmos.authz.v1beta1.Authz.GenericAuthorization.newBuilder()).apply { block() }._build()
public object GenericAuthorizationKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.authz.v1beta1.Authz.GenericAuthorization.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.authz.v1beta1.Authz.GenericAuthorization.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.authz.v1beta1.Authz.GenericAuthorization = _builder.build()

    /**
     * <pre>
     * Msg, identified by it's type URL, to grant unrestricted permissions to execute
     * </pre>
     *
     * <code>string msg = 1;</code>
     */
    public var msg: kotlin.String
      @JvmName("getMsg")
      get() = _builder.getMsg()
      @JvmName("setMsg")
      set(value) {
        _builder.setMsg(value)
      }
    /**
     * <pre>
     * Msg, identified by it's type URL, to grant unrestricted permissions to execute
     * </pre>
     *
     * <code>string msg = 1;</code>
     */
    public fun clearMsg() {
      _builder.clearMsg()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.authz.v1beta1.Authz.GenericAuthorization.copy(block: cosmos.authz.v1beta1.GenericAuthorizationKt.Dsl.() -> kotlin.Unit): cosmos.authz.v1beta1.Authz.GenericAuthorization =
  cosmos.authz.v1beta1.GenericAuthorizationKt.Dsl._create(this.toBuilder()).apply { block() }._build()

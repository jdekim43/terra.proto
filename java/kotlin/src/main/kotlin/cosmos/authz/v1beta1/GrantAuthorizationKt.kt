//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/authz/v1beta1/authz.proto

package cosmos.authz.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun grantAuthorization(block: cosmos.authz.v1beta1.GrantAuthorizationKt.Dsl.() -> kotlin.Unit): cosmos.authz.v1beta1.Authz.GrantAuthorization =
  cosmos.authz.v1beta1.GrantAuthorizationKt.Dsl._create(cosmos.authz.v1beta1.Authz.GrantAuthorization.newBuilder()).apply { block() }._build()
public object GrantAuthorizationKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.authz.v1beta1.Authz.GrantAuthorization.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.authz.v1beta1.Authz.GrantAuthorization.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.authz.v1beta1.Authz.GrantAuthorization = _builder.build()

    /**
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
     * <code>string granter = 1;</code>
     */
    public fun clearGranter() {
      _builder.clearGranter()
    }

    /**
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
     * <code>string grantee = 2;</code>
     */
    public fun clearGrantee() {
      _builder.clearGrantee()
    }

    /**
     * <code>.google.protobuf.Any authorization = 3 [(.cosmos_proto.accepts_interface) = "Authorization"];</code>
     */
    public var authorization: com.google.protobuf.Any
      @JvmName("getAuthorization")
      get() = _builder.getAuthorization()
      @JvmName("setAuthorization")
      set(value) {
        _builder.setAuthorization(value)
      }
    /**
     * <code>.google.protobuf.Any authorization = 3 [(.cosmos_proto.accepts_interface) = "Authorization"];</code>
     */
    public fun clearAuthorization() {
      _builder.clearAuthorization()
    }
    /**
     * <code>.google.protobuf.Any authorization = 3 [(.cosmos_proto.accepts_interface) = "Authorization"];</code>
     * @return Whether the authorization field is set.
     */
    public fun hasAuthorization(): kotlin.Boolean {
      return _builder.hasAuthorization()
    }

    /**
     * <code>.google.protobuf.Timestamp expiration = 4 [(.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public var expiration: com.google.protobuf.Timestamp
      @JvmName("getExpiration")
      get() = _builder.getExpiration()
      @JvmName("setExpiration")
      set(value) {
        _builder.setExpiration(value)
      }
    /**
     * <code>.google.protobuf.Timestamp expiration = 4 [(.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public fun clearExpiration() {
      _builder.clearExpiration()
    }
    /**
     * <code>.google.protobuf.Timestamp expiration = 4 [(.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the expiration field is set.
     */
    public fun hasExpiration(): kotlin.Boolean {
      return _builder.hasExpiration()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.authz.v1beta1.Authz.GrantAuthorization.copy(block: cosmos.authz.v1beta1.GrantAuthorizationKt.Dsl.() -> kotlin.Unit): cosmos.authz.v1beta1.Authz.GrantAuthorization =
  cosmos.authz.v1beta1.GrantAuthorizationKt.Dsl._create(this.toBuilder()).apply { block() }._build()

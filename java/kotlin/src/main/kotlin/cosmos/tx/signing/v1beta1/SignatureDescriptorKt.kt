//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/tx/signing/v1beta1/signing.proto

package cosmos.tx.signing.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun signatureDescriptor(block: cosmos.tx.signing.v1beta1.SignatureDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor =
  cosmos.tx.signing.v1beta1.SignatureDescriptorKt.Dsl._create(cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.newBuilder()).apply { block() }._build()
public object SignatureDescriptorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor = _builder.build()

    /**
     * <pre>
     * public_key is the public key of the signer
     * </pre>
     *
     * <code>.google.protobuf.Any public_key = 1;</code>
     */
    public var publicKey: com.google.protobuf.Any
      @JvmName("getPublicKey")
      get() = _builder.getPublicKey()
      @JvmName("setPublicKey")
      set(value) {
        _builder.setPublicKey(value)
      }
    /**
     * <pre>
     * public_key is the public key of the signer
     * </pre>
     *
     * <code>.google.protobuf.Any public_key = 1;</code>
     */
    public fun clearPublicKey() {
      _builder.clearPublicKey()
    }
    /**
     * <pre>
     * public_key is the public key of the signer
     * </pre>
     *
     * <code>.google.protobuf.Any public_key = 1;</code>
     * @return Whether the publicKey field is set.
     */
    public fun hasPublicKey(): kotlin.Boolean {
      return _builder.hasPublicKey()
    }

    /**
     * <code>.cosmos.tx.signing.v1beta1.SignatureDescriptor.Data data = 2;</code>
     */
    public var data: cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data
      @JvmName("getData")
      get() = _builder.getData()
      @JvmName("setData")
      set(value) {
        _builder.setData(value)
      }
    /**
     * <code>.cosmos.tx.signing.v1beta1.SignatureDescriptor.Data data = 2;</code>
     */
    public fun clearData() {
      _builder.clearData()
    }
    /**
     * <code>.cosmos.tx.signing.v1beta1.SignatureDescriptor.Data data = 2;</code>
     * @return Whether the data field is set.
     */
    public fun hasData(): kotlin.Boolean {
      return _builder.hasData()
    }

    /**
     * <pre>
     * sequence is the sequence of the account, which describes the
     * number of committed transactions signed by a given address. It is used to prevent
     * replay attacks.
     * </pre>
     *
     * <code>uint64 sequence = 3;</code>
     */
    public var sequence: kotlin.Long
      @JvmName("getSequence")
      get() = _builder.getSequence()
      @JvmName("setSequence")
      set(value) {
        _builder.setSequence(value)
      }
    /**
     * <pre>
     * sequence is the sequence of the account, which describes the
     * number of committed transactions signed by a given address. It is used to prevent
     * replay attacks.
     * </pre>
     *
     * <code>uint64 sequence = 3;</code>
     */
    public fun clearSequence() {
      _builder.clearSequence()
    }
  }
  @kotlin.jvm.JvmSynthetic
  public inline fun data(block: cosmos.tx.signing.v1beta1.SignatureDescriptorKt.DataKt.Dsl.() -> kotlin.Unit): cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data =
    cosmos.tx.signing.v1beta1.SignatureDescriptorKt.DataKt.Dsl._create(cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data.newBuilder()).apply { block() }._build()
  public object DataKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data = _builder.build()

      /**
       * <pre>
       * single represents a single signer
       * </pre>
       *
       * <code>.cosmos.tx.signing.v1beta1.SignatureDescriptor.Data.Single single = 1;</code>
       */
      public var single: cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data.Single
        @JvmName("getSingle")
        get() = _builder.getSingle()
        @JvmName("setSingle")
        set(value) {
          _builder.setSingle(value)
        }
      /**
       * <pre>
       * single represents a single signer
       * </pre>
       *
       * <code>.cosmos.tx.signing.v1beta1.SignatureDescriptor.Data.Single single = 1;</code>
       */
      public fun clearSingle() {
        _builder.clearSingle()
      }
      /**
       * <pre>
       * single represents a single signer
       * </pre>
       *
       * <code>.cosmos.tx.signing.v1beta1.SignatureDescriptor.Data.Single single = 1;</code>
       * @return Whether the single field is set.
       */
      public fun hasSingle(): kotlin.Boolean {
        return _builder.hasSingle()
      }

      /**
       * <pre>
       * multi represents a multisig signer
       * </pre>
       *
       * <code>.cosmos.tx.signing.v1beta1.SignatureDescriptor.Data.Multi multi = 2;</code>
       */
      public var multi: cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data.Multi
        @JvmName("getMulti")
        get() = _builder.getMulti()
        @JvmName("setMulti")
        set(value) {
          _builder.setMulti(value)
        }
      /**
       * <pre>
       * multi represents a multisig signer
       * </pre>
       *
       * <code>.cosmos.tx.signing.v1beta1.SignatureDescriptor.Data.Multi multi = 2;</code>
       */
      public fun clearMulti() {
        _builder.clearMulti()
      }
      /**
       * <pre>
       * multi represents a multisig signer
       * </pre>
       *
       * <code>.cosmos.tx.signing.v1beta1.SignatureDescriptor.Data.Multi multi = 2;</code>
       * @return Whether the multi field is set.
       */
      public fun hasMulti(): kotlin.Boolean {
        return _builder.hasMulti()
      }
      public val sumCase: cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data.SumCase
        @JvmName("getSumCase")
        get() = _builder.getSumCase()

      public fun clearSum() {
        _builder.clearSum()
      }
    }
    @kotlin.jvm.JvmSynthetic
    public inline fun single(block: cosmos.tx.signing.v1beta1.SignatureDescriptorKt.DataKt.SingleKt.Dsl.() -> kotlin.Unit): cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data.Single =
      cosmos.tx.signing.v1beta1.SignatureDescriptorKt.DataKt.SingleKt.Dsl._create(cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data.Single.newBuilder()).apply { block() }._build()
    public object SingleKt {
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      @com.google.protobuf.kotlin.ProtoDslMarker
      public class Dsl private constructor(
        private val _builder: cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data.Single.Builder
      ) {
        public companion object {
          @kotlin.jvm.JvmSynthetic
          @kotlin.PublishedApi
          internal fun _create(builder: cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data.Single.Builder): Dsl = Dsl(builder)
        }

        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _build(): cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data.Single = _builder.build()

        /**
         * <pre>
         * mode is the signing mode of the single signer
         * </pre>
         *
         * <code>.cosmos.tx.signing.v1beta1.SignMode mode = 1;</code>
         */
        public var mode: cosmos.tx.signing.v1beta1.Signing.SignMode
          @JvmName("getMode")
          get() = _builder.getMode()
          @JvmName("setMode")
          set(value) {
            _builder.setMode(value)
          }
        /**
         * <pre>
         * mode is the signing mode of the single signer
         * </pre>
         *
         * <code>.cosmos.tx.signing.v1beta1.SignMode mode = 1;</code>
         */
        public fun clearMode() {
          _builder.clearMode()
        }

        /**
         * <pre>
         * signature is the raw signature bytes
         * </pre>
         *
         * <code>bytes signature = 2;</code>
         */
        public var signature: com.google.protobuf.ByteString
          @JvmName("getSignature")
          get() = _builder.getSignature()
          @JvmName("setSignature")
          set(value) {
            _builder.setSignature(value)
          }
        /**
         * <pre>
         * signature is the raw signature bytes
         * </pre>
         *
         * <code>bytes signature = 2;</code>
         */
        public fun clearSignature() {
          _builder.clearSignature()
        }
      }
    }
    @kotlin.jvm.JvmSynthetic
    public inline fun multi(block: cosmos.tx.signing.v1beta1.SignatureDescriptorKt.DataKt.MultiKt.Dsl.() -> kotlin.Unit): cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data.Multi =
      cosmos.tx.signing.v1beta1.SignatureDescriptorKt.DataKt.MultiKt.Dsl._create(cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data.Multi.newBuilder()).apply { block() }._build()
    public object MultiKt {
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      @com.google.protobuf.kotlin.ProtoDslMarker
      public class Dsl private constructor(
        private val _builder: cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data.Multi.Builder
      ) {
        public companion object {
          @kotlin.jvm.JvmSynthetic
          @kotlin.PublishedApi
          internal fun _create(builder: cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data.Multi.Builder): Dsl = Dsl(builder)
        }

        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _build(): cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data.Multi = _builder.build()

        /**
         * <pre>
         * bitarray specifies which keys within the multisig are signing
         * </pre>
         *
         * <code>.cosmos.crypto.multisig.v1beta1.CompactBitArray bitarray = 1;</code>
         */
        public var bitarray: cosmos.crypto.multisig.v1beta1.Multisig.CompactBitArray
          @JvmName("getBitarray")
          get() = _builder.getBitarray()
          @JvmName("setBitarray")
          set(value) {
            _builder.setBitarray(value)
          }
        /**
         * <pre>
         * bitarray specifies which keys within the multisig are signing
         * </pre>
         *
         * <code>.cosmos.crypto.multisig.v1beta1.CompactBitArray bitarray = 1;</code>
         */
        public fun clearBitarray() {
          _builder.clearBitarray()
        }
        /**
         * <pre>
         * bitarray specifies which keys within the multisig are signing
         * </pre>
         *
         * <code>.cosmos.crypto.multisig.v1beta1.CompactBitArray bitarray = 1;</code>
         * @return Whether the bitarray field is set.
         */
        public fun hasBitarray(): kotlin.Boolean {
          return _builder.hasBitarray()
        }

        /**
         * An uninstantiable, behaviorless type to represent the field in
         * generics.
         */
        @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
        public class SignaturesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
        /**
         * <pre>
         * signatures is the signatures of the multi-signature
         * </pre>
         *
         * <code>repeated .cosmos.tx.signing.v1beta1.SignatureDescriptor.Data signatures = 2;</code>
         */
         public val signatures: com.google.protobuf.kotlin.DslList<cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data, SignaturesProxy>
          @kotlin.jvm.JvmSynthetic
          get() = com.google.protobuf.kotlin.DslList(
            _builder.getSignaturesList()
          )
        /**
         * <pre>
         * signatures is the signatures of the multi-signature
         * </pre>
         *
         * <code>repeated .cosmos.tx.signing.v1beta1.SignatureDescriptor.Data signatures = 2;</code>
         * @param value The signatures to add.
         */
        @kotlin.jvm.JvmSynthetic
        @kotlin.jvm.JvmName("addSignatures")
        public fun com.google.protobuf.kotlin.DslList<cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data, SignaturesProxy>.add(value: cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data) {
          _builder.addSignatures(value)
        }/**
         * <pre>
         * signatures is the signatures of the multi-signature
         * </pre>
         *
         * <code>repeated .cosmos.tx.signing.v1beta1.SignatureDescriptor.Data signatures = 2;</code>
         * @param value The signatures to add.
         */
        @kotlin.jvm.JvmSynthetic
        @kotlin.jvm.JvmName("plusAssignSignatures")
        @Suppress("NOTHING_TO_INLINE")
        public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data, SignaturesProxy>.plusAssign(value: cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data) {
          add(value)
        }/**
         * <pre>
         * signatures is the signatures of the multi-signature
         * </pre>
         *
         * <code>repeated .cosmos.tx.signing.v1beta1.SignatureDescriptor.Data signatures = 2;</code>
         * @param values The signatures to add.
         */
        @kotlin.jvm.JvmSynthetic
        @kotlin.jvm.JvmName("addAllSignatures")
        public fun com.google.protobuf.kotlin.DslList<cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data, SignaturesProxy>.addAll(values: kotlin.collections.Iterable<cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data>) {
          _builder.addAllSignatures(values)
        }/**
         * <pre>
         * signatures is the signatures of the multi-signature
         * </pre>
         *
         * <code>repeated .cosmos.tx.signing.v1beta1.SignatureDescriptor.Data signatures = 2;</code>
         * @param values The signatures to add.
         */
        @kotlin.jvm.JvmSynthetic
        @kotlin.jvm.JvmName("plusAssignAllSignatures")
        @Suppress("NOTHING_TO_INLINE")
        public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data, SignaturesProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data>) {
          addAll(values)
        }/**
         * <pre>
         * signatures is the signatures of the multi-signature
         * </pre>
         *
         * <code>repeated .cosmos.tx.signing.v1beta1.SignatureDescriptor.Data signatures = 2;</code>
         * @param index The index to set the value at.
         * @param value The signatures to set.
         */
        @kotlin.jvm.JvmSynthetic
        @kotlin.jvm.JvmName("setSignatures")
        public operator fun com.google.protobuf.kotlin.DslList<cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data, SignaturesProxy>.set(index: kotlin.Int, value: cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data) {
          _builder.setSignatures(index, value)
        }/**
         * <pre>
         * signatures is the signatures of the multi-signature
         * </pre>
         *
         * <code>repeated .cosmos.tx.signing.v1beta1.SignatureDescriptor.Data signatures = 2;</code>
         */
        @kotlin.jvm.JvmSynthetic
        @kotlin.jvm.JvmName("clearSignatures")
        public fun com.google.protobuf.kotlin.DslList<cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data, SignaturesProxy>.clear() {
          _builder.clearSignatures()
        }}
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.copy(block: cosmos.tx.signing.v1beta1.SignatureDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor =
  cosmos.tx.signing.v1beta1.SignatureDescriptorKt.Dsl._create(this.toBuilder()).apply { block() }._build()
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data.copy(block: cosmos.tx.signing.v1beta1.SignatureDescriptorKt.DataKt.Dsl.() -> kotlin.Unit): cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data =
  cosmos.tx.signing.v1beta1.SignatureDescriptorKt.DataKt.Dsl._create(this.toBuilder()).apply { block() }._build()
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data.Single.copy(block: cosmos.tx.signing.v1beta1.SignatureDescriptorKt.DataKt.SingleKt.Dsl.() -> kotlin.Unit): cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data.Single =
  cosmos.tx.signing.v1beta1.SignatureDescriptorKt.DataKt.SingleKt.Dsl._create(this.toBuilder()).apply { block() }._build()
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data.Multi.copy(block: cosmos.tx.signing.v1beta1.SignatureDescriptorKt.DataKt.MultiKt.Dsl.() -> kotlin.Unit): cosmos.tx.signing.v1beta1.Signing.SignatureDescriptor.Data.Multi =
  cosmos.tx.signing.v1beta1.SignatureDescriptorKt.DataKt.MultiKt.Dsl._create(this.toBuilder()).apply { block() }._build()

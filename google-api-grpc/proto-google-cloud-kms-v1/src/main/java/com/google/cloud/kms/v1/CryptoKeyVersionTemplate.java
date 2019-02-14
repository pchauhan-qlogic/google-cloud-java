// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/resources.proto

package com.google.cloud.kms.v1;

/**
 *
 *
 * <pre>
 * A [CryptoKeyVersionTemplate][google.cloud.kms.v1.CryptoKeyVersionTemplate] specifies the properties to use when creating
 * a new [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion], either manually with
 * [CreateCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.CreateCryptoKeyVersion] or
 * automatically as a result of auto-rotation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.kms.v1.CryptoKeyVersionTemplate}
 */
public final class CryptoKeyVersionTemplate extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.kms.v1.CryptoKeyVersionTemplate)
    CryptoKeyVersionTemplateOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CryptoKeyVersionTemplate.newBuilder() to construct.
  private CryptoKeyVersionTemplate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CryptoKeyVersionTemplate() {
    protectionLevel_ = 0;
    algorithm_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CryptoKeyVersionTemplate(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8:
            {
              int rawValue = input.readEnum();

              protectionLevel_ = rawValue;
              break;
            }
          case 24:
            {
              int rawValue = input.readEnum();

              algorithm_ = rawValue;
              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.kms.v1.KmsResourcesProto
        .internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.kms.v1.KmsResourcesProto
        .internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.kms.v1.CryptoKeyVersionTemplate.class,
            com.google.cloud.kms.v1.CryptoKeyVersionTemplate.Builder.class);
  }

  public static final int PROTECTION_LEVEL_FIELD_NUMBER = 1;
  private int protectionLevel_;
  /**
   *
   *
   * <pre>
   * [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] to use when creating a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] based on
   * this template. Immutable. Defaults to [SOFTWARE][google.cloud.kms.v1.ProtectionLevel.SOFTWARE].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 1;</code>
   */
  public int getProtectionLevelValue() {
    return protectionLevel_;
  }
  /**
   *
   *
   * <pre>
   * [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] to use when creating a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] based on
   * this template. Immutable. Defaults to [SOFTWARE][google.cloud.kms.v1.ProtectionLevel.SOFTWARE].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 1;</code>
   */
  public com.google.cloud.kms.v1.ProtectionLevel getProtectionLevel() {
    @SuppressWarnings("deprecation")
    com.google.cloud.kms.v1.ProtectionLevel result =
        com.google.cloud.kms.v1.ProtectionLevel.valueOf(protectionLevel_);
    return result == null ? com.google.cloud.kms.v1.ProtectionLevel.UNRECOGNIZED : result;
  }

  public static final int ALGORITHM_FIELD_NUMBER = 3;
  private int algorithm_;
  /**
   *
   *
   * <pre>
   * Required. [Algorithm][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm] to use
   * when creating a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] based on this template.
   * For backwards compatibility, GOOGLE_SYMMETRIC_ENCRYPTION is implied if both
   * this field is omitted and [CryptoKey.purpose][google.cloud.kms.v1.CryptoKey.purpose] is
   * [ENCRYPT_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm algorithm = 3;</code>
   */
  public int getAlgorithmValue() {
    return algorithm_;
  }
  /**
   *
   *
   * <pre>
   * Required. [Algorithm][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm] to use
   * when creating a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] based on this template.
   * For backwards compatibility, GOOGLE_SYMMETRIC_ENCRYPTION is implied if both
   * this field is omitted and [CryptoKey.purpose][google.cloud.kms.v1.CryptoKey.purpose] is
   * [ENCRYPT_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm algorithm = 3;</code>
   */
  public com.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm getAlgorithm() {
    @SuppressWarnings("deprecation")
    com.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm result =
        com.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm.valueOf(algorithm_);
    return result == null
        ? com.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm.UNRECOGNIZED
        : result;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (protectionLevel_
        != com.google.cloud.kms.v1.ProtectionLevel.PROTECTION_LEVEL_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, protectionLevel_);
    }
    if (algorithm_
        != com.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm
            .CRYPTO_KEY_VERSION_ALGORITHM_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, algorithm_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (protectionLevel_
        != com.google.cloud.kms.v1.ProtectionLevel.PROTECTION_LEVEL_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, protectionLevel_);
    }
    if (algorithm_
        != com.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm
            .CRYPTO_KEY_VERSION_ALGORITHM_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, algorithm_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.kms.v1.CryptoKeyVersionTemplate)) {
      return super.equals(obj);
    }
    com.google.cloud.kms.v1.CryptoKeyVersionTemplate other =
        (com.google.cloud.kms.v1.CryptoKeyVersionTemplate) obj;

    boolean result = true;
    result = result && protectionLevel_ == other.protectionLevel_;
    result = result && algorithm_ == other.algorithm_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PROTECTION_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + protectionLevel_;
    hash = (37 * hash) + ALGORITHM_FIELD_NUMBER;
    hash = (53 * hash) + algorithm_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.kms.v1.CryptoKeyVersionTemplate parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.CryptoKeyVersionTemplate parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CryptoKeyVersionTemplate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.CryptoKeyVersionTemplate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CryptoKeyVersionTemplate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.CryptoKeyVersionTemplate parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CryptoKeyVersionTemplate parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.CryptoKeyVersionTemplate parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CryptoKeyVersionTemplate parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.CryptoKeyVersionTemplate parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CryptoKeyVersionTemplate parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.CryptoKeyVersionTemplate parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.kms.v1.CryptoKeyVersionTemplate prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A [CryptoKeyVersionTemplate][google.cloud.kms.v1.CryptoKeyVersionTemplate] specifies the properties to use when creating
   * a new [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion], either manually with
   * [CreateCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.CreateCryptoKeyVersion] or
   * automatically as a result of auto-rotation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.kms.v1.CryptoKeyVersionTemplate}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.kms.v1.CryptoKeyVersionTemplate)
      com.google.cloud.kms.v1.CryptoKeyVersionTemplateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.kms.v1.KmsResourcesProto
          .internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.kms.v1.KmsResourcesProto
          .internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.kms.v1.CryptoKeyVersionTemplate.class,
              com.google.cloud.kms.v1.CryptoKeyVersionTemplate.Builder.class);
    }

    // Construct using com.google.cloud.kms.v1.CryptoKeyVersionTemplate.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      protectionLevel_ = 0;

      algorithm_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.kms.v1.KmsResourcesProto
          .internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.CryptoKeyVersionTemplate getDefaultInstanceForType() {
      return com.google.cloud.kms.v1.CryptoKeyVersionTemplate.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.CryptoKeyVersionTemplate build() {
      com.google.cloud.kms.v1.CryptoKeyVersionTemplate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.CryptoKeyVersionTemplate buildPartial() {
      com.google.cloud.kms.v1.CryptoKeyVersionTemplate result =
          new com.google.cloud.kms.v1.CryptoKeyVersionTemplate(this);
      result.protectionLevel_ = protectionLevel_;
      result.algorithm_ = algorithm_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.kms.v1.CryptoKeyVersionTemplate) {
        return mergeFrom((com.google.cloud.kms.v1.CryptoKeyVersionTemplate) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.kms.v1.CryptoKeyVersionTemplate other) {
      if (other == com.google.cloud.kms.v1.CryptoKeyVersionTemplate.getDefaultInstance())
        return this;
      if (other.protectionLevel_ != 0) {
        setProtectionLevelValue(other.getProtectionLevelValue());
      }
      if (other.algorithm_ != 0) {
        setAlgorithmValue(other.getAlgorithmValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.kms.v1.CryptoKeyVersionTemplate parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.kms.v1.CryptoKeyVersionTemplate) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int protectionLevel_ = 0;
    /**
     *
     *
     * <pre>
     * [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] to use when creating a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] based on
     * this template. Immutable. Defaults to [SOFTWARE][google.cloud.kms.v1.ProtectionLevel.SOFTWARE].
     * </pre>
     *
     * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 1;</code>
     */
    public int getProtectionLevelValue() {
      return protectionLevel_;
    }
    /**
     *
     *
     * <pre>
     * [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] to use when creating a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] based on
     * this template. Immutable. Defaults to [SOFTWARE][google.cloud.kms.v1.ProtectionLevel.SOFTWARE].
     * </pre>
     *
     * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 1;</code>
     */
    public Builder setProtectionLevelValue(int value) {
      protectionLevel_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] to use when creating a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] based on
     * this template. Immutable. Defaults to [SOFTWARE][google.cloud.kms.v1.ProtectionLevel.SOFTWARE].
     * </pre>
     *
     * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 1;</code>
     */
    public com.google.cloud.kms.v1.ProtectionLevel getProtectionLevel() {
      @SuppressWarnings("deprecation")
      com.google.cloud.kms.v1.ProtectionLevel result =
          com.google.cloud.kms.v1.ProtectionLevel.valueOf(protectionLevel_);
      return result == null ? com.google.cloud.kms.v1.ProtectionLevel.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] to use when creating a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] based on
     * this template. Immutable. Defaults to [SOFTWARE][google.cloud.kms.v1.ProtectionLevel.SOFTWARE].
     * </pre>
     *
     * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 1;</code>
     */
    public Builder setProtectionLevel(com.google.cloud.kms.v1.ProtectionLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }

      protectionLevel_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] to use when creating a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] based on
     * this template. Immutable. Defaults to [SOFTWARE][google.cloud.kms.v1.ProtectionLevel.SOFTWARE].
     * </pre>
     *
     * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 1;</code>
     */
    public Builder clearProtectionLevel() {

      protectionLevel_ = 0;
      onChanged();
      return this;
    }

    private int algorithm_ = 0;
    /**
     *
     *
     * <pre>
     * Required. [Algorithm][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm] to use
     * when creating a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] based on this template.
     * For backwards compatibility, GOOGLE_SYMMETRIC_ENCRYPTION is implied if both
     * this field is omitted and [CryptoKey.purpose][google.cloud.kms.v1.CryptoKey.purpose] is
     * [ENCRYPT_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT].
     * </pre>
     *
     * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm algorithm = 3;</code>
     */
    public int getAlgorithmValue() {
      return algorithm_;
    }
    /**
     *
     *
     * <pre>
     * Required. [Algorithm][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm] to use
     * when creating a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] based on this template.
     * For backwards compatibility, GOOGLE_SYMMETRIC_ENCRYPTION is implied if both
     * this field is omitted and [CryptoKey.purpose][google.cloud.kms.v1.CryptoKey.purpose] is
     * [ENCRYPT_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT].
     * </pre>
     *
     * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm algorithm = 3;</code>
     */
    public Builder setAlgorithmValue(int value) {
      algorithm_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. [Algorithm][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm] to use
     * when creating a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] based on this template.
     * For backwards compatibility, GOOGLE_SYMMETRIC_ENCRYPTION is implied if both
     * this field is omitted and [CryptoKey.purpose][google.cloud.kms.v1.CryptoKey.purpose] is
     * [ENCRYPT_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT].
     * </pre>
     *
     * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm algorithm = 3;</code>
     */
    public com.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm getAlgorithm() {
      @SuppressWarnings("deprecation")
      com.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm result =
          com.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm.valueOf(algorithm_);
      return result == null
          ? com.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Required. [Algorithm][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm] to use
     * when creating a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] based on this template.
     * For backwards compatibility, GOOGLE_SYMMETRIC_ENCRYPTION is implied if both
     * this field is omitted and [CryptoKey.purpose][google.cloud.kms.v1.CryptoKey.purpose] is
     * [ENCRYPT_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT].
     * </pre>
     *
     * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm algorithm = 3;</code>
     */
    public Builder setAlgorithm(
        com.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm value) {
      if (value == null) {
        throw new NullPointerException();
      }

      algorithm_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. [Algorithm][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm] to use
     * when creating a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] based on this template.
     * For backwards compatibility, GOOGLE_SYMMETRIC_ENCRYPTION is implied if both
     * this field is omitted and [CryptoKey.purpose][google.cloud.kms.v1.CryptoKey.purpose] is
     * [ENCRYPT_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT].
     * </pre>
     *
     * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm algorithm = 3;</code>
     */
    public Builder clearAlgorithm() {

      algorithm_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.kms.v1.CryptoKeyVersionTemplate)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.kms.v1.CryptoKeyVersionTemplate)
  private static final com.google.cloud.kms.v1.CryptoKeyVersionTemplate DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.kms.v1.CryptoKeyVersionTemplate();
  }

  public static com.google.cloud.kms.v1.CryptoKeyVersionTemplate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CryptoKeyVersionTemplate> PARSER =
      new com.google.protobuf.AbstractParser<CryptoKeyVersionTemplate>() {
        @java.lang.Override
        public CryptoKeyVersionTemplate parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CryptoKeyVersionTemplate(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CryptoKeyVersionTemplate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CryptoKeyVersionTemplate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.kms.v1.CryptoKeyVersionTemplate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
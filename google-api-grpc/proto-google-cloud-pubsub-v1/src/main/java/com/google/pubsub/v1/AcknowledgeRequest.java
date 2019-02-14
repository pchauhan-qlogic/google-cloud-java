// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

/**
 *
 *
 * <pre>
 * Request for the Acknowledge method.
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1.AcknowledgeRequest}
 */
public final class AcknowledgeRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.AcknowledgeRequest)
    AcknowledgeRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AcknowledgeRequest.newBuilder() to construct.
  private AcknowledgeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AcknowledgeRequest() {
    subscription_ = "";
    ackIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AcknowledgeRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              subscription_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                ackIds_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              ackIds_.add(s);
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        ackIds_ = ackIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_AcknowledgeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_AcknowledgeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.AcknowledgeRequest.class,
            com.google.pubsub.v1.AcknowledgeRequest.Builder.class);
  }

  private int bitField0_;
  public static final int SUBSCRIPTION_FIELD_NUMBER = 1;
  private volatile java.lang.Object subscription_;
  /**
   *
   *
   * <pre>
   * The subscription whose message is being acknowledged.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   */
  public java.lang.String getSubscription() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subscription_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The subscription whose message is being acknowledged.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   */
  public com.google.protobuf.ByteString getSubscriptionBytes() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      subscription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACK_IDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList ackIds_;
  /**
   *
   *
   * <pre>
   * The acknowledgment ID for the messages being acknowledged that was returned
   * by the Pub/Sub system in the `Pull` response. Must not be empty.
   * </pre>
   *
   * <code>repeated string ack_ids = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList getAckIdsList() {
    return ackIds_;
  }
  /**
   *
   *
   * <pre>
   * The acknowledgment ID for the messages being acknowledged that was returned
   * by the Pub/Sub system in the `Pull` response. Must not be empty.
   * </pre>
   *
   * <code>repeated string ack_ids = 2;</code>
   */
  public int getAckIdsCount() {
    return ackIds_.size();
  }
  /**
   *
   *
   * <pre>
   * The acknowledgment ID for the messages being acknowledged that was returned
   * by the Pub/Sub system in the `Pull` response. Must not be empty.
   * </pre>
   *
   * <code>repeated string ack_ids = 2;</code>
   */
  public java.lang.String getAckIds(int index) {
    return ackIds_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The acknowledgment ID for the messages being acknowledged that was returned
   * by the Pub/Sub system in the `Pull` response. Must not be empty.
   * </pre>
   *
   * <code>repeated string ack_ids = 2;</code>
   */
  public com.google.protobuf.ByteString getAckIdsBytes(int index) {
    return ackIds_.getByteString(index);
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
    if (!getSubscriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, subscription_);
    }
    for (int i = 0; i < ackIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ackIds_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSubscriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, subscription_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < ackIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(ackIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAckIdsList().size();
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
    if (!(obj instanceof com.google.pubsub.v1.AcknowledgeRequest)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.AcknowledgeRequest other = (com.google.pubsub.v1.AcknowledgeRequest) obj;

    boolean result = true;
    result = result && getSubscription().equals(other.getSubscription());
    result = result && getAckIdsList().equals(other.getAckIdsList());
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
    hash = (37 * hash) + SUBSCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getSubscription().hashCode();
    if (getAckIdsCount() > 0) {
      hash = (37 * hash) + ACK_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getAckIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.AcknowledgeRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.AcknowledgeRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.AcknowledgeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.AcknowledgeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.AcknowledgeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.AcknowledgeRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.AcknowledgeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.AcknowledgeRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.AcknowledgeRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.AcknowledgeRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.AcknowledgeRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.AcknowledgeRequest parseFrom(
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

  public static Builder newBuilder(com.google.pubsub.v1.AcknowledgeRequest prototype) {
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
   * Request for the Acknowledge method.
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1.AcknowledgeRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.AcknowledgeRequest)
      com.google.pubsub.v1.AcknowledgeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_AcknowledgeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_AcknowledgeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.AcknowledgeRequest.class,
              com.google.pubsub.v1.AcknowledgeRequest.Builder.class);
    }

    // Construct using com.google.pubsub.v1.AcknowledgeRequest.newBuilder()
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
      subscription_ = "";

      ackIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_AcknowledgeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.pubsub.v1.AcknowledgeRequest getDefaultInstanceForType() {
      return com.google.pubsub.v1.AcknowledgeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.pubsub.v1.AcknowledgeRequest build() {
      com.google.pubsub.v1.AcknowledgeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.pubsub.v1.AcknowledgeRequest buildPartial() {
      com.google.pubsub.v1.AcknowledgeRequest result =
          new com.google.pubsub.v1.AcknowledgeRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.subscription_ = subscription_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        ackIds_ = ackIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.ackIds_ = ackIds_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.pubsub.v1.AcknowledgeRequest) {
        return mergeFrom((com.google.pubsub.v1.AcknowledgeRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.AcknowledgeRequest other) {
      if (other == com.google.pubsub.v1.AcknowledgeRequest.getDefaultInstance()) return this;
      if (!other.getSubscription().isEmpty()) {
        subscription_ = other.subscription_;
        onChanged();
      }
      if (!other.ackIds_.isEmpty()) {
        if (ackIds_.isEmpty()) {
          ackIds_ = other.ackIds_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureAckIdsIsMutable();
          ackIds_.addAll(other.ackIds_);
        }
        onChanged();
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
      com.google.pubsub.v1.AcknowledgeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.pubsub.v1.AcknowledgeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object subscription_ = "";
    /**
     *
     *
     * <pre>
     * The subscription whose message is being acknowledged.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     */
    public java.lang.String getSubscription() {
      java.lang.Object ref = subscription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subscription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The subscription whose message is being acknowledged.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     */
    public com.google.protobuf.ByteString getSubscriptionBytes() {
      java.lang.Object ref = subscription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        subscription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The subscription whose message is being acknowledged.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     */
    public Builder setSubscription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      subscription_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The subscription whose message is being acknowledged.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     */
    public Builder clearSubscription() {

      subscription_ = getDefaultInstance().getSubscription();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The subscription whose message is being acknowledged.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     */
    public Builder setSubscriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      subscription_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList ackIds_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureAckIdsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        ackIds_ = new com.google.protobuf.LazyStringArrayList(ackIds_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     *
     *
     * <pre>
     * The acknowledgment ID for the messages being acknowledged that was returned
     * by the Pub/Sub system in the `Pull` response. Must not be empty.
     * </pre>
     *
     * <code>repeated string ack_ids = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList getAckIdsList() {
      return ackIds_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * The acknowledgment ID for the messages being acknowledged that was returned
     * by the Pub/Sub system in the `Pull` response. Must not be empty.
     * </pre>
     *
     * <code>repeated string ack_ids = 2;</code>
     */
    public int getAckIdsCount() {
      return ackIds_.size();
    }
    /**
     *
     *
     * <pre>
     * The acknowledgment ID for the messages being acknowledged that was returned
     * by the Pub/Sub system in the `Pull` response. Must not be empty.
     * </pre>
     *
     * <code>repeated string ack_ids = 2;</code>
     */
    public java.lang.String getAckIds(int index) {
      return ackIds_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The acknowledgment ID for the messages being acknowledged that was returned
     * by the Pub/Sub system in the `Pull` response. Must not be empty.
     * </pre>
     *
     * <code>repeated string ack_ids = 2;</code>
     */
    public com.google.protobuf.ByteString getAckIdsBytes(int index) {
      return ackIds_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The acknowledgment ID for the messages being acknowledged that was returned
     * by the Pub/Sub system in the `Pull` response. Must not be empty.
     * </pre>
     *
     * <code>repeated string ack_ids = 2;</code>
     */
    public Builder setAckIds(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAckIdsIsMutable();
      ackIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The acknowledgment ID for the messages being acknowledged that was returned
     * by the Pub/Sub system in the `Pull` response. Must not be empty.
     * </pre>
     *
     * <code>repeated string ack_ids = 2;</code>
     */
    public Builder addAckIds(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAckIdsIsMutable();
      ackIds_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The acknowledgment ID for the messages being acknowledged that was returned
     * by the Pub/Sub system in the `Pull` response. Must not be empty.
     * </pre>
     *
     * <code>repeated string ack_ids = 2;</code>
     */
    public Builder addAllAckIds(java.lang.Iterable<java.lang.String> values) {
      ensureAckIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, ackIds_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The acknowledgment ID for the messages being acknowledged that was returned
     * by the Pub/Sub system in the `Pull` response. Must not be empty.
     * </pre>
     *
     * <code>repeated string ack_ids = 2;</code>
     */
    public Builder clearAckIds() {
      ackIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The acknowledgment ID for the messages being acknowledged that was returned
     * by the Pub/Sub system in the `Pull` response. Must not be empty.
     * </pre>
     *
     * <code>repeated string ack_ids = 2;</code>
     */
    public Builder addAckIdsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureAckIdsIsMutable();
      ackIds_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.AcknowledgeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1.AcknowledgeRequest)
  private static final com.google.pubsub.v1.AcknowledgeRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.AcknowledgeRequest();
  }

  public static com.google.pubsub.v1.AcknowledgeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AcknowledgeRequest> PARSER =
      new com.google.protobuf.AbstractParser<AcknowledgeRequest>() {
        @java.lang.Override
        public AcknowledgeRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AcknowledgeRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AcknowledgeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AcknowledgeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.pubsub.v1.AcknowledgeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
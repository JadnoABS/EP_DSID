// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sample.proto

package generated;

/**
 * Protobuf type {@code proto.ThirdDegreeRoot}
 */
public  final class ThirdDegreeRoot extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.ThirdDegreeRoot)
    ThirdDegreeRootOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ThirdDegreeRoot.newBuilder() to construct.
  private ThirdDegreeRoot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ThirdDegreeRoot() {
    x1_ = "";
    x2_ = "";
    x3_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ThirdDegreeRoot();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ThirdDegreeRoot(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            x1_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            x2_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            x3_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return generated.Proto.internal_static_proto_ThirdDegreeRoot_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.Proto.internal_static_proto_ThirdDegreeRoot_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.ThirdDegreeRoot.class, generated.ThirdDegreeRoot.Builder.class);
  }

  public static final int X1_FIELD_NUMBER = 1;
  private volatile java.lang.Object x1_;
  /**
   * <code>string x1 = 1;</code>
   * @return The x1.
   */
  public java.lang.String getX1() {
    java.lang.Object ref = x1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      x1_ = s;
      return s;
    }
  }
  /**
   * <code>string x1 = 1;</code>
   * @return The bytes for x1.
   */
  public com.google.protobuf.ByteString
      getX1Bytes() {
    java.lang.Object ref = x1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      x1_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int X2_FIELD_NUMBER = 2;
  private volatile java.lang.Object x2_;
  /**
   * <code>string x2 = 2;</code>
   * @return The x2.
   */
  public java.lang.String getX2() {
    java.lang.Object ref = x2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      x2_ = s;
      return s;
    }
  }
  /**
   * <code>string x2 = 2;</code>
   * @return The bytes for x2.
   */
  public com.google.protobuf.ByteString
      getX2Bytes() {
    java.lang.Object ref = x2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      x2_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int X3_FIELD_NUMBER = 3;
  private volatile java.lang.Object x3_;
  /**
   * <code>string x3 = 3;</code>
   * @return The x3.
   */
  public java.lang.String getX3() {
    java.lang.Object ref = x3_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      x3_ = s;
      return s;
    }
  }
  /**
   * <code>string x3 = 3;</code>
   * @return The bytes for x3.
   */
  public com.google.protobuf.ByteString
      getX3Bytes() {
    java.lang.Object ref = x3_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      x3_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getX1Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, x1_);
    }
    if (!getX2Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, x2_);
    }
    if (!getX3Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, x3_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getX1Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, x1_);
    }
    if (!getX2Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, x2_);
    }
    if (!getX3Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, x3_);
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
    if (!(obj instanceof generated.ThirdDegreeRoot)) {
      return super.equals(obj);
    }
    generated.ThirdDegreeRoot other = (generated.ThirdDegreeRoot) obj;

    if (!getX1()
        .equals(other.getX1())) return false;
    if (!getX2()
        .equals(other.getX2())) return false;
    if (!getX3()
        .equals(other.getX3())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + X1_FIELD_NUMBER;
    hash = (53 * hash) + getX1().hashCode();
    hash = (37 * hash) + X2_FIELD_NUMBER;
    hash = (53 * hash) + getX2().hashCode();
    hash = (37 * hash) + X3_FIELD_NUMBER;
    hash = (53 * hash) + getX3().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.ThirdDegreeRoot parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.ThirdDegreeRoot parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.ThirdDegreeRoot parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.ThirdDegreeRoot parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.ThirdDegreeRoot parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.ThirdDegreeRoot parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.ThirdDegreeRoot parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.ThirdDegreeRoot parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.ThirdDegreeRoot parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.ThirdDegreeRoot parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.ThirdDegreeRoot parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.ThirdDegreeRoot parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(generated.ThirdDegreeRoot prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code proto.ThirdDegreeRoot}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.ThirdDegreeRoot)
      generated.ThirdDegreeRootOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.Proto.internal_static_proto_ThirdDegreeRoot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.Proto.internal_static_proto_ThirdDegreeRoot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.ThirdDegreeRoot.class, generated.ThirdDegreeRoot.Builder.class);
    }

    // Construct using generated.ThirdDegreeRoot.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      x1_ = "";

      x2_ = "";

      x3_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.Proto.internal_static_proto_ThirdDegreeRoot_descriptor;
    }

    @java.lang.Override
    public generated.ThirdDegreeRoot getDefaultInstanceForType() {
      return generated.ThirdDegreeRoot.getDefaultInstance();
    }

    @java.lang.Override
    public generated.ThirdDegreeRoot build() {
      generated.ThirdDegreeRoot result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.ThirdDegreeRoot buildPartial() {
      generated.ThirdDegreeRoot result = new generated.ThirdDegreeRoot(this);
      result.x1_ = x1_;
      result.x2_ = x2_;
      result.x3_ = x3_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof generated.ThirdDegreeRoot) {
        return mergeFrom((generated.ThirdDegreeRoot)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.ThirdDegreeRoot other) {
      if (other == generated.ThirdDegreeRoot.getDefaultInstance()) return this;
      if (!other.getX1().isEmpty()) {
        x1_ = other.x1_;
        onChanged();
      }
      if (!other.getX2().isEmpty()) {
        x2_ = other.x2_;
        onChanged();
      }
      if (!other.getX3().isEmpty()) {
        x3_ = other.x3_;
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
      generated.ThirdDegreeRoot parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.ThirdDegreeRoot) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object x1_ = "";
    /**
     * <code>string x1 = 1;</code>
     * @return The x1.
     */
    public java.lang.String getX1() {
      java.lang.Object ref = x1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        x1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string x1 = 1;</code>
     * @return The bytes for x1.
     */
    public com.google.protobuf.ByteString
        getX1Bytes() {
      java.lang.Object ref = x1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        x1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string x1 = 1;</code>
     * @param value The x1 to set.
     * @return This builder for chaining.
     */
    public Builder setX1(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      x1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string x1 = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearX1() {
      
      x1_ = getDefaultInstance().getX1();
      onChanged();
      return this;
    }
    /**
     * <code>string x1 = 1;</code>
     * @param value The bytes for x1 to set.
     * @return This builder for chaining.
     */
    public Builder setX1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      x1_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object x2_ = "";
    /**
     * <code>string x2 = 2;</code>
     * @return The x2.
     */
    public java.lang.String getX2() {
      java.lang.Object ref = x2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        x2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string x2 = 2;</code>
     * @return The bytes for x2.
     */
    public com.google.protobuf.ByteString
        getX2Bytes() {
      java.lang.Object ref = x2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        x2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string x2 = 2;</code>
     * @param value The x2 to set.
     * @return This builder for chaining.
     */
    public Builder setX2(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      x2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string x2 = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearX2() {
      
      x2_ = getDefaultInstance().getX2();
      onChanged();
      return this;
    }
    /**
     * <code>string x2 = 2;</code>
     * @param value The bytes for x2 to set.
     * @return This builder for chaining.
     */
    public Builder setX2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      x2_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object x3_ = "";
    /**
     * <code>string x3 = 3;</code>
     * @return The x3.
     */
    public java.lang.String getX3() {
      java.lang.Object ref = x3_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        x3_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string x3 = 3;</code>
     * @return The bytes for x3.
     */
    public com.google.protobuf.ByteString
        getX3Bytes() {
      java.lang.Object ref = x3_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        x3_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string x3 = 3;</code>
     * @param value The x3 to set.
     * @return This builder for chaining.
     */
    public Builder setX3(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      x3_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string x3 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearX3() {
      
      x3_ = getDefaultInstance().getX3();
      onChanged();
      return this;
    }
    /**
     * <code>string x3 = 3;</code>
     * @param value The bytes for x3 to set.
     * @return This builder for chaining.
     */
    public Builder setX3Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      x3_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto.ThirdDegreeRoot)
  }

  // @@protoc_insertion_point(class_scope:proto.ThirdDegreeRoot)
  private static final generated.ThirdDegreeRoot DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.ThirdDegreeRoot();
  }

  public static generated.ThirdDegreeRoot getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThirdDegreeRoot>
      PARSER = new com.google.protobuf.AbstractParser<ThirdDegreeRoot>() {
    @java.lang.Override
    public ThirdDegreeRoot parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ThirdDegreeRoot(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ThirdDegreeRoot> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThirdDegreeRoot> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.ThirdDegreeRoot getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


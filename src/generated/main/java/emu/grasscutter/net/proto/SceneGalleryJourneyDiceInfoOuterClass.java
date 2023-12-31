// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryJourneyDiceInfo.proto

package emu.grasscutter.net.proto;

public final class SceneGalleryJourneyDiceInfoOuterClass {
  private SceneGalleryJourneyDiceInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryJourneyDiceInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryJourneyDiceInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 score = 9;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>repeated uint32 GBOHILEAPIM = 15;</code>
     * @return A list containing the gBOHILEAPIM.
     */
    java.util.List<java.lang.Integer> getGBOHILEAPIMList();
    /**
     * <code>repeated uint32 GBOHILEAPIM = 15;</code>
     * @return The count of gBOHILEAPIM.
     */
    int getGBOHILEAPIMCount();
    /**
     * <code>repeated uint32 GBOHILEAPIM = 15;</code>
     * @param index The index of the element to return.
     * @return The gBOHILEAPIM at the given index.
     */
    int getGBOHILEAPIM(int index);

    /**
     * <code>uint32 DEJJPIOCJDD = 4;</code>
     * @return The dEJJPIOCJDD.
     */
    int getDEJJPIOCJDD();

    /**
     * <code>uint32 AHOADFMAPLB = 3;</code>
     * @return The aHOADFMAPLB.
     */
    int getAHOADFMAPLB();
  }
  /**
   * <pre>
   * Obf: MHEDFFJMDGE
   * </pre>
   *
   * Protobuf type {@code SceneGalleryJourneyDiceInfo}
   */
  public static final class SceneGalleryJourneyDiceInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryJourneyDiceInfo)
      SceneGalleryJourneyDiceInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryJourneyDiceInfo.newBuilder() to construct.
    private SceneGalleryJourneyDiceInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryJourneyDiceInfo() {
      gBOHILEAPIM_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryJourneyDiceInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryJourneyDiceInfo(
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
            case 24: {

              aHOADFMAPLB_ = input.readUInt32();
              break;
            }
            case 32: {

              dEJJPIOCJDD_ = input.readUInt32();
              break;
            }
            case 72: {

              score_ = input.readUInt32();
              break;
            }
            case 120: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                gBOHILEAPIM_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              gBOHILEAPIM_.addInt(input.readUInt32());
              break;
            }
            case 122: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                gBOHILEAPIM_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                gBOHILEAPIM_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          gBOHILEAPIM_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.internal_static_SceneGalleryJourneyDiceInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.internal_static_SceneGalleryJourneyDiceInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo.class, emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo.Builder.class);
    }

    public static final int SCORE_FIELD_NUMBER = 9;
    private int score_;
    /**
     * <code>uint32 score = 9;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int GBOHILEAPIM_FIELD_NUMBER = 15;
    private com.google.protobuf.Internal.IntList gBOHILEAPIM_;
    /**
     * <code>repeated uint32 GBOHILEAPIM = 15;</code>
     * @return A list containing the gBOHILEAPIM.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getGBOHILEAPIMList() {
      return gBOHILEAPIM_;
    }
    /**
     * <code>repeated uint32 GBOHILEAPIM = 15;</code>
     * @return The count of gBOHILEAPIM.
     */
    public int getGBOHILEAPIMCount() {
      return gBOHILEAPIM_.size();
    }
    /**
     * <code>repeated uint32 GBOHILEAPIM = 15;</code>
     * @param index The index of the element to return.
     * @return The gBOHILEAPIM at the given index.
     */
    public int getGBOHILEAPIM(int index) {
      return gBOHILEAPIM_.getInt(index);
    }
    private int gBOHILEAPIMMemoizedSerializedSize = -1;

    public static final int DEJJPIOCJDD_FIELD_NUMBER = 4;
    private int dEJJPIOCJDD_;
    /**
     * <code>uint32 DEJJPIOCJDD = 4;</code>
     * @return The dEJJPIOCJDD.
     */
    @java.lang.Override
    public int getDEJJPIOCJDD() {
      return dEJJPIOCJDD_;
    }

    public static final int AHOADFMAPLB_FIELD_NUMBER = 3;
    private int aHOADFMAPLB_;
    /**
     * <code>uint32 AHOADFMAPLB = 3;</code>
     * @return The aHOADFMAPLB.
     */
    @java.lang.Override
    public int getAHOADFMAPLB() {
      return aHOADFMAPLB_;
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
      getSerializedSize();
      if (aHOADFMAPLB_ != 0) {
        output.writeUInt32(3, aHOADFMAPLB_);
      }
      if (dEJJPIOCJDD_ != 0) {
        output.writeUInt32(4, dEJJPIOCJDD_);
      }
      if (score_ != 0) {
        output.writeUInt32(9, score_);
      }
      if (getGBOHILEAPIMList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(gBOHILEAPIMMemoizedSerializedSize);
      }
      for (int i = 0; i < gBOHILEAPIM_.size(); i++) {
        output.writeUInt32NoTag(gBOHILEAPIM_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (aHOADFMAPLB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, aHOADFMAPLB_);
      }
      if (dEJJPIOCJDD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, dEJJPIOCJDD_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, score_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < gBOHILEAPIM_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(gBOHILEAPIM_.getInt(i));
        }
        size += dataSize;
        if (!getGBOHILEAPIMList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        gBOHILEAPIMMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo other = (emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo) obj;

      if (getScore()
          != other.getScore()) return false;
      if (!getGBOHILEAPIMList()
          .equals(other.getGBOHILEAPIMList())) return false;
      if (getDEJJPIOCJDD()
          != other.getDEJJPIOCJDD()) return false;
      if (getAHOADFMAPLB()
          != other.getAHOADFMAPLB()) return false;
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
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      if (getGBOHILEAPIMCount() > 0) {
        hash = (37 * hash) + GBOHILEAPIM_FIELD_NUMBER;
        hash = (53 * hash) + getGBOHILEAPIMList().hashCode();
      }
      hash = (37 * hash) + DEJJPIOCJDD_FIELD_NUMBER;
      hash = (53 * hash) + getDEJJPIOCJDD();
      hash = (37 * hash) + AHOADFMAPLB_FIELD_NUMBER;
      hash = (53 * hash) + getAHOADFMAPLB();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo prototype) {
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
     * <pre>
     * Obf: MHEDFFJMDGE
     * </pre>
     *
     * Protobuf type {@code SceneGalleryJourneyDiceInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryJourneyDiceInfo)
        emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.internal_static_SceneGalleryJourneyDiceInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.internal_static_SceneGalleryJourneyDiceInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo.class, emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo.newBuilder()
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
        score_ = 0;

        gBOHILEAPIM_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        dEJJPIOCJDD_ = 0;

        aHOADFMAPLB_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.internal_static_SceneGalleryJourneyDiceInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo build() {
        emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo buildPartial() {
        emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo result = new emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo(this);
        int from_bitField0_ = bitField0_;
        result.score_ = score_;
        if (((bitField0_ & 0x00000001) != 0)) {
          gBOHILEAPIM_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.gBOHILEAPIM_ = gBOHILEAPIM_;
        result.dEJJPIOCJDD_ = dEJJPIOCJDD_;
        result.aHOADFMAPLB_ = aHOADFMAPLB_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo other) {
        if (other == emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo.getDefaultInstance()) return this;
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (!other.gBOHILEAPIM_.isEmpty()) {
          if (gBOHILEAPIM_.isEmpty()) {
            gBOHILEAPIM_ = other.gBOHILEAPIM_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGBOHILEAPIMIsMutable();
            gBOHILEAPIM_.addAll(other.gBOHILEAPIM_);
          }
          onChanged();
        }
        if (other.getDEJJPIOCJDD() != 0) {
          setDEJJPIOCJDD(other.getDEJJPIOCJDD());
        }
        if (other.getAHOADFMAPLB() != 0) {
          setAHOADFMAPLB(other.getAHOADFMAPLB());
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
        emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int score_ ;
      /**
       * <code>uint32 score = 9;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 9;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList gBOHILEAPIM_ = emptyIntList();
      private void ensureGBOHILEAPIMIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          gBOHILEAPIM_ = mutableCopy(gBOHILEAPIM_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 GBOHILEAPIM = 15;</code>
       * @return A list containing the gBOHILEAPIM.
       */
      public java.util.List<java.lang.Integer>
          getGBOHILEAPIMList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(gBOHILEAPIM_) : gBOHILEAPIM_;
      }
      /**
       * <code>repeated uint32 GBOHILEAPIM = 15;</code>
       * @return The count of gBOHILEAPIM.
       */
      public int getGBOHILEAPIMCount() {
        return gBOHILEAPIM_.size();
      }
      /**
       * <code>repeated uint32 GBOHILEAPIM = 15;</code>
       * @param index The index of the element to return.
       * @return The gBOHILEAPIM at the given index.
       */
      public int getGBOHILEAPIM(int index) {
        return gBOHILEAPIM_.getInt(index);
      }
      /**
       * <code>repeated uint32 GBOHILEAPIM = 15;</code>
       * @param index The index to set the value at.
       * @param value The gBOHILEAPIM to set.
       * @return This builder for chaining.
       */
      public Builder setGBOHILEAPIM(
          int index, int value) {
        ensureGBOHILEAPIMIsMutable();
        gBOHILEAPIM_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 GBOHILEAPIM = 15;</code>
       * @param value The gBOHILEAPIM to add.
       * @return This builder for chaining.
       */
      public Builder addGBOHILEAPIM(int value) {
        ensureGBOHILEAPIMIsMutable();
        gBOHILEAPIM_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 GBOHILEAPIM = 15;</code>
       * @param values The gBOHILEAPIM to add.
       * @return This builder for chaining.
       */
      public Builder addAllGBOHILEAPIM(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureGBOHILEAPIMIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, gBOHILEAPIM_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 GBOHILEAPIM = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearGBOHILEAPIM() {
        gBOHILEAPIM_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int dEJJPIOCJDD_ ;
      /**
       * <code>uint32 DEJJPIOCJDD = 4;</code>
       * @return The dEJJPIOCJDD.
       */
      @java.lang.Override
      public int getDEJJPIOCJDD() {
        return dEJJPIOCJDD_;
      }
      /**
       * <code>uint32 DEJJPIOCJDD = 4;</code>
       * @param value The dEJJPIOCJDD to set.
       * @return This builder for chaining.
       */
      public Builder setDEJJPIOCJDD(int value) {
        
        dEJJPIOCJDD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DEJJPIOCJDD = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDEJJPIOCJDD() {
        
        dEJJPIOCJDD_ = 0;
        onChanged();
        return this;
      }

      private int aHOADFMAPLB_ ;
      /**
       * <code>uint32 AHOADFMAPLB = 3;</code>
       * @return The aHOADFMAPLB.
       */
      @java.lang.Override
      public int getAHOADFMAPLB() {
        return aHOADFMAPLB_;
      }
      /**
       * <code>uint32 AHOADFMAPLB = 3;</code>
       * @param value The aHOADFMAPLB to set.
       * @return This builder for chaining.
       */
      public Builder setAHOADFMAPLB(int value) {
        
        aHOADFMAPLB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 AHOADFMAPLB = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAHOADFMAPLB() {
        
        aHOADFMAPLB_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryJourneyDiceInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryJourneyDiceInfo)
    private static final emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo();
    }

    public static emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryJourneyDiceInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryJourneyDiceInfo>() {
      @java.lang.Override
      public SceneGalleryJourneyDiceInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryJourneyDiceInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryJourneyDiceInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryJourneyDiceInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGalleryJourneyDiceInfoOuterClass.SceneGalleryJourneyDiceInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryJourneyDiceInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryJourneyDiceInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!SceneGalleryJourneyDiceInfo.proto\"k\n\033S" +
      "ceneGalleryJourneyDiceInfo\022\r\n\005score\030\t \001(" +
      "\r\022\023\n\013GBOHILEAPIM\030\017 \003(\r\022\023\n\013DEJJPIOCJDD\030\004 " +
      "\001(\r\022\023\n\013AHOADFMAPLB\030\003 \001(\rB\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryJourneyDiceInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryJourneyDiceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryJourneyDiceInfo_descriptor,
        new java.lang.String[] { "Score", "GBOHILEAPIM", "DEJJPIOCJDD", "AHOADFMAPLB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

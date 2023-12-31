// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CLCJPBMMNCM.proto

package emu.grasscutter.net.proto;

public final class CLCJPBMMNCMOuterClass {
  private CLCJPBMMNCMOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CLCJPBMMNCMOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CLCJPBMMNCM)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 13;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>repeated uint32 GONAIMADJMD = 8;</code>
     * @return A list containing the gONAIMADJMD.
     */
    java.util.List<java.lang.Integer> getGONAIMADJMDList();
    /**
     * <code>repeated uint32 GONAIMADJMD = 8;</code>
     * @return The count of gONAIMADJMD.
     */
    int getGONAIMADJMDCount();
    /**
     * <code>repeated uint32 GONAIMADJMD = 8;</code>
     * @param index The index of the element to return.
     * @return The gONAIMADJMD at the given index.
     */
    int getGONAIMADJMD(int index);

    /**
     * <code>uint32 id = 4;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * <pre>
   * CmdId: 29215
   * </pre>
   *
   * Protobuf type {@code CLCJPBMMNCM}
   */
  public static final class CLCJPBMMNCM extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CLCJPBMMNCM)
      CLCJPBMMNCMOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CLCJPBMMNCM.newBuilder() to construct.
    private CLCJPBMMNCM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CLCJPBMMNCM() {
      gONAIMADJMD_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CLCJPBMMNCM();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CLCJPBMMNCM(
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
            case 32: {

              id_ = input.readUInt32();
              break;
            }
            case 64: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                gONAIMADJMD_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              gONAIMADJMD_.addInt(input.readUInt32());
              break;
            }
            case 66: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                gONAIMADJMD_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                gONAIMADJMD_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 104: {

              levelId_ = input.readUInt32();
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
          gONAIMADJMD_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.internal_static_CLCJPBMMNCM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.internal_static_CLCJPBMMNCM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM.class, emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 13;
    private int levelId_;
    /**
     * <code>uint32 level_id = 13;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int GONAIMADJMD_FIELD_NUMBER = 8;
    private com.google.protobuf.Internal.IntList gONAIMADJMD_;
    /**
     * <code>repeated uint32 GONAIMADJMD = 8;</code>
     * @return A list containing the gONAIMADJMD.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getGONAIMADJMDList() {
      return gONAIMADJMD_;
    }
    /**
     * <code>repeated uint32 GONAIMADJMD = 8;</code>
     * @return The count of gONAIMADJMD.
     */
    public int getGONAIMADJMDCount() {
      return gONAIMADJMD_.size();
    }
    /**
     * <code>repeated uint32 GONAIMADJMD = 8;</code>
     * @param index The index of the element to return.
     * @return The gONAIMADJMD at the given index.
     */
    public int getGONAIMADJMD(int index) {
      return gONAIMADJMD_.getInt(index);
    }
    private int gONAIMADJMDMemoizedSerializedSize = -1;

    public static final int ID_FIELD_NUMBER = 4;
    private int id_;
    /**
     * <code>uint32 id = 4;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
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
      if (id_ != 0) {
        output.writeUInt32(4, id_);
      }
      if (getGONAIMADJMDList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(gONAIMADJMDMemoizedSerializedSize);
      }
      for (int i = 0; i < gONAIMADJMD_.size(); i++) {
        output.writeUInt32NoTag(gONAIMADJMD_.getInt(i));
      }
      if (levelId_ != 0) {
        output.writeUInt32(13, levelId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, id_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < gONAIMADJMD_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(gONAIMADJMD_.getInt(i));
        }
        size += dataSize;
        if (!getGONAIMADJMDList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        gONAIMADJMDMemoizedSerializedSize = dataSize;
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM other = (emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (!getGONAIMADJMDList()
          .equals(other.getGONAIMADJMDList())) return false;
      if (getId()
          != other.getId()) return false;
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
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      if (getGONAIMADJMDCount() > 0) {
        hash = (37 * hash) + GONAIMADJMD_FIELD_NUMBER;
        hash = (53 * hash) + getGONAIMADJMDList().hashCode();
      }
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM prototype) {
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
     * CmdId: 29215
     * </pre>
     *
     * Protobuf type {@code CLCJPBMMNCM}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CLCJPBMMNCM)
        emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCMOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.internal_static_CLCJPBMMNCM_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.internal_static_CLCJPBMMNCM_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM.class, emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM.newBuilder()
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
        levelId_ = 0;

        gONAIMADJMD_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.internal_static_CLCJPBMMNCM_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM build() {
        emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM buildPartial() {
        emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM result = new emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM(this);
        int from_bitField0_ = bitField0_;
        result.levelId_ = levelId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          gONAIMADJMD_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.gONAIMADJMD_ = gONAIMADJMD_;
        result.id_ = id_;
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
        if (other instanceof emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM) {
          return mergeFrom((emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM other) {
        if (other == emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (!other.gONAIMADJMD_.isEmpty()) {
          if (gONAIMADJMD_.isEmpty()) {
            gONAIMADJMD_ = other.gONAIMADJMD_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGONAIMADJMDIsMutable();
            gONAIMADJMD_.addAll(other.gONAIMADJMD_);
          }
          onChanged();
        }
        if (other.getId() != 0) {
          setId(other.getId());
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
        emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 13;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 13;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList gONAIMADJMD_ = emptyIntList();
      private void ensureGONAIMADJMDIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          gONAIMADJMD_ = mutableCopy(gONAIMADJMD_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 GONAIMADJMD = 8;</code>
       * @return A list containing the gONAIMADJMD.
       */
      public java.util.List<java.lang.Integer>
          getGONAIMADJMDList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(gONAIMADJMD_) : gONAIMADJMD_;
      }
      /**
       * <code>repeated uint32 GONAIMADJMD = 8;</code>
       * @return The count of gONAIMADJMD.
       */
      public int getGONAIMADJMDCount() {
        return gONAIMADJMD_.size();
      }
      /**
       * <code>repeated uint32 GONAIMADJMD = 8;</code>
       * @param index The index of the element to return.
       * @return The gONAIMADJMD at the given index.
       */
      public int getGONAIMADJMD(int index) {
        return gONAIMADJMD_.getInt(index);
      }
      /**
       * <code>repeated uint32 GONAIMADJMD = 8;</code>
       * @param index The index to set the value at.
       * @param value The gONAIMADJMD to set.
       * @return This builder for chaining.
       */
      public Builder setGONAIMADJMD(
          int index, int value) {
        ensureGONAIMADJMDIsMutable();
        gONAIMADJMD_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 GONAIMADJMD = 8;</code>
       * @param value The gONAIMADJMD to add.
       * @return This builder for chaining.
       */
      public Builder addGONAIMADJMD(int value) {
        ensureGONAIMADJMDIsMutable();
        gONAIMADJMD_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 GONAIMADJMD = 8;</code>
       * @param values The gONAIMADJMD to add.
       * @return This builder for chaining.
       */
      public Builder addAllGONAIMADJMD(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureGONAIMADJMDIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, gONAIMADJMD_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 GONAIMADJMD = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearGONAIMADJMD() {
        gONAIMADJMD_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 4;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 4;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CLCJPBMMNCM)
    }

    // @@protoc_insertion_point(class_scope:CLCJPBMMNCM)
    private static final emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM();
    }

    public static emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CLCJPBMMNCM>
        PARSER = new com.google.protobuf.AbstractParser<CLCJPBMMNCM>() {
      @java.lang.Override
      public CLCJPBMMNCM parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CLCJPBMMNCM(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CLCJPBMMNCM> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CLCJPBMMNCM> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CLCJPBMMNCMOuterClass.CLCJPBMMNCM getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CLCJPBMMNCM_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CLCJPBMMNCM_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CLCJPBMMNCM.proto\"@\n\013CLCJPBMMNCM\022\020\n\010le" +
      "vel_id\030\r \001(\r\022\023\n\013GONAIMADJMD\030\010 \003(\r\022\n\n\002id\030" +
      "\004 \001(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CLCJPBMMNCM_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CLCJPBMMNCM_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CLCJPBMMNCM_descriptor,
        new java.lang.String[] { "LevelId", "GONAIMADJMD", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

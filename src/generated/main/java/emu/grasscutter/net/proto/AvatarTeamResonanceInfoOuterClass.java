// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarTeamResonanceInfo.proto

package emu.grasscutter.net.proto;

public final class AvatarTeamResonanceInfoOuterClass {
  private AvatarTeamResonanceInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarTeamResonanceInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarTeamResonanceInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 7;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>repeated uint32 APADELCPLGE = 1;</code>
     * @return A list containing the aPADELCPLGE.
     */
    java.util.List<java.lang.Integer> getAPADELCPLGEList();
    /**
     * <code>repeated uint32 APADELCPLGE = 1;</code>
     * @return The count of aPADELCPLGE.
     */
    int getAPADELCPLGECount();
    /**
     * <code>repeated uint32 APADELCPLGE = 1;</code>
     * @param index The index of the element to return.
     * @return The aPADELCPLGE at the given index.
     */
    int getAPADELCPLGE(int index);

    /**
     * <code>uint64 avatar_guid = 6;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>repeated uint32 GFJMLEAFNBM = 14;</code>
     * @return A list containing the gFJMLEAFNBM.
     */
    java.util.List<java.lang.Integer> getGFJMLEAFNBMList();
    /**
     * <code>repeated uint32 GFJMLEAFNBM = 14;</code>
     * @return The count of gFJMLEAFNBM.
     */
    int getGFJMLEAFNBMCount();
    /**
     * <code>repeated uint32 GFJMLEAFNBM = 14;</code>
     * @param index The index of the element to return.
     * @return The gFJMLEAFNBM at the given index.
     */
    int getGFJMLEAFNBM(int index);
  }
  /**
   * <pre>
   * Obf: COBALHBKFBJ
   * </pre>
   *
   * Protobuf type {@code AvatarTeamResonanceInfo}
   */
  public static final class AvatarTeamResonanceInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarTeamResonanceInfo)
      AvatarTeamResonanceInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarTeamResonanceInfo.newBuilder() to construct.
    private AvatarTeamResonanceInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarTeamResonanceInfo() {
      aPADELCPLGE_ = emptyIntList();
      gFJMLEAFNBM_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarTeamResonanceInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarTeamResonanceInfo(
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
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                aPADELCPLGE_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              aPADELCPLGE_.addInt(input.readUInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                aPADELCPLGE_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                aPADELCPLGE_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 48: {

              avatarGuid_ = input.readUInt64();
              break;
            }
            case 56: {

              entityId_ = input.readUInt32();
              break;
            }
            case 112: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                gFJMLEAFNBM_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              gFJMLEAFNBM_.addInt(input.readUInt32());
              break;
            }
            case 114: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                gFJMLEAFNBM_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                gFJMLEAFNBM_.addInt(input.readUInt32());
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
          aPADELCPLGE_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          gFJMLEAFNBM_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.internal_static_AvatarTeamResonanceInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.internal_static_AvatarTeamResonanceInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.class, emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 7;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 7;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int APADELCPLGE_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList aPADELCPLGE_;
    /**
     * <code>repeated uint32 APADELCPLGE = 1;</code>
     * @return A list containing the aPADELCPLGE.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAPADELCPLGEList() {
      return aPADELCPLGE_;
    }
    /**
     * <code>repeated uint32 APADELCPLGE = 1;</code>
     * @return The count of aPADELCPLGE.
     */
    public int getAPADELCPLGECount() {
      return aPADELCPLGE_.size();
    }
    /**
     * <code>repeated uint32 APADELCPLGE = 1;</code>
     * @param index The index of the element to return.
     * @return The aPADELCPLGE at the given index.
     */
    public int getAPADELCPLGE(int index) {
      return aPADELCPLGE_.getInt(index);
    }
    private int aPADELCPLGEMemoizedSerializedSize = -1;

    public static final int AVATAR_GUID_FIELD_NUMBER = 6;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 6;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int GFJMLEAFNBM_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.IntList gFJMLEAFNBM_;
    /**
     * <code>repeated uint32 GFJMLEAFNBM = 14;</code>
     * @return A list containing the gFJMLEAFNBM.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getGFJMLEAFNBMList() {
      return gFJMLEAFNBM_;
    }
    /**
     * <code>repeated uint32 GFJMLEAFNBM = 14;</code>
     * @return The count of gFJMLEAFNBM.
     */
    public int getGFJMLEAFNBMCount() {
      return gFJMLEAFNBM_.size();
    }
    /**
     * <code>repeated uint32 GFJMLEAFNBM = 14;</code>
     * @param index The index of the element to return.
     * @return The gFJMLEAFNBM at the given index.
     */
    public int getGFJMLEAFNBM(int index) {
      return gFJMLEAFNBM_.getInt(index);
    }
    private int gFJMLEAFNBMMemoizedSerializedSize = -1;

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
      if (getAPADELCPLGEList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(aPADELCPLGEMemoizedSerializedSize);
      }
      for (int i = 0; i < aPADELCPLGE_.size(); i++) {
        output.writeUInt32NoTag(aPADELCPLGE_.getInt(i));
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(6, avatarGuid_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(7, entityId_);
      }
      if (getGFJMLEAFNBMList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(gFJMLEAFNBMMemoizedSerializedSize);
      }
      for (int i = 0; i < gFJMLEAFNBM_.size(); i++) {
        output.writeUInt32NoTag(gFJMLEAFNBM_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < aPADELCPLGE_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(aPADELCPLGE_.getInt(i));
        }
        size += dataSize;
        if (!getAPADELCPLGEList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        aPADELCPLGEMemoizedSerializedSize = dataSize;
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, avatarGuid_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, entityId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < gFJMLEAFNBM_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(gFJMLEAFNBM_.getInt(i));
        }
        size += dataSize;
        if (!getGFJMLEAFNBMList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        gFJMLEAFNBMMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo other = (emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (!getAPADELCPLGEList()
          .equals(other.getAPADELCPLGEList())) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (!getGFJMLEAFNBMList()
          .equals(other.getGFJMLEAFNBMList())) return false;
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (getAPADELCPLGECount() > 0) {
        hash = (37 * hash) + APADELCPLGE_FIELD_NUMBER;
        hash = (53 * hash) + getAPADELCPLGEList().hashCode();
      }
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      if (getGFJMLEAFNBMCount() > 0) {
        hash = (37 * hash) + GFJMLEAFNBM_FIELD_NUMBER;
        hash = (53 * hash) + getGFJMLEAFNBMList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo prototype) {
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
     * Obf: COBALHBKFBJ
     * </pre>
     *
     * Protobuf type {@code AvatarTeamResonanceInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarTeamResonanceInfo)
        emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.internal_static_AvatarTeamResonanceInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.internal_static_AvatarTeamResonanceInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.class, emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.newBuilder()
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
        entityId_ = 0;

        aPADELCPLGE_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        avatarGuid_ = 0L;

        gFJMLEAFNBM_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.internal_static_AvatarTeamResonanceInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo build() {
        emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo buildPartial() {
        emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo result = new emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo(this);
        int from_bitField0_ = bitField0_;
        result.entityId_ = entityId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          aPADELCPLGE_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.aPADELCPLGE_ = aPADELCPLGE_;
        result.avatarGuid_ = avatarGuid_;
        if (((bitField0_ & 0x00000002) != 0)) {
          gFJMLEAFNBM_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.gFJMLEAFNBM_ = gFJMLEAFNBM_;
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
        if (other instanceof emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo other) {
        if (other == emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (!other.aPADELCPLGE_.isEmpty()) {
          if (aPADELCPLGE_.isEmpty()) {
            aPADELCPLGE_ = other.aPADELCPLGE_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAPADELCPLGEIsMutable();
            aPADELCPLGE_.addAll(other.aPADELCPLGE_);
          }
          onChanged();
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (!other.gFJMLEAFNBM_.isEmpty()) {
          if (gFJMLEAFNBM_.isEmpty()) {
            gFJMLEAFNBM_ = other.gFJMLEAFNBM_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureGFJMLEAFNBMIsMutable();
            gFJMLEAFNBM_.addAll(other.gFJMLEAFNBM_);
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
        emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 7;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 7;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList aPADELCPLGE_ = emptyIntList();
      private void ensureAPADELCPLGEIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          aPADELCPLGE_ = mutableCopy(aPADELCPLGE_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 APADELCPLGE = 1;</code>
       * @return A list containing the aPADELCPLGE.
       */
      public java.util.List<java.lang.Integer>
          getAPADELCPLGEList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(aPADELCPLGE_) : aPADELCPLGE_;
      }
      /**
       * <code>repeated uint32 APADELCPLGE = 1;</code>
       * @return The count of aPADELCPLGE.
       */
      public int getAPADELCPLGECount() {
        return aPADELCPLGE_.size();
      }
      /**
       * <code>repeated uint32 APADELCPLGE = 1;</code>
       * @param index The index of the element to return.
       * @return The aPADELCPLGE at the given index.
       */
      public int getAPADELCPLGE(int index) {
        return aPADELCPLGE_.getInt(index);
      }
      /**
       * <code>repeated uint32 APADELCPLGE = 1;</code>
       * @param index The index to set the value at.
       * @param value The aPADELCPLGE to set.
       * @return This builder for chaining.
       */
      public Builder setAPADELCPLGE(
          int index, int value) {
        ensureAPADELCPLGEIsMutable();
        aPADELCPLGE_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 APADELCPLGE = 1;</code>
       * @param value The aPADELCPLGE to add.
       * @return This builder for chaining.
       */
      public Builder addAPADELCPLGE(int value) {
        ensureAPADELCPLGEIsMutable();
        aPADELCPLGE_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 APADELCPLGE = 1;</code>
       * @param values The aPADELCPLGE to add.
       * @return This builder for chaining.
       */
      public Builder addAllAPADELCPLGE(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAPADELCPLGEIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, aPADELCPLGE_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 APADELCPLGE = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAPADELCPLGE() {
        aPADELCPLGE_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 6;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 6;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList gFJMLEAFNBM_ = emptyIntList();
      private void ensureGFJMLEAFNBMIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          gFJMLEAFNBM_ = mutableCopy(gFJMLEAFNBM_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 GFJMLEAFNBM = 14;</code>
       * @return A list containing the gFJMLEAFNBM.
       */
      public java.util.List<java.lang.Integer>
          getGFJMLEAFNBMList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(gFJMLEAFNBM_) : gFJMLEAFNBM_;
      }
      /**
       * <code>repeated uint32 GFJMLEAFNBM = 14;</code>
       * @return The count of gFJMLEAFNBM.
       */
      public int getGFJMLEAFNBMCount() {
        return gFJMLEAFNBM_.size();
      }
      /**
       * <code>repeated uint32 GFJMLEAFNBM = 14;</code>
       * @param index The index of the element to return.
       * @return The gFJMLEAFNBM at the given index.
       */
      public int getGFJMLEAFNBM(int index) {
        return gFJMLEAFNBM_.getInt(index);
      }
      /**
       * <code>repeated uint32 GFJMLEAFNBM = 14;</code>
       * @param index The index to set the value at.
       * @param value The gFJMLEAFNBM to set.
       * @return This builder for chaining.
       */
      public Builder setGFJMLEAFNBM(
          int index, int value) {
        ensureGFJMLEAFNBMIsMutable();
        gFJMLEAFNBM_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 GFJMLEAFNBM = 14;</code>
       * @param value The gFJMLEAFNBM to add.
       * @return This builder for chaining.
       */
      public Builder addGFJMLEAFNBM(int value) {
        ensureGFJMLEAFNBMIsMutable();
        gFJMLEAFNBM_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 GFJMLEAFNBM = 14;</code>
       * @param values The gFJMLEAFNBM to add.
       * @return This builder for chaining.
       */
      public Builder addAllGFJMLEAFNBM(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureGFJMLEAFNBMIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, gFJMLEAFNBM_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 GFJMLEAFNBM = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearGFJMLEAFNBM() {
        gFJMLEAFNBM_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:AvatarTeamResonanceInfo)
    }

    // @@protoc_insertion_point(class_scope:AvatarTeamResonanceInfo)
    private static final emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo();
    }

    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarTeamResonanceInfo>
        PARSER = new com.google.protobuf.AbstractParser<AvatarTeamResonanceInfo>() {
      @java.lang.Override
      public AvatarTeamResonanceInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarTeamResonanceInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarTeamResonanceInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarTeamResonanceInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarTeamResonanceInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarTeamResonanceInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035AvatarTeamResonanceInfo.proto\"k\n\027Avata" +
      "rTeamResonanceInfo\022\021\n\tentity_id\030\007 \001(\r\022\023\n" +
      "\013APADELCPLGE\030\001 \003(\r\022\023\n\013avatar_guid\030\006 \001(\004\022" +
      "\023\n\013GFJMLEAFNBM\030\016 \003(\rB\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarTeamResonanceInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarTeamResonanceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarTeamResonanceInfo_descriptor,
        new java.lang.String[] { "EntityId", "APADELCPLGE", "AvatarGuid", "GFJMLEAFNBM", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

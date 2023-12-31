// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ForceDragAvatarNotify.proto

package emu.grasscutter.net.proto;

public final class ForceDragAvatarNotifyOuterClass {
  private ForceDragAvatarNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ForceDragAvatarNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ForceDragAvatarNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.MotionInfo motion_info = 4;</code>
     * @return Whether the motionInfo field is set.
     */
    boolean hasMotionInfo();
    /**
     * <code>.MotionInfo motion_info = 4;</code>
     * @return The motionInfo.
     */
    emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo getMotionInfo();
    /**
     * <code>.MotionInfo motion_info = 4;</code>
     */
    emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder();

    /**
     * <code>uint32 entity_id = 1;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint64 BLNEOPIFBGK = 10;</code>
     * @return The bLNEOPIFBGK.
     */
    long getBLNEOPIFBGK();

    /**
     * <code>bool is_first_valid = 15;</code>
     * @return The isFirstValid.
     */
    boolean getIsFirstValid();

    /**
     * <code>uint64 CHFNMCLHBOI = 3;</code>
     * @return The cHFNMCLHBOI.
     */
    long getCHFNMCLHBOI();

    /**
     * <code>uint32 scene_time = 7;</code>
     * @return The sceneTime.
     */
    int getSceneTime();
  }
  /**
   * <pre>
   * CmdId: 2141
   * Obf: GFBHCMKNPCG
   * </pre>
   *
   * Protobuf type {@code ForceDragAvatarNotify}
   */
  public static final class ForceDragAvatarNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ForceDragAvatarNotify)
      ForceDragAvatarNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ForceDragAvatarNotify.newBuilder() to construct.
    private ForceDragAvatarNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ForceDragAvatarNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ForceDragAvatarNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ForceDragAvatarNotify(
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
            case 8: {

              entityId_ = input.readUInt32();
              break;
            }
            case 24: {

              cHFNMCLHBOI_ = input.readUInt64();
              break;
            }
            case 34: {
              emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder subBuilder = null;
              if (motionInfo_ != null) {
                subBuilder = motionInfo_.toBuilder();
              }
              motionInfo_ = input.readMessage(emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(motionInfo_);
                motionInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 56: {

              sceneTime_ = input.readUInt32();
              break;
            }
            case 80: {

              bLNEOPIFBGK_ = input.readUInt64();
              break;
            }
            case 120: {

              isFirstValid_ = input.readBool();
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
      return emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.internal_static_ForceDragAvatarNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.internal_static_ForceDragAvatarNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify.class, emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify.Builder.class);
    }

    public static final int MOTION_INFO_FIELD_NUMBER = 4;
    private emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo motionInfo_;
    /**
     * <code>.MotionInfo motion_info = 4;</code>
     * @return Whether the motionInfo field is set.
     */
    @java.lang.Override
    public boolean hasMotionInfo() {
      return motionInfo_ != null;
    }
    /**
     * <code>.MotionInfo motion_info = 4;</code>
     * @return The motionInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo getMotionInfo() {
      return motionInfo_ == null ? emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.getDefaultInstance() : motionInfo_;
    }
    /**
     * <code>.MotionInfo motion_info = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder() {
      return getMotionInfo();
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 1;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 1;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int BLNEOPIFBGK_FIELD_NUMBER = 10;
    private long bLNEOPIFBGK_;
    /**
     * <code>uint64 BLNEOPIFBGK = 10;</code>
     * @return The bLNEOPIFBGK.
     */
    @java.lang.Override
    public long getBLNEOPIFBGK() {
      return bLNEOPIFBGK_;
    }

    public static final int IS_FIRST_VALID_FIELD_NUMBER = 15;
    private boolean isFirstValid_;
    /**
     * <code>bool is_first_valid = 15;</code>
     * @return The isFirstValid.
     */
    @java.lang.Override
    public boolean getIsFirstValid() {
      return isFirstValid_;
    }

    public static final int CHFNMCLHBOI_FIELD_NUMBER = 3;
    private long cHFNMCLHBOI_;
    /**
     * <code>uint64 CHFNMCLHBOI = 3;</code>
     * @return The cHFNMCLHBOI.
     */
    @java.lang.Override
    public long getCHFNMCLHBOI() {
      return cHFNMCLHBOI_;
    }

    public static final int SCENE_TIME_FIELD_NUMBER = 7;
    private int sceneTime_;
    /**
     * <code>uint32 scene_time = 7;</code>
     * @return The sceneTime.
     */
    @java.lang.Override
    public int getSceneTime() {
      return sceneTime_;
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
      if (entityId_ != 0) {
        output.writeUInt32(1, entityId_);
      }
      if (cHFNMCLHBOI_ != 0L) {
        output.writeUInt64(3, cHFNMCLHBOI_);
      }
      if (motionInfo_ != null) {
        output.writeMessage(4, getMotionInfo());
      }
      if (sceneTime_ != 0) {
        output.writeUInt32(7, sceneTime_);
      }
      if (bLNEOPIFBGK_ != 0L) {
        output.writeUInt64(10, bLNEOPIFBGK_);
      }
      if (isFirstValid_ != false) {
        output.writeBool(15, isFirstValid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, entityId_);
      }
      if (cHFNMCLHBOI_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, cHFNMCLHBOI_);
      }
      if (motionInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getMotionInfo());
      }
      if (sceneTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, sceneTime_);
      }
      if (bLNEOPIFBGK_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(10, bLNEOPIFBGK_);
      }
      if (isFirstValid_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isFirstValid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify other = (emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify) obj;

      if (hasMotionInfo() != other.hasMotionInfo()) return false;
      if (hasMotionInfo()) {
        if (!getMotionInfo()
            .equals(other.getMotionInfo())) return false;
      }
      if (getEntityId()
          != other.getEntityId()) return false;
      if (getBLNEOPIFBGK()
          != other.getBLNEOPIFBGK()) return false;
      if (getIsFirstValid()
          != other.getIsFirstValid()) return false;
      if (getCHFNMCLHBOI()
          != other.getCHFNMCLHBOI()) return false;
      if (getSceneTime()
          != other.getSceneTime()) return false;
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
      if (hasMotionInfo()) {
        hash = (37 * hash) + MOTION_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getMotionInfo().hashCode();
      }
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + BLNEOPIFBGK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getBLNEOPIFBGK());
      hash = (37 * hash) + IS_FIRST_VALID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFirstValid());
      hash = (37 * hash) + CHFNMCLHBOI_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCHFNMCLHBOI());
      hash = (37 * hash) + SCENE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getSceneTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify prototype) {
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
     * CmdId: 2141
     * Obf: GFBHCMKNPCG
     * </pre>
     *
     * Protobuf type {@code ForceDragAvatarNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ForceDragAvatarNotify)
        emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.internal_static_ForceDragAvatarNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.internal_static_ForceDragAvatarNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify.class, emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify.newBuilder()
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
        if (motionInfoBuilder_ == null) {
          motionInfo_ = null;
        } else {
          motionInfo_ = null;
          motionInfoBuilder_ = null;
        }
        entityId_ = 0;

        bLNEOPIFBGK_ = 0L;

        isFirstValid_ = false;

        cHFNMCLHBOI_ = 0L;

        sceneTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.internal_static_ForceDragAvatarNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify build() {
        emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify buildPartial() {
        emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify result = new emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify(this);
        if (motionInfoBuilder_ == null) {
          result.motionInfo_ = motionInfo_;
        } else {
          result.motionInfo_ = motionInfoBuilder_.build();
        }
        result.entityId_ = entityId_;
        result.bLNEOPIFBGK_ = bLNEOPIFBGK_;
        result.isFirstValid_ = isFirstValid_;
        result.cHFNMCLHBOI_ = cHFNMCLHBOI_;
        result.sceneTime_ = sceneTime_;
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
        if (other instanceof emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify other) {
        if (other == emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify.getDefaultInstance()) return this;
        if (other.hasMotionInfo()) {
          mergeMotionInfo(other.getMotionInfo());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getBLNEOPIFBGK() != 0L) {
          setBLNEOPIFBGK(other.getBLNEOPIFBGK());
        }
        if (other.getIsFirstValid() != false) {
          setIsFirstValid(other.getIsFirstValid());
        }
        if (other.getCHFNMCLHBOI() != 0L) {
          setCHFNMCLHBOI(other.getCHFNMCLHBOI());
        }
        if (other.getSceneTime() != 0) {
          setSceneTime(other.getSceneTime());
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
        emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo motionInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder> motionInfoBuilder_;
      /**
       * <code>.MotionInfo motion_info = 4;</code>
       * @return Whether the motionInfo field is set.
       */
      public boolean hasMotionInfo() {
        return motionInfoBuilder_ != null || motionInfo_ != null;
      }
      /**
       * <code>.MotionInfo motion_info = 4;</code>
       * @return The motionInfo.
       */
      public emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo getMotionInfo() {
        if (motionInfoBuilder_ == null) {
          return motionInfo_ == null ? emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.getDefaultInstance() : motionInfo_;
        } else {
          return motionInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.MotionInfo motion_info = 4;</code>
       */
      public Builder setMotionInfo(emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo value) {
        if (motionInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          motionInfo_ = value;
          onChanged();
        } else {
          motionInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 4;</code>
       */
      public Builder setMotionInfo(
          emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder builderForValue) {
        if (motionInfoBuilder_ == null) {
          motionInfo_ = builderForValue.build();
          onChanged();
        } else {
          motionInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 4;</code>
       */
      public Builder mergeMotionInfo(emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo value) {
        if (motionInfoBuilder_ == null) {
          if (motionInfo_ != null) {
            motionInfo_ =
              emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.newBuilder(motionInfo_).mergeFrom(value).buildPartial();
          } else {
            motionInfo_ = value;
          }
          onChanged();
        } else {
          motionInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 4;</code>
       */
      public Builder clearMotionInfo() {
        if (motionInfoBuilder_ == null) {
          motionInfo_ = null;
          onChanged();
        } else {
          motionInfo_ = null;
          motionInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 4;</code>
       */
      public emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder getMotionInfoBuilder() {
        
        onChanged();
        return getMotionInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.MotionInfo motion_info = 4;</code>
       */
      public emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder() {
        if (motionInfoBuilder_ != null) {
          return motionInfoBuilder_.getMessageOrBuilder();
        } else {
          return motionInfo_ == null ?
              emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.getDefaultInstance() : motionInfo_;
        }
      }
      /**
       * <code>.MotionInfo motion_info = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder> 
          getMotionInfoFieldBuilder() {
        if (motionInfoBuilder_ == null) {
          motionInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder>(
                  getMotionInfo(),
                  getParentForChildren(),
                  isClean());
          motionInfo_ = null;
        }
        return motionInfoBuilder_;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 1;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 1;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private long bLNEOPIFBGK_ ;
      /**
       * <code>uint64 BLNEOPIFBGK = 10;</code>
       * @return The bLNEOPIFBGK.
       */
      @java.lang.Override
      public long getBLNEOPIFBGK() {
        return bLNEOPIFBGK_;
      }
      /**
       * <code>uint64 BLNEOPIFBGK = 10;</code>
       * @param value The bLNEOPIFBGK to set.
       * @return This builder for chaining.
       */
      public Builder setBLNEOPIFBGK(long value) {
        
        bLNEOPIFBGK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 BLNEOPIFBGK = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearBLNEOPIFBGK() {
        
        bLNEOPIFBGK_ = 0L;
        onChanged();
        return this;
      }

      private boolean isFirstValid_ ;
      /**
       * <code>bool is_first_valid = 15;</code>
       * @return The isFirstValid.
       */
      @java.lang.Override
      public boolean getIsFirstValid() {
        return isFirstValid_;
      }
      /**
       * <code>bool is_first_valid = 15;</code>
       * @param value The isFirstValid to set.
       * @return This builder for chaining.
       */
      public Builder setIsFirstValid(boolean value) {
        
        isFirstValid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_first_valid = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFirstValid() {
        
        isFirstValid_ = false;
        onChanged();
        return this;
      }

      private long cHFNMCLHBOI_ ;
      /**
       * <code>uint64 CHFNMCLHBOI = 3;</code>
       * @return The cHFNMCLHBOI.
       */
      @java.lang.Override
      public long getCHFNMCLHBOI() {
        return cHFNMCLHBOI_;
      }
      /**
       * <code>uint64 CHFNMCLHBOI = 3;</code>
       * @param value The cHFNMCLHBOI to set.
       * @return This builder for chaining.
       */
      public Builder setCHFNMCLHBOI(long value) {
        
        cHFNMCLHBOI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 CHFNMCLHBOI = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCHFNMCLHBOI() {
        
        cHFNMCLHBOI_ = 0L;
        onChanged();
        return this;
      }

      private int sceneTime_ ;
      /**
       * <code>uint32 scene_time = 7;</code>
       * @return The sceneTime.
       */
      @java.lang.Override
      public int getSceneTime() {
        return sceneTime_;
      }
      /**
       * <code>uint32 scene_time = 7;</code>
       * @param value The sceneTime to set.
       * @return This builder for chaining.
       */
      public Builder setSceneTime(int value) {
        
        sceneTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_time = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneTime() {
        
        sceneTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ForceDragAvatarNotify)
    }

    // @@protoc_insertion_point(class_scope:ForceDragAvatarNotify)
    private static final emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify();
    }

    public static emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ForceDragAvatarNotify>
        PARSER = new com.google.protobuf.AbstractParser<ForceDragAvatarNotify>() {
      @java.lang.Override
      public ForceDragAvatarNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ForceDragAvatarNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ForceDragAvatarNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ForceDragAvatarNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ForceDragAvatarNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ForceDragAvatarNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ForceDragAvatarNotify.proto\032\020MotionInf" +
      "o.proto\"\242\001\n\025ForceDragAvatarNotify\022 \n\013mot" +
      "ion_info\030\004 \001(\0132\013.MotionInfo\022\021\n\tentity_id" +
      "\030\001 \001(\r\022\023\n\013BLNEOPIFBGK\030\n \001(\004\022\026\n\016is_first_" +
      "valid\030\017 \001(\010\022\023\n\013CHFNMCLHBOI\030\003 \001(\004\022\022\n\nscen" +
      "e_time\030\007 \001(\rB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MotionInfoOuterClass.getDescriptor(),
        });
    internal_static_ForceDragAvatarNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ForceDragAvatarNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ForceDragAvatarNotify_descriptor,
        new java.lang.String[] { "MotionInfo", "EntityId", "BLNEOPIFBGK", "IsFirstValid", "CHFNMCLHBOI", "SceneTime", });
    emu.grasscutter.net.proto.MotionInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

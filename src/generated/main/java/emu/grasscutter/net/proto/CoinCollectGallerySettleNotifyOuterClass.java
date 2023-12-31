// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CoinCollectGallerySettleNotify.proto

package emu.grasscutter.net.proto;

public final class CoinCollectGallerySettleNotifyOuterClass {
  private CoinCollectGallerySettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CoinCollectGallerySettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CoinCollectGallerySettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 DKPANNIJPEN = 5;</code>
     * @return The dKPANNIJPEN.
     */
    int getDKPANNIJPEN();

    /**
     * <code>bool is_new_record = 10;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>uint32 PPHPNNOGALH = 6;</code>
     * @return The pPHPNNOGALH.
     */
    int getPPHPNNOGALH();

    /**
     * <code>uint32 multistage_play_index = 13;</code>
     * @return The multistagePlayIndex.
     */
    int getMultistagePlayIndex();

    /**
     * <code>uint32 LAJGLFDJOFN = 4;</code>
     * @return The lAJGLFDJOFN.
     */
    int getLAJGLFDJOFN();

    /**
     * <code>uint32 level_id = 3;</code>
     * @return The levelId.
     */
    int getLevelId();
  }
  /**
   * <pre>
   * CmdId: 1488
   * Obf: PFFNALAEMAI
   * </pre>
   *
   * Protobuf type {@code CoinCollectGallerySettleNotify}
   */
  public static final class CoinCollectGallerySettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CoinCollectGallerySettleNotify)
      CoinCollectGallerySettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CoinCollectGallerySettleNotify.newBuilder() to construct.
    private CoinCollectGallerySettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CoinCollectGallerySettleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CoinCollectGallerySettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CoinCollectGallerySettleNotify(
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
            case 24: {

              levelId_ = input.readUInt32();
              break;
            }
            case 32: {

              lAJGLFDJOFN_ = input.readUInt32();
              break;
            }
            case 40: {

              dKPANNIJPEN_ = input.readUInt32();
              break;
            }
            case 48: {

              pPHPNNOGALH_ = input.readUInt32();
              break;
            }
            case 80: {

              isNewRecord_ = input.readBool();
              break;
            }
            case 104: {

              multistagePlayIndex_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.internal_static_CoinCollectGallerySettleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.internal_static_CoinCollectGallerySettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify.class, emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify.Builder.class);
    }

    public static final int DKPANNIJPEN_FIELD_NUMBER = 5;
    private int dKPANNIJPEN_;
    /**
     * <code>uint32 DKPANNIJPEN = 5;</code>
     * @return The dKPANNIJPEN.
     */
    @java.lang.Override
    public int getDKPANNIJPEN() {
      return dKPANNIJPEN_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 10;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 10;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int PPHPNNOGALH_FIELD_NUMBER = 6;
    private int pPHPNNOGALH_;
    /**
     * <code>uint32 PPHPNNOGALH = 6;</code>
     * @return The pPHPNNOGALH.
     */
    @java.lang.Override
    public int getPPHPNNOGALH() {
      return pPHPNNOGALH_;
    }

    public static final int MULTISTAGE_PLAY_INDEX_FIELD_NUMBER = 13;
    private int multistagePlayIndex_;
    /**
     * <code>uint32 multistage_play_index = 13;</code>
     * @return The multistagePlayIndex.
     */
    @java.lang.Override
    public int getMultistagePlayIndex() {
      return multistagePlayIndex_;
    }

    public static final int LAJGLFDJOFN_FIELD_NUMBER = 4;
    private int lAJGLFDJOFN_;
    /**
     * <code>uint32 LAJGLFDJOFN = 4;</code>
     * @return The lAJGLFDJOFN.
     */
    @java.lang.Override
    public int getLAJGLFDJOFN() {
      return lAJGLFDJOFN_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 3;
    private int levelId_;
    /**
     * <code>uint32 level_id = 3;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
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
      if (levelId_ != 0) {
        output.writeUInt32(3, levelId_);
      }
      if (lAJGLFDJOFN_ != 0) {
        output.writeUInt32(4, lAJGLFDJOFN_);
      }
      if (dKPANNIJPEN_ != 0) {
        output.writeUInt32(5, dKPANNIJPEN_);
      }
      if (pPHPNNOGALH_ != 0) {
        output.writeUInt32(6, pPHPNNOGALH_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(10, isNewRecord_);
      }
      if (multistagePlayIndex_ != 0) {
        output.writeUInt32(13, multistagePlayIndex_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, levelId_);
      }
      if (lAJGLFDJOFN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, lAJGLFDJOFN_);
      }
      if (dKPANNIJPEN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, dKPANNIJPEN_);
      }
      if (pPHPNNOGALH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, pPHPNNOGALH_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isNewRecord_);
      }
      if (multistagePlayIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, multistagePlayIndex_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify other = (emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify) obj;

      if (getDKPANNIJPEN()
          != other.getDKPANNIJPEN()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getPPHPNNOGALH()
          != other.getPPHPNNOGALH()) return false;
      if (getMultistagePlayIndex()
          != other.getMultistagePlayIndex()) return false;
      if (getLAJGLFDJOFN()
          != other.getLAJGLFDJOFN()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
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
      hash = (37 * hash) + DKPANNIJPEN_FIELD_NUMBER;
      hash = (53 * hash) + getDKPANNIJPEN();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + PPHPNNOGALH_FIELD_NUMBER;
      hash = (53 * hash) + getPPHPNNOGALH();
      hash = (37 * hash) + MULTISTAGE_PLAY_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getMultistagePlayIndex();
      hash = (37 * hash) + LAJGLFDJOFN_FIELD_NUMBER;
      hash = (53 * hash) + getLAJGLFDJOFN();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify prototype) {
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
     * CmdId: 1488
     * Obf: PFFNALAEMAI
     * </pre>
     *
     * Protobuf type {@code CoinCollectGallerySettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CoinCollectGallerySettleNotify)
        emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.internal_static_CoinCollectGallerySettleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.internal_static_CoinCollectGallerySettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify.class, emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify.newBuilder()
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
        dKPANNIJPEN_ = 0;

        isNewRecord_ = false;

        pPHPNNOGALH_ = 0;

        multistagePlayIndex_ = 0;

        lAJGLFDJOFN_ = 0;

        levelId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.internal_static_CoinCollectGallerySettleNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify build() {
        emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify buildPartial() {
        emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify result = new emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify(this);
        result.dKPANNIJPEN_ = dKPANNIJPEN_;
        result.isNewRecord_ = isNewRecord_;
        result.pPHPNNOGALH_ = pPHPNNOGALH_;
        result.multistagePlayIndex_ = multistagePlayIndex_;
        result.lAJGLFDJOFN_ = lAJGLFDJOFN_;
        result.levelId_ = levelId_;
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
        if (other instanceof emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify) {
          return mergeFrom((emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify other) {
        if (other == emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify.getDefaultInstance()) return this;
        if (other.getDKPANNIJPEN() != 0) {
          setDKPANNIJPEN(other.getDKPANNIJPEN());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getPPHPNNOGALH() != 0) {
          setPPHPNNOGALH(other.getPPHPNNOGALH());
        }
        if (other.getMultistagePlayIndex() != 0) {
          setMultistagePlayIndex(other.getMultistagePlayIndex());
        }
        if (other.getLAJGLFDJOFN() != 0) {
          setLAJGLFDJOFN(other.getLAJGLFDJOFN());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
        emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int dKPANNIJPEN_ ;
      /**
       * <code>uint32 DKPANNIJPEN = 5;</code>
       * @return The dKPANNIJPEN.
       */
      @java.lang.Override
      public int getDKPANNIJPEN() {
        return dKPANNIJPEN_;
      }
      /**
       * <code>uint32 DKPANNIJPEN = 5;</code>
       * @param value The dKPANNIJPEN to set.
       * @return This builder for chaining.
       */
      public Builder setDKPANNIJPEN(int value) {
        
        dKPANNIJPEN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DKPANNIJPEN = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearDKPANNIJPEN() {
        
        dKPANNIJPEN_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 10;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 10;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private int pPHPNNOGALH_ ;
      /**
       * <code>uint32 PPHPNNOGALH = 6;</code>
       * @return The pPHPNNOGALH.
       */
      @java.lang.Override
      public int getPPHPNNOGALH() {
        return pPHPNNOGALH_;
      }
      /**
       * <code>uint32 PPHPNNOGALH = 6;</code>
       * @param value The pPHPNNOGALH to set.
       * @return This builder for chaining.
       */
      public Builder setPPHPNNOGALH(int value) {
        
        pPHPNNOGALH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 PPHPNNOGALH = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearPPHPNNOGALH() {
        
        pPHPNNOGALH_ = 0;
        onChanged();
        return this;
      }

      private int multistagePlayIndex_ ;
      /**
       * <code>uint32 multistage_play_index = 13;</code>
       * @return The multistagePlayIndex.
       */
      @java.lang.Override
      public int getMultistagePlayIndex() {
        return multistagePlayIndex_;
      }
      /**
       * <code>uint32 multistage_play_index = 13;</code>
       * @param value The multistagePlayIndex to set.
       * @return This builder for chaining.
       */
      public Builder setMultistagePlayIndex(int value) {
        
        multistagePlayIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 multistage_play_index = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearMultistagePlayIndex() {
        
        multistagePlayIndex_ = 0;
        onChanged();
        return this;
      }

      private int lAJGLFDJOFN_ ;
      /**
       * <code>uint32 LAJGLFDJOFN = 4;</code>
       * @return The lAJGLFDJOFN.
       */
      @java.lang.Override
      public int getLAJGLFDJOFN() {
        return lAJGLFDJOFN_;
      }
      /**
       * <code>uint32 LAJGLFDJOFN = 4;</code>
       * @param value The lAJGLFDJOFN to set.
       * @return This builder for chaining.
       */
      public Builder setLAJGLFDJOFN(int value) {
        
        lAJGLFDJOFN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LAJGLFDJOFN = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearLAJGLFDJOFN() {
        
        lAJGLFDJOFN_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 3;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 3;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CoinCollectGallerySettleNotify)
    }

    // @@protoc_insertion_point(class_scope:CoinCollectGallerySettleNotify)
    private static final emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify();
    }

    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CoinCollectGallerySettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<CoinCollectGallerySettleNotify>() {
      @java.lang.Override
      public CoinCollectGallerySettleNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CoinCollectGallerySettleNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CoinCollectGallerySettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CoinCollectGallerySettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CoinCollectGallerySettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CoinCollectGallerySettleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$CoinCollectGallerySettleNotify.proto\"\247" +
      "\001\n\036CoinCollectGallerySettleNotify\022\023\n\013DKP" +
      "ANNIJPEN\030\005 \001(\r\022\025\n\ris_new_record\030\n \001(\010\022\023\n" +
      "\013PPHPNNOGALH\030\006 \001(\r\022\035\n\025multistage_play_in" +
      "dex\030\r \001(\r\022\023\n\013LAJGLFDJOFN\030\004 \001(\r\022\020\n\010level_" +
      "id\030\003 \001(\rB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CoinCollectGallerySettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CoinCollectGallerySettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CoinCollectGallerySettleNotify_descriptor,
        new java.lang.String[] { "DKPANNIJPEN", "IsNewRecord", "PPHPNNOGALH", "MultistagePlayIndex", "LAJGLFDJOFN", "LevelId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

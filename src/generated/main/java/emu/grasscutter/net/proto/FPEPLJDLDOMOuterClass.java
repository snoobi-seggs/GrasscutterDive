// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FPEPLJDLDOM.proto

package emu.grasscutter.net.proto;

public final class FPEPLJDLDOMOuterClass {
  private FPEPLJDLDOMOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FPEPLJDLDOMOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FPEPLJDLDOM)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool NGPJGIOCNEH = 1;</code>
     * @return The nGPJGIOCNEH.
     */
    boolean getNGPJGIOCNEH();

    /**
     * <code>uint32 HJKNINOGIEB = 13;</code>
     * @return The hJKNINOGIEB.
     */
    int getHJKNINOGIEB();

    /**
     * <code>uint32 level_id = 7;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 score = 14;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>uint32 KCFNBHCMLKM = 12;</code>
     * @return The kCFNBHCMLKM.
     */
    int getKCFNBHCMLKM();

    /**
     * <code>uint32 total_num = 2;</code>
     * @return The totalNum.
     */
    int getTotalNum();

    /**
     * <code>uint32 KKPPMGBGBKH = 6;</code>
     * @return The kKPPMGBGBKH.
     */
    int getKKPPMGBGBKH();

    /**
     * <code>bool is_finish = 10;</code>
     * @return The isFinish.
     */
    boolean getIsFinish();
  }
  /**
   * <pre>
   * CmdId: 6408
   * </pre>
   *
   * Protobuf type {@code FPEPLJDLDOM}
   */
  public static final class FPEPLJDLDOM extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FPEPLJDLDOM)
      FPEPLJDLDOMOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FPEPLJDLDOM.newBuilder() to construct.
    private FPEPLJDLDOM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FPEPLJDLDOM() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FPEPLJDLDOM();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FPEPLJDLDOM(
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

              nGPJGIOCNEH_ = input.readBool();
              break;
            }
            case 16: {

              totalNum_ = input.readUInt32();
              break;
            }
            case 48: {

              kKPPMGBGBKH_ = input.readUInt32();
              break;
            }
            case 56: {

              levelId_ = input.readUInt32();
              break;
            }
            case 80: {

              isFinish_ = input.readBool();
              break;
            }
            case 96: {

              kCFNBHCMLKM_ = input.readUInt32();
              break;
            }
            case 104: {

              hJKNINOGIEB_ = input.readUInt32();
              break;
            }
            case 112: {

              score_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.internal_static_FPEPLJDLDOM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.internal_static_FPEPLJDLDOM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM.class, emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM.Builder.class);
    }

    public static final int NGPJGIOCNEH_FIELD_NUMBER = 1;
    private boolean nGPJGIOCNEH_;
    /**
     * <code>bool NGPJGIOCNEH = 1;</code>
     * @return The nGPJGIOCNEH.
     */
    @java.lang.Override
    public boolean getNGPJGIOCNEH() {
      return nGPJGIOCNEH_;
    }

    public static final int HJKNINOGIEB_FIELD_NUMBER = 13;
    private int hJKNINOGIEB_;
    /**
     * <code>uint32 HJKNINOGIEB = 13;</code>
     * @return The hJKNINOGIEB.
     */
    @java.lang.Override
    public int getHJKNINOGIEB() {
      return hJKNINOGIEB_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 7;
    private int levelId_;
    /**
     * <code>uint32 level_id = 7;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int SCORE_FIELD_NUMBER = 14;
    private int score_;
    /**
     * <code>uint32 score = 14;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int KCFNBHCMLKM_FIELD_NUMBER = 12;
    private int kCFNBHCMLKM_;
    /**
     * <code>uint32 KCFNBHCMLKM = 12;</code>
     * @return The kCFNBHCMLKM.
     */
    @java.lang.Override
    public int getKCFNBHCMLKM() {
      return kCFNBHCMLKM_;
    }

    public static final int TOTAL_NUM_FIELD_NUMBER = 2;
    private int totalNum_;
    /**
     * <code>uint32 total_num = 2;</code>
     * @return The totalNum.
     */
    @java.lang.Override
    public int getTotalNum() {
      return totalNum_;
    }

    public static final int KKPPMGBGBKH_FIELD_NUMBER = 6;
    private int kKPPMGBGBKH_;
    /**
     * <code>uint32 KKPPMGBGBKH = 6;</code>
     * @return The kKPPMGBGBKH.
     */
    @java.lang.Override
    public int getKKPPMGBGBKH() {
      return kKPPMGBGBKH_;
    }

    public static final int IS_FINISH_FIELD_NUMBER = 10;
    private boolean isFinish_;
    /**
     * <code>bool is_finish = 10;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
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
      if (nGPJGIOCNEH_ != false) {
        output.writeBool(1, nGPJGIOCNEH_);
      }
      if (totalNum_ != 0) {
        output.writeUInt32(2, totalNum_);
      }
      if (kKPPMGBGBKH_ != 0) {
        output.writeUInt32(6, kKPPMGBGBKH_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(7, levelId_);
      }
      if (isFinish_ != false) {
        output.writeBool(10, isFinish_);
      }
      if (kCFNBHCMLKM_ != 0) {
        output.writeUInt32(12, kCFNBHCMLKM_);
      }
      if (hJKNINOGIEB_ != 0) {
        output.writeUInt32(13, hJKNINOGIEB_);
      }
      if (score_ != 0) {
        output.writeUInt32(14, score_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (nGPJGIOCNEH_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, nGPJGIOCNEH_);
      }
      if (totalNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, totalNum_);
      }
      if (kKPPMGBGBKH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, kKPPMGBGBKH_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, levelId_);
      }
      if (isFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isFinish_);
      }
      if (kCFNBHCMLKM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, kCFNBHCMLKM_);
      }
      if (hJKNINOGIEB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, hJKNINOGIEB_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, score_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM other = (emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM) obj;

      if (getNGPJGIOCNEH()
          != other.getNGPJGIOCNEH()) return false;
      if (getHJKNINOGIEB()
          != other.getHJKNINOGIEB()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getScore()
          != other.getScore()) return false;
      if (getKCFNBHCMLKM()
          != other.getKCFNBHCMLKM()) return false;
      if (getTotalNum()
          != other.getTotalNum()) return false;
      if (getKKPPMGBGBKH()
          != other.getKKPPMGBGBKH()) return false;
      if (getIsFinish()
          != other.getIsFinish()) return false;
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
      hash = (37 * hash) + NGPJGIOCNEH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getNGPJGIOCNEH());
      hash = (37 * hash) + HJKNINOGIEB_FIELD_NUMBER;
      hash = (53 * hash) + getHJKNINOGIEB();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + KCFNBHCMLKM_FIELD_NUMBER;
      hash = (53 * hash) + getKCFNBHCMLKM();
      hash = (37 * hash) + TOTAL_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getTotalNum();
      hash = (37 * hash) + KKPPMGBGBKH_FIELD_NUMBER;
      hash = (53 * hash) + getKKPPMGBGBKH();
      hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinish());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM prototype) {
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
     * CmdId: 6408
     * </pre>
     *
     * Protobuf type {@code FPEPLJDLDOM}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FPEPLJDLDOM)
        emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOMOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.internal_static_FPEPLJDLDOM_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.internal_static_FPEPLJDLDOM_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM.class, emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM.newBuilder()
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
        nGPJGIOCNEH_ = false;

        hJKNINOGIEB_ = 0;

        levelId_ = 0;

        score_ = 0;

        kCFNBHCMLKM_ = 0;

        totalNum_ = 0;

        kKPPMGBGBKH_ = 0;

        isFinish_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.internal_static_FPEPLJDLDOM_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM build() {
        emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM buildPartial() {
        emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM result = new emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM(this);
        result.nGPJGIOCNEH_ = nGPJGIOCNEH_;
        result.hJKNINOGIEB_ = hJKNINOGIEB_;
        result.levelId_ = levelId_;
        result.score_ = score_;
        result.kCFNBHCMLKM_ = kCFNBHCMLKM_;
        result.totalNum_ = totalNum_;
        result.kKPPMGBGBKH_ = kKPPMGBGBKH_;
        result.isFinish_ = isFinish_;
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
        if (other instanceof emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM) {
          return mergeFrom((emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM other) {
        if (other == emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM.getDefaultInstance()) return this;
        if (other.getNGPJGIOCNEH() != false) {
          setNGPJGIOCNEH(other.getNGPJGIOCNEH());
        }
        if (other.getHJKNINOGIEB() != 0) {
          setHJKNINOGIEB(other.getHJKNINOGIEB());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getKCFNBHCMLKM() != 0) {
          setKCFNBHCMLKM(other.getKCFNBHCMLKM());
        }
        if (other.getTotalNum() != 0) {
          setTotalNum(other.getTotalNum());
        }
        if (other.getKKPPMGBGBKH() != 0) {
          setKKPPMGBGBKH(other.getKKPPMGBGBKH());
        }
        if (other.getIsFinish() != false) {
          setIsFinish(other.getIsFinish());
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
        emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean nGPJGIOCNEH_ ;
      /**
       * <code>bool NGPJGIOCNEH = 1;</code>
       * @return The nGPJGIOCNEH.
       */
      @java.lang.Override
      public boolean getNGPJGIOCNEH() {
        return nGPJGIOCNEH_;
      }
      /**
       * <code>bool NGPJGIOCNEH = 1;</code>
       * @param value The nGPJGIOCNEH to set.
       * @return This builder for chaining.
       */
      public Builder setNGPJGIOCNEH(boolean value) {
        
        nGPJGIOCNEH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool NGPJGIOCNEH = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearNGPJGIOCNEH() {
        
        nGPJGIOCNEH_ = false;
        onChanged();
        return this;
      }

      private int hJKNINOGIEB_ ;
      /**
       * <code>uint32 HJKNINOGIEB = 13;</code>
       * @return The hJKNINOGIEB.
       */
      @java.lang.Override
      public int getHJKNINOGIEB() {
        return hJKNINOGIEB_;
      }
      /**
       * <code>uint32 HJKNINOGIEB = 13;</code>
       * @param value The hJKNINOGIEB to set.
       * @return This builder for chaining.
       */
      public Builder setHJKNINOGIEB(int value) {
        
        hJKNINOGIEB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 HJKNINOGIEB = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearHJKNINOGIEB() {
        
        hJKNINOGIEB_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 7;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 7;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 14;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 14;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private int kCFNBHCMLKM_ ;
      /**
       * <code>uint32 KCFNBHCMLKM = 12;</code>
       * @return The kCFNBHCMLKM.
       */
      @java.lang.Override
      public int getKCFNBHCMLKM() {
        return kCFNBHCMLKM_;
      }
      /**
       * <code>uint32 KCFNBHCMLKM = 12;</code>
       * @param value The kCFNBHCMLKM to set.
       * @return This builder for chaining.
       */
      public Builder setKCFNBHCMLKM(int value) {
        
        kCFNBHCMLKM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 KCFNBHCMLKM = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearKCFNBHCMLKM() {
        
        kCFNBHCMLKM_ = 0;
        onChanged();
        return this;
      }

      private int totalNum_ ;
      /**
       * <code>uint32 total_num = 2;</code>
       * @return The totalNum.
       */
      @java.lang.Override
      public int getTotalNum() {
        return totalNum_;
      }
      /**
       * <code>uint32 total_num = 2;</code>
       * @param value The totalNum to set.
       * @return This builder for chaining.
       */
      public Builder setTotalNum(int value) {
        
        totalNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_num = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalNum() {
        
        totalNum_ = 0;
        onChanged();
        return this;
      }

      private int kKPPMGBGBKH_ ;
      /**
       * <code>uint32 KKPPMGBGBKH = 6;</code>
       * @return The kKPPMGBGBKH.
       */
      @java.lang.Override
      public int getKKPPMGBGBKH() {
        return kKPPMGBGBKH_;
      }
      /**
       * <code>uint32 KKPPMGBGBKH = 6;</code>
       * @param value The kKPPMGBGBKH to set.
       * @return This builder for chaining.
       */
      public Builder setKKPPMGBGBKH(int value) {
        
        kKPPMGBGBKH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 KKPPMGBGBKH = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearKKPPMGBGBKH() {
        
        kKPPMGBGBKH_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinish_ ;
      /**
       * <code>bool is_finish = 10;</code>
       * @return The isFinish.
       */
      @java.lang.Override
      public boolean getIsFinish() {
        return isFinish_;
      }
      /**
       * <code>bool is_finish = 10;</code>
       * @param value The isFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinish(boolean value) {
        
        isFinish_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finish = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinish() {
        
        isFinish_ = false;
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


      // @@protoc_insertion_point(builder_scope:FPEPLJDLDOM)
    }

    // @@protoc_insertion_point(class_scope:FPEPLJDLDOM)
    private static final emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM();
    }

    public static emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FPEPLJDLDOM>
        PARSER = new com.google.protobuf.AbstractParser<FPEPLJDLDOM>() {
      @java.lang.Override
      public FPEPLJDLDOM parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FPEPLJDLDOM(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FPEPLJDLDOM> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FPEPLJDLDOM> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FPEPLJDLDOMOuterClass.FPEPLJDLDOM getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FPEPLJDLDOM_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FPEPLJDLDOM_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021FPEPLJDLDOM.proto\"\250\001\n\013FPEPLJDLDOM\022\023\n\013N" +
      "GPJGIOCNEH\030\001 \001(\010\022\023\n\013HJKNINOGIEB\030\r \001(\r\022\020\n" +
      "\010level_id\030\007 \001(\r\022\r\n\005score\030\016 \001(\r\022\023\n\013KCFNBH" +
      "CMLKM\030\014 \001(\r\022\021\n\ttotal_num\030\002 \001(\r\022\023\n\013KKPPMG" +
      "BGBKH\030\006 \001(\r\022\021\n\tis_finish\030\n \001(\010B\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FPEPLJDLDOM_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FPEPLJDLDOM_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FPEPLJDLDOM_descriptor,
        new java.lang.String[] { "NGPJGIOCNEH", "HJKNINOGIEB", "LevelId", "Score", "KCFNBHCMLKM", "TotalNum", "KKPPMGBGBKH", "IsFinish", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

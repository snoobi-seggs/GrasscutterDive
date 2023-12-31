// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WindFieldGalleryChallengeInfoNotify.proto

package emu.grasscutter.net.proto;

public final class WindFieldGalleryChallengeInfoNotifyOuterClass {
  private WindFieldGalleryChallengeInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WindFieldGalleryChallengeInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WindFieldGalleryChallengeInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_start = 7;</code>
     * @return The isStart.
     */
    boolean getIsStart();

    /**
     * <code>uint32 GCMNEADPFBH = 2;</code>
     * @return The gCMNEADPFBH.
     */
    int getGCMNEADPFBH();

    /**
     * <code>uint32 EHLLLIJFOJG = 3;</code>
     * @return The eHLLLIJFOJG.
     */
    int getEHLLLIJFOJG();

    /**
     * <code>uint32 OKJOJDABKGC = 9;</code>
     * @return The oKJOJDABKGC.
     */
    int getOKJOJDABKGC();

    /**
     * <code>uint32 DPOBEKFGJOP = 11;</code>
     * @return The dPOBEKFGJOP.
     */
    int getDPOBEKFGJOP();

    /**
     * <code>bool is_success = 14;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>uint32 KJCLNIGPNDF = 5;</code>
     * @return The kJCLNIGPNDF.
     */
    int getKJCLNIGPNDF();
  }
  /**
   * <pre>
   * CmdId: 23657
   * Obf: OEBEJDAIKIP
   * </pre>
   *
   * Protobuf type {@code WindFieldGalleryChallengeInfoNotify}
   */
  public static final class WindFieldGalleryChallengeInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WindFieldGalleryChallengeInfoNotify)
      WindFieldGalleryChallengeInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WindFieldGalleryChallengeInfoNotify.newBuilder() to construct.
    private WindFieldGalleryChallengeInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WindFieldGalleryChallengeInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WindFieldGalleryChallengeInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WindFieldGalleryChallengeInfoNotify(
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
            case 16: {

              gCMNEADPFBH_ = input.readUInt32();
              break;
            }
            case 24: {

              eHLLLIJFOJG_ = input.readUInt32();
              break;
            }
            case 40: {

              kJCLNIGPNDF_ = input.readUInt32();
              break;
            }
            case 56: {

              isStart_ = input.readBool();
              break;
            }
            case 72: {

              oKJOJDABKGC_ = input.readUInt32();
              break;
            }
            case 88: {

              dPOBEKFGJOP_ = input.readUInt32();
              break;
            }
            case 112: {

              isSuccess_ = input.readBool();
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
      return emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.internal_static_WindFieldGalleryChallengeInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.internal_static_WindFieldGalleryChallengeInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify.class, emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify.Builder.class);
    }

    public static final int IS_START_FIELD_NUMBER = 7;
    private boolean isStart_;
    /**
     * <code>bool is_start = 7;</code>
     * @return The isStart.
     */
    @java.lang.Override
    public boolean getIsStart() {
      return isStart_;
    }

    public static final int GCMNEADPFBH_FIELD_NUMBER = 2;
    private int gCMNEADPFBH_;
    /**
     * <code>uint32 GCMNEADPFBH = 2;</code>
     * @return The gCMNEADPFBH.
     */
    @java.lang.Override
    public int getGCMNEADPFBH() {
      return gCMNEADPFBH_;
    }

    public static final int EHLLLIJFOJG_FIELD_NUMBER = 3;
    private int eHLLLIJFOJG_;
    /**
     * <code>uint32 EHLLLIJFOJG = 3;</code>
     * @return The eHLLLIJFOJG.
     */
    @java.lang.Override
    public int getEHLLLIJFOJG() {
      return eHLLLIJFOJG_;
    }

    public static final int OKJOJDABKGC_FIELD_NUMBER = 9;
    private int oKJOJDABKGC_;
    /**
     * <code>uint32 OKJOJDABKGC = 9;</code>
     * @return The oKJOJDABKGC.
     */
    @java.lang.Override
    public int getOKJOJDABKGC() {
      return oKJOJDABKGC_;
    }

    public static final int DPOBEKFGJOP_FIELD_NUMBER = 11;
    private int dPOBEKFGJOP_;
    /**
     * <code>uint32 DPOBEKFGJOP = 11;</code>
     * @return The dPOBEKFGJOP.
     */
    @java.lang.Override
    public int getDPOBEKFGJOP() {
      return dPOBEKFGJOP_;
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 14;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 14;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int KJCLNIGPNDF_FIELD_NUMBER = 5;
    private int kJCLNIGPNDF_;
    /**
     * <code>uint32 KJCLNIGPNDF = 5;</code>
     * @return The kJCLNIGPNDF.
     */
    @java.lang.Override
    public int getKJCLNIGPNDF() {
      return kJCLNIGPNDF_;
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
      if (gCMNEADPFBH_ != 0) {
        output.writeUInt32(2, gCMNEADPFBH_);
      }
      if (eHLLLIJFOJG_ != 0) {
        output.writeUInt32(3, eHLLLIJFOJG_);
      }
      if (kJCLNIGPNDF_ != 0) {
        output.writeUInt32(5, kJCLNIGPNDF_);
      }
      if (isStart_ != false) {
        output.writeBool(7, isStart_);
      }
      if (oKJOJDABKGC_ != 0) {
        output.writeUInt32(9, oKJOJDABKGC_);
      }
      if (dPOBEKFGJOP_ != 0) {
        output.writeUInt32(11, dPOBEKFGJOP_);
      }
      if (isSuccess_ != false) {
        output.writeBool(14, isSuccess_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gCMNEADPFBH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, gCMNEADPFBH_);
      }
      if (eHLLLIJFOJG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, eHLLLIJFOJG_);
      }
      if (kJCLNIGPNDF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, kJCLNIGPNDF_);
      }
      if (isStart_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isStart_);
      }
      if (oKJOJDABKGC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, oKJOJDABKGC_);
      }
      if (dPOBEKFGJOP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, dPOBEKFGJOP_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isSuccess_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify other = (emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify) obj;

      if (getIsStart()
          != other.getIsStart()) return false;
      if (getGCMNEADPFBH()
          != other.getGCMNEADPFBH()) return false;
      if (getEHLLLIJFOJG()
          != other.getEHLLLIJFOJG()) return false;
      if (getOKJOJDABKGC()
          != other.getOKJOJDABKGC()) return false;
      if (getDPOBEKFGJOP()
          != other.getDPOBEKFGJOP()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getKJCLNIGPNDF()
          != other.getKJCLNIGPNDF()) return false;
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
      hash = (37 * hash) + IS_START_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsStart());
      hash = (37 * hash) + GCMNEADPFBH_FIELD_NUMBER;
      hash = (53 * hash) + getGCMNEADPFBH();
      hash = (37 * hash) + EHLLLIJFOJG_FIELD_NUMBER;
      hash = (53 * hash) + getEHLLLIJFOJG();
      hash = (37 * hash) + OKJOJDABKGC_FIELD_NUMBER;
      hash = (53 * hash) + getOKJOJDABKGC();
      hash = (37 * hash) + DPOBEKFGJOP_FIELD_NUMBER;
      hash = (53 * hash) + getDPOBEKFGJOP();
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + KJCLNIGPNDF_FIELD_NUMBER;
      hash = (53 * hash) + getKJCLNIGPNDF();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify prototype) {
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
     * CmdId: 23657
     * Obf: OEBEJDAIKIP
     * </pre>
     *
     * Protobuf type {@code WindFieldGalleryChallengeInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WindFieldGalleryChallengeInfoNotify)
        emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.internal_static_WindFieldGalleryChallengeInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.internal_static_WindFieldGalleryChallengeInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify.class, emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify.newBuilder()
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
        isStart_ = false;

        gCMNEADPFBH_ = 0;

        eHLLLIJFOJG_ = 0;

        oKJOJDABKGC_ = 0;

        dPOBEKFGJOP_ = 0;

        isSuccess_ = false;

        kJCLNIGPNDF_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.internal_static_WindFieldGalleryChallengeInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify build() {
        emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify buildPartial() {
        emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify result = new emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify(this);
        result.isStart_ = isStart_;
        result.gCMNEADPFBH_ = gCMNEADPFBH_;
        result.eHLLLIJFOJG_ = eHLLLIJFOJG_;
        result.oKJOJDABKGC_ = oKJOJDABKGC_;
        result.dPOBEKFGJOP_ = dPOBEKFGJOP_;
        result.isSuccess_ = isSuccess_;
        result.kJCLNIGPNDF_ = kJCLNIGPNDF_;
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
        if (other instanceof emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify other) {
        if (other == emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify.getDefaultInstance()) return this;
        if (other.getIsStart() != false) {
          setIsStart(other.getIsStart());
        }
        if (other.getGCMNEADPFBH() != 0) {
          setGCMNEADPFBH(other.getGCMNEADPFBH());
        }
        if (other.getEHLLLIJFOJG() != 0) {
          setEHLLLIJFOJG(other.getEHLLLIJFOJG());
        }
        if (other.getOKJOJDABKGC() != 0) {
          setOKJOJDABKGC(other.getOKJOJDABKGC());
        }
        if (other.getDPOBEKFGJOP() != 0) {
          setDPOBEKFGJOP(other.getDPOBEKFGJOP());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getKJCLNIGPNDF() != 0) {
          setKJCLNIGPNDF(other.getKJCLNIGPNDF());
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
        emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isStart_ ;
      /**
       * <code>bool is_start = 7;</code>
       * @return The isStart.
       */
      @java.lang.Override
      public boolean getIsStart() {
        return isStart_;
      }
      /**
       * <code>bool is_start = 7;</code>
       * @param value The isStart to set.
       * @return This builder for chaining.
       */
      public Builder setIsStart(boolean value) {
        
        isStart_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_start = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsStart() {
        
        isStart_ = false;
        onChanged();
        return this;
      }

      private int gCMNEADPFBH_ ;
      /**
       * <code>uint32 GCMNEADPFBH = 2;</code>
       * @return The gCMNEADPFBH.
       */
      @java.lang.Override
      public int getGCMNEADPFBH() {
        return gCMNEADPFBH_;
      }
      /**
       * <code>uint32 GCMNEADPFBH = 2;</code>
       * @param value The gCMNEADPFBH to set.
       * @return This builder for chaining.
       */
      public Builder setGCMNEADPFBH(int value) {
        
        gCMNEADPFBH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 GCMNEADPFBH = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGCMNEADPFBH() {
        
        gCMNEADPFBH_ = 0;
        onChanged();
        return this;
      }

      private int eHLLLIJFOJG_ ;
      /**
       * <code>uint32 EHLLLIJFOJG = 3;</code>
       * @return The eHLLLIJFOJG.
       */
      @java.lang.Override
      public int getEHLLLIJFOJG() {
        return eHLLLIJFOJG_;
      }
      /**
       * <code>uint32 EHLLLIJFOJG = 3;</code>
       * @param value The eHLLLIJFOJG to set.
       * @return This builder for chaining.
       */
      public Builder setEHLLLIJFOJG(int value) {
        
        eHLLLIJFOJG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 EHLLLIJFOJG = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEHLLLIJFOJG() {
        
        eHLLLIJFOJG_ = 0;
        onChanged();
        return this;
      }

      private int oKJOJDABKGC_ ;
      /**
       * <code>uint32 OKJOJDABKGC = 9;</code>
       * @return The oKJOJDABKGC.
       */
      @java.lang.Override
      public int getOKJOJDABKGC() {
        return oKJOJDABKGC_;
      }
      /**
       * <code>uint32 OKJOJDABKGC = 9;</code>
       * @param value The oKJOJDABKGC to set.
       * @return This builder for chaining.
       */
      public Builder setOKJOJDABKGC(int value) {
        
        oKJOJDABKGC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 OKJOJDABKGC = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearOKJOJDABKGC() {
        
        oKJOJDABKGC_ = 0;
        onChanged();
        return this;
      }

      private int dPOBEKFGJOP_ ;
      /**
       * <code>uint32 DPOBEKFGJOP = 11;</code>
       * @return The dPOBEKFGJOP.
       */
      @java.lang.Override
      public int getDPOBEKFGJOP() {
        return dPOBEKFGJOP_;
      }
      /**
       * <code>uint32 DPOBEKFGJOP = 11;</code>
       * @param value The dPOBEKFGJOP to set.
       * @return This builder for chaining.
       */
      public Builder setDPOBEKFGJOP(int value) {
        
        dPOBEKFGJOP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DPOBEKFGJOP = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearDPOBEKFGJOP() {
        
        dPOBEKFGJOP_ = 0;
        onChanged();
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 14;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 14;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private int kJCLNIGPNDF_ ;
      /**
       * <code>uint32 KJCLNIGPNDF = 5;</code>
       * @return The kJCLNIGPNDF.
       */
      @java.lang.Override
      public int getKJCLNIGPNDF() {
        return kJCLNIGPNDF_;
      }
      /**
       * <code>uint32 KJCLNIGPNDF = 5;</code>
       * @param value The kJCLNIGPNDF to set.
       * @return This builder for chaining.
       */
      public Builder setKJCLNIGPNDF(int value) {
        
        kJCLNIGPNDF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 KJCLNIGPNDF = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearKJCLNIGPNDF() {
        
        kJCLNIGPNDF_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WindFieldGalleryChallengeInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:WindFieldGalleryChallengeInfoNotify)
    private static final emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify();
    }

    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WindFieldGalleryChallengeInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<WindFieldGalleryChallengeInfoNotify>() {
      @java.lang.Override
      public WindFieldGalleryChallengeInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WindFieldGalleryChallengeInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WindFieldGalleryChallengeInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WindFieldGalleryChallengeInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WindFieldGalleryChallengeInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WindFieldGalleryChallengeInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)WindFieldGalleryChallengeInfoNotify.pr" +
      "oto\"\264\001\n#WindFieldGalleryChallengeInfoNot" +
      "ify\022\020\n\010is_start\030\007 \001(\010\022\023\n\013GCMNEADPFBH\030\002 \001" +
      "(\r\022\023\n\013EHLLLIJFOJG\030\003 \001(\r\022\023\n\013OKJOJDABKGC\030\t" +
      " \001(\r\022\023\n\013DPOBEKFGJOP\030\013 \001(\r\022\022\n\nis_success\030" +
      "\016 \001(\010\022\023\n\013KJCLNIGPNDF\030\005 \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WindFieldGalleryChallengeInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WindFieldGalleryChallengeInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WindFieldGalleryChallengeInfoNotify_descriptor,
        new java.lang.String[] { "IsStart", "GCMNEADPFBH", "EHLLLIJFOJG", "OKJOJDABKGC", "DPOBEKFGJOP", "IsSuccess", "KJCLNIGPNDF", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

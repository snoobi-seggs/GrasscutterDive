// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryEffigyChallengeV2Info.proto

package emu.grasscutter.net.proto;

public final class SceneGalleryEffigyChallengeV2InfoOuterClass {
  private SceneGalleryEffigyChallengeV2InfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryEffigyChallengeV2InfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryEffigyChallengeV2Info)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 ODKJDPOBACG = 9;</code>
     * @return The oDKJDPOBACG.
     */
    int getODKJDPOBACG();

    /**
     * <code>uint32 AAHLNAJKEKM = 12;</code>
     * @return The aAHLNAJKEKM.
     */
    int getAAHLNAJKEKM();

    /**
     * <code>uint32 OJBEAGBINFI = 1;</code>
     * @return The oJBEAGBINFI.
     */
    int getOJBEAGBINFI();

    /**
     * <code>uint32 ENGBIEPJBII = 5;</code>
     * @return The eNGBIEPJBII.
     */
    int getENGBIEPJBII();

    /**
     * <code>uint32 GFHLKGPONED = 7;</code>
     * @return The gFHLKGPONED.
     */
    int getGFHLKGPONED();
  }
  /**
   * <pre>
   * Obf: MPICHLLJNPG
   * </pre>
   *
   * Protobuf type {@code SceneGalleryEffigyChallengeV2Info}
   */
  public static final class SceneGalleryEffigyChallengeV2Info extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryEffigyChallengeV2Info)
      SceneGalleryEffigyChallengeV2InfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryEffigyChallengeV2Info.newBuilder() to construct.
    private SceneGalleryEffigyChallengeV2Info(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryEffigyChallengeV2Info() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryEffigyChallengeV2Info();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryEffigyChallengeV2Info(
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

              oJBEAGBINFI_ = input.readUInt32();
              break;
            }
            case 40: {

              eNGBIEPJBII_ = input.readUInt32();
              break;
            }
            case 56: {

              gFHLKGPONED_ = input.readUInt32();
              break;
            }
            case 72: {

              oDKJDPOBACG_ = input.readUInt32();
              break;
            }
            case 96: {

              aAHLNAJKEKM_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.internal_static_SceneGalleryEffigyChallengeV2Info_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.internal_static_SceneGalleryEffigyChallengeV2Info_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info.class, emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info.Builder.class);
    }

    public static final int ODKJDPOBACG_FIELD_NUMBER = 9;
    private int oDKJDPOBACG_;
    /**
     * <code>uint32 ODKJDPOBACG = 9;</code>
     * @return The oDKJDPOBACG.
     */
    @java.lang.Override
    public int getODKJDPOBACG() {
      return oDKJDPOBACG_;
    }

    public static final int AAHLNAJKEKM_FIELD_NUMBER = 12;
    private int aAHLNAJKEKM_;
    /**
     * <code>uint32 AAHLNAJKEKM = 12;</code>
     * @return The aAHLNAJKEKM.
     */
    @java.lang.Override
    public int getAAHLNAJKEKM() {
      return aAHLNAJKEKM_;
    }

    public static final int OJBEAGBINFI_FIELD_NUMBER = 1;
    private int oJBEAGBINFI_;
    /**
     * <code>uint32 OJBEAGBINFI = 1;</code>
     * @return The oJBEAGBINFI.
     */
    @java.lang.Override
    public int getOJBEAGBINFI() {
      return oJBEAGBINFI_;
    }

    public static final int ENGBIEPJBII_FIELD_NUMBER = 5;
    private int eNGBIEPJBII_;
    /**
     * <code>uint32 ENGBIEPJBII = 5;</code>
     * @return The eNGBIEPJBII.
     */
    @java.lang.Override
    public int getENGBIEPJBII() {
      return eNGBIEPJBII_;
    }

    public static final int GFHLKGPONED_FIELD_NUMBER = 7;
    private int gFHLKGPONED_;
    /**
     * <code>uint32 GFHLKGPONED = 7;</code>
     * @return The gFHLKGPONED.
     */
    @java.lang.Override
    public int getGFHLKGPONED() {
      return gFHLKGPONED_;
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
      if (oJBEAGBINFI_ != 0) {
        output.writeUInt32(1, oJBEAGBINFI_);
      }
      if (eNGBIEPJBII_ != 0) {
        output.writeUInt32(5, eNGBIEPJBII_);
      }
      if (gFHLKGPONED_ != 0) {
        output.writeUInt32(7, gFHLKGPONED_);
      }
      if (oDKJDPOBACG_ != 0) {
        output.writeUInt32(9, oDKJDPOBACG_);
      }
      if (aAHLNAJKEKM_ != 0) {
        output.writeUInt32(12, aAHLNAJKEKM_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (oJBEAGBINFI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, oJBEAGBINFI_);
      }
      if (eNGBIEPJBII_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, eNGBIEPJBII_);
      }
      if (gFHLKGPONED_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, gFHLKGPONED_);
      }
      if (oDKJDPOBACG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, oDKJDPOBACG_);
      }
      if (aAHLNAJKEKM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, aAHLNAJKEKM_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info other = (emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info) obj;

      if (getODKJDPOBACG()
          != other.getODKJDPOBACG()) return false;
      if (getAAHLNAJKEKM()
          != other.getAAHLNAJKEKM()) return false;
      if (getOJBEAGBINFI()
          != other.getOJBEAGBINFI()) return false;
      if (getENGBIEPJBII()
          != other.getENGBIEPJBII()) return false;
      if (getGFHLKGPONED()
          != other.getGFHLKGPONED()) return false;
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
      hash = (37 * hash) + ODKJDPOBACG_FIELD_NUMBER;
      hash = (53 * hash) + getODKJDPOBACG();
      hash = (37 * hash) + AAHLNAJKEKM_FIELD_NUMBER;
      hash = (53 * hash) + getAAHLNAJKEKM();
      hash = (37 * hash) + OJBEAGBINFI_FIELD_NUMBER;
      hash = (53 * hash) + getOJBEAGBINFI();
      hash = (37 * hash) + ENGBIEPJBII_FIELD_NUMBER;
      hash = (53 * hash) + getENGBIEPJBII();
      hash = (37 * hash) + GFHLKGPONED_FIELD_NUMBER;
      hash = (53 * hash) + getGFHLKGPONED();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info prototype) {
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
     * Obf: MPICHLLJNPG
     * </pre>
     *
     * Protobuf type {@code SceneGalleryEffigyChallengeV2Info}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryEffigyChallengeV2Info)
        emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2InfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.internal_static_SceneGalleryEffigyChallengeV2Info_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.internal_static_SceneGalleryEffigyChallengeV2Info_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info.class, emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info.newBuilder()
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
        oDKJDPOBACG_ = 0;

        aAHLNAJKEKM_ = 0;

        oJBEAGBINFI_ = 0;

        eNGBIEPJBII_ = 0;

        gFHLKGPONED_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.internal_static_SceneGalleryEffigyChallengeV2Info_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info build() {
        emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info buildPartial() {
        emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info result = new emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info(this);
        result.oDKJDPOBACG_ = oDKJDPOBACG_;
        result.aAHLNAJKEKM_ = aAHLNAJKEKM_;
        result.oJBEAGBINFI_ = oJBEAGBINFI_;
        result.eNGBIEPJBII_ = eNGBIEPJBII_;
        result.gFHLKGPONED_ = gFHLKGPONED_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info other) {
        if (other == emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info.getDefaultInstance()) return this;
        if (other.getODKJDPOBACG() != 0) {
          setODKJDPOBACG(other.getODKJDPOBACG());
        }
        if (other.getAAHLNAJKEKM() != 0) {
          setAAHLNAJKEKM(other.getAAHLNAJKEKM());
        }
        if (other.getOJBEAGBINFI() != 0) {
          setOJBEAGBINFI(other.getOJBEAGBINFI());
        }
        if (other.getENGBIEPJBII() != 0) {
          setENGBIEPJBII(other.getENGBIEPJBII());
        }
        if (other.getGFHLKGPONED() != 0) {
          setGFHLKGPONED(other.getGFHLKGPONED());
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
        emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int oDKJDPOBACG_ ;
      /**
       * <code>uint32 ODKJDPOBACG = 9;</code>
       * @return The oDKJDPOBACG.
       */
      @java.lang.Override
      public int getODKJDPOBACG() {
        return oDKJDPOBACG_;
      }
      /**
       * <code>uint32 ODKJDPOBACG = 9;</code>
       * @param value The oDKJDPOBACG to set.
       * @return This builder for chaining.
       */
      public Builder setODKJDPOBACG(int value) {
        
        oDKJDPOBACG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ODKJDPOBACG = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearODKJDPOBACG() {
        
        oDKJDPOBACG_ = 0;
        onChanged();
        return this;
      }

      private int aAHLNAJKEKM_ ;
      /**
       * <code>uint32 AAHLNAJKEKM = 12;</code>
       * @return The aAHLNAJKEKM.
       */
      @java.lang.Override
      public int getAAHLNAJKEKM() {
        return aAHLNAJKEKM_;
      }
      /**
       * <code>uint32 AAHLNAJKEKM = 12;</code>
       * @param value The aAHLNAJKEKM to set.
       * @return This builder for chaining.
       */
      public Builder setAAHLNAJKEKM(int value) {
        
        aAHLNAJKEKM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 AAHLNAJKEKM = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearAAHLNAJKEKM() {
        
        aAHLNAJKEKM_ = 0;
        onChanged();
        return this;
      }

      private int oJBEAGBINFI_ ;
      /**
       * <code>uint32 OJBEAGBINFI = 1;</code>
       * @return The oJBEAGBINFI.
       */
      @java.lang.Override
      public int getOJBEAGBINFI() {
        return oJBEAGBINFI_;
      }
      /**
       * <code>uint32 OJBEAGBINFI = 1;</code>
       * @param value The oJBEAGBINFI to set.
       * @return This builder for chaining.
       */
      public Builder setOJBEAGBINFI(int value) {
        
        oJBEAGBINFI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 OJBEAGBINFI = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearOJBEAGBINFI() {
        
        oJBEAGBINFI_ = 0;
        onChanged();
        return this;
      }

      private int eNGBIEPJBII_ ;
      /**
       * <code>uint32 ENGBIEPJBII = 5;</code>
       * @return The eNGBIEPJBII.
       */
      @java.lang.Override
      public int getENGBIEPJBII() {
        return eNGBIEPJBII_;
      }
      /**
       * <code>uint32 ENGBIEPJBII = 5;</code>
       * @param value The eNGBIEPJBII to set.
       * @return This builder for chaining.
       */
      public Builder setENGBIEPJBII(int value) {
        
        eNGBIEPJBII_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ENGBIEPJBII = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearENGBIEPJBII() {
        
        eNGBIEPJBII_ = 0;
        onChanged();
        return this;
      }

      private int gFHLKGPONED_ ;
      /**
       * <code>uint32 GFHLKGPONED = 7;</code>
       * @return The gFHLKGPONED.
       */
      @java.lang.Override
      public int getGFHLKGPONED() {
        return gFHLKGPONED_;
      }
      /**
       * <code>uint32 GFHLKGPONED = 7;</code>
       * @param value The gFHLKGPONED to set.
       * @return This builder for chaining.
       */
      public Builder setGFHLKGPONED(int value) {
        
        gFHLKGPONED_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 GFHLKGPONED = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearGFHLKGPONED() {
        
        gFHLKGPONED_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryEffigyChallengeV2Info)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryEffigyChallengeV2Info)
    private static final emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info();
    }

    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryEffigyChallengeV2Info>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryEffigyChallengeV2Info>() {
      @java.lang.Override
      public SceneGalleryEffigyChallengeV2Info parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryEffigyChallengeV2Info(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryEffigyChallengeV2Info> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryEffigyChallengeV2Info> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryEffigyChallengeV2Info_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryEffigyChallengeV2Info_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'SceneGalleryEffigyChallengeV2Info.prot" +
      "o\"\214\001\n!SceneGalleryEffigyChallengeV2Info\022" +
      "\023\n\013ODKJDPOBACG\030\t \001(\r\022\023\n\013AAHLNAJKEKM\030\014 \001(" +
      "\r\022\023\n\013OJBEAGBINFI\030\001 \001(\r\022\023\n\013ENGBIEPJBII\030\005 " +
      "\001(\r\022\023\n\013GFHLKGPONED\030\007 \001(\rB\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryEffigyChallengeV2Info_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryEffigyChallengeV2Info_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryEffigyChallengeV2Info_descriptor,
        new java.lang.String[] { "ODKJDPOBACG", "AAHLNAJKEKM", "OJBEAGBINFI", "ENGBIEPJBII", "GFHLKGPONED", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GDPNILLIJCJ.proto

package emu.grasscutter.net.proto;

public final class GDPNILLIJCJOuterClass {
  private GDPNILLIJCJOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GDPNILLIJCJOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GDPNILLIJCJ)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 CEGBPCMMEKG = 10;</code>
     * @return The cEGBPCMMEKG.
     */
    int getCEGBPCMMEKG();

    /**
     * <code>.IONAPMPJOBP OHMODGBNODK = 9;</code>
     * @return Whether the oHMODGBNODK field is set.
     */
    boolean hasOHMODGBNODK();
    /**
     * <code>.IONAPMPJOBP OHMODGBNODK = 9;</code>
     * @return The oHMODGBNODK.
     */
    emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBP getOHMODGBNODK();
    /**
     * <code>.IONAPMPJOBP OHMODGBNODK = 9;</code>
     */
    emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBPOrBuilder getOHMODGBNODKOrBuilder();

    /**
     * <code>repeated uint32 OLNJNLAMEOG = 12;</code>
     * @return A list containing the oLNJNLAMEOG.
     */
    java.util.List<java.lang.Integer> getOLNJNLAMEOGList();
    /**
     * <code>repeated uint32 OLNJNLAMEOG = 12;</code>
     * @return The count of oLNJNLAMEOG.
     */
    int getOLNJNLAMEOGCount();
    /**
     * <code>repeated uint32 OLNJNLAMEOG = 12;</code>
     * @param index The index of the element to return.
     * @return The oLNJNLAMEOG at the given index.
     */
    int getOLNJNLAMEOG(int index);
  }
  /**
   * <pre>
   * CmdId: 9561
   * </pre>
   *
   * Protobuf type {@code GDPNILLIJCJ}
   */
  public static final class GDPNILLIJCJ extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GDPNILLIJCJ)
      GDPNILLIJCJOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GDPNILLIJCJ.newBuilder() to construct.
    private GDPNILLIJCJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GDPNILLIJCJ() {
      oLNJNLAMEOG_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GDPNILLIJCJ();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GDPNILLIJCJ(
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
            case 74: {
              emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBP.Builder subBuilder = null;
              if (oHMODGBNODK_ != null) {
                subBuilder = oHMODGBNODK_.toBuilder();
              }
              oHMODGBNODK_ = input.readMessage(emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBP.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(oHMODGBNODK_);
                oHMODGBNODK_ = subBuilder.buildPartial();
              }

              break;
            }
            case 80: {

              cEGBPCMMEKG_ = input.readUInt32();
              break;
            }
            case 96: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                oLNJNLAMEOG_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              oLNJNLAMEOG_.addInt(input.readUInt32());
              break;
            }
            case 98: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                oLNJNLAMEOG_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                oLNJNLAMEOG_.addInt(input.readUInt32());
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
          oLNJNLAMEOG_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.internal_static_GDPNILLIJCJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.internal_static_GDPNILLIJCJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ.class, emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ.Builder.class);
    }

    public static final int CEGBPCMMEKG_FIELD_NUMBER = 10;
    private int cEGBPCMMEKG_;
    /**
     * <code>uint32 CEGBPCMMEKG = 10;</code>
     * @return The cEGBPCMMEKG.
     */
    @java.lang.Override
    public int getCEGBPCMMEKG() {
      return cEGBPCMMEKG_;
    }

    public static final int OHMODGBNODK_FIELD_NUMBER = 9;
    private emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBP oHMODGBNODK_;
    /**
     * <code>.IONAPMPJOBP OHMODGBNODK = 9;</code>
     * @return Whether the oHMODGBNODK field is set.
     */
    @java.lang.Override
    public boolean hasOHMODGBNODK() {
      return oHMODGBNODK_ != null;
    }
    /**
     * <code>.IONAPMPJOBP OHMODGBNODK = 9;</code>
     * @return The oHMODGBNODK.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBP getOHMODGBNODK() {
      return oHMODGBNODK_ == null ? emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBP.getDefaultInstance() : oHMODGBNODK_;
    }
    /**
     * <code>.IONAPMPJOBP OHMODGBNODK = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBPOrBuilder getOHMODGBNODKOrBuilder() {
      return getOHMODGBNODK();
    }

    public static final int OLNJNLAMEOG_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList oLNJNLAMEOG_;
    /**
     * <code>repeated uint32 OLNJNLAMEOG = 12;</code>
     * @return A list containing the oLNJNLAMEOG.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getOLNJNLAMEOGList() {
      return oLNJNLAMEOG_;
    }
    /**
     * <code>repeated uint32 OLNJNLAMEOG = 12;</code>
     * @return The count of oLNJNLAMEOG.
     */
    public int getOLNJNLAMEOGCount() {
      return oLNJNLAMEOG_.size();
    }
    /**
     * <code>repeated uint32 OLNJNLAMEOG = 12;</code>
     * @param index The index of the element to return.
     * @return The oLNJNLAMEOG at the given index.
     */
    public int getOLNJNLAMEOG(int index) {
      return oLNJNLAMEOG_.getInt(index);
    }
    private int oLNJNLAMEOGMemoizedSerializedSize = -1;

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
      if (oHMODGBNODK_ != null) {
        output.writeMessage(9, getOHMODGBNODK());
      }
      if (cEGBPCMMEKG_ != 0) {
        output.writeUInt32(10, cEGBPCMMEKG_);
      }
      if (getOLNJNLAMEOGList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(oLNJNLAMEOGMemoizedSerializedSize);
      }
      for (int i = 0; i < oLNJNLAMEOG_.size(); i++) {
        output.writeUInt32NoTag(oLNJNLAMEOG_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (oHMODGBNODK_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getOHMODGBNODK());
      }
      if (cEGBPCMMEKG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, cEGBPCMMEKG_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < oLNJNLAMEOG_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(oLNJNLAMEOG_.getInt(i));
        }
        size += dataSize;
        if (!getOLNJNLAMEOGList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        oLNJNLAMEOGMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ other = (emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ) obj;

      if (getCEGBPCMMEKG()
          != other.getCEGBPCMMEKG()) return false;
      if (hasOHMODGBNODK() != other.hasOHMODGBNODK()) return false;
      if (hasOHMODGBNODK()) {
        if (!getOHMODGBNODK()
            .equals(other.getOHMODGBNODK())) return false;
      }
      if (!getOLNJNLAMEOGList()
          .equals(other.getOLNJNLAMEOGList())) return false;
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
      hash = (37 * hash) + CEGBPCMMEKG_FIELD_NUMBER;
      hash = (53 * hash) + getCEGBPCMMEKG();
      if (hasOHMODGBNODK()) {
        hash = (37 * hash) + OHMODGBNODK_FIELD_NUMBER;
        hash = (53 * hash) + getOHMODGBNODK().hashCode();
      }
      if (getOLNJNLAMEOGCount() > 0) {
        hash = (37 * hash) + OLNJNLAMEOG_FIELD_NUMBER;
        hash = (53 * hash) + getOLNJNLAMEOGList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ prototype) {
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
     * CmdId: 9561
     * </pre>
     *
     * Protobuf type {@code GDPNILLIJCJ}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GDPNILLIJCJ)
        emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.internal_static_GDPNILLIJCJ_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.internal_static_GDPNILLIJCJ_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ.class, emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ.newBuilder()
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
        cEGBPCMMEKG_ = 0;

        if (oHMODGBNODKBuilder_ == null) {
          oHMODGBNODK_ = null;
        } else {
          oHMODGBNODK_ = null;
          oHMODGBNODKBuilder_ = null;
        }
        oLNJNLAMEOG_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.internal_static_GDPNILLIJCJ_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ build() {
        emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ buildPartial() {
        emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ result = new emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ(this);
        int from_bitField0_ = bitField0_;
        result.cEGBPCMMEKG_ = cEGBPCMMEKG_;
        if (oHMODGBNODKBuilder_ == null) {
          result.oHMODGBNODK_ = oHMODGBNODK_;
        } else {
          result.oHMODGBNODK_ = oHMODGBNODKBuilder_.build();
        }
        if (((bitField0_ & 0x00000001) != 0)) {
          oLNJNLAMEOG_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.oLNJNLAMEOG_ = oLNJNLAMEOG_;
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
        if (other instanceof emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ) {
          return mergeFrom((emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ other) {
        if (other == emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ.getDefaultInstance()) return this;
        if (other.getCEGBPCMMEKG() != 0) {
          setCEGBPCMMEKG(other.getCEGBPCMMEKG());
        }
        if (other.hasOHMODGBNODK()) {
          mergeOHMODGBNODK(other.getOHMODGBNODK());
        }
        if (!other.oLNJNLAMEOG_.isEmpty()) {
          if (oLNJNLAMEOG_.isEmpty()) {
            oLNJNLAMEOG_ = other.oLNJNLAMEOG_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOLNJNLAMEOGIsMutable();
            oLNJNLAMEOG_.addAll(other.oLNJNLAMEOG_);
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
        emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int cEGBPCMMEKG_ ;
      /**
       * <code>uint32 CEGBPCMMEKG = 10;</code>
       * @return The cEGBPCMMEKG.
       */
      @java.lang.Override
      public int getCEGBPCMMEKG() {
        return cEGBPCMMEKG_;
      }
      /**
       * <code>uint32 CEGBPCMMEKG = 10;</code>
       * @param value The cEGBPCMMEKG to set.
       * @return This builder for chaining.
       */
      public Builder setCEGBPCMMEKG(int value) {
        
        cEGBPCMMEKG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 CEGBPCMMEKG = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCEGBPCMMEKG() {
        
        cEGBPCMMEKG_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBP oHMODGBNODK_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBP, emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBP.Builder, emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBPOrBuilder> oHMODGBNODKBuilder_;
      /**
       * <code>.IONAPMPJOBP OHMODGBNODK = 9;</code>
       * @return Whether the oHMODGBNODK field is set.
       */
      public boolean hasOHMODGBNODK() {
        return oHMODGBNODKBuilder_ != null || oHMODGBNODK_ != null;
      }
      /**
       * <code>.IONAPMPJOBP OHMODGBNODK = 9;</code>
       * @return The oHMODGBNODK.
       */
      public emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBP getOHMODGBNODK() {
        if (oHMODGBNODKBuilder_ == null) {
          return oHMODGBNODK_ == null ? emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBP.getDefaultInstance() : oHMODGBNODK_;
        } else {
          return oHMODGBNODKBuilder_.getMessage();
        }
      }
      /**
       * <code>.IONAPMPJOBP OHMODGBNODK = 9;</code>
       */
      public Builder setOHMODGBNODK(emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBP value) {
        if (oHMODGBNODKBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          oHMODGBNODK_ = value;
          onChanged();
        } else {
          oHMODGBNODKBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.IONAPMPJOBP OHMODGBNODK = 9;</code>
       */
      public Builder setOHMODGBNODK(
          emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBP.Builder builderForValue) {
        if (oHMODGBNODKBuilder_ == null) {
          oHMODGBNODK_ = builderForValue.build();
          onChanged();
        } else {
          oHMODGBNODKBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.IONAPMPJOBP OHMODGBNODK = 9;</code>
       */
      public Builder mergeOHMODGBNODK(emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBP value) {
        if (oHMODGBNODKBuilder_ == null) {
          if (oHMODGBNODK_ != null) {
            oHMODGBNODK_ =
              emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBP.newBuilder(oHMODGBNODK_).mergeFrom(value).buildPartial();
          } else {
            oHMODGBNODK_ = value;
          }
          onChanged();
        } else {
          oHMODGBNODKBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.IONAPMPJOBP OHMODGBNODK = 9;</code>
       */
      public Builder clearOHMODGBNODK() {
        if (oHMODGBNODKBuilder_ == null) {
          oHMODGBNODK_ = null;
          onChanged();
        } else {
          oHMODGBNODK_ = null;
          oHMODGBNODKBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.IONAPMPJOBP OHMODGBNODK = 9;</code>
       */
      public emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBP.Builder getOHMODGBNODKBuilder() {
        
        onChanged();
        return getOHMODGBNODKFieldBuilder().getBuilder();
      }
      /**
       * <code>.IONAPMPJOBP OHMODGBNODK = 9;</code>
       */
      public emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBPOrBuilder getOHMODGBNODKOrBuilder() {
        if (oHMODGBNODKBuilder_ != null) {
          return oHMODGBNODKBuilder_.getMessageOrBuilder();
        } else {
          return oHMODGBNODK_ == null ?
              emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBP.getDefaultInstance() : oHMODGBNODK_;
        }
      }
      /**
       * <code>.IONAPMPJOBP OHMODGBNODK = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBP, emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBP.Builder, emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBPOrBuilder> 
          getOHMODGBNODKFieldBuilder() {
        if (oHMODGBNODKBuilder_ == null) {
          oHMODGBNODKBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBP, emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBP.Builder, emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.IONAPMPJOBPOrBuilder>(
                  getOHMODGBNODK(),
                  getParentForChildren(),
                  isClean());
          oHMODGBNODK_ = null;
        }
        return oHMODGBNODKBuilder_;
      }

      private com.google.protobuf.Internal.IntList oLNJNLAMEOG_ = emptyIntList();
      private void ensureOLNJNLAMEOGIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          oLNJNLAMEOG_ = mutableCopy(oLNJNLAMEOG_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 OLNJNLAMEOG = 12;</code>
       * @return A list containing the oLNJNLAMEOG.
       */
      public java.util.List<java.lang.Integer>
          getOLNJNLAMEOGList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(oLNJNLAMEOG_) : oLNJNLAMEOG_;
      }
      /**
       * <code>repeated uint32 OLNJNLAMEOG = 12;</code>
       * @return The count of oLNJNLAMEOG.
       */
      public int getOLNJNLAMEOGCount() {
        return oLNJNLAMEOG_.size();
      }
      /**
       * <code>repeated uint32 OLNJNLAMEOG = 12;</code>
       * @param index The index of the element to return.
       * @return The oLNJNLAMEOG at the given index.
       */
      public int getOLNJNLAMEOG(int index) {
        return oLNJNLAMEOG_.getInt(index);
      }
      /**
       * <code>repeated uint32 OLNJNLAMEOG = 12;</code>
       * @param index The index to set the value at.
       * @param value The oLNJNLAMEOG to set.
       * @return This builder for chaining.
       */
      public Builder setOLNJNLAMEOG(
          int index, int value) {
        ensureOLNJNLAMEOGIsMutable();
        oLNJNLAMEOG_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 OLNJNLAMEOG = 12;</code>
       * @param value The oLNJNLAMEOG to add.
       * @return This builder for chaining.
       */
      public Builder addOLNJNLAMEOG(int value) {
        ensureOLNJNLAMEOGIsMutable();
        oLNJNLAMEOG_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 OLNJNLAMEOG = 12;</code>
       * @param values The oLNJNLAMEOG to add.
       * @return This builder for chaining.
       */
      public Builder addAllOLNJNLAMEOG(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureOLNJNLAMEOGIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, oLNJNLAMEOG_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 OLNJNLAMEOG = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearOLNJNLAMEOG() {
        oLNJNLAMEOG_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:GDPNILLIJCJ)
    }

    // @@protoc_insertion_point(class_scope:GDPNILLIJCJ)
    private static final emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ();
    }

    public static emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GDPNILLIJCJ>
        PARSER = new com.google.protobuf.AbstractParser<GDPNILLIJCJ>() {
      @java.lang.Override
      public GDPNILLIJCJ parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GDPNILLIJCJ(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GDPNILLIJCJ> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GDPNILLIJCJ> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GDPNILLIJCJOuterClass.GDPNILLIJCJ getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GDPNILLIJCJ_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GDPNILLIJCJ_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021GDPNILLIJCJ.proto\032\021IONAPMPJOBP.proto\"Z" +
      "\n\013GDPNILLIJCJ\022\023\n\013CEGBPCMMEKG\030\n \001(\r\022!\n\013OH" +
      "MODGBNODK\030\t \001(\0132\014.IONAPMPJOBP\022\023\n\013OLNJNLA" +
      "MEOG\030\014 \003(\rB\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.getDescriptor(),
        });
    internal_static_GDPNILLIJCJ_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GDPNILLIJCJ_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GDPNILLIJCJ_descriptor,
        new java.lang.String[] { "CEGBPCMMEKG", "OHMODGBNODK", "OLNJNLAMEOG", });
    emu.grasscutter.net.proto.IONAPMPJOBPOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

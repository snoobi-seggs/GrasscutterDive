// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryInstableSprayBuffInfo.proto

package emu.grasscutter.net.proto;

public final class SceneGalleryInstableSprayBuffInfoOuterClass {
  private SceneGalleryInstableSprayBuffInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryInstableSprayBuffInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryInstableSprayBuffInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 buff_id = 2;</code>
     * @return The buffId.
     */
    int getBuffId();

    /**
     * <code>uint64 PMDBPOPIDNL = 13;</code>
     * @return The pMDBPOPIDNL.
     */
    long getPMDBPOPIDNL();

    /**
     * <code>uint64 PCGMEOMDLJC = 8;</code>
     * @return The pCGMEOMDLJC.
     */
    long getPCGMEOMDLJC();
  }
  /**
   * <pre>
   * Obf: JAHEIIELIAN
   * </pre>
   *
   * Protobuf type {@code SceneGalleryInstableSprayBuffInfo}
   */
  public static final class SceneGalleryInstableSprayBuffInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryInstableSprayBuffInfo)
      SceneGalleryInstableSprayBuffInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryInstableSprayBuffInfo.newBuilder() to construct.
    private SceneGalleryInstableSprayBuffInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryInstableSprayBuffInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryInstableSprayBuffInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryInstableSprayBuffInfo(
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

              buffId_ = input.readUInt32();
              break;
            }
            case 64: {

              pCGMEOMDLJC_ = input.readUInt64();
              break;
            }
            case 104: {

              pMDBPOPIDNL_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.internal_static_SceneGalleryInstableSprayBuffInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.internal_static_SceneGalleryInstableSprayBuffInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo.class, emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo.Builder.class);
    }

    public static final int BUFF_ID_FIELD_NUMBER = 2;
    private int buffId_;
    /**
     * <code>uint32 buff_id = 2;</code>
     * @return The buffId.
     */
    @java.lang.Override
    public int getBuffId() {
      return buffId_;
    }

    public static final int PMDBPOPIDNL_FIELD_NUMBER = 13;
    private long pMDBPOPIDNL_;
    /**
     * <code>uint64 PMDBPOPIDNL = 13;</code>
     * @return The pMDBPOPIDNL.
     */
    @java.lang.Override
    public long getPMDBPOPIDNL() {
      return pMDBPOPIDNL_;
    }

    public static final int PCGMEOMDLJC_FIELD_NUMBER = 8;
    private long pCGMEOMDLJC_;
    /**
     * <code>uint64 PCGMEOMDLJC = 8;</code>
     * @return The pCGMEOMDLJC.
     */
    @java.lang.Override
    public long getPCGMEOMDLJC() {
      return pCGMEOMDLJC_;
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
      if (buffId_ != 0) {
        output.writeUInt32(2, buffId_);
      }
      if (pCGMEOMDLJC_ != 0L) {
        output.writeUInt64(8, pCGMEOMDLJC_);
      }
      if (pMDBPOPIDNL_ != 0L) {
        output.writeUInt64(13, pMDBPOPIDNL_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (buffId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, buffId_);
      }
      if (pCGMEOMDLJC_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(8, pCGMEOMDLJC_);
      }
      if (pMDBPOPIDNL_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(13, pMDBPOPIDNL_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo other = (emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo) obj;

      if (getBuffId()
          != other.getBuffId()) return false;
      if (getPMDBPOPIDNL()
          != other.getPMDBPOPIDNL()) return false;
      if (getPCGMEOMDLJC()
          != other.getPCGMEOMDLJC()) return false;
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
      hash = (37 * hash) + BUFF_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBuffId();
      hash = (37 * hash) + PMDBPOPIDNL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPMDBPOPIDNL());
      hash = (37 * hash) + PCGMEOMDLJC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPCGMEOMDLJC());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo prototype) {
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
     * Obf: JAHEIIELIAN
     * </pre>
     *
     * Protobuf type {@code SceneGalleryInstableSprayBuffInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryInstableSprayBuffInfo)
        emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.internal_static_SceneGalleryInstableSprayBuffInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.internal_static_SceneGalleryInstableSprayBuffInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo.class, emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo.newBuilder()
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
        buffId_ = 0;

        pMDBPOPIDNL_ = 0L;

        pCGMEOMDLJC_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.internal_static_SceneGalleryInstableSprayBuffInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo build() {
        emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo buildPartial() {
        emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo result = new emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo(this);
        result.buffId_ = buffId_;
        result.pMDBPOPIDNL_ = pMDBPOPIDNL_;
        result.pCGMEOMDLJC_ = pCGMEOMDLJC_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo other) {
        if (other == emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo.getDefaultInstance()) return this;
        if (other.getBuffId() != 0) {
          setBuffId(other.getBuffId());
        }
        if (other.getPMDBPOPIDNL() != 0L) {
          setPMDBPOPIDNL(other.getPMDBPOPIDNL());
        }
        if (other.getPCGMEOMDLJC() != 0L) {
          setPCGMEOMDLJC(other.getPCGMEOMDLJC());
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
        emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int buffId_ ;
      /**
       * <code>uint32 buff_id = 2;</code>
       * @return The buffId.
       */
      @java.lang.Override
      public int getBuffId() {
        return buffId_;
      }
      /**
       * <code>uint32 buff_id = 2;</code>
       * @param value The buffId to set.
       * @return This builder for chaining.
       */
      public Builder setBuffId(int value) {
        
        buffId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 buff_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuffId() {
        
        buffId_ = 0;
        onChanged();
        return this;
      }

      private long pMDBPOPIDNL_ ;
      /**
       * <code>uint64 PMDBPOPIDNL = 13;</code>
       * @return The pMDBPOPIDNL.
       */
      @java.lang.Override
      public long getPMDBPOPIDNL() {
        return pMDBPOPIDNL_;
      }
      /**
       * <code>uint64 PMDBPOPIDNL = 13;</code>
       * @param value The pMDBPOPIDNL to set.
       * @return This builder for chaining.
       */
      public Builder setPMDBPOPIDNL(long value) {
        
        pMDBPOPIDNL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 PMDBPOPIDNL = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearPMDBPOPIDNL() {
        
        pMDBPOPIDNL_ = 0L;
        onChanged();
        return this;
      }

      private long pCGMEOMDLJC_ ;
      /**
       * <code>uint64 PCGMEOMDLJC = 8;</code>
       * @return The pCGMEOMDLJC.
       */
      @java.lang.Override
      public long getPCGMEOMDLJC() {
        return pCGMEOMDLJC_;
      }
      /**
       * <code>uint64 PCGMEOMDLJC = 8;</code>
       * @param value The pCGMEOMDLJC to set.
       * @return This builder for chaining.
       */
      public Builder setPCGMEOMDLJC(long value) {
        
        pCGMEOMDLJC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 PCGMEOMDLJC = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearPCGMEOMDLJC() {
        
        pCGMEOMDLJC_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryInstableSprayBuffInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryInstableSprayBuffInfo)
    private static final emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo();
    }

    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryInstableSprayBuffInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryInstableSprayBuffInfo>() {
      @java.lang.Override
      public SceneGalleryInstableSprayBuffInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryInstableSprayBuffInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryInstableSprayBuffInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryInstableSprayBuffInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryInstableSprayBuffInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryInstableSprayBuffInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'SceneGalleryInstableSprayBuffInfo.prot" +
      "o\"^\n!SceneGalleryInstableSprayBuffInfo\022\017" +
      "\n\007buff_id\030\002 \001(\r\022\023\n\013PMDBPOPIDNL\030\r \001(\004\022\023\n\013" +
      "PCGMEOMDLJC\030\010 \001(\004B\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryInstableSprayBuffInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryInstableSprayBuffInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryInstableSprayBuffInfo_descriptor,
        new java.lang.String[] { "BuffId", "PMDBPOPIDNL", "PCGMEOMDLJC", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

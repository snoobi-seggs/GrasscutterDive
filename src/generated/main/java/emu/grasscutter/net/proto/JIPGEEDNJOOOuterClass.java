// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JIPGEEDNJOO.proto

package emu.grasscutter.net.proto;

public final class JIPGEEDNJOOOuterClass {
  private JIPGEEDNJOOOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JIPGEEDNJOOOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JIPGEEDNJOO)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.JMFPBNKNHED GPOHBBPBBEC = 9;</code>
     * @return Whether the gPOHBBPBBEC field is set.
     */
    boolean hasGPOHBBPBBEC();
    /**
     * <code>.JMFPBNKNHED GPOHBBPBBEC = 9;</code>
     * @return The gPOHBBPBBEC.
     */
    emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED getGPOHBBPBBEC();
    /**
     * <code>.JMFPBNKNHED GPOHBBPBBEC = 9;</code>
     */
    emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHEDOrBuilder getGPOHBBPBBECOrBuilder();

    /**
     * <code>uint32 entity_id = 1;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * <pre>
   * CmdId: 5742
   * </pre>
   *
   * Protobuf type {@code JIPGEEDNJOO}
   */
  public static final class JIPGEEDNJOO extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:JIPGEEDNJOO)
      JIPGEEDNJOOOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JIPGEEDNJOO.newBuilder() to construct.
    private JIPGEEDNJOO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JIPGEEDNJOO() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new JIPGEEDNJOO();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private JIPGEEDNJOO(
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
            case 74: {
              emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED.Builder subBuilder = null;
              if (gPOHBBPBBEC_ != null) {
                subBuilder = gPOHBBPBBEC_.toBuilder();
              }
              gPOHBBPBBEC_ = input.readMessage(emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(gPOHBBPBBEC_);
                gPOHBBPBBEC_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.internal_static_JIPGEEDNJOO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.internal_static_JIPGEEDNJOO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO.class, emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO.Builder.class);
    }

    public static final int GPOHBBPBBEC_FIELD_NUMBER = 9;
    private emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED gPOHBBPBBEC_;
    /**
     * <code>.JMFPBNKNHED GPOHBBPBBEC = 9;</code>
     * @return Whether the gPOHBBPBBEC field is set.
     */
    @java.lang.Override
    public boolean hasGPOHBBPBBEC() {
      return gPOHBBPBBEC_ != null;
    }
    /**
     * <code>.JMFPBNKNHED GPOHBBPBBEC = 9;</code>
     * @return The gPOHBBPBBEC.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED getGPOHBBPBBEC() {
      return gPOHBBPBBEC_ == null ? emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED.getDefaultInstance() : gPOHBBPBBEC_;
    }
    /**
     * <code>.JMFPBNKNHED GPOHBBPBBEC = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHEDOrBuilder getGPOHBBPBBECOrBuilder() {
      return getGPOHBBPBBEC();
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
      if (gPOHBBPBBEC_ != null) {
        output.writeMessage(9, getGPOHBBPBBEC());
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
      if (gPOHBBPBBEC_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getGPOHBBPBBEC());
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
      if (!(obj instanceof emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO other = (emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO) obj;

      if (hasGPOHBBPBBEC() != other.hasGPOHBBPBBEC()) return false;
      if (hasGPOHBBPBBEC()) {
        if (!getGPOHBBPBBEC()
            .equals(other.getGPOHBBPBBEC())) return false;
      }
      if (getEntityId()
          != other.getEntityId()) return false;
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
      if (hasGPOHBBPBBEC()) {
        hash = (37 * hash) + GPOHBBPBBEC_FIELD_NUMBER;
        hash = (53 * hash) + getGPOHBBPBBEC().hashCode();
      }
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO prototype) {
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
     * CmdId: 5742
     * </pre>
     *
     * Protobuf type {@code JIPGEEDNJOO}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JIPGEEDNJOO)
        emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOOOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.internal_static_JIPGEEDNJOO_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.internal_static_JIPGEEDNJOO_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO.class, emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO.newBuilder()
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
        if (gPOHBBPBBECBuilder_ == null) {
          gPOHBBPBBEC_ = null;
        } else {
          gPOHBBPBBEC_ = null;
          gPOHBBPBBECBuilder_ = null;
        }
        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.internal_static_JIPGEEDNJOO_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO build() {
        emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO buildPartial() {
        emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO result = new emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO(this);
        if (gPOHBBPBBECBuilder_ == null) {
          result.gPOHBBPBBEC_ = gPOHBBPBBEC_;
        } else {
          result.gPOHBBPBBEC_ = gPOHBBPBBECBuilder_.build();
        }
        result.entityId_ = entityId_;
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
        if (other instanceof emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO) {
          return mergeFrom((emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO other) {
        if (other == emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO.getDefaultInstance()) return this;
        if (other.hasGPOHBBPBBEC()) {
          mergeGPOHBBPBBEC(other.getGPOHBBPBBEC());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
        emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED gPOHBBPBBEC_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED, emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED.Builder, emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHEDOrBuilder> gPOHBBPBBECBuilder_;
      /**
       * <code>.JMFPBNKNHED GPOHBBPBBEC = 9;</code>
       * @return Whether the gPOHBBPBBEC field is set.
       */
      public boolean hasGPOHBBPBBEC() {
        return gPOHBBPBBECBuilder_ != null || gPOHBBPBBEC_ != null;
      }
      /**
       * <code>.JMFPBNKNHED GPOHBBPBBEC = 9;</code>
       * @return The gPOHBBPBBEC.
       */
      public emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED getGPOHBBPBBEC() {
        if (gPOHBBPBBECBuilder_ == null) {
          return gPOHBBPBBEC_ == null ? emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED.getDefaultInstance() : gPOHBBPBBEC_;
        } else {
          return gPOHBBPBBECBuilder_.getMessage();
        }
      }
      /**
       * <code>.JMFPBNKNHED GPOHBBPBBEC = 9;</code>
       */
      public Builder setGPOHBBPBBEC(emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED value) {
        if (gPOHBBPBBECBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          gPOHBBPBBEC_ = value;
          onChanged();
        } else {
          gPOHBBPBBECBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.JMFPBNKNHED GPOHBBPBBEC = 9;</code>
       */
      public Builder setGPOHBBPBBEC(
          emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED.Builder builderForValue) {
        if (gPOHBBPBBECBuilder_ == null) {
          gPOHBBPBBEC_ = builderForValue.build();
          onChanged();
        } else {
          gPOHBBPBBECBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.JMFPBNKNHED GPOHBBPBBEC = 9;</code>
       */
      public Builder mergeGPOHBBPBBEC(emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED value) {
        if (gPOHBBPBBECBuilder_ == null) {
          if (gPOHBBPBBEC_ != null) {
            gPOHBBPBBEC_ =
              emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED.newBuilder(gPOHBBPBBEC_).mergeFrom(value).buildPartial();
          } else {
            gPOHBBPBBEC_ = value;
          }
          onChanged();
        } else {
          gPOHBBPBBECBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.JMFPBNKNHED GPOHBBPBBEC = 9;</code>
       */
      public Builder clearGPOHBBPBBEC() {
        if (gPOHBBPBBECBuilder_ == null) {
          gPOHBBPBBEC_ = null;
          onChanged();
        } else {
          gPOHBBPBBEC_ = null;
          gPOHBBPBBECBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.JMFPBNKNHED GPOHBBPBBEC = 9;</code>
       */
      public emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED.Builder getGPOHBBPBBECBuilder() {
        
        onChanged();
        return getGPOHBBPBBECFieldBuilder().getBuilder();
      }
      /**
       * <code>.JMFPBNKNHED GPOHBBPBBEC = 9;</code>
       */
      public emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHEDOrBuilder getGPOHBBPBBECOrBuilder() {
        if (gPOHBBPBBECBuilder_ != null) {
          return gPOHBBPBBECBuilder_.getMessageOrBuilder();
        } else {
          return gPOHBBPBBEC_ == null ?
              emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED.getDefaultInstance() : gPOHBBPBBEC_;
        }
      }
      /**
       * <code>.JMFPBNKNHED GPOHBBPBBEC = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED, emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED.Builder, emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHEDOrBuilder> 
          getGPOHBBPBBECFieldBuilder() {
        if (gPOHBBPBBECBuilder_ == null) {
          gPOHBBPBBECBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED, emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED.Builder, emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHEDOrBuilder>(
                  getGPOHBBPBBEC(),
                  getParentForChildren(),
                  isClean());
          gPOHBBPBBEC_ = null;
        }
        return gPOHBBPBBECBuilder_;
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


      // @@protoc_insertion_point(builder_scope:JIPGEEDNJOO)
    }

    // @@protoc_insertion_point(class_scope:JIPGEEDNJOO)
    private static final emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO();
    }

    public static emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JIPGEEDNJOO>
        PARSER = new com.google.protobuf.AbstractParser<JIPGEEDNJOO>() {
      @java.lang.Override
      public JIPGEEDNJOO parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new JIPGEEDNJOO(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<JIPGEEDNJOO> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JIPGEEDNJOO> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.JIPGEEDNJOOOuterClass.JIPGEEDNJOO getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JIPGEEDNJOO_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JIPGEEDNJOO_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021JIPGEEDNJOO.proto\032\021JMFPBNKNHED.proto\"C" +
      "\n\013JIPGEEDNJOO\022!\n\013GPOHBBPBBEC\030\t \001(\0132\014.JMF" +
      "PBNKNHED\022\021\n\tentity_id\030\001 \001(\rB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.getDescriptor(),
        });
    internal_static_JIPGEEDNJOO_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JIPGEEDNJOO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JIPGEEDNJOO_descriptor,
        new java.lang.String[] { "GPOHBBPBBEC", "EntityId", });
    emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

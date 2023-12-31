// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerLogNotify.proto

package emu.grasscutter.net.proto;

public final class ServerLogNotifyOuterClass {
  private ServerLogNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ServerLogNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ServerLogNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ServerLogType log_type = 7;</code>
     * @return The enum numeric value on the wire for logType.
     */
    int getLogTypeValue();
    /**
     * <code>.ServerLogType log_type = 7;</code>
     * @return The logType.
     */
    emu.grasscutter.net.proto.ServerLogTypeOuterClass.ServerLogType getLogType();

    /**
     * <code>.ServerLogLevel log_level = 8;</code>
     * @return The enum numeric value on the wire for logLevel.
     */
    int getLogLevelValue();
    /**
     * <code>.ServerLogLevel log_level = 8;</code>
     * @return The logLevel.
     */
    emu.grasscutter.net.proto.ServerLogLevelOuterClass.ServerLogLevel getLogLevel();

    /**
     * <code>string server_log = 3;</code>
     * @return The serverLog.
     */
    java.lang.String getServerLog();
    /**
     * <code>string server_log = 3;</code>
     * @return The bytes for serverLog.
     */
    com.google.protobuf.ByteString
        getServerLogBytes();
  }
  /**
   * <pre>
   * CmdId: 7350
   * Obf: FLLKMEPDPHJ
   * </pre>
   *
   * Protobuf type {@code ServerLogNotify}
   */
  public static final class ServerLogNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ServerLogNotify)
      ServerLogNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ServerLogNotify.newBuilder() to construct.
    private ServerLogNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ServerLogNotify() {
      logType_ = 0;
      logLevel_ = 0;
      serverLog_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ServerLogNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ServerLogNotify(
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
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              serverLog_ = s;
              break;
            }
            case 56: {
              int rawValue = input.readEnum();

              logType_ = rawValue;
              break;
            }
            case 64: {
              int rawValue = input.readEnum();

              logLevel_ = rawValue;
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
      return emu.grasscutter.net.proto.ServerLogNotifyOuterClass.internal_static_ServerLogNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ServerLogNotifyOuterClass.internal_static_ServerLogNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify.class, emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify.Builder.class);
    }

    public static final int LOG_TYPE_FIELD_NUMBER = 7;
    private int logType_;
    /**
     * <code>.ServerLogType log_type = 7;</code>
     * @return The enum numeric value on the wire for logType.
     */
    @java.lang.Override public int getLogTypeValue() {
      return logType_;
    }
    /**
     * <code>.ServerLogType log_type = 7;</code>
     * @return The logType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.ServerLogTypeOuterClass.ServerLogType getLogType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.ServerLogTypeOuterClass.ServerLogType result = emu.grasscutter.net.proto.ServerLogTypeOuterClass.ServerLogType.valueOf(logType_);
      return result == null ? emu.grasscutter.net.proto.ServerLogTypeOuterClass.ServerLogType.UNRECOGNIZED : result;
    }

    public static final int LOG_LEVEL_FIELD_NUMBER = 8;
    private int logLevel_;
    /**
     * <code>.ServerLogLevel log_level = 8;</code>
     * @return The enum numeric value on the wire for logLevel.
     */
    @java.lang.Override public int getLogLevelValue() {
      return logLevel_;
    }
    /**
     * <code>.ServerLogLevel log_level = 8;</code>
     * @return The logLevel.
     */
    @java.lang.Override public emu.grasscutter.net.proto.ServerLogLevelOuterClass.ServerLogLevel getLogLevel() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.ServerLogLevelOuterClass.ServerLogLevel result = emu.grasscutter.net.proto.ServerLogLevelOuterClass.ServerLogLevel.valueOf(logLevel_);
      return result == null ? emu.grasscutter.net.proto.ServerLogLevelOuterClass.ServerLogLevel.UNRECOGNIZED : result;
    }

    public static final int SERVER_LOG_FIELD_NUMBER = 3;
    private volatile java.lang.Object serverLog_;
    /**
     * <code>string server_log = 3;</code>
     * @return The serverLog.
     */
    @java.lang.Override
    public java.lang.String getServerLog() {
      java.lang.Object ref = serverLog_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serverLog_ = s;
        return s;
      }
    }
    /**
     * <code>string server_log = 3;</code>
     * @return The bytes for serverLog.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getServerLogBytes() {
      java.lang.Object ref = serverLog_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serverLog_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serverLog_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, serverLog_);
      }
      if (logType_ != emu.grasscutter.net.proto.ServerLogTypeOuterClass.ServerLogType.SERVER_LOG_NONE.getNumber()) {
        output.writeEnum(7, logType_);
      }
      if (logLevel_ != emu.grasscutter.net.proto.ServerLogLevelOuterClass.ServerLogLevel.LOG_LEVEL_NONE.getNumber()) {
        output.writeEnum(8, logLevel_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serverLog_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, serverLog_);
      }
      if (logType_ != emu.grasscutter.net.proto.ServerLogTypeOuterClass.ServerLogType.SERVER_LOG_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, logType_);
      }
      if (logLevel_ != emu.grasscutter.net.proto.ServerLogLevelOuterClass.ServerLogLevel.LOG_LEVEL_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(8, logLevel_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify other = (emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify) obj;

      if (logType_ != other.logType_) return false;
      if (logLevel_ != other.logLevel_) return false;
      if (!getServerLog()
          .equals(other.getServerLog())) return false;
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
      hash = (37 * hash) + LOG_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + logType_;
      hash = (37 * hash) + LOG_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + logLevel_;
      hash = (37 * hash) + SERVER_LOG_FIELD_NUMBER;
      hash = (53 * hash) + getServerLog().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify prototype) {
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
     * CmdId: 7350
     * Obf: FLLKMEPDPHJ
     * </pre>
     *
     * Protobuf type {@code ServerLogNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ServerLogNotify)
        emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ServerLogNotifyOuterClass.internal_static_ServerLogNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ServerLogNotifyOuterClass.internal_static_ServerLogNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify.class, emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify.newBuilder()
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
        logType_ = 0;

        logLevel_ = 0;

        serverLog_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ServerLogNotifyOuterClass.internal_static_ServerLogNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify build() {
        emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify buildPartial() {
        emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify result = new emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify(this);
        result.logType_ = logType_;
        result.logLevel_ = logLevel_;
        result.serverLog_ = serverLog_;
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
        if (other instanceof emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify other) {
        if (other == emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify.getDefaultInstance()) return this;
        if (other.logType_ != 0) {
          setLogTypeValue(other.getLogTypeValue());
        }
        if (other.logLevel_ != 0) {
          setLogLevelValue(other.getLogLevelValue());
        }
        if (!other.getServerLog().isEmpty()) {
          serverLog_ = other.serverLog_;
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
        emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int logType_ = 0;
      /**
       * <code>.ServerLogType log_type = 7;</code>
       * @return The enum numeric value on the wire for logType.
       */
      @java.lang.Override public int getLogTypeValue() {
        return logType_;
      }
      /**
       * <code>.ServerLogType log_type = 7;</code>
       * @param value The enum numeric value on the wire for logType to set.
       * @return This builder for chaining.
       */
      public Builder setLogTypeValue(int value) {
        
        logType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ServerLogType log_type = 7;</code>
       * @return The logType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.ServerLogTypeOuterClass.ServerLogType getLogType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.ServerLogTypeOuterClass.ServerLogType result = emu.grasscutter.net.proto.ServerLogTypeOuterClass.ServerLogType.valueOf(logType_);
        return result == null ? emu.grasscutter.net.proto.ServerLogTypeOuterClass.ServerLogType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ServerLogType log_type = 7;</code>
       * @param value The logType to set.
       * @return This builder for chaining.
       */
      public Builder setLogType(emu.grasscutter.net.proto.ServerLogTypeOuterClass.ServerLogType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        logType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ServerLogType log_type = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearLogType() {
        
        logType_ = 0;
        onChanged();
        return this;
      }

      private int logLevel_ = 0;
      /**
       * <code>.ServerLogLevel log_level = 8;</code>
       * @return The enum numeric value on the wire for logLevel.
       */
      @java.lang.Override public int getLogLevelValue() {
        return logLevel_;
      }
      /**
       * <code>.ServerLogLevel log_level = 8;</code>
       * @param value The enum numeric value on the wire for logLevel to set.
       * @return This builder for chaining.
       */
      public Builder setLogLevelValue(int value) {
        
        logLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ServerLogLevel log_level = 8;</code>
       * @return The logLevel.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.ServerLogLevelOuterClass.ServerLogLevel getLogLevel() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.ServerLogLevelOuterClass.ServerLogLevel result = emu.grasscutter.net.proto.ServerLogLevelOuterClass.ServerLogLevel.valueOf(logLevel_);
        return result == null ? emu.grasscutter.net.proto.ServerLogLevelOuterClass.ServerLogLevel.UNRECOGNIZED : result;
      }
      /**
       * <code>.ServerLogLevel log_level = 8;</code>
       * @param value The logLevel to set.
       * @return This builder for chaining.
       */
      public Builder setLogLevel(emu.grasscutter.net.proto.ServerLogLevelOuterClass.ServerLogLevel value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        logLevel_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ServerLogLevel log_level = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearLogLevel() {
        
        logLevel_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object serverLog_ = "";
      /**
       * <code>string server_log = 3;</code>
       * @return The serverLog.
       */
      public java.lang.String getServerLog() {
        java.lang.Object ref = serverLog_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          serverLog_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string server_log = 3;</code>
       * @return The bytes for serverLog.
       */
      public com.google.protobuf.ByteString
          getServerLogBytes() {
        java.lang.Object ref = serverLog_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          serverLog_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string server_log = 3;</code>
       * @param value The serverLog to set.
       * @return This builder for chaining.
       */
      public Builder setServerLog(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        serverLog_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string server_log = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerLog() {
        
        serverLog_ = getDefaultInstance().getServerLog();
        onChanged();
        return this;
      }
      /**
       * <code>string server_log = 3;</code>
       * @param value The bytes for serverLog to set.
       * @return This builder for chaining.
       */
      public Builder setServerLogBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        serverLog_ = value;
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


      // @@protoc_insertion_point(builder_scope:ServerLogNotify)
    }

    // @@protoc_insertion_point(class_scope:ServerLogNotify)
    private static final emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify();
    }

    public static emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ServerLogNotify>
        PARSER = new com.google.protobuf.AbstractParser<ServerLogNotify>() {
      @java.lang.Override
      public ServerLogNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ServerLogNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ServerLogNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ServerLogNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ServerLogNotifyOuterClass.ServerLogNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServerLogNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServerLogNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025ServerLogNotify.proto\032\023ServerLogType.p" +
      "roto\032\024ServerLogLevel.proto\"k\n\017ServerLogN" +
      "otify\022 \n\010log_type\030\007 \001(\0162\016.ServerLogType\022" +
      "\"\n\tlog_level\030\010 \001(\0162\017.ServerLogLevel\022\022\n\ns" +
      "erver_log\030\003 \001(\tB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ServerLogTypeOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.ServerLogLevelOuterClass.getDescriptor(),
        });
    internal_static_ServerLogNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ServerLogNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServerLogNotify_descriptor,
        new java.lang.String[] { "LogType", "LogLevel", "ServerLog", });
    emu.grasscutter.net.proto.ServerLogTypeOuterClass.getDescriptor();
    emu.grasscutter.net.proto.ServerLogLevelOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

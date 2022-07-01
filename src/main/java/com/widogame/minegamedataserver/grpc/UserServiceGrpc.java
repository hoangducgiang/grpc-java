package com.widogame.minegamedataserver.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: service/UserService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterRequest,
      com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterResponse> getSelectCharacterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "selectCharacter",
      requestType = com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterRequest.class,
      responseType = com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterRequest,
      com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterResponse> getSelectCharacterMethod() {
    io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterRequest, com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterResponse> getSelectCharacterMethod;
    if ((getSelectCharacterMethod = UserServiceGrpc.getSelectCharacterMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSelectCharacterMethod = UserServiceGrpc.getSelectCharacterMethod) == null) {
          UserServiceGrpc.getSelectCharacterMethod = getSelectCharacterMethod =
              io.grpc.MethodDescriptor.<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterRequest, com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "selectCharacter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("selectCharacter"))
              .build();
        }
      }
    }
    return getSelectCharacterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.widogame.minegamedataserver.grpc.UserServiceOuterClass.CharactersResponse> getGetCharactersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCharacters",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.widogame.minegamedataserver.grpc.UserServiceOuterClass.CharactersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.widogame.minegamedataserver.grpc.UserServiceOuterClass.CharactersResponse> getGetCharactersMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.widogame.minegamedataserver.grpc.UserServiceOuterClass.CharactersResponse> getGetCharactersMethod;
    if ((getGetCharactersMethod = UserServiceGrpc.getGetCharactersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetCharactersMethod = UserServiceGrpc.getGetCharactersMethod) == null) {
          UserServiceGrpc.getGetCharactersMethod = getGetCharactersMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.widogame.minegamedataserver.grpc.UserServiceOuterClass.CharactersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCharacters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.UserServiceOuterClass.CharactersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getCharacters"))
              .build();
        }
      }
    }
    return getGetCharactersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileRequest,
      com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileResponse> getGetUserProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserProfile",
      requestType = com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileRequest.class,
      responseType = com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileRequest,
      com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileResponse> getGetUserProfileMethod() {
    io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileRequest, com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileResponse> getGetUserProfileMethod;
    if ((getGetUserProfileMethod = UserServiceGrpc.getGetUserProfileMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserProfileMethod = UserServiceGrpc.getGetUserProfileMethod) == null) {
          UserServiceGrpc.getGetUserProfileMethod = getGetUserProfileMethod =
              io.grpc.MethodDescriptor.<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileRequest, com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getUserProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserProfile"))
              .build();
        }
      }
    }
    return getGetUserProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ResourceStatsResponse> getGetResourceStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getResourceStats",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ResourceStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ResourceStatsResponse> getGetResourceStatsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ResourceStatsResponse> getGetResourceStatsMethod;
    if ((getGetResourceStatsMethod = UserServiceGrpc.getGetResourceStatsMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetResourceStatsMethod = UserServiceGrpc.getGetResourceStatsMethod) == null) {
          UserServiceGrpc.getGetResourceStatsMethod = getGetResourceStatsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ResourceStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getResourceStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ResourceStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getResourceStats"))
              .build();
        }
      }
    }
    return getGetResourceStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.widogame.minegamedataserver.grpc.UserServiceOuterClass.DailyQuestResponse> getGenerateDailyQuestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "generateDailyQuest",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.widogame.minegamedataserver.grpc.UserServiceOuterClass.DailyQuestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.widogame.minegamedataserver.grpc.UserServiceOuterClass.DailyQuestResponse> getGenerateDailyQuestMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.widogame.minegamedataserver.grpc.UserServiceOuterClass.DailyQuestResponse> getGenerateDailyQuestMethod;
    if ((getGenerateDailyQuestMethod = UserServiceGrpc.getGenerateDailyQuestMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGenerateDailyQuestMethod = UserServiceGrpc.getGenerateDailyQuestMethod) == null) {
          UserServiceGrpc.getGenerateDailyQuestMethod = getGenerateDailyQuestMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.widogame.minegamedataserver.grpc.UserServiceOuterClass.DailyQuestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "generateDailyQuest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.UserServiceOuterClass.DailyQuestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("generateDailyQuest"))
              .build();
        }
      }
    }
    return getGenerateDailyQuestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardRequest,
      com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardResponse> getClaimQuestRewardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "claimQuestReward",
      requestType = com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardRequest.class,
      responseType = com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardRequest,
      com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardResponse> getClaimQuestRewardMethod() {
    io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardRequest, com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardResponse> getClaimQuestRewardMethod;
    if ((getClaimQuestRewardMethod = UserServiceGrpc.getClaimQuestRewardMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getClaimQuestRewardMethod = UserServiceGrpc.getClaimQuestRewardMethod) == null) {
          UserServiceGrpc.getClaimQuestRewardMethod = getClaimQuestRewardMethod =
              io.grpc.MethodDescriptor.<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardRequest, com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "claimQuestReward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("claimQuestReward"))
              .build();
        }
      }
    }
    return getClaimQuestRewardMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void selectCharacter(com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSelectCharacterMethod(), responseObserver);
    }

    /**
     */
    public void getCharacters(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.CharactersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCharactersMethod(), responseObserver);
    }

    /**
     */
    public void getUserProfile(com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserProfileMethod(), responseObserver);
    }

    /**
     */
    public void getResourceStats(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ResourceStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetResourceStatsMethod(), responseObserver);
    }

    /**
     */
    public void generateDailyQuest(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.DailyQuestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateDailyQuestMethod(), responseObserver);
    }

    /**
     */
    public void claimQuestReward(com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimQuestRewardMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSelectCharacterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterRequest,
                com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterResponse>(
                  this, METHODID_SELECT_CHARACTER)))
          .addMethod(
            getGetCharactersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.widogame.minegamedataserver.grpc.UserServiceOuterClass.CharactersResponse>(
                  this, METHODID_GET_CHARACTERS)))
          .addMethod(
            getGetUserProfileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileRequest,
                com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileResponse>(
                  this, METHODID_GET_USER_PROFILE)))
          .addMethod(
            getGetResourceStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ResourceStatsResponse>(
                  this, METHODID_GET_RESOURCE_STATS)))
          .addMethod(
            getGenerateDailyQuestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.widogame.minegamedataserver.grpc.UserServiceOuterClass.DailyQuestResponse>(
                  this, METHODID_GENERATE_DAILY_QUEST)))
          .addMethod(
            getClaimQuestRewardMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardRequest,
                com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardResponse>(
                  this, METHODID_CLAIM_QUEST_REWARD)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void selectCharacter(com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSelectCharacterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCharacters(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.CharactersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCharactersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserProfile(com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getResourceStats(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ResourceStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetResourceStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateDailyQuest(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.DailyQuestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateDailyQuestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claimQuestReward(com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimQuestRewardMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterResponse selectCharacter(com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSelectCharacterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.widogame.minegamedataserver.grpc.UserServiceOuterClass.CharactersResponse getCharacters(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCharactersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileResponse getUserProfile(com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ResourceStatsResponse getResourceStats(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetResourceStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.widogame.minegamedataserver.grpc.UserServiceOuterClass.DailyQuestResponse generateDailyQuest(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateDailyQuestMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardResponse claimQuestReward(com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimQuestRewardMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterResponse> selectCharacter(
        com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSelectCharacterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.CharactersResponse> getCharacters(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCharactersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileResponse> getUserProfile(
        com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ResourceStatsResponse> getResourceStats(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetResourceStatsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.DailyQuestResponse> generateDailyQuest(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateDailyQuestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardResponse> claimQuestReward(
        com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimQuestRewardMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SELECT_CHARACTER = 0;
  private static final int METHODID_GET_CHARACTERS = 1;
  private static final int METHODID_GET_USER_PROFILE = 2;
  private static final int METHODID_GET_RESOURCE_STATS = 3;
  private static final int METHODID_GENERATE_DAILY_QUEST = 4;
  private static final int METHODID_CLAIM_QUEST_REWARD = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SELECT_CHARACTER:
          serviceImpl.selectCharacter((com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterRequest) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.SelectCharacterResponse>) responseObserver);
          break;
        case METHODID_GET_CHARACTERS:
          serviceImpl.getCharacters((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.CharactersResponse>) responseObserver);
          break;
        case METHODID_GET_USER_PROFILE:
          serviceImpl.getUserProfile((com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.GetUserProfileResponse>) responseObserver);
          break;
        case METHODID_GET_RESOURCE_STATS:
          serviceImpl.getResourceStats((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ResourceStatsResponse>) responseObserver);
          break;
        case METHODID_GENERATE_DAILY_QUEST:
          serviceImpl.generateDailyQuest((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.DailyQuestResponse>) responseObserver);
          break;
        case METHODID_CLAIM_QUEST_REWARD:
          serviceImpl.claimQuestReward((com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardRequest) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.UserServiceOuterClass.ClaimQuestRewardResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.widogame.minegamedataserver.grpc.UserServiceOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getSelectCharacterMethod())
              .addMethod(getGetCharactersMethod())
              .addMethod(getGetUserProfileMethod())
              .addMethod(getGetResourceStatsMethod())
              .addMethod(getGenerateDailyQuestMethod())
              .addMethod(getClaimQuestRewardMethod())
              .build();
        }
      }
    }
    return result;
  }
}

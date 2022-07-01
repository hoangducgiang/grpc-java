package com.widogame.minegamedataserver.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: service/SeasonService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SeasonServiceGrpc {

  private SeasonServiceGrpc() {}

  public static final String SERVICE_NAME = "SeasonService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LuckyPoolsRewardResponse> getGetLuckyPoolsRewardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLuckyPoolsReward",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LuckyPoolsRewardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LuckyPoolsRewardResponse> getGetLuckyPoolsRewardMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LuckyPoolsRewardResponse> getGetLuckyPoolsRewardMethod;
    if ((getGetLuckyPoolsRewardMethod = SeasonServiceGrpc.getGetLuckyPoolsRewardMethod) == null) {
      synchronized (SeasonServiceGrpc.class) {
        if ((getGetLuckyPoolsRewardMethod = SeasonServiceGrpc.getGetLuckyPoolsRewardMethod) == null) {
          SeasonServiceGrpc.getGetLuckyPoolsRewardMethod = getGetLuckyPoolsRewardMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LuckyPoolsRewardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getLuckyPoolsReward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LuckyPoolsRewardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SeasonServiceMethodDescriptorSupplier("getLuckyPoolsReward"))
              .build();
        }
      }
    }
    return getGetLuckyPoolsRewardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LeaderBoardRewardResponse> getGetLeaderBoardPoolsRewardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLeaderBoardPoolsReward",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LeaderBoardRewardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LeaderBoardRewardResponse> getGetLeaderBoardPoolsRewardMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LeaderBoardRewardResponse> getGetLeaderBoardPoolsRewardMethod;
    if ((getGetLeaderBoardPoolsRewardMethod = SeasonServiceGrpc.getGetLeaderBoardPoolsRewardMethod) == null) {
      synchronized (SeasonServiceGrpc.class) {
        if ((getGetLeaderBoardPoolsRewardMethod = SeasonServiceGrpc.getGetLeaderBoardPoolsRewardMethod) == null) {
          SeasonServiceGrpc.getGetLeaderBoardPoolsRewardMethod = getGetLeaderBoardPoolsRewardMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LeaderBoardRewardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getLeaderBoardPoolsReward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LeaderBoardRewardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SeasonServiceMethodDescriptorSupplier("getLeaderBoardPoolsReward"))
              .build();
        }
      }
    }
    return getGetLeaderBoardPoolsRewardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallRequest,
      com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallResponse> getChangeLuckyBallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeLuckyBall",
      requestType = com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallRequest.class,
      responseType = com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallRequest,
      com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallResponse> getChangeLuckyBallMethod() {
    io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallRequest, com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallResponse> getChangeLuckyBallMethod;
    if ((getChangeLuckyBallMethod = SeasonServiceGrpc.getChangeLuckyBallMethod) == null) {
      synchronized (SeasonServiceGrpc.class) {
        if ((getChangeLuckyBallMethod = SeasonServiceGrpc.getChangeLuckyBallMethod) == null) {
          SeasonServiceGrpc.getChangeLuckyBallMethod = getChangeLuckyBallMethod =
              io.grpc.MethodDescriptor.<com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallRequest, com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "changeLuckyBall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SeasonServiceMethodDescriptorSupplier("changeLuckyBall"))
              .build();
        }
      }
    }
    return getChangeLuckyBallMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SeasonServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SeasonServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SeasonServiceStub>() {
        @Override
        public SeasonServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SeasonServiceStub(channel, callOptions);
        }
      };
    return SeasonServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SeasonServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SeasonServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SeasonServiceBlockingStub>() {
        @Override
        public SeasonServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SeasonServiceBlockingStub(channel, callOptions);
        }
      };
    return SeasonServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SeasonServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SeasonServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SeasonServiceFutureStub>() {
        @Override
        public SeasonServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SeasonServiceFutureStub(channel, callOptions);
        }
      };
    return SeasonServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SeasonServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getLuckyPoolsReward(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LuckyPoolsRewardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLuckyPoolsRewardMethod(), responseObserver);
    }

    /**
     */
    public void getLeaderBoardPoolsReward(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LeaderBoardRewardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLeaderBoardPoolsRewardMethod(), responseObserver);
    }

    /**
     */
    public void changeLuckyBall(com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeLuckyBallMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLuckyPoolsRewardMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LuckyPoolsRewardResponse>(
                  this, METHODID_GET_LUCKY_POOLS_REWARD)))
          .addMethod(
            getGetLeaderBoardPoolsRewardMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LeaderBoardRewardResponse>(
                  this, METHODID_GET_LEADER_BOARD_POOLS_REWARD)))
          .addMethod(
            getChangeLuckyBallMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallRequest,
                com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallResponse>(
                  this, METHODID_CHANGE_LUCKY_BALL)))
          .build();
    }
  }

  /**
   */
  public static final class SeasonServiceStub extends io.grpc.stub.AbstractAsyncStub<SeasonServiceStub> {
    private SeasonServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SeasonServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SeasonServiceStub(channel, callOptions);
    }

    /**
     */
    public void getLuckyPoolsReward(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LuckyPoolsRewardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLuckyPoolsRewardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLeaderBoardPoolsReward(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LeaderBoardRewardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLeaderBoardPoolsRewardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeLuckyBall(com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeLuckyBallMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SeasonServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SeasonServiceBlockingStub> {
    private SeasonServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SeasonServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SeasonServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LuckyPoolsRewardResponse getLuckyPoolsReward(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLuckyPoolsRewardMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LeaderBoardRewardResponse getLeaderBoardPoolsReward(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLeaderBoardPoolsRewardMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallResponse changeLuckyBall(com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeLuckyBallMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SeasonServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SeasonServiceFutureStub> {
    private SeasonServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SeasonServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SeasonServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LuckyPoolsRewardResponse> getLuckyPoolsReward(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLuckyPoolsRewardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LeaderBoardRewardResponse> getLeaderBoardPoolsReward(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLeaderBoardPoolsRewardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallResponse> changeLuckyBall(
        com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeLuckyBallMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LUCKY_POOLS_REWARD = 0;
  private static final int METHODID_GET_LEADER_BOARD_POOLS_REWARD = 1;
  private static final int METHODID_CHANGE_LUCKY_BALL = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SeasonServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SeasonServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LUCKY_POOLS_REWARD:
          serviceImpl.getLuckyPoolsReward((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LuckyPoolsRewardResponse>) responseObserver);
          break;
        case METHODID_GET_LEADER_BOARD_POOLS_REWARD:
          serviceImpl.getLeaderBoardPoolsReward((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.LeaderBoardRewardResponse>) responseObserver);
          break;
        case METHODID_CHANGE_LUCKY_BALL:
          serviceImpl.changeLuckyBall((com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallRequest) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.ChangeLuckyBallResponse>) responseObserver);
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

  private static abstract class SeasonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SeasonServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.widogame.minegamedataserver.grpc.SeasonServiceOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SeasonService");
    }
  }

  private static final class SeasonServiceFileDescriptorSupplier
      extends SeasonServiceBaseDescriptorSupplier {
    SeasonServiceFileDescriptorSupplier() {}
  }

  private static final class SeasonServiceMethodDescriptorSupplier
      extends SeasonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SeasonServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SeasonServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SeasonServiceFileDescriptorSupplier())
              .addMethod(getGetLuckyPoolsRewardMethod())
              .addMethod(getGetLeaderBoardPoolsRewardMethod())
              .addMethod(getChangeLuckyBallMethod())
              .build();
        }
      }
    }
    return result;
  }
}

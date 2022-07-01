package com.widogame.minegamedataserver.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: service/MatchMakingService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MatchMakingServiceGrpc {

  private MatchMakingServiceGrpc() {}

  public static final String SERVICE_NAME = "MatchMakingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.MatchMakingRequest,
      com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.AssignmentsResponse> getCreateTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTicket",
      requestType = com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.MatchMakingRequest.class,
      responseType = com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.AssignmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.MatchMakingRequest,
      com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.AssignmentsResponse> getCreateTicketMethod() {
    io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.MatchMakingRequest, com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.AssignmentsResponse> getCreateTicketMethod;
    if ((getCreateTicketMethod = MatchMakingServiceGrpc.getCreateTicketMethod) == null) {
      synchronized (MatchMakingServiceGrpc.class) {
        if ((getCreateTicketMethod = MatchMakingServiceGrpc.getCreateTicketMethod) == null) {
          MatchMakingServiceGrpc.getCreateTicketMethod = getCreateTicketMethod =
              io.grpc.MethodDescriptor.<com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.MatchMakingRequest, com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.AssignmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.MatchMakingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.AssignmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MatchMakingServiceMethodDescriptorSupplier("createTicket"))
              .build();
        }
      }
    }
    return getCreateTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.GetTicketResponse> getGetTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTicket",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.GetTicketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.GetTicketResponse> getGetTicketMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.GetTicketResponse> getGetTicketMethod;
    if ((getGetTicketMethod = MatchMakingServiceGrpc.getGetTicketMethod) == null) {
      synchronized (MatchMakingServiceGrpc.class) {
        if ((getGetTicketMethod = MatchMakingServiceGrpc.getGetTicketMethod) == null) {
          MatchMakingServiceGrpc.getGetTicketMethod = getGetTicketMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.GetTicketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.GetTicketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MatchMakingServiceMethodDescriptorSupplier("getTicket"))
              .build();
        }
      }
    }
    return getGetTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.DeleteTicketResponse> getDeleteTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteTicket",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.DeleteTicketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.DeleteTicketResponse> getDeleteTicketMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.DeleteTicketResponse> getDeleteTicketMethod;
    if ((getDeleteTicketMethod = MatchMakingServiceGrpc.getDeleteTicketMethod) == null) {
      synchronized (MatchMakingServiceGrpc.class) {
        if ((getDeleteTicketMethod = MatchMakingServiceGrpc.getDeleteTicketMethod) == null) {
          MatchMakingServiceGrpc.getDeleteTicketMethod = getDeleteTicketMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.DeleteTicketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.DeleteTicketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MatchMakingServiceMethodDescriptorSupplier("deleteTicket"))
              .build();
        }
      }
    }
    return getDeleteTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.AssignmentsResponse> getWatchAssignmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "watchAssignments",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.AssignmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.AssignmentsResponse> getWatchAssignmentsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.AssignmentsResponse> getWatchAssignmentsMethod;
    if ((getWatchAssignmentsMethod = MatchMakingServiceGrpc.getWatchAssignmentsMethod) == null) {
      synchronized (MatchMakingServiceGrpc.class) {
        if ((getWatchAssignmentsMethod = MatchMakingServiceGrpc.getWatchAssignmentsMethod) == null) {
          MatchMakingServiceGrpc.getWatchAssignmentsMethod = getWatchAssignmentsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.AssignmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "watchAssignments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.AssignmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MatchMakingServiceMethodDescriptorSupplier("watchAssignments"))
              .build();
        }
      }
    }
    return getWatchAssignmentsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MatchMakingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MatchMakingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MatchMakingServiceStub>() {
        @Override
        public MatchMakingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MatchMakingServiceStub(channel, callOptions);
        }
      };
    return MatchMakingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MatchMakingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MatchMakingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MatchMakingServiceBlockingStub>() {
        @Override
        public MatchMakingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MatchMakingServiceBlockingStub(channel, callOptions);
        }
      };
    return MatchMakingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MatchMakingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MatchMakingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MatchMakingServiceFutureStub>() {
        @Override
        public MatchMakingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MatchMakingServiceFutureStub(channel, callOptions);
        }
      };
    return MatchMakingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MatchMakingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTicket(com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.MatchMakingRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.AssignmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTicketMethod(), responseObserver);
    }

    /**
     */
    public void getTicket(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.GetTicketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTicketMethod(), responseObserver);
    }

    /**
     */
    public void deleteTicket(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.DeleteTicketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTicketMethod(), responseObserver);
    }

    /**
     */
    public void watchAssignments(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.AssignmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWatchAssignmentsMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTicketMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.MatchMakingRequest,
                com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.AssignmentsResponse>(
                  this, METHODID_CREATE_TICKET)))
          .addMethod(
            getGetTicketMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.GetTicketResponse>(
                  this, METHODID_GET_TICKET)))
          .addMethod(
            getDeleteTicketMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.DeleteTicketResponse>(
                  this, METHODID_DELETE_TICKET)))
          .addMethod(
            getWatchAssignmentsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.AssignmentsResponse>(
                  this, METHODID_WATCH_ASSIGNMENTS)))
          .build();
    }
  }

  /**
   */
  public static final class MatchMakingServiceStub extends io.grpc.stub.AbstractAsyncStub<MatchMakingServiceStub> {
    private MatchMakingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MatchMakingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MatchMakingServiceStub(channel, callOptions);
    }

    /**
     */
    public void createTicket(com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.MatchMakingRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.AssignmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTicket(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.GetTicketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTicket(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.DeleteTicketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void watchAssignments(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.AssignmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getWatchAssignmentsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MatchMakingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MatchMakingServiceBlockingStub> {
    private MatchMakingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MatchMakingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MatchMakingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.AssignmentsResponse> createTicket(
        com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.MatchMakingRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getCreateTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.GetTicketResponse getTicket(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.DeleteTicketResponse deleteTicket(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.AssignmentsResponse> watchAssignments(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getWatchAssignmentsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MatchMakingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MatchMakingServiceFutureStub> {
    private MatchMakingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MatchMakingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MatchMakingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.GetTicketResponse> getTicket(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.DeleteTicketResponse> deleteTicket(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTicketMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TICKET = 0;
  private static final int METHODID_GET_TICKET = 1;
  private static final int METHODID_DELETE_TICKET = 2;
  private static final int METHODID_WATCH_ASSIGNMENTS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MatchMakingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MatchMakingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TICKET:
          serviceImpl.createTicket((com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.MatchMakingRequest) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.AssignmentsResponse>) responseObserver);
          break;
        case METHODID_GET_TICKET:
          serviceImpl.getTicket((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.GetTicketResponse>) responseObserver);
          break;
        case METHODID_DELETE_TICKET:
          serviceImpl.deleteTicket((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.DeleteTicketResponse>) responseObserver);
          break;
        case METHODID_WATCH_ASSIGNMENTS:
          serviceImpl.watchAssignments((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.AssignmentsResponse>) responseObserver);
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

  private static abstract class MatchMakingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MatchMakingServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.widogame.minegamedataserver.grpc.MatchMakingServiceOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MatchMakingService");
    }
  }

  private static final class MatchMakingServiceFileDescriptorSupplier
      extends MatchMakingServiceBaseDescriptorSupplier {
    MatchMakingServiceFileDescriptorSupplier() {}
  }

  private static final class MatchMakingServiceMethodDescriptorSupplier
      extends MatchMakingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MatchMakingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MatchMakingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MatchMakingServiceFileDescriptorSupplier())
              .addMethod(getCreateTicketMethod())
              .addMethod(getGetTicketMethod())
              .addMethod(getDeleteTicketMethod())
              .addMethod(getWatchAssignmentsMethod())
              .build();
        }
      }
    }
    return result;
  }
}

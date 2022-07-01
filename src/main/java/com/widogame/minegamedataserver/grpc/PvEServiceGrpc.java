package com.widogame.minegamedataserver.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: service/PvEService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PvEServiceGrpc {

  private PvEServiceGrpc() {}

  public static final String SERVICE_NAME = "AlloService.PvEService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.widogame.minegamedataserver.grpc.PvEServiceOuterClass.PvERespones> getStartPvEMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "startPvE",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.widogame.minegamedataserver.grpc.PvEServiceOuterClass.PvERespones.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.widogame.minegamedataserver.grpc.PvEServiceOuterClass.PvERespones> getStartPvEMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.widogame.minegamedataserver.grpc.PvEServiceOuterClass.PvERespones> getStartPvEMethod;
    if ((getStartPvEMethod = PvEServiceGrpc.getStartPvEMethod) == null) {
      synchronized (PvEServiceGrpc.class) {
        if ((getStartPvEMethod = PvEServiceGrpc.getStartPvEMethod) == null) {
          PvEServiceGrpc.getStartPvEMethod = getStartPvEMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.widogame.minegamedataserver.grpc.PvEServiceOuterClass.PvERespones>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "startPvE"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.PvEServiceOuterClass.PvERespones.getDefaultInstance()))
              .setSchemaDescriptor(new PvEServiceMethodDescriptorSupplier("startPvE"))
              .build();
        }
      }
    }
    return getStartPvEMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PvEServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PvEServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PvEServiceStub>() {
        @Override
        public PvEServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PvEServiceStub(channel, callOptions);
        }
      };
    return PvEServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PvEServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PvEServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PvEServiceBlockingStub>() {
        @Override
        public PvEServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PvEServiceBlockingStub(channel, callOptions);
        }
      };
    return PvEServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PvEServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PvEServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PvEServiceFutureStub>() {
        @Override
        public PvEServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PvEServiceFutureStub(channel, callOptions);
        }
      };
    return PvEServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PvEServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void startPvE(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.PvEServiceOuterClass.PvERespones> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartPvEMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStartPvEMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.widogame.minegamedataserver.grpc.PvEServiceOuterClass.PvERespones>(
                  this, METHODID_START_PV_E)))
          .build();
    }
  }

  /**
   */
  public static final class PvEServiceStub extends io.grpc.stub.AbstractAsyncStub<PvEServiceStub> {
    private PvEServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PvEServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PvEServiceStub(channel, callOptions);
    }

    /**
     */
    public void startPvE(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.PvEServiceOuterClass.PvERespones> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartPvEMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PvEServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PvEServiceBlockingStub> {
    private PvEServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PvEServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PvEServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.widogame.minegamedataserver.grpc.PvEServiceOuterClass.PvERespones startPvE(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartPvEMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PvEServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PvEServiceFutureStub> {
    private PvEServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PvEServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PvEServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.widogame.minegamedataserver.grpc.PvEServiceOuterClass.PvERespones> startPvE(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartPvEMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START_PV_E = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PvEServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PvEServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START_PV_E:
          serviceImpl.startPvE((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.PvEServiceOuterClass.PvERespones>) responseObserver);
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

  private static abstract class PvEServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PvEServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.widogame.minegamedataserver.grpc.PvEServiceOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PvEService");
    }
  }

  private static final class PvEServiceFileDescriptorSupplier
      extends PvEServiceBaseDescriptorSupplier {
    PvEServiceFileDescriptorSupplier() {}
  }

  private static final class PvEServiceMethodDescriptorSupplier
      extends PvEServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PvEServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PvEServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PvEServiceFileDescriptorSupplier())
              .addMethod(getStartPvEMethod())
              .build();
        }
      }
    }
    return result;
  }
}

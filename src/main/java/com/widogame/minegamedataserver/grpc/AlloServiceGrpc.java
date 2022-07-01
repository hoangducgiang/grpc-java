package com.widogame.minegamedataserver.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: service/AlloService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AlloServiceGrpc {

  private AlloServiceGrpc() {}

  public static final String SERVICE_NAME = "AlloService.AlloService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRequest,
      com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRespones> getAllocateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Allocate",
      requestType = com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRequest.class,
      responseType = com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRespones.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRequest,
      com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRespones> getAllocateMethod() {
    io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRequest, com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRespones> getAllocateMethod;
    if ((getAllocateMethod = AlloServiceGrpc.getAllocateMethod) == null) {
      synchronized (AlloServiceGrpc.class) {
        if ((getAllocateMethod = AlloServiceGrpc.getAllocateMethod) == null) {
          AlloServiceGrpc.getAllocateMethod = getAllocateMethod =
              io.grpc.MethodDescriptor.<com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRequest, com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRespones>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Allocate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRespones.getDefaultInstance()))
              .setSchemaDescriptor(new AlloServiceMethodDescriptorSupplier("Allocate"))
              .build();
        }
      }
    }
    return getAllocateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AlloServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlloServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AlloServiceStub>() {
        @Override
        public AlloServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AlloServiceStub(channel, callOptions);
        }
      };
    return AlloServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AlloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlloServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AlloServiceBlockingStub>() {
        @Override
        public AlloServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AlloServiceBlockingStub(channel, callOptions);
        }
      };
    return AlloServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AlloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlloServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AlloServiceFutureStub>() {
        @Override
        public AlloServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AlloServiceFutureStub(channel, callOptions);
        }
      };
    return AlloServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AlloServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void allocate(com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRespones> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllocateMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllocateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRequest,
                com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRespones>(
                  this, METHODID_ALLOCATE)))
          .build();
    }
  }

  /**
   */
  public static final class AlloServiceStub extends io.grpc.stub.AbstractAsyncStub<AlloServiceStub> {
    private AlloServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AlloServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlloServiceStub(channel, callOptions);
    }

    /**
     */
    public void allocate(com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRespones> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllocateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AlloServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AlloServiceBlockingStub> {
    private AlloServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AlloServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlloServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRespones allocate(com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllocateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AlloServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AlloServiceFutureStub> {
    private AlloServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AlloServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlloServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRespones> allocate(
        com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllocateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALLOCATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AlloServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AlloServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALLOCATE:
          serviceImpl.allocate((com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRequest) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.AlloRespones>) responseObserver);
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

  private static abstract class AlloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AlloServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.widogame.minegamedataserver.grpc.AlloServiceOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AlloService");
    }
  }

  private static final class AlloServiceFileDescriptorSupplier
      extends AlloServiceBaseDescriptorSupplier {
    AlloServiceFileDescriptorSupplier() {}
  }

  private static final class AlloServiceMethodDescriptorSupplier
      extends AlloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AlloServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AlloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AlloServiceFileDescriptorSupplier())
              .addMethod(getAllocateMethod())
              .build();
        }
      }
    }
    return result;
  }
}

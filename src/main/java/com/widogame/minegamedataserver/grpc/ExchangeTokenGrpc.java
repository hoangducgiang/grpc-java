package com.widogame.minegamedataserver.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: service/ExchangeToken.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ExchangeTokenGrpc {

  private ExchangeTokenGrpc() {}

  public static final String SERVICE_NAME = "ExchangeToken";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenRequest,
      com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenResponse> getExchangeTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "exchangeToken",
      requestType = com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenRequest.class,
      responseType = com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenRequest,
      com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenResponse> getExchangeTokenMethod() {
    io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenRequest, com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenResponse> getExchangeTokenMethod;
    if ((getExchangeTokenMethod = ExchangeTokenGrpc.getExchangeTokenMethod) == null) {
      synchronized (ExchangeTokenGrpc.class) {
        if ((getExchangeTokenMethod = ExchangeTokenGrpc.getExchangeTokenMethod) == null) {
          ExchangeTokenGrpc.getExchangeTokenMethod = getExchangeTokenMethod =
              io.grpc.MethodDescriptor.<com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenRequest, com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "exchangeToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExchangeTokenMethodDescriptorSupplier("exchangeToken"))
              .build();
        }
      }
    }
    return getExchangeTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExchangeTokenStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExchangeTokenStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExchangeTokenStub>() {
        @Override
        public ExchangeTokenStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExchangeTokenStub(channel, callOptions);
        }
      };
    return ExchangeTokenStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExchangeTokenBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExchangeTokenBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExchangeTokenBlockingStub>() {
        @Override
        public ExchangeTokenBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExchangeTokenBlockingStub(channel, callOptions);
        }
      };
    return ExchangeTokenBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExchangeTokenFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExchangeTokenFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExchangeTokenFutureStub>() {
        @Override
        public ExchangeTokenFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExchangeTokenFutureStub(channel, callOptions);
        }
      };
    return ExchangeTokenFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ExchangeTokenImplBase implements io.grpc.BindableService {

    /**
     */
    public void exchangeToken(com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangeTokenMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExchangeTokenMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenRequest,
                com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenResponse>(
                  this, METHODID_EXCHANGE_TOKEN)))
          .build();
    }
  }

  /**
   */
  public static final class ExchangeTokenStub extends io.grpc.stub.AbstractAsyncStub<ExchangeTokenStub> {
    private ExchangeTokenStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ExchangeTokenStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExchangeTokenStub(channel, callOptions);
    }

    /**
     */
    public void exchangeToken(com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangeTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ExchangeTokenBlockingStub extends io.grpc.stub.AbstractBlockingStub<ExchangeTokenBlockingStub> {
    private ExchangeTokenBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ExchangeTokenBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExchangeTokenBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenResponse exchangeToken(com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangeTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ExchangeTokenFutureStub extends io.grpc.stub.AbstractFutureStub<ExchangeTokenFutureStub> {
    private ExchangeTokenFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ExchangeTokenFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExchangeTokenFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenResponse> exchangeToken(
        com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangeTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXCHANGE_TOKEN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExchangeTokenImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExchangeTokenImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXCHANGE_TOKEN:
          serviceImpl.exchangeToken((com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.ExchangeTokenResponse>) responseObserver);
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

  private static abstract class ExchangeTokenBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExchangeTokenBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.widogame.minegamedataserver.grpc.ExchangeTokenOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExchangeToken");
    }
  }

  private static final class ExchangeTokenFileDescriptorSupplier
      extends ExchangeTokenBaseDescriptorSupplier {
    ExchangeTokenFileDescriptorSupplier() {}
  }

  private static final class ExchangeTokenMethodDescriptorSupplier
      extends ExchangeTokenBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExchangeTokenMethodDescriptorSupplier(String methodName) {
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
      synchronized (ExchangeTokenGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExchangeTokenFileDescriptorSupplier())
              .addMethod(getExchangeTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}

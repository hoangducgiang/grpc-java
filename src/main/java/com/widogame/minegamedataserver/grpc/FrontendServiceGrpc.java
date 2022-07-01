package com.widogame.minegamedataserver.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The FrontendService implements APIs to manage and query status of a Tickets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: service/FrontendService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FrontendServiceGrpc {

  private FrontendServiceGrpc() {}

  public static final String SERVICE_NAME = "openmatch.FrontendService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.CreateTicketRequest,
      com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket> getCreateTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTicket",
      requestType = com.widogame.minegamedataserver.grpc.FrontendMessage.CreateTicketRequest.class,
      responseType = com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.CreateTicketRequest,
      com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket> getCreateTicketMethod() {
    io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.CreateTicketRequest, com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket> getCreateTicketMethod;
    if ((getCreateTicketMethod = FrontendServiceGrpc.getCreateTicketMethod) == null) {
      synchronized (FrontendServiceGrpc.class) {
        if ((getCreateTicketMethod = FrontendServiceGrpc.getCreateTicketMethod) == null) {
          FrontendServiceGrpc.getCreateTicketMethod = getCreateTicketMethod =
              io.grpc.MethodDescriptor.<com.widogame.minegamedataserver.grpc.FrontendMessage.CreateTicketRequest, com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.FrontendMessage.CreateTicketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendServiceMethodDescriptorSupplier("CreateTicket"))
              .build();
        }
      }
    }
    return getCreateTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteTicketRequest,
      com.google.protobuf.Empty> getDeleteTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTicket",
      requestType = com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteTicketRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteTicketRequest,
      com.google.protobuf.Empty> getDeleteTicketMethod() {
    io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteTicketRequest, com.google.protobuf.Empty> getDeleteTicketMethod;
    if ((getDeleteTicketMethod = FrontendServiceGrpc.getDeleteTicketMethod) == null) {
      synchronized (FrontendServiceGrpc.class) {
        if ((getDeleteTicketMethod = FrontendServiceGrpc.getDeleteTicketMethod) == null) {
          FrontendServiceGrpc.getDeleteTicketMethod = getDeleteTicketMethod =
              io.grpc.MethodDescriptor.<com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteTicketRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteTicketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendServiceMethodDescriptorSupplier("DeleteTicket"))
              .build();
        }
      }
    }
    return getDeleteTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.GetTicketRequest,
      com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket> getGetTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTicket",
      requestType = com.widogame.minegamedataserver.grpc.FrontendMessage.GetTicketRequest.class,
      responseType = com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.GetTicketRequest,
      com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket> getGetTicketMethod() {
    io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.GetTicketRequest, com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket> getGetTicketMethod;
    if ((getGetTicketMethod = FrontendServiceGrpc.getGetTicketMethod) == null) {
      synchronized (FrontendServiceGrpc.class) {
        if ((getGetTicketMethod = FrontendServiceGrpc.getGetTicketMethod) == null) {
          FrontendServiceGrpc.getGetTicketMethod = getGetTicketMethod =
              io.grpc.MethodDescriptor.<com.widogame.minegamedataserver.grpc.FrontendMessage.GetTicketRequest, com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.FrontendMessage.GetTicketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendServiceMethodDescriptorSupplier("GetTicket"))
              .build();
        }
      }
    }
    return getGetTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.WatchAssignmentsRequest,
      com.widogame.minegamedataserver.grpc.FrontendMessage.WatchAssignmentsResponse> getWatchAssignmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchAssignments",
      requestType = com.widogame.minegamedataserver.grpc.FrontendMessage.WatchAssignmentsRequest.class,
      responseType = com.widogame.minegamedataserver.grpc.FrontendMessage.WatchAssignmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.WatchAssignmentsRequest,
      com.widogame.minegamedataserver.grpc.FrontendMessage.WatchAssignmentsResponse> getWatchAssignmentsMethod() {
    io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.WatchAssignmentsRequest, com.widogame.minegamedataserver.grpc.FrontendMessage.WatchAssignmentsResponse> getWatchAssignmentsMethod;
    if ((getWatchAssignmentsMethod = FrontendServiceGrpc.getWatchAssignmentsMethod) == null) {
      synchronized (FrontendServiceGrpc.class) {
        if ((getWatchAssignmentsMethod = FrontendServiceGrpc.getWatchAssignmentsMethod) == null) {
          FrontendServiceGrpc.getWatchAssignmentsMethod = getWatchAssignmentsMethod =
              io.grpc.MethodDescriptor.<com.widogame.minegamedataserver.grpc.FrontendMessage.WatchAssignmentsRequest, com.widogame.minegamedataserver.grpc.FrontendMessage.WatchAssignmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchAssignments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.FrontendMessage.WatchAssignmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.FrontendMessage.WatchAssignmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendServiceMethodDescriptorSupplier("WatchAssignments"))
              .build();
        }
      }
    }
    return getWatchAssignmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillRequest,
      com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillResponse> getAcknowledgeBackfillMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AcknowledgeBackfill",
      requestType = com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillRequest.class,
      responseType = com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillRequest,
      com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillResponse> getAcknowledgeBackfillMethod() {
    io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillRequest, com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillResponse> getAcknowledgeBackfillMethod;
    if ((getAcknowledgeBackfillMethod = FrontendServiceGrpc.getAcknowledgeBackfillMethod) == null) {
      synchronized (FrontendServiceGrpc.class) {
        if ((getAcknowledgeBackfillMethod = FrontendServiceGrpc.getAcknowledgeBackfillMethod) == null) {
          FrontendServiceGrpc.getAcknowledgeBackfillMethod = getAcknowledgeBackfillMethod =
              io.grpc.MethodDescriptor.<com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillRequest, com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AcknowledgeBackfill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendServiceMethodDescriptorSupplier("AcknowledgeBackfill"))
              .build();
        }
      }
    }
    return getAcknowledgeBackfillMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.CreateBackfillRequest,
      com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill> getCreateBackfillMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBackfill",
      requestType = com.widogame.minegamedataserver.grpc.FrontendMessage.CreateBackfillRequest.class,
      responseType = com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.CreateBackfillRequest,
      com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill> getCreateBackfillMethod() {
    io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.CreateBackfillRequest, com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill> getCreateBackfillMethod;
    if ((getCreateBackfillMethod = FrontendServiceGrpc.getCreateBackfillMethod) == null) {
      synchronized (FrontendServiceGrpc.class) {
        if ((getCreateBackfillMethod = FrontendServiceGrpc.getCreateBackfillMethod) == null) {
          FrontendServiceGrpc.getCreateBackfillMethod = getCreateBackfillMethod =
              io.grpc.MethodDescriptor.<com.widogame.minegamedataserver.grpc.FrontendMessage.CreateBackfillRequest, com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBackfill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.FrontendMessage.CreateBackfillRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendServiceMethodDescriptorSupplier("CreateBackfill"))
              .build();
        }
      }
    }
    return getCreateBackfillMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteBackfillRequest,
      com.google.protobuf.Empty> getDeleteBackfillMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBackfill",
      requestType = com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteBackfillRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteBackfillRequest,
      com.google.protobuf.Empty> getDeleteBackfillMethod() {
    io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteBackfillRequest, com.google.protobuf.Empty> getDeleteBackfillMethod;
    if ((getDeleteBackfillMethod = FrontendServiceGrpc.getDeleteBackfillMethod) == null) {
      synchronized (FrontendServiceGrpc.class) {
        if ((getDeleteBackfillMethod = FrontendServiceGrpc.getDeleteBackfillMethod) == null) {
          FrontendServiceGrpc.getDeleteBackfillMethod = getDeleteBackfillMethod =
              io.grpc.MethodDescriptor.<com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteBackfillRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBackfill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteBackfillRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendServiceMethodDescriptorSupplier("DeleteBackfill"))
              .build();
        }
      }
    }
    return getDeleteBackfillMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.GetBackfillRequest,
      com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill> getGetBackfillMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBackfill",
      requestType = com.widogame.minegamedataserver.grpc.FrontendMessage.GetBackfillRequest.class,
      responseType = com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.GetBackfillRequest,
      com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill> getGetBackfillMethod() {
    io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.GetBackfillRequest, com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill> getGetBackfillMethod;
    if ((getGetBackfillMethod = FrontendServiceGrpc.getGetBackfillMethod) == null) {
      synchronized (FrontendServiceGrpc.class) {
        if ((getGetBackfillMethod = FrontendServiceGrpc.getGetBackfillMethod) == null) {
          FrontendServiceGrpc.getGetBackfillMethod = getGetBackfillMethod =
              io.grpc.MethodDescriptor.<com.widogame.minegamedataserver.grpc.FrontendMessage.GetBackfillRequest, com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBackfill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.FrontendMessage.GetBackfillRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendServiceMethodDescriptorSupplier("GetBackfill"))
              .build();
        }
      }
    }
    return getGetBackfillMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.UpdateBackfillRequest,
      com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill> getUpdateBackfillMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBackfill",
      requestType = com.widogame.minegamedataserver.grpc.FrontendMessage.UpdateBackfillRequest.class,
      responseType = com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.UpdateBackfillRequest,
      com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill> getUpdateBackfillMethod() {
    io.grpc.MethodDescriptor<com.widogame.minegamedataserver.grpc.FrontendMessage.UpdateBackfillRequest, com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill> getUpdateBackfillMethod;
    if ((getUpdateBackfillMethod = FrontendServiceGrpc.getUpdateBackfillMethod) == null) {
      synchronized (FrontendServiceGrpc.class) {
        if ((getUpdateBackfillMethod = FrontendServiceGrpc.getUpdateBackfillMethod) == null) {
          FrontendServiceGrpc.getUpdateBackfillMethod = getUpdateBackfillMethod =
              io.grpc.MethodDescriptor.<com.widogame.minegamedataserver.grpc.FrontendMessage.UpdateBackfillRequest, com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBackfill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.FrontendMessage.UpdateBackfillRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendServiceMethodDescriptorSupplier("UpdateBackfill"))
              .build();
        }
      }
    }
    return getUpdateBackfillMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FrontendServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FrontendServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FrontendServiceStub>() {
        @Override
        public FrontendServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FrontendServiceStub(channel, callOptions);
        }
      };
    return FrontendServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FrontendServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FrontendServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FrontendServiceBlockingStub>() {
        @Override
        public FrontendServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FrontendServiceBlockingStub(channel, callOptions);
        }
      };
    return FrontendServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FrontendServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FrontendServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FrontendServiceFutureStub>() {
        @Override
        public FrontendServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FrontendServiceFutureStub(channel, callOptions);
        }
      };
    return FrontendServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The FrontendService implements APIs to manage and query status of a Tickets.
   * </pre>
   */
  public static abstract class FrontendServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * CreateTicket assigns an unique TicketId to the input Ticket and record it in state storage.
     * A ticket is considered as ready for matchmaking once it is created.
     *   - If a TicketId exists in a Ticket request, an auto-generated TicketId will override this field.
     *   - If SearchFields exist in a Ticket, CreateTicket will also index these fields such that one can query the ticket with query.QueryTickets function.
     * </pre>
     */
    public void createTicket(com.widogame.minegamedataserver.grpc.FrontendMessage.CreateTicketRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTicketMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteTicket immediately stops Open Match from using the Ticket for matchmaking and removes the Ticket from state storage.
     * The client should delete the Ticket when finished matchmaking with it.
     * </pre>
     */
    public void deleteTicket(com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteTicketRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTicketMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTicket get the Ticket associated with the specified TicketId.
     * </pre>
     */
    public void getTicket(com.widogame.minegamedataserver.grpc.FrontendMessage.GetTicketRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTicketMethod(), responseObserver);
    }

    /**
     * <pre>
     * WatchAssignments stream back Assignment of the specified TicketId if it is updated.
     *   - If the Assignment is not updated, GetAssignment will retry using the configured backoff strategy.
     * </pre>
     */
    public void watchAssignments(com.widogame.minegamedataserver.grpc.FrontendMessage.WatchAssignmentsRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.FrontendMessage.WatchAssignmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWatchAssignmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AcknowledgeBackfill is used to notify OpenMatch about GameServer connection info
     * This triggers an assignment process.
     * BETA FEATURE WARNING: This call and the associated Request and Response
     * messages are not finalized and still subject to possible change or removal.
     * </pre>
     */
    public void acknowledgeBackfill(com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAcknowledgeBackfillMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateBackfill creates a new Backfill object.
     * BETA FEATURE WARNING:  This call and the associated Request and Response
     * messages are not finalized and still subject to possible change or removal.
     * </pre>
     */
    public void createBackfill(com.widogame.minegamedataserver.grpc.FrontendMessage.CreateBackfillRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBackfillMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteBackfill receives a backfill ID and deletes its resource.
     * Any tickets waiting for this backfill will be returned to the active pool, no longer pending.
     * BETA FEATURE WARNING:  This call and the associated Request and Response
     * messages are not finalized and still subject to possible change or removal.
     * </pre>
     */
    public void deleteBackfill(com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteBackfillRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBackfillMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetBackfill returns a backfill object by its ID.
     * BETA FEATURE WARNING:  This call and the associated Request and Response
     * messages are not finalized and still subject to possible change or removal.
     * </pre>
     */
    public void getBackfill(com.widogame.minegamedataserver.grpc.FrontendMessage.GetBackfillRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBackfillMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateBackfill updates search_fields and extensions for the backfill with the provided id.
     * Any tickets waiting for this backfill will be returned to the active pool, no longer pending.
     * BETA FEATURE WARNING:  This call and the associated Request and Response
     * messages are not finalized and still subject to possible change or removal.
     * </pre>
     */
    public void updateBackfill(com.widogame.minegamedataserver.grpc.FrontendMessage.UpdateBackfillRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBackfillMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTicketMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.widogame.minegamedataserver.grpc.FrontendMessage.CreateTicketRequest,
                com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket>(
                  this, METHODID_CREATE_TICKET)))
          .addMethod(
            getDeleteTicketMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteTicketRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_TICKET)))
          .addMethod(
            getGetTicketMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.widogame.minegamedataserver.grpc.FrontendMessage.GetTicketRequest,
                com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket>(
                  this, METHODID_GET_TICKET)))
          .addMethod(
            getWatchAssignmentsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.widogame.minegamedataserver.grpc.FrontendMessage.WatchAssignmentsRequest,
                com.widogame.minegamedataserver.grpc.FrontendMessage.WatchAssignmentsResponse>(
                  this, METHODID_WATCH_ASSIGNMENTS)))
          .addMethod(
            getAcknowledgeBackfillMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillRequest,
                com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillResponse>(
                  this, METHODID_ACKNOWLEDGE_BACKFILL)))
          .addMethod(
            getCreateBackfillMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.widogame.minegamedataserver.grpc.FrontendMessage.CreateBackfillRequest,
                com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill>(
                  this, METHODID_CREATE_BACKFILL)))
          .addMethod(
            getDeleteBackfillMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteBackfillRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_BACKFILL)))
          .addMethod(
            getGetBackfillMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.widogame.minegamedataserver.grpc.FrontendMessage.GetBackfillRequest,
                com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill>(
                  this, METHODID_GET_BACKFILL)))
          .addMethod(
            getUpdateBackfillMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.widogame.minegamedataserver.grpc.FrontendMessage.UpdateBackfillRequest,
                com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill>(
                  this, METHODID_UPDATE_BACKFILL)))
          .build();
    }
  }

  /**
   * <pre>
   * The FrontendService implements APIs to manage and query status of a Tickets.
   * </pre>
   */
  public static final class FrontendServiceStub extends io.grpc.stub.AbstractAsyncStub<FrontendServiceStub> {
    private FrontendServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected FrontendServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FrontendServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateTicket assigns an unique TicketId to the input Ticket and record it in state storage.
     * A ticket is considered as ready for matchmaking once it is created.
     *   - If a TicketId exists in a Ticket request, an auto-generated TicketId will override this field.
     *   - If SearchFields exist in a Ticket, CreateTicket will also index these fields such that one can query the ticket with query.QueryTickets function.
     * </pre>
     */
    public void createTicket(com.widogame.minegamedataserver.grpc.FrontendMessage.CreateTicketRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteTicket immediately stops Open Match from using the Ticket for matchmaking and removes the Ticket from state storage.
     * The client should delete the Ticket when finished matchmaking with it.
     * </pre>
     */
    public void deleteTicket(com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteTicketRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTicket get the Ticket associated with the specified TicketId.
     * </pre>
     */
    public void getTicket(com.widogame.minegamedataserver.grpc.FrontendMessage.GetTicketRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WatchAssignments stream back Assignment of the specified TicketId if it is updated.
     *   - If the Assignment is not updated, GetAssignment will retry using the configured backoff strategy.
     * </pre>
     */
    public void watchAssignments(com.widogame.minegamedataserver.grpc.FrontendMessage.WatchAssignmentsRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.FrontendMessage.WatchAssignmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getWatchAssignmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AcknowledgeBackfill is used to notify OpenMatch about GameServer connection info
     * This triggers an assignment process.
     * BETA FEATURE WARNING: This call and the associated Request and Response
     * messages are not finalized and still subject to possible change or removal.
     * </pre>
     */
    public void acknowledgeBackfill(com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAcknowledgeBackfillMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateBackfill creates a new Backfill object.
     * BETA FEATURE WARNING:  This call and the associated Request and Response
     * messages are not finalized and still subject to possible change or removal.
     * </pre>
     */
    public void createBackfill(com.widogame.minegamedataserver.grpc.FrontendMessage.CreateBackfillRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBackfillMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteBackfill receives a backfill ID and deletes its resource.
     * Any tickets waiting for this backfill will be returned to the active pool, no longer pending.
     * BETA FEATURE WARNING:  This call and the associated Request and Response
     * messages are not finalized and still subject to possible change or removal.
     * </pre>
     */
    public void deleteBackfill(com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteBackfillRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBackfillMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetBackfill returns a backfill object by its ID.
     * BETA FEATURE WARNING:  This call and the associated Request and Response
     * messages are not finalized and still subject to possible change or removal.
     * </pre>
     */
    public void getBackfill(com.widogame.minegamedataserver.grpc.FrontendMessage.GetBackfillRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBackfillMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateBackfill updates search_fields and extensions for the backfill with the provided id.
     * Any tickets waiting for this backfill will be returned to the active pool, no longer pending.
     * BETA FEATURE WARNING:  This call and the associated Request and Response
     * messages are not finalized and still subject to possible change or removal.
     * </pre>
     */
    public void updateBackfill(com.widogame.minegamedataserver.grpc.FrontendMessage.UpdateBackfillRequest request,
        io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBackfillMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The FrontendService implements APIs to manage and query status of a Tickets.
   * </pre>
   */
  public static final class FrontendServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FrontendServiceBlockingStub> {
    private FrontendServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected FrontendServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FrontendServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateTicket assigns an unique TicketId to the input Ticket and record it in state storage.
     * A ticket is considered as ready for matchmaking once it is created.
     *   - If a TicketId exists in a Ticket request, an auto-generated TicketId will override this field.
     *   - If SearchFields exist in a Ticket, CreateTicket will also index these fields such that one can query the ticket with query.QueryTickets function.
     * </pre>
     */
    public com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket createTicket(com.widogame.minegamedataserver.grpc.FrontendMessage.CreateTicketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTicketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteTicket immediately stops Open Match from using the Ticket for matchmaking and removes the Ticket from state storage.
     * The client should delete the Ticket when finished matchmaking with it.
     * </pre>
     */
    public com.google.protobuf.Empty deleteTicket(com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteTicketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTicketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTicket get the Ticket associated with the specified TicketId.
     * </pre>
     */
    public com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket getTicket(com.widogame.minegamedataserver.grpc.FrontendMessage.GetTicketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTicketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WatchAssignments stream back Assignment of the specified TicketId if it is updated.
     *   - If the Assignment is not updated, GetAssignment will retry using the configured backoff strategy.
     * </pre>
     */
    public java.util.Iterator<com.widogame.minegamedataserver.grpc.FrontendMessage.WatchAssignmentsResponse> watchAssignments(
        com.widogame.minegamedataserver.grpc.FrontendMessage.WatchAssignmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getWatchAssignmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AcknowledgeBackfill is used to notify OpenMatch about GameServer connection info
     * This triggers an assignment process.
     * BETA FEATURE WARNING: This call and the associated Request and Response
     * messages are not finalized and still subject to possible change or removal.
     * </pre>
     */
    public com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillResponse acknowledgeBackfill(com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAcknowledgeBackfillMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateBackfill creates a new Backfill object.
     * BETA FEATURE WARNING:  This call and the associated Request and Response
     * messages are not finalized and still subject to possible change or removal.
     * </pre>
     */
    public com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill createBackfill(com.widogame.minegamedataserver.grpc.FrontendMessage.CreateBackfillRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBackfillMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteBackfill receives a backfill ID and deletes its resource.
     * Any tickets waiting for this backfill will be returned to the active pool, no longer pending.
     * BETA FEATURE WARNING:  This call and the associated Request and Response
     * messages are not finalized and still subject to possible change or removal.
     * </pre>
     */
    public com.google.protobuf.Empty deleteBackfill(com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteBackfillRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBackfillMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetBackfill returns a backfill object by its ID.
     * BETA FEATURE WARNING:  This call and the associated Request and Response
     * messages are not finalized and still subject to possible change or removal.
     * </pre>
     */
    public com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill getBackfill(com.widogame.minegamedataserver.grpc.FrontendMessage.GetBackfillRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBackfillMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateBackfill updates search_fields and extensions for the backfill with the provided id.
     * Any tickets waiting for this backfill will be returned to the active pool, no longer pending.
     * BETA FEATURE WARNING:  This call and the associated Request and Response
     * messages are not finalized and still subject to possible change or removal.
     * </pre>
     */
    public com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill updateBackfill(com.widogame.minegamedataserver.grpc.FrontendMessage.UpdateBackfillRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBackfillMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The FrontendService implements APIs to manage and query status of a Tickets.
   * </pre>
   */
  public static final class FrontendServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FrontendServiceFutureStub> {
    private FrontendServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected FrontendServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FrontendServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateTicket assigns an unique TicketId to the input Ticket and record it in state storage.
     * A ticket is considered as ready for matchmaking once it is created.
     *   - If a TicketId exists in a Ticket request, an auto-generated TicketId will override this field.
     *   - If SearchFields exist in a Ticket, CreateTicket will also index these fields such that one can query the ticket with query.QueryTickets function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket> createTicket(
        com.widogame.minegamedataserver.grpc.FrontendMessage.CreateTicketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteTicket immediately stops Open Match from using the Ticket for matchmaking and removes the Ticket from state storage.
     * The client should delete the Ticket when finished matchmaking with it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTicket(
        com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteTicketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTicketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetTicket get the Ticket associated with the specified TicketId.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket> getTicket(
        com.widogame.minegamedataserver.grpc.FrontendMessage.GetTicketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTicketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AcknowledgeBackfill is used to notify OpenMatch about GameServer connection info
     * This triggers an assignment process.
     * BETA FEATURE WARNING: This call and the associated Request and Response
     * messages are not finalized and still subject to possible change or removal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillResponse> acknowledgeBackfill(
        com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAcknowledgeBackfillMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateBackfill creates a new Backfill object.
     * BETA FEATURE WARNING:  This call and the associated Request and Response
     * messages are not finalized and still subject to possible change or removal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill> createBackfill(
        com.widogame.minegamedataserver.grpc.FrontendMessage.CreateBackfillRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBackfillMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteBackfill receives a backfill ID and deletes its resource.
     * Any tickets waiting for this backfill will be returned to the active pool, no longer pending.
     * BETA FEATURE WARNING:  This call and the associated Request and Response
     * messages are not finalized and still subject to possible change or removal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteBackfill(
        com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteBackfillRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBackfillMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetBackfill returns a backfill object by its ID.
     * BETA FEATURE WARNING:  This call and the associated Request and Response
     * messages are not finalized and still subject to possible change or removal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill> getBackfill(
        com.widogame.minegamedataserver.grpc.FrontendMessage.GetBackfillRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBackfillMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateBackfill updates search_fields and extensions for the backfill with the provided id.
     * Any tickets waiting for this backfill will be returned to the active pool, no longer pending.
     * BETA FEATURE WARNING:  This call and the associated Request and Response
     * messages are not finalized and still subject to possible change or removal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill> updateBackfill(
        com.widogame.minegamedataserver.grpc.FrontendMessage.UpdateBackfillRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBackfillMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TICKET = 0;
  private static final int METHODID_DELETE_TICKET = 1;
  private static final int METHODID_GET_TICKET = 2;
  private static final int METHODID_WATCH_ASSIGNMENTS = 3;
  private static final int METHODID_ACKNOWLEDGE_BACKFILL = 4;
  private static final int METHODID_CREATE_BACKFILL = 5;
  private static final int METHODID_DELETE_BACKFILL = 6;
  private static final int METHODID_GET_BACKFILL = 7;
  private static final int METHODID_UPDATE_BACKFILL = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FrontendServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FrontendServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TICKET:
          serviceImpl.createTicket((com.widogame.minegamedataserver.grpc.FrontendMessage.CreateTicketRequest) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket>) responseObserver);
          break;
        case METHODID_DELETE_TICKET:
          serviceImpl.deleteTicket((com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteTicketRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_TICKET:
          serviceImpl.getTicket((com.widogame.minegamedataserver.grpc.FrontendMessage.GetTicketRequest) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.FrontendMessage.Ticket>) responseObserver);
          break;
        case METHODID_WATCH_ASSIGNMENTS:
          serviceImpl.watchAssignments((com.widogame.minegamedataserver.grpc.FrontendMessage.WatchAssignmentsRequest) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.FrontendMessage.WatchAssignmentsResponse>) responseObserver);
          break;
        case METHODID_ACKNOWLEDGE_BACKFILL:
          serviceImpl.acknowledgeBackfill((com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillRequest) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.FrontendMessage.AcknowledgeBackfillResponse>) responseObserver);
          break;
        case METHODID_CREATE_BACKFILL:
          serviceImpl.createBackfill((com.widogame.minegamedataserver.grpc.FrontendMessage.CreateBackfillRequest) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill>) responseObserver);
          break;
        case METHODID_DELETE_BACKFILL:
          serviceImpl.deleteBackfill((com.widogame.minegamedataserver.grpc.FrontendMessage.DeleteBackfillRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_BACKFILL:
          serviceImpl.getBackfill((com.widogame.minegamedataserver.grpc.FrontendMessage.GetBackfillRequest) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill>) responseObserver);
          break;
        case METHODID_UPDATE_BACKFILL:
          serviceImpl.updateBackfill((com.widogame.minegamedataserver.grpc.FrontendMessage.UpdateBackfillRequest) request,
              (io.grpc.stub.StreamObserver<com.widogame.minegamedataserver.grpc.FrontendMessage.Backfill>) responseObserver);
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

  private static abstract class FrontendServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FrontendServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.widogame.minegamedataserver.grpc.FrontendServiceOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FrontendService");
    }
  }

  private static final class FrontendServiceFileDescriptorSupplier
      extends FrontendServiceBaseDescriptorSupplier {
    FrontendServiceFileDescriptorSupplier() {}
  }

  private static final class FrontendServiceMethodDescriptorSupplier
      extends FrontendServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FrontendServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FrontendServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FrontendServiceFileDescriptorSupplier())
              .addMethod(getCreateTicketMethod())
              .addMethod(getDeleteTicketMethod())
              .addMethod(getGetTicketMethod())
              .addMethod(getWatchAssignmentsMethod())
              .addMethod(getAcknowledgeBackfillMethod())
              .addMethod(getCreateBackfillMethod())
              .addMethod(getDeleteBackfillMethod())
              .addMethod(getGetBackfillMethod())
              .addMethod(getUpdateBackfillMethod())
              .build();
        }
      }
    }
    return result;
  }
}

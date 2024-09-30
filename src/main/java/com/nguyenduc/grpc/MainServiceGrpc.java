package com.nguyenduc.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: MainService.proto")
public final class MainServiceGrpc {

  private MainServiceGrpc() {}

  public static final String SERVICE_NAME = "com.nguyenduc.grpc.MainService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcRequest,
      com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcResponse> getGetUserByCardNoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserByCardNo",
      requestType = com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcRequest.class,
      responseType = com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcRequest,
      com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcResponse> getGetUserByCardNoMethod() {
    io.grpc.MethodDescriptor<com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcRequest, com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcResponse> getGetUserByCardNoMethod;
    if ((getGetUserByCardNoMethod = MainServiceGrpc.getGetUserByCardNoMethod) == null) {
      synchronized (MainServiceGrpc.class) {
        if ((getGetUserByCardNoMethod = MainServiceGrpc.getGetUserByCardNoMethod) == null) {
          MainServiceGrpc.getGetUserByCardNoMethod = getGetUserByCardNoMethod = 
              io.grpc.MethodDescriptor.<com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcRequest, com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.nguyenduc.grpc.MainService", "getUserByCardNo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MainServiceMethodDescriptorSupplier("getUserByCardNo"))
                  .build();
          }
        }
     }
     return getGetUserByCardNoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MainServiceStub newStub(io.grpc.Channel channel) {
    return new MainServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MainServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MainServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MainServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MainServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MainServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUserByCardNo(com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcRequest request,
        io.grpc.stub.StreamObserver<com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserByCardNoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserByCardNoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcRequest,
                com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcResponse>(
                  this, METHODID_GET_USER_BY_CARD_NO)))
          .build();
    }
  }

  /**
   */
  public static final class MainServiceStub extends io.grpc.stub.AbstractStub<MainServiceStub> {
    private MainServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MainServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MainServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MainServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUserByCardNo(com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcRequest request,
        io.grpc.stub.StreamObserver<com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserByCardNoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MainServiceBlockingStub extends io.grpc.stub.AbstractStub<MainServiceBlockingStub> {
    private MainServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MainServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MainServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MainServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcResponse getUserByCardNo(com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserByCardNoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MainServiceFutureStub extends io.grpc.stub.AbstractStub<MainServiceFutureStub> {
    private MainServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MainServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MainServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MainServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcResponse> getUserByCardNo(
        com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserByCardNoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_BY_CARD_NO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MainServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MainServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_BY_CARD_NO:
          serviceImpl.getUserByCardNo((com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcRequest) request,
              (io.grpc.stub.StreamObserver<com.nguyenduc.grpc.MainServiceOuterClass.ServiceGrpcResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MainServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MainServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nguyenduc.grpc.MainServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MainService");
    }
  }

  private static final class MainServiceFileDescriptorSupplier
      extends MainServiceBaseDescriptorSupplier {
    MainServiceFileDescriptorSupplier() {}
  }

  private static final class MainServiceMethodDescriptorSupplier
      extends MainServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MainServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MainServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MainServiceFileDescriptorSupplier())
              .addMethod(getGetUserByCardNoMethod())
              .build();
        }
      }
    }
    return result;
  }
}

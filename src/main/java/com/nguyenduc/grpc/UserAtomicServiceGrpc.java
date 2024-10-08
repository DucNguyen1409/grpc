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
    comments = "Source: UserAtomicService.proto")
public final class UserAtomicServiceGrpc {

  private UserAtomicServiceGrpc() {}

  public static final String SERVICE_NAME = "com.nguyenduc.grpc.UserAtomicService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nguyenduc.grpc.UserAtomicRequest,
      com.nguyenduc.grpc.UserAtomicResponse> getGetUserByCardNoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserByCardNo",
      requestType = com.nguyenduc.grpc.UserAtomicRequest.class,
      responseType = com.nguyenduc.grpc.UserAtomicResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nguyenduc.grpc.UserAtomicRequest,
      com.nguyenduc.grpc.UserAtomicResponse> getGetUserByCardNoMethod() {
    io.grpc.MethodDescriptor<com.nguyenduc.grpc.UserAtomicRequest, com.nguyenduc.grpc.UserAtomicResponse> getGetUserByCardNoMethod;
    if ((getGetUserByCardNoMethod = UserAtomicServiceGrpc.getGetUserByCardNoMethod) == null) {
      synchronized (UserAtomicServiceGrpc.class) {
        if ((getGetUserByCardNoMethod = UserAtomicServiceGrpc.getGetUserByCardNoMethod) == null) {
          UserAtomicServiceGrpc.getGetUserByCardNoMethod = getGetUserByCardNoMethod = 
              io.grpc.MethodDescriptor.<com.nguyenduc.grpc.UserAtomicRequest, com.nguyenduc.grpc.UserAtomicResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.nguyenduc.grpc.UserAtomicService", "getUserByCardNo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nguyenduc.grpc.UserAtomicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nguyenduc.grpc.UserAtomicResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserAtomicServiceMethodDescriptorSupplier("getUserByCardNo"))
                  .build();
          }
        }
     }
     return getGetUserByCardNoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserAtomicServiceStub newStub(io.grpc.Channel channel) {
    return new UserAtomicServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserAtomicServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserAtomicServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserAtomicServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserAtomicServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserAtomicServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUserByCardNo(com.nguyenduc.grpc.UserAtomicRequest request,
        io.grpc.stub.StreamObserver<com.nguyenduc.grpc.UserAtomicResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserByCardNoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserByCardNoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.nguyenduc.grpc.UserAtomicRequest,
                com.nguyenduc.grpc.UserAtomicResponse>(
                  this, METHODID_GET_USER_BY_CARD_NO)))
          .build();
    }
  }

  /**
   */
  public static final class UserAtomicServiceStub extends io.grpc.stub.AbstractStub<UserAtomicServiceStub> {
    private UserAtomicServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserAtomicServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAtomicServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserAtomicServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUserByCardNo(com.nguyenduc.grpc.UserAtomicRequest request,
        io.grpc.stub.StreamObserver<com.nguyenduc.grpc.UserAtomicResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserByCardNoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserAtomicServiceBlockingStub extends io.grpc.stub.AbstractStub<UserAtomicServiceBlockingStub> {
    private UserAtomicServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserAtomicServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAtomicServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserAtomicServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.nguyenduc.grpc.UserAtomicResponse getUserByCardNo(com.nguyenduc.grpc.UserAtomicRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserByCardNoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserAtomicServiceFutureStub extends io.grpc.stub.AbstractStub<UserAtomicServiceFutureStub> {
    private UserAtomicServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserAtomicServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAtomicServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserAtomicServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nguyenduc.grpc.UserAtomicResponse> getUserByCardNo(
        com.nguyenduc.grpc.UserAtomicRequest request) {
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
    private final UserAtomicServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserAtomicServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_BY_CARD_NO:
          serviceImpl.getUserByCardNo((com.nguyenduc.grpc.UserAtomicRequest) request,
              (io.grpc.stub.StreamObserver<com.nguyenduc.grpc.UserAtomicResponse>) responseObserver);
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

  private static abstract class UserAtomicServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserAtomicServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nguyenduc.grpc.UserAtomicServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserAtomicService");
    }
  }

  private static final class UserAtomicServiceFileDescriptorSupplier
      extends UserAtomicServiceBaseDescriptorSupplier {
    UserAtomicServiceFileDescriptorSupplier() {}
  }

  private static final class UserAtomicServiceMethodDescriptorSupplier
      extends UserAtomicServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserAtomicServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserAtomicServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserAtomicServiceFileDescriptorSupplier())
              .addMethod(getGetUserByCardNoMethod())
              .build();
        }
      }
    }
    return result;
  }
}

package com.nguyenduc.service;

import com.nguyenduc.constant.ResponseStatus;
import com.nguyenduc.grpc.Hello;
import com.nguyenduc.grpc.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void sayHello(Hello.HelloRequest request, StreamObserver<Hello.HelloResponse> responseObserver) {
        try {
            String greeting = "Hello, " + request.getName();

            Hello.HelloResponse result = Hello.HelloResponse.newBuilder()
                    .setMessage(greeting)
                    .setResponseCode(ResponseStatus.SUCCESS.getCode())
                    .build();

            responseObserver.onNext(result);
            responseObserver.onCompleted();
        } catch(Exception e) {
            Hello.HelloResponse result = Hello.HelloResponse.newBuilder()
                    .setMessage(ResponseStatus.ERROR.getDetail())
                    .setResponseCode(ResponseStatus.ERROR.getCode())
                    .build();
        }
    }
}

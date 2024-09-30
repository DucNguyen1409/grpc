package com.nguyenduc.orchestrator.service;

import com.nguyenduc.orchestrator.constant.ResponseStatus;
import com.nguyenduc.orchestrator.dto.HelloRequest;
import com.nguyenduc.orchestrator.dto.HelloResponse;
import com.nguyenduc.orchestrator.grpc.Hello;
import com.nguyenduc.orchestrator.grpc.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void sayHello(Hello.HelloRequest request, StreamObserver<Hello.HelloResponse> responseObserver) {
        String greeting = "Hello, " + request.getName();

        Hello.HelloResponse result = Hello.HelloResponse.newBuilder()
                .setMessage(greeting)
                .setResponseCode(ResponseStatus.SUCCESS.getCode())
                .build();

        responseObserver.onNext(result);
        responseObserver.onCompleted();
    }
}

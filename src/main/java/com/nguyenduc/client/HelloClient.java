package com.nguyenduc.client;

import com.nguyenduc.Utils.CommonUtils;
import com.nguyenduc.grpc.Hello;
import com.nguyenduc.grpc.HelloServiceGrpc;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloClient {

    private final CommonUtils common;

    @GrpcClient("local-grpc-server")
    private HelloServiceGrpc.HelloServiceBlockingStub helloStub;

    public String sendMessage(String name) {
        Hello.HelloRequest request = Hello.HelloRequest.newBuilder()
                .setName(name)
                .setRequestId(common.generateLMID())
                .build();
        Hello.HelloResponse response = helloStub.sayHello(request);
        return response.getMessage();
    }
}

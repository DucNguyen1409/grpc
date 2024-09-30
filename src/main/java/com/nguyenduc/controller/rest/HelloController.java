package com.nguyenduc.controller.rest;

import com.nguyenduc.client.HelloClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/management")
@RequiredArgsConstructor
public class HelloController {

    private final HelloClient helloClient;

    @GetMapping("/{name}")
    public void helloName(@PathVariable String name) {
        helloClient.sendMessage(name);
    }
}
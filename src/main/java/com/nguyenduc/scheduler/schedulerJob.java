package com.nguyenduc.scheduler;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
@RequiredArgsConstructor
public class schedulerJob {

//    private final HelloClient helloClient;
//
//    @Scheduled(cron = "${tcp.client.sendEcho: */5 * * * * ?}")
//    public void sendMessageJob() {
////        helloClient.sendMessage("DucNH");
//    }
}

package com.example.demo.controller;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@EnableEurekaClient
@RestController
public class SumController {

    @GetMapping("/sum")
    public Mono<Integer> sum(@RequestParam int x, @RequestParam int y) {
        return Mono.just(x+y);
    }
}

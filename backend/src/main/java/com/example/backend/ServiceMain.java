package com.example.backend;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ServiceMain {


    public Mono<String> change(String input){
        return Mono.just(input.toUpperCase());
    }
}

package com.example.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
public class Controller {

    private final ServiceMain serviceMain;

    public Controller(ServiceMain serviceMain) {
        this.serviceMain = serviceMain;
    }

    @GetMapping("/get")
    public Mono<String> getHello(){
        return Mono.just("hello");
    }


    @PostMapping("/change")
    public Mono<String> postString(@RequestBody Map map){
        String input = (String) map.get("input");
        return serviceMain.change(input);
    }


}

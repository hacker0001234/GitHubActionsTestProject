package com.example.backend;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webflux.test.autoconfigure.WebFluxTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@WebFluxTest(Controller.class)
public class ControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void testHello(){
        webTestClient.get().uri("/get")
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class)
                .isEqualTo("hello");
    }
}

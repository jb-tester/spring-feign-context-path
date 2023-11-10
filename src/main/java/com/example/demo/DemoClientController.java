package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoClientController {


    private final DemoClient demoClient;

    public DemoClientController(DemoClient demoClient) {
        this.demoClient = demoClient;
    }

    // genarated HTTP Request is ok (the context-path is added):
    // GET http://localhost:8082/demo/client/test
    @GetMapping("/test")
    String test(){
        return "response from client: "+demoClient.getTest();
    }
}

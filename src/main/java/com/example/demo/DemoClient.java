package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "test1",  url = "http://localhost:8081/server")
public interface DemoClient {

    // generated HTTP Request: GET http://localhost:8081/server/demo/client/test
    // expected: GET http://localhost:8081/server/test  (the context-path shouldn't be added)
    @GetMapping("/test")
    String getTest();
}

package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
class DemoController {
    @GetMapping(path = "/", produces = MediaType.TEXT_PLAIN_VALUE)
    String helloWorld() {
        return "Hello World\n";
    }
}

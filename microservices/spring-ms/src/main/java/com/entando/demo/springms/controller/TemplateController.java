package com.entando.demo.springms.controller;
import org.springframework.web.bind.annotation.*;
@RestController
public class TemplateController {
    @CrossOrigin @GetMapping("/api/example")
    public MyResponse getExample() { return new MyResponse("My NPS test data: " + Math.random()); }
    public static class MyResponse{
        private final String payload;
        public MyResponse(String payload) { this.payload = payload; }
        public String getPayload() { return payload; }
    }
}

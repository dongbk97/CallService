package com.example.callservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallController {

    @GetMapping("/call")
    public ResponseEntity<?> call() {
        return ResponseEntity.ok("Đã call lại");
    }

}

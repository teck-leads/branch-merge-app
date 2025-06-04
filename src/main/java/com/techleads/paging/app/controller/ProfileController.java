package com.techleads.paging.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    @GetMapping("/health-check")
    public ResponseEntity<String> helthCheck() {
        return ResponseEntity.ok("Application is running");
    }
}

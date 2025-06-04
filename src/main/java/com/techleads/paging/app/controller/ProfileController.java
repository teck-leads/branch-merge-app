package com.techleads.paging.app.controller;

import com.techleads.paging.app.service.ProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }


    @GetMapping("/health-check")
    public ResponseEntity<String> helthCheck() {
        return ResponseEntity.ok("Application is running");
    }
}

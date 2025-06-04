package com.techleads.paging.app.service;

import com.techleads.paging.app.repository.ProfileRepository;

public class ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }
}

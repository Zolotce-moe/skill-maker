package com.am.skillmaker.service;

import com.am.skillmaker.dto.UserProfileDto;
import com.am.skillmaker.repository.UserProfileRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserProfileService {
    private final UserProfileRepository userProfileRepository;

    public UserProfileDto createUserProfile(UserProfileDto userProfileDto) {
        return null;
    }

    public UserProfileDto getUserProfile(String userProfileId) {
        return null;
    }

    public UserProfileDto updateUserProfile(String userProfileId, UserProfileDto userProfileDto) {
        return null;
    }

    public void deleteUserProfile(String userProfileId) {
    }

    public List<UserProfileDto> getAllUserProfilesSortedByRating() {
        return null;
    }

    public List<UserProfileDto> getAllUserProfilesWithSkillAndSortedByRating(String skillId) {
        return null;
    }

}

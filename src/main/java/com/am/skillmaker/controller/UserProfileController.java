package com.am.skillmaker.controller;

import com.am.skillmaker.controller.EndpointInterface.UserProfileEndpoint;
import com.am.skillmaker.dto.UserProfileDto;
import com.am.skillmaker.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user_profile")
public class UserProfileController implements UserProfileEndpoint {
    private final UserProfileService userProfileService;

    @Override
    public UserProfileDto createUserProfile(UserProfileDto userProfileDto) {
        return userProfileService.createUserProfile(userProfileDto);
    }

    @Override
    public UserProfileDto getUserProfile(String userProfileId) {
        return userProfileService.getUserProfile(userProfileId);
    }

    @Override
    public UserProfileDto updateUserProfile(String userProfileId, UserProfileDto userProfileDto) {
        return userProfileService.updateUserProfile(userProfileId, userProfileDto);
    }

    @Override
    public void deleteUserProfile(String userProfileId) {
        userProfileService.deleteUserProfile(userProfileId);
    }

    @Override
    public List<UserProfileDto> getAllUserProfilesSortedByRating() {
        return userProfileService.getAllUserProfilesSortedByRating();
    }

    @Override
    public List<UserProfileDto> getAllUserProfilesWithSkillAndSortedByRating(String skillId) {
        return userProfileService.getAllUserProfilesWithSkillAndSortedByRating(skillId);
    }
}

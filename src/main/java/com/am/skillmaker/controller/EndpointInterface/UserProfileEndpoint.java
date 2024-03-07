package com.am.skillmaker.controller.EndpointInterface;

import com.am.skillmaker.dto.UserProfileDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface UserProfileEndpoint {
    @PostMapping(value = "/")
    UserProfileDto createUserProfile(@RequestBody UserProfileDto userProfileDto);

    @GetMapping(value = "/{userProfileId}")
    UserProfileDto getUserProfile(@PathVariable String userProfileId);

    @PutMapping(value = "/{userProfileId}")
    UserProfileDto updateUserProfile(@PathVariable String userProfileId, @RequestBody UserProfileDto userProfileDto);

    @DeleteMapping(value = "/{userProfileId}")
    void deleteUserProfile(@PathVariable String userProfileId);

    @GetMapping(value = "/all")
    List<UserProfileDto> getAllUserProfilesSortedByRating();

    @GetMapping(value = "/all/{skillId}")
    List<UserProfileDto> getAllUserProfilesWithSkillAndSortedByRating(@PathVariable String skillId);
}

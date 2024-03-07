package com.am.skillmaker.controller;

import com.am.skillmaker.controller.EndpointInterface.UserEndpoint;
import com.am.skillmaker.dto.UserDto;
import com.am.skillmaker.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController implements UserEndpoint {
    private final UserService userService;

    @Override
    public UserDto createUser(UserDto userDto) {
        return userService.createUser(userDto);
    }

    @Override
    public UserDto getUser(String userId) {
        return userService.getUser(userId);
    }

    @Override
    public UserDto updateUser(String userId, UserDto userDto) {
        return userService.updateUser(userId, userDto);
    }

    @Override
    public void deleteUser(String userId) {
        userService.deleteUser(userId);
    }
}

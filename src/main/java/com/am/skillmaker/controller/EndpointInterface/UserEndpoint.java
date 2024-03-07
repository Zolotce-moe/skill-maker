package com.am.skillmaker.controller.EndpointInterface;

import com.am.skillmaker.dto.UserDto;
import org.springframework.web.bind.annotation.*;

public interface UserEndpoint {
    @PostMapping(value = "/")
    UserDto createUser(@RequestBody UserDto userDto);

    @GetMapping(value = "/{userId}")
    UserDto getUser(@PathVariable String userId);

    @PutMapping(value = "/{userId}")
    UserDto updateUser(@PathVariable String userId, @RequestBody UserDto userDto);

    @DeleteMapping(value = "/{userId}")
    void deleteUser(@PathVariable String userId);
}

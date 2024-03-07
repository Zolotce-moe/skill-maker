package com.am.skillmaker.service;

import com.am.skillmaker.dto.UserDto;
import com.am.skillmaker.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    public UserDto createUser(UserDto userDto) {
        return null;
    }

    public UserDto getUser(String userId) {
        return null;
    }

    public UserDto updateUser(String userId, UserDto userDto) {
        return null;
    }

    public void deleteUser(String userId) {
    }
}

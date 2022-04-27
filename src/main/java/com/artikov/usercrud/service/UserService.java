package com.artikov.usercrud.service;

import com.artikov.usercrud.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getUserList();
    void createUser(UserDto userDto);
    void updateUser(UserDto userDto);
    void deleteUser(Long id);
}

package com.artikov.usercrud.service.impl;

import com.artikov.usercrud.dto.UserDto;
import com.artikov.usercrud.entity.UserEntity;
import com.artikov.usercrud.repository.UserRepository;
import com.artikov.usercrud.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<UserDto> getUserList(){
        return userRepository.findAll()
                .stream()
                .map(UserEntity::getDto)
                .collect(Collectors.toList());
    }

    @Transactional
    public void createUser(UserDto userDto){
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userDto, userEntity);
        userRepository.save(userEntity);
    }

    @Transactional
    public void updateUser(UserDto userDto){
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userDto, userEntity);
        userRepository.save(userEntity);
    }

    @Transactional
    public void deleteUser(Long id){
        Optional<UserEntity> userEntityOptional = userRepository.findById(id);
        userEntityOptional.ifPresent(userEntity -> userRepository.delete(userEntity));
    }
}

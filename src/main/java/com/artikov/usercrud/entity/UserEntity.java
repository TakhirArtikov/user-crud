package com.artikov.usercrud.entity;

import com.artikov.usercrud.dto.UserDto;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String fName;
    private String lName;
    private String dateOfBirth;
    private String city;
    private String mobileNumber;

    public UserDto getDto(){

        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(this, userDto);
        return userDto;
    }

}

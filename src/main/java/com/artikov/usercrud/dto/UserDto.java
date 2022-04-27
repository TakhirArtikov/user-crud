package com.artikov.usercrud.dto;

import lombok.Data;

@Data
public class UserDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String city;
    private String mobileNumber;

}

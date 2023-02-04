package com.logwin.userservice.UserService.Dto;


import com.logwin.userservice.UserService.entity.User;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto {

    private User user;
    private Department department;
}

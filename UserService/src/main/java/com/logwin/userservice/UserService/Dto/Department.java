package com.logwin.userservice.UserService.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Department {
    private Long id;

    private String name;

    private String address;
}

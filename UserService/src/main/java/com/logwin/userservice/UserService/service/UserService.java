package com.logwin.userservice.UserService.service;

import com.logwin.userservice.UserService.Dto.Department;
import com.logwin.userservice.UserService.Dto.UserDto;
import com.logwin.userservice.UserService.entity.User;
import com.logwin.userservice.UserService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User getUser(Long id) {
        Optional<User> user=userRepository.findById(id);
        return user.orElse(null);
    }

    public UserDto getUserWithDepartment(Long id) {
        UserDto userDto=new UserDto();
        Optional<User> user=userRepository.findById(id);
        if (user.isPresent()){
            userDto.setUser(user.get());
            Department department=restTemplate.getForObject("http://DEPT-SERVICE/department/"+user.get().getDepartmentId(),Department.class);

            userDto.setDepartment(department);
            return userDto;
        }
        return null;
    }
}

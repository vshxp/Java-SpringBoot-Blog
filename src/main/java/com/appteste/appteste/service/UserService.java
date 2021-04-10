package com.appteste.appteste.service;

import com.appteste.appteste.controller.dto.UserDto;
import com.appteste.appteste.model.User;
import com.appteste.appteste.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void save(UserDto userDto) {
        userRepository.save(new User(userDto.getId(), userDto.getName(), userDto.getPassword()));
    }

}

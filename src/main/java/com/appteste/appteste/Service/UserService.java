package com.appteste.appteste.Service;

import com.appteste.appteste.Controller.dto.UserDto;
import com.appteste.appteste.Model.User;
import com.appteste.appteste.Repository.UserRepository;
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

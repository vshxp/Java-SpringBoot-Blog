package com.appteste.appteste.controller;

import com.appteste.appteste.controller.dto.UserDto;
import com.appteste.appteste.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PutMapping("/new")
    @ResponseStatus(HttpStatus.OK)
    public void newUser(@RequestBody UserDto userDto){
        userService.save(userDto);
    }




}

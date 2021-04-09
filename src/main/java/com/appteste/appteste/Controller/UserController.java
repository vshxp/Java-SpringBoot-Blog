package com.appteste.appteste.Controller;

import com.appteste.appteste.Controller.dto.UserDto;
import com.appteste.appteste.Service.UserService;
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

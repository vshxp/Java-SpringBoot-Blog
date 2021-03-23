package com.appteste.appteste.Controller;

import com.appteste.appteste.Controller.dto.PersonDto;
import com.appteste.appteste.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.OK)
    public void newPerson(@RequestBody PersonDto personDto){
        personService.save(personDto);
    }


}

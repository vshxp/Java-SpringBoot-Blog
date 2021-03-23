package com.appteste.appteste.Service;

import com.appteste.appteste.Controller.dto.PersonDto;
import com.appteste.appteste.Model.Person;
import com.appteste.appteste.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void save(PersonDto personDto) {
        personRepository.save(new Person(personDto.getId(), personDto.getName()));
    }
}

package com.appteste.appteste.Repository;

import com.appteste.appteste.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

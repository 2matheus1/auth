package com.auth.service.impl;

import com.auth.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PersonService {
    List<Person> findAllPerson();

    Person findPersonById(Long id);

    void createPerson(Person person);
}

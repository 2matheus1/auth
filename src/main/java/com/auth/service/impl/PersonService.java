package com.auth.service.impl;

import com.auth.model.person.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAllPerson();

    Person findPersonById(Long id);

    void createPerson(Person person);
}

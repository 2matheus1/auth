package com.auth.service;

import com.auth.model.person.Person;
import com.auth.repository.PersonRepository;
import com.auth.service.impl.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public List<Person> findAllPerson() {
        return personRepository.findAll();
    }

    @Override
    public Person findPersonById(Long id) {
        return personRepository.findById(id).orElseThrow();
    }


    @Override
    public void createPerson(Person person) {
        personRepository.save(person);
    }


}

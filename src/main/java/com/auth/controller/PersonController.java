package com.auth.controller;

import com.auth.model.Person;
import com.auth.service.impl.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@AllArgsConstructor
public class PersonController {

    private PersonService personService;


    @GetMapping
    public ResponseEntity<List<Person>> findAll() {
        var allPerson = personService.findAllPerson();

        return ResponseEntity.ok().body(allPerson);

    }


    @GetMapping("/{id}")
    public ResponseEntity<Person> findById(@PathVariable Long id) {
        var allPerson = personService.findPersonById(id);

        return ResponseEntity.ok().body(allPerson);
    }

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody  Person person) {
        personService.createPerson(person);

        return new ResponseEntity<>(person, HttpStatus.CREATED);

    }

}

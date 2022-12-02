package com.hatch.demoapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/age")
    public List<Person> getPersonsUnderAge(@RequestParam int age){
        return personService.getByAge(age);
    }
//
    @GetMapping("/id")
    public Person getPersonById(@RequestParam long id){
        return personService.getById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public Person createPerson(@RequestBody Person person) {
        return personService.create(person);
    }

}

package com.hatch.demoapi;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.ArrayList;
@Component
public class PersonDao {

    private HashMap<Long, Person> persons = new HashMap<>();
    private Long idCounter = 4L; // simulating database ids

    public PersonDao() {
        persons.put(1L, new Person(1L, "Sarah", 13));
        persons.put(2L, new Person(2L, "James", 25));
        persons.put(3L, new Person(3L, "Oren", 44));
    }

    public HashMap<Long, Person> getPersons() {
        return this.persons;
    }

    public Person addPerson(Person person) {
        person.setId(this.idCounter);
        persons.put(this.idCounter, person);
        idCounter += 1;
        return person;
    }

}

package com.hatch.demoapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

@Service
public class PersonService {

    private final PersonDao personDao;

    @Autowired
    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public ArrayList<Person> getByAge(int age) {
        ArrayList<Person> personsUnderAge = new ArrayList<Person>();

        for (HashMap.Entry<Long, Person> person : personDao.getPersons().entrySet()) {
            if (person.getValue().getAge() < age) {
                personsUnderAge.add(person.getValue());
            }
        }
        return personsUnderAge;
    }

    public Person getById(long id) {
        return personDao.getPersons().get(id);
    }

    public Person create(Person person) {
        return personDao.addPerson(person);
    }
}

package com.ivoyant.redis.service;

import com.ivoyant.redis.entity.Person;
import com.ivoyant.redis.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepo personRepo;

    public Person savePerson(Person person) {
        return personRepo.save(person);
    }

    public List<Person> getAllPersons() {
        List<Person> people = new ArrayList<>();
        personRepo.findAll().forEach(people::add);
        return people;
    }
    public Person getPerson(String id) {
        return personRepo.findById(id).orElse(null);
    }

    public Person updatePerson(Person person, String id) {
        return personRepo.save(person);
    }

    public void deletePerson(String id) {
        personRepo.deleteById(id);
    }
}

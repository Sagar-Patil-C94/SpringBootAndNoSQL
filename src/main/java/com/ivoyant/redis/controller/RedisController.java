package com.ivoyant.redis.controller;

import com.ivoyant.redis.entity.Person;
import com.ivoyant.redis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private PersonService personService;

    @PostMapping("/create")
    public Person savePerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }

    @GetMapping("/getAllPersons")
    public List<Person> getPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/getPerson/{id}")
    public Person getPersonById(@PathVariable String id) {
        return personService.getPerson(id);
    }

    @PostMapping("/update/{id}")
    public Person updatePerson(@PathVariable String id, @RequestBody Person person) {
        return personService.updatePerson(person, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePerson(@PathVariable String id) {
        personService.deletePerson(id);
    }
}

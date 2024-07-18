package com.kabir.project.springjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonDao personDao;

    @GetMapping("/persons")
    public List<Person> findAll() {
        return personDao.findAll();
    }

    @GetMapping("/persons/{id}")
    public Person findById(@PathVariable int id) {
        return personDao.findById(id);
    }

    @PostMapping("/persons")
    public int addPerson(Person person) {
        return personDao.addPerson(person);
    }

    @PutMapping("/persons")
    public int updatePerson(Person person) {
        return personDao.updatePerson(person);
    }

    @DeleteMapping("/persons/{id}")
    public int deleteById(int id) {
        return personDao.deleteById(id);
    }
}

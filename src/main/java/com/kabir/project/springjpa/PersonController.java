package com.kabir.project.springjpa;

import com.kabir.project.springjpa.error.PersonNotFoundException;
import org.apache.catalina.valves.JsonErrorReportValve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/persons")
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @GetMapping("/persons/{id}")
    public Person findById(@PathVariable Long id) {
        return personRepository.findById(id);
    }

    @PostMapping("/persons")
    public Person addPerson(@RequestBody Person person) {
        return personRepository.addPerson(person);
    }

    @PutMapping("/persons")
    public Person updatePerson(@RequestBody Person person) {
        if(person.getId() == null || personRepository.findById(person.getId()) == null) {
            throw new PersonNotFoundException("id is not valid");
        }
        return personRepository.updatePerson(person);
    }

    @DeleteMapping("/persons/{id}")
    public void deleteById(@PathVariable Long id) {
       personRepository.deleteById(id);
    }
}

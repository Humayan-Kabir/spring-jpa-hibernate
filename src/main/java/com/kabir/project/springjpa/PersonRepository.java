package com.kabir.project.springjpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
@Transactional
public class PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> findAll() {
        return entityManager
                .createQuery("select p from Person p", Person.class)
                .getResultList();
    }

    public Person addPerson(Person person) {
        return entityManager.merge(person);
    }

    public Person updatePerson(Person person) {
        return entityManager.merge(person);
    }

    public Person findById(Long id) {
        return entityManager.find(Person.class, id);
    }

    public void deleteById(Long id) {
        Person person = findById(id);
        entityManager.remove(person);
    }
}

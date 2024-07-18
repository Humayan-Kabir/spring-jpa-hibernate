package com.kabir.project.springjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> findAll() {
        return jdbcTemplate.query("select * from person",
                new BeanPropertyRowMapper<>(Person.class));
    }

    public int addPerson(Person person) {
        return jdbcTemplate.update("insert into person (id, name, location, birth_date) " + "values(?, ?, ?, ?)",
                person.getId(), person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime()));
    }

    public int updatePerson(Person person) {
        return jdbcTemplate.update("update person " + "set name = ?, location = ?, birth_date = ?",
                person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime()));
    }

    public Person findById(int id) {
        return jdbcTemplate.queryForObject("select * from person where id = ?",
                new BeanPropertyRowMapper<>(Person.class), id);
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("delete from person where id = ?", id);
    }
}

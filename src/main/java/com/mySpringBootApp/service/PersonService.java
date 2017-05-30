package com.mySpringBootApp.service;

import com.mySpringBootApp.dao.PersonDao;
import com.mySpringBootApp.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by просто on 29.05.2017.
 */
@Service
public class PersonService {
    @Autowired
    private PersonDao dao;

    public List<Person> getAll(){
        List<Person> personList = new ArrayList<>();
        dao.findAll().forEach(personList::add);
        return personList;
    }

    public void addPerson(Person person){
        dao.save(person);
    }
}

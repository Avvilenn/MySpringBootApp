package com.mySpringBootApp.test;

import com.mySpringBootApp.model.Person;
import com.mySpringBootApp.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by просто on 31.05.2017.
 */

@RunWith(SpringRunner.class)
@DataJpaTest
public class PersonServiceTest {

    @Autowired
    private PersonService service;

    @Test
    public void testShowAll() {
        List <Person> personList = service.getAll();
        System.out.println(personList);
    }

}

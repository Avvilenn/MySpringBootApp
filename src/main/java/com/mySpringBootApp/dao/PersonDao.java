package com.mySpringBootApp.dao;

import com.mySpringBootApp.model.Person;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by просто on 29.05.2017.
 */
@Transactional
public interface PersonDao extends CrudRepository<Person, Long> {
}

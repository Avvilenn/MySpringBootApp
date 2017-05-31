package com.mySpringBootApp.controller;

import com.mySpringBootApp.model.Person;
import com.mySpringBootApp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by просто on 29.05.2017.
 */
@Controller
public class PersonController {
    @Autowired
    private PersonService service;

    @RequestMapping("/")
    public String welcome (Model model){
        List<Person> personList = service.getAll();
        model.addAttribute("PERSONS", personList);
        return "welcome";
    }

    @RequestMapping(value = "/addtext", method = RequestMethod.POST)
    public String add(@RequestBody Person person) {
        service.addPerson(person);
        return "welcome";
    }

//    @RequestMapping("/error")
//    public String error (Model model){
//        List<Person> personList = service.getAll();
//        model.addAttribute("PERSONS", personList);
//        return "welcome";
//    }



}

package com.mySpringBootApp.controller;

import com.mySpringBootApp.model.Person;
import com.mySpringBootApp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

//    @RequestMapping("/error")
//    public String error (Model model){
//        List<Person> personList = service.getAll();
//        model.addAttribute("PERSONS", personList);
//        return "welcome";
//    }



}

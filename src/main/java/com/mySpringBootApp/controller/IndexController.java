package com.mySpringBootApp.controller;

import com.mySpringBootApp.model.Person;
import com.mySpringBootApp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by просто on 31.05.2017.
 */
@Controller
public class IndexController implements ErrorController{

    private static final String PATH = "/error";

    @Autowired
    private PersonService service;

    @RequestMapping(value = PATH)
    public String error(Model model) {
        List<Person> personList = service.getAll();
        model.addAttribute("PERSONS", personList);
        return "welcome";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}

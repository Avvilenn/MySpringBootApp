package com.mySpringBootApp.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by просто on 31.05.2017.
 */
@Controller
public class IndexController implements ErrorController {

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "errorpage";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}

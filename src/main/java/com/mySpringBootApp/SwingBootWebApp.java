package com.mySpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by просто on 29.05.2017.
 */

@SpringBootApplication
public class SwingBootWebApp extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SwingBootWebApp.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SwingBootWebApp.class, args);
    }
}

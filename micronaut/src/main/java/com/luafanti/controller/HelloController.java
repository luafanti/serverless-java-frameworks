package com.luafanti.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Controller
public class HelloController {

    private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);

    @Get(value = "/hello")
    public String index() {
        LOG.info("Info logging");
        return "Hello Micronaut Lambda";
    }
}

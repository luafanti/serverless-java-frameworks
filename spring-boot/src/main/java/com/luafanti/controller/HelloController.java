package com.luafanti.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger LOG = LogManager.getLogger();

    @GetMapping("/hello")
    ResponseEntity<String> hello() {
        LOG.info("Info logging");
        return ResponseEntity.ok("Hello SpringBoot Lambda");
    }
}

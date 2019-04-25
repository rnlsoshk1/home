package com.velocity.test;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @RequestMapping(value = "/menus", method = RequestMethod.GET)
    public JsonNode form(){
        return service.getResult();
    }

}

package com.velocity.test;

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
    public String form(){
        return service.getResult();
    }

}

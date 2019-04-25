package com.velocity.test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.StringWriter;

@org.springframework.stereotype.Service
public class Service {
    Menu[] list;
    JsonNode actualObj;
    String result = "";

    public Service() throws IOException {
        String url = "http://ec2-13-125-30-89.ap-northeast-2.compute.amazonaws.com:8080/menus";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Menu[]> response = restTemplate.getForEntity(url, Menu[].class);
        HttpStatus statusCode = response.getStatusCode();

        list = response.getBody();
        dump(statusCode);
    }

    private void dump(HttpStatus status) throws IOException {
        if(status == HttpStatus.OK){
            VelocityEngine ve = new VelocityEngine();
            ve.setProperty(RuntimeConstants.FILE_RESOURCE_LOADER_PATH, "/Users/kwon/Study/Velocity/home/src/main/resources/templates");
            ve.init();

            Template t = ve.getTemplate("model.vm");

            VelocityContext vc = new VelocityContext();

            vc.put("inputRoot", list);

            StringWriter sw = new StringWriter();
            t.merge(vc, sw);

            result = sw.toString();
            System.out.println(result);

            ObjectMapper mapper = new ObjectMapper();
            actualObj = mapper.readTree(result);
        }
    }

    public JsonNode getResult(){
        return actualObj;
    }

}

package com.velocity.test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.parser.JSONParser;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@org.springframework.stereotype.Service
public class Service {
    private String url = "http://ec2-13-125-229-70.ap-northeast-2.compute.amazonaws.com:8080/menus";
    private String result = "";

    private RestTemplate restTemplate;
    private HttpHeaders headers;
    private HttpEntity<Menu[]> entity;
    private ResponseEntity<Menu[]> response;
    private HttpStatus statusCode;

    private VelocityEngine ve;
    private Template t;
    private VelocityContext vc;

    private ObjectMapper objectMapper;
    private Map<Object, Object> map;

    public Service(){
        restTemplate = new RestTemplate();
        headers = new HttpHeaders();

        headers.setAccept(Arrays.asList(new MediaType[] {MediaType.APPLICATION_JSON}));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("my_other_key", "my_other_value");

        entity = new HttpEntity<>(headers);
        response = restTemplate.exchange(url, HttpMethod.GET, entity, Menu[].class);

        statusCode = response.getStatusCode();
        dump(statusCode);
    }

    private void dump(HttpStatus status){
        if(status == HttpStatus.OK){
            ve = new VelocityEngine();
            ve.setProperty(RuntimeConstants.FILE_RESOURCE_LOADER_PATH, "/Users/new/Downloads/test 2/src/main/resources/templates");
            ve.init();

            t = ve.getTemplate("model.vm");

            vc = new VelocityContext();

            Menu[] list = response.getBody();
            vc.put("inputRoot", list);

            StringWriter sw = new StringWriter();
            t.merge(vc, sw);

            System.out.println(sw);
            result = sw.toString();

//            objectMapper = new ObjectMapper();
//            map = new HashMap<>();
//
//            try{
//                map = objectMapper.readValue(result, new TypeReference<>())
//                System.out.println(map);
//            } catch (JsonParseException e) {
//                e.printStackTrace();
//            } catch (JsonMappingException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
            //System.out.println(result);
        }
    }

    public String getResult(){
        return result;
    }

}

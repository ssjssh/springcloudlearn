package org.ssj.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.ssj.entity.Student;

import java.util.Collection;

@RestController
@RequestMapping("/rest")
public class RestHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return restTemplate.getForObject("http://localhost:8020/student/findAll", Collection.class);
    }
}

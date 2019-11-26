package org.ssj.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.ssj.entity.Student;

import java.util.Collection;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return restTemplate.getForObject("http://provider/student/findAll",Collection.class);
    }
}

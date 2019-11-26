package org.ssj.handler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ssj.entity.Student;
import org.ssj.feign.FeignProviderClient;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignHandler {
    @Autowired
    private FeignProviderClient providerClient;

    @RequestMapping("/findAll")
    public Collection<Student> findAll() {
        return providerClient.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return providerClient.index();
    }



}

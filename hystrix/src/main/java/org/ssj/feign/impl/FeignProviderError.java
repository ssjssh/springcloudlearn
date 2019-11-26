package org.ssj.feign.impl;

import org.springframework.stereotype.Component;
import org.ssj.entity.Student;
import org.ssj.feign.FeignProviderClient;

import java.util.Collection;

@Component
public class FeignProviderError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中";
    }
}

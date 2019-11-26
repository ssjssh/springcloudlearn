package org.ssj.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.ssj.entity.Student;
import org.ssj.feign.impl.FeignProviderError;

import java.util.Collection;

@FeignClient(value = "provider", fallback = FeignProviderError.class)
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}

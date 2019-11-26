package org.ssj.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("native")
public class NativeConfigHandler {
    @Value("${server.port}")
    private int port;

    @Value("${foo}")
    private String foo;

    @GetMapping("index")
    public String index() {
        return port + "->" + foo;
    }


}

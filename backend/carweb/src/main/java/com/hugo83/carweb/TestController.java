package com.hugo83.carweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {
    @GetMapping("/hello")
    @ResponseBody
    public String helloSpring() {
        return "Hello, SpringBoot!";
    }
    
}

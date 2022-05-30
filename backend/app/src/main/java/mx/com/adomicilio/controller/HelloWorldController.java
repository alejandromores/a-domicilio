package mx.com.adomicilio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping(value = "/message")
    public String helloWorldMsg(){
        return "Hello world";
    }
}

package mx.com.adomicilio.controller;

import mx.com.adomicilio.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static String defaultMsg = "Hello, %s!";
    private AtomicLong counter = new AtomicLong();

    @GetMapping(value = "/greeting")
    public Greeting getGreeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(defaultMsg, name));
    }

}

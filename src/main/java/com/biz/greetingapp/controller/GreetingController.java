package com.biz.greetingapp.controller;

import com.biz.greetingapp.entity.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private static final String template="Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    // Controller for return JSON for get ethods.

    @GetMapping("/")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }


    @RequestMapping("/user")
    public Greeting greetingUser(@RequestParam(value="firstName") String firstName,
                                 @RequestParam(value="lastName") String lastName) {
        return new Greeting(counter.incrementAndGet(),String.format(template, (firstName+" "+lastName)));
    }

    @PutMapping("/{firstName}")
    public Greeting greeting(@PathVariable String firstName,
                             @RequestParam(value = "lastName") String lastName) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, (firstName+" "+lastName)));
    }
}

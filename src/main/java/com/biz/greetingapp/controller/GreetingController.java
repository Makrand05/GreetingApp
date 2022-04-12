package com.biz.greetingapp.controller;

import com.biz.greetingapp.entity.Greeting;
import com.biz.greetingapp.entity.User;
import com.biz.greetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
//    private static final String template="Hello, %s";
//    private final AtomicLong counter = new AtomicLong();

    // Controller for return JSON for get ethods.
    @Autowired
    IGreetingService iGreetingService;

    @GetMapping("/")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        User user = new User();
        user.setName(name);
        return iGreetingService.addGreeting(user);
    }


    @RequestMapping("/getGreeting")
    public Greeting getGreeting(@RequestParam int id) {
        return iGreetingService.getGreeting(id);
    }

    @PostMapping("/allGreeting")
    public List<Greeting> getAllGreeting(){
        return iGreetingService.getallGreeting();
    }

    @PostMapping("/editGreeting")
    public Greeting editGreeting(@RequestParam int id){
        return iGreetingService.editGreeting(id);
    }
    @PostMapping("/deleteGreeting")
    public String deleteGreeting(@RequestParam long id){
        iGreetingService.deleteGreeting(id);
        return "Greeting deleted" +id;
    }


}

package com.biz.greetingapp.service;

import com.biz.greetingapp.entity.Greeting;
import com.biz.greetingapp.entity.User;

import java.util.List;

public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreeting(long id);

    List<Greeting> getallGreeting();

    Greeting editGreeting(int id);

     void deleteGreeting(long id);
}

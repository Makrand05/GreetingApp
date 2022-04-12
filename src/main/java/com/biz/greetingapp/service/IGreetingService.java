package com.biz.greetingapp.controller;

import com.biz.greetingapp.entity.Greeting;
import com.biz.greetingapp.entity.User;

public interface IGreetingController {
    Greeting addGreeting(User user);
    Greeting getGreeting(long id);
}

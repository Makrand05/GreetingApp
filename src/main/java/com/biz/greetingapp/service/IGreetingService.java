package com.biz.greetingapp.service;

import com.biz.greetingapp.entity.Greeting;
import com.biz.greetingapp.entity.User;

public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreeting(long id);
}

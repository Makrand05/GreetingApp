package com.biz.greetingapp.service;

import com.biz.greetingapp.repo.GreetingRepository;
import com.biz.greetingapp.entity.Greeting;
import com.biz.greetingapp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGreetingService {
    private static final String template="Hello, %s";
    private final AtomicLong counter = new Atomiadd .cLong();

    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public Greeting addGreeting(User user) {
        String message=String.format(template,(user.toString().isEmpty()?"Hello World":user.toString()));

        return greetingRepository.save(new Greeting(counter.incrementAndGet(),message));
    }

    @Override
    public Greeting getGreeting(long id) {
        return greetingRepository.findById(id).get();
    }
}

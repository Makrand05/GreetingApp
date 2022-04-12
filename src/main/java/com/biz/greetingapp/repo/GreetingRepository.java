package com.biz.greetingapp.repo;

import com.biz.greetingapp.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface GreetingRepository extends JpaRepository<Greeting,Long> {
}

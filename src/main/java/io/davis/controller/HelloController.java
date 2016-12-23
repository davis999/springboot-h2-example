package io.davis.controller;

import io.davis.entity.User;
import io.davis.service.UserService;

import org.hibernate.engine.jdbc.connections.internal.UserSuppliedConnectionProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Davis on 16/12/23.
 */
@RestController
public class HelloController {
  @Autowired
  private UserService userService;

  @GetMapping("/index")
  public User hello() {
    User user = userService.createUser();
    return user;
  }

  @GetMapping("/user/{id}")
  public User getUser(@PathVariable(value = "id") String id) {
    return userService.getUser(id);
  }
}

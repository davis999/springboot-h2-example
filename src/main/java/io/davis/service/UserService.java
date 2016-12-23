package io.davis.service;

import io.davis.entity.User;
import io.davis.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Davis on 16/12/23.
 */
@Service
public class UserService {
  /**
   * The Repository.
   */
  @Autowired
  private UserRepository repository;

  public User createUser() {
    User user = new User();
    user.setName("name");
    user.setAge(188);
    User savedUser = repository.save(user);
    return savedUser;
  }

  public User getUser(String id) {
    return repository.findOne(id);
  }
}

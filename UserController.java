package com.harishdemo.users;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
  private final UserRepo repo;

  public UserController(UserRepo repo) {
    this.repo = repo;
  }

  @GetMapping
  public List<User> all() {
    return repo.findAll();
  }
}
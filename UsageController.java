package com.harishdemo.usage;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usage")
public class UsageController {

 private final UsageRepo repo;

 public UsageController(UsageRepo repo){
  this.repo = repo;
 }

 @PostMapping
 public UsageLog log(@RequestBody UsageLog log){
  return repo.save(log);
 }

 @GetMapping
 public List<UsageLog> all(){
  return repo.findAll();
 }
}

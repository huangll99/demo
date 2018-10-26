package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author: huangll
 * Written on 2018/10/25.
 */
@RestController
public class UserController {

  @Autowired
  private UserMapper userMapper;

  @GetMapping("/hello")
  public String hello() {
    List<User> users = userMapper.selectList(null);
    users.stream().forEach(System.out::println);

    return "ok";
  }
}

package com.xiangfajun.cloud.demo.user.controller;

import com.xiangfajun.cloud.demo.user.entity.User;
import com.xiangfajun.cloud.demo.user.feign.UserFeignHystrixClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignHystrixController {
  @Autowired
  private UserFeignHystrixClient userFeignHystrixClient;

  @GetMapping("feign/{id}")
  public User findByIdFeign(@PathVariable Long id) {
    User user = this.userFeignHystrixClient.findByIdFeign(id);
    return user;
  }

  @GetMapping("feign/time_out/{time}")
  public User findUserTimeOutTest(@PathVariable Long time) {
    User user = this.userFeignHystrixClient.testTimeOutFeign(time);
    return user;
  }
}

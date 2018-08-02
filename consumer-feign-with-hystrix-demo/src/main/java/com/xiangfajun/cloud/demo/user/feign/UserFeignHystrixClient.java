package com.xiangfajun.cloud.demo.user.feign;

import com.xiangfajun.cloud.demo.user.entity.User;
import com.xiangfajun.cloud.demo.user.fallback.UserFeignHystrixClientFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 使用@FeignClient注解的fallback属性，指定fallback类
 */
@FeignClient(name = "service-demo", fallback = UserFeignHystrixClientFallBack.class)
public interface UserFeignHystrixClient {

  @RequestMapping("/{id}")
 public User findByIdFeign(@PathVariable("id") Long id);

  @RequestMapping("/time_out/{time}")
  public User testTimeOutFeign(@PathVariable("time") Long time);

}

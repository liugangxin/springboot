package org.spring.springboot.dubbo;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.liu.UserBean;
import com.liu.service.UserService;

@Component
public class UserServiceClient {

	@Reference(version = "1.0.0")
	UserService userService;

	public UserBean getName() {
		UserBean user = userService.getName();
		System.out.println("查询到：" + user.getName());
		return user;
	}

}

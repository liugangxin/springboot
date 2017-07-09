package org.spring.springboot.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.liu.UserBean;
import com.liu.service.UserService;

/* 注册为 Dubbo 服务
 * 注意：dubbo获取相关服务类，需要在指定的包下.
 * */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

	@Override
	public UserBean getName() {
		return new UserBean(1, "liugangxin");
	}
}

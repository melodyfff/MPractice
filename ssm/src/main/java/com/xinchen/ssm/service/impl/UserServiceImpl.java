package com.xinchen.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xinchen.ssm.dao.UserDao;
import com.xinchen.ssm.dao.UserMapper;
import com.xinchen.ssm.entity.User;
import com.xinchen.ssm.service.UserService;

/**   
* @Description: 
* @author xinchen  
* @date 2016年8月14日 下午7:09:17   
*/
@Service("userService")
public class UserServiceImpl implements UserService {
	 @Autowired
	 private UserMapper userMapper;
	
	 @Autowired
	 private UserDao userDao;
	 
	@Override
	public List<User> loadUsers() {
		// TODO Auto-generated method stub
		return userMapper.queryAll();
	}
 
	@Override
	public List<User> loadUsers2() {
		// TODO Auto-generated method stub
		return userDao.queryAll();
	}

	
	

}

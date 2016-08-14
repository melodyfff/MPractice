package com.xinchen.ssm.service;

import java.util.List;

import com.xinchen.ssm.entity.User;

/**   
* @Description: 
* @author xinchen  
* @date 2016年8月14日 下午7:06:55   
*/
public interface UserService {
	/** 
	* @Title: loadUsers 
	* @Description: TODO 加载用户  
	* @return List<User>     
	*/
	List<User> loadUsers();
	List<User> loadUsers2();
}
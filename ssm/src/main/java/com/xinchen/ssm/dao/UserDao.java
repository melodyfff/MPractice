package com.xinchen.ssm.dao;

import java.util.List;

import com.xinchen.ssm.entity.User;

/**   
* @Description: 
* @author xinchen  
* @date 2016年8月14日 下午9:07:11   
*/
public interface UserDao {
	/** 
	* @Title: queryAll 
	* @Description: TODO 查询所有    
	* @return List<User>     
	*/
	List<User> queryAll();
}
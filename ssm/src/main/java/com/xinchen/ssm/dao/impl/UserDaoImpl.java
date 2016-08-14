package com.xinchen.ssm.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.xinchen.ssm.dao.UserDao;
import com.xinchen.ssm.entity.User;

/**   
* @Description: 
* @author xinchen  
* @date 2016年8月14日 下午9:07:49   
*/
@Repository
public class UserDaoImpl implements UserDao {
	@Resource
	public SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<User> queryAll() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("mapping.UserMapper.queryAll");
	}
	
}
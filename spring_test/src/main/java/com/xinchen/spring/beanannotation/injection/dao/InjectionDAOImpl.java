package com.xinchen.spring.beanannotation.injection.dao;

import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @author xinchen
 * @date 2016年10月5日 上午12:14:10
 * @version V1.0
 */
@Repository
public class InjectionDAOImpl implements InjectionDAO {

	public void save(String arg) {
		// TODO Auto-generated method stub
		System.out.println("保存数据：" + arg);
	}

}

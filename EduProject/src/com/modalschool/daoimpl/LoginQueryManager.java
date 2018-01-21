package com.modalschool.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.modalschool.bean.LoginUser;
import com.modalschool.dao.LoginDao;

/**
 * @author udaykumar swamy
 *
 */
@Service
public class LoginQueryManager {

	@Autowired
	private LoginDao loginDao;
	
	@Transactional
	public List<LoginUser> checkUser(String userName,String password){
		return loginDao.loginCheck(userName, password);
	}
}

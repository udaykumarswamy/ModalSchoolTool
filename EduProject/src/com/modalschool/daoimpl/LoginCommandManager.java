package com.modalschool.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.modalschool.dao.LoginDao;

/**
 * @author udaykumar swamy
 *
 */
@Service
public class LoginCommandManager {

	@Autowired
	private LoginDao loginDao;
	@Transactional
	public void updateLastLogin(double userId)
	{
		loginDao.updateLastLogin(userId);
	}
}

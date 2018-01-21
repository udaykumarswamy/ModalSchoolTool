package com.modalschool.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.modalschool.bean.LoginUser;
import com.modalschool.constants.ApplicationConstants;

/**
 * @author udaykumar swamy
 *
 */
@Repository
public class LoginDao extends SessinfactoryDao {
	
	/**
	 * @param userName
	 * @param password
	 * @return LoginUser Bean
	 * 
	 * This Following code will check for the existence of the user In the DataMart
	 */
	@Transactional
	public List<LoginUser> loginCheck(String userName,String password)
	{
		ArrayList<LoginUser> loginUserList=new ArrayList<LoginUser>();
		LoginUser loginUser=new LoginUser();
		Query query=sessionFactory.getCurrentSession().createQuery(ApplicationConstants.checkUser);
		query.setParameter("userName", userName);
		query.setParameter("password", password);
		loginUserList=(ArrayList<LoginUser>) query.list();
		if(loginUserList.size()>=1)
		{
		for(LoginUser user:loginUserList){
			loginUser.setUserName(user.getUserName());
			loginUser.setUserId(user.getUserId());
			loginUser.setUserMailId(user.getUserMailId());
			loginUser.setLastLogin(user.getLastLogin());
			loginUser.setAccessType(user.getAccessType());
		}
		}
		else
		{
			loginUserList=null;
		}
		return loginUserList;
		
	}

}

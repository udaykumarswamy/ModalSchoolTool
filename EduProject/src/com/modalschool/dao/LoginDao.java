package com.modalschool.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
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
	 *         This Following code will check for the existence of the user In
	 *         the DataMart
	 */
	@Transactional
	public List<LoginUser> loginCheck(String userName, String password) {
		ArrayList<LoginUser> loginUserList = new ArrayList<LoginUser>();
		try {

			LoginUser loginUser = new LoginUser();

			Query query = sessionFactory.getCurrentSession().createQuery(
					ApplicationConstants.checkUser);
			query.setParameter("userName", userName);
			query.setParameter("password", password);
			loginUserList = (ArrayList<LoginUser>) query.list();
			/* sessionFactory.close(); */
			if (loginUserList.size() >= 1) {
				for (LoginUser user : loginUserList) {
					loginUser.setUserName(user.getUserName());
					loginUser.setUserId(user.getUserId());
					loginUser.setUserMailId(user.getUserMailId());
					loginUser.setLastLogin(user.getLastLogin());
					loginUser.setAccessType(user.getAccessType());
				}

			} else {
				loginUserList = null;
			}

			return loginUserList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			
		}
		return loginUserList;

	}

	/**
	 * @param userId
	 *            this following method will update the last login time with the
	 *            current time
	 */
	@Transactional
	public void updateLastLogin(double userId) {
		Session session = sessionFactory.openSession();
		Transaction updateLoginTransaction=null;
		try {
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date currentLogin = new Date();
			String lastLogin = dateFormat.format(currentLogin);
			Object obj=session.load(LoginUser.class, new Double(userId));
			LoginUser loginUser=(LoginUser)obj;
			updateLoginTransaction= session.beginTransaction();
			loginUser.setLastLogin(lastLogin);
			updateLoginTransaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			updateLoginTransaction.rollback();
		} finally {
			session.close();
		}
	}

}

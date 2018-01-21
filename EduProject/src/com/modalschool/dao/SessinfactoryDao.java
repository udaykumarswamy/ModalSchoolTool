package com.modalschool.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author udaykumar swamy
 *
 */
@Repository
@Transactional
public class SessinfactoryDao {
	
	@Autowired 
	protected SessionFactory sessionFactory;
	
	
	public Session getSession()
	{
		return sessionFactory.getCurrentSession();
		
	}
}

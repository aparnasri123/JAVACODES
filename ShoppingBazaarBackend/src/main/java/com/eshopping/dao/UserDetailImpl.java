package com.eshopping.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eshopping.model.Category;
import com.eshopping.model.UserDetail;

@Repository("userDetail")
@Transactional
public class UserDetailImpl implements UserDetailDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addUserDetail(UserDetail userDetail) {
		
		try {
			
			sessionFactory.getCurrentSession().save(userDetail);
			return true;
		  }
		catch(Exception e) {
			return false;
		}
	}
		
	@Override
	public boolean deleteUserDetail(UserDetail userDetail) {
	 try {
		 
		 sessionFactory.getCurrentSession().delete(userDetail);
		 return true;
	  }catch(Exception e)
	 {
		 return false;
	 }
	}

	@Override
	public boolean updateUserDetail(UserDetail userDetail) {
		
		try
		{
		   sessionFactory.getCurrentSession().update(userDetail);
		   return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public UserDetail getUserDetail(String UserName) {
		Session session=sessionFactory.openSession();
		UserDetail userDetail = session.get(UserDetail.class,UserName);
		session.close();
		return userDetail ;
	}

	@Override
	public List<UserDetail> userdetailLists() {
		Session session =sessionFactory.openSession();
		Query query=session.createQuery("from UserDetail");
		List<UserDetail> userdetailList = query.list();
		session.close();
		return userdetailList;
	}
	

	

}

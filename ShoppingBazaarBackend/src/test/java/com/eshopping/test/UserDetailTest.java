package com.eshopping.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eshopping.dao.UserDetailDAO;
import com.eshopping.model.UserDetail;

public class UserDetailTest {

	static UserDetailDAO userDetailDAO;
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.eshopping");
		context.refresh();
		
		userDetailDAO=(UserDetailDAO)context.getBean("userDetail");
	}
	
	@Ignore
	@Test
	public void addUserDetailTest()
	{
		UserDetail userDetail=new UserDetail();
		userDetail.setUserName("Aparna");
		userDetail.setUserAddress("Chennai");
		userDetail.setUserEmail("aparna@gmail.com");
		assertTrue("problem in adding userdetail", userDetailDAO.addUserDetail(userDetail));
	}
	
	@Ignore
	@Test
	public void addUserDetailTest1()
	{
		UserDetail userDetail=new UserDetail();
		userDetail.setUserName("Basha");
		userDetail.setUserAddress("Mumbai");
		userDetail.setUserEmail("basha@yahoo.com");
		assertTrue("problem in adding userdetail", userDetailDAO.addUserDetail(userDetail));
	}
	@Ignore
	@Test
	public void addUserDetailTest2()
	{
		UserDetail userDetail=new UserDetail();
		userDetail.setUserName("Cathy");
		userDetail.setUserAddress("Boston");
		userDetail.setUserEmail("cathy@live.com");
		assertTrue("problem in adding userdetail", userDetailDAO.addUserDetail(userDetail));
	}
	
	@Ignore
	@Test 
	public void deleteUserDetailTest()
	{
		UserDetail userDetail= userDetailDAO.getUserDetail("Cathy");
		assertTrue("problem in deleting the userdetail",userDetailDAO.deleteUserDetail(userDetail));
	}
	
	@Ignore
	@Test
	public void updateUserDetailTest()
	{
		UserDetail userDetail=userDetailDAO.getUserDetail("Basha");
		userDetail.setUserAddress("Delhi");
		assertTrue("problem in updating the userdetails", userDetailDAO.updateUserDetail(userDetail));
	}
	
	@Test
	public void userDetailListTest()
	{
		List<UserDetail> userDetailList = userDetailDAO.userdetailLists();
		assertTrue("problem in adding userdetaillist",userDetailList.size()>0);
		for(UserDetail userDetail:userDetailList)
		{
			System.out.print(userDetail.getUserName()+"\t");
			System.out.print(userDetail.getUserAddress()+"\t");
			System.out.println(userDetail.getUserEmail()+"\t");
			
		}
		
	}
}


package com.eshopping.test;

import static org.junit.Assert.assertTrue;

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
		userDetail.setPassword("ABC@123");
		userDetail.setUserAddress("Chennai");
		userDetail.setUserEmail("aparna@gmail.com");
		userDetail.setUserRole("User");
		
		assertTrue("problem in adding userdetail", userDetailDAO.addUserDetail(userDetail));
	}
	
	@Ignore
	@Test
	public void addUserDetailTest1()
	{
		UserDetail userDetail=new UserDetail();
		userDetail.setUserName("Basha");
		userDetail.setPassword("bashadon@001");
		userDetail.setUserAddress("Mumbai");
		userDetail.setUserEmail("basha@yahoo.com");
		userDetail.setUserRole("User");
		
		assertTrue("problem in adding userdetail", userDetailDAO.addUserDetail(userDetail));
	}
	
	@Ignore
	@Test
	public void addUserDetailTest2()
	{
		UserDetail userDetail=new UserDetail();
		userDetail.setUserName("Admin");
		userDetail.setPassword("admin@123$");
		userDetail.setUserAddress("Bengaluru");
		userDetail.setUserEmail("admin@gmail.com");
		userDetail.setUserRole("Admin");
		
		assertTrue("problem in adding userdetail", userDetailDAO.addUserDetail(userDetail));
	}
	
	@Ignore
	@Test 
	public void deleteUserDetailTest()
	{
		UserDetail userDetail= userDetailDAO.getUserDetail("Basha");
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
			System.out.print(userDetail.getPassword()+"\t");
			System.out.print(userDetail.getUserAddress()+"\t");
			System.out.print(userDetail.getUserEmail()+"\t");
			System.out.println(userDetail.getUserRole()+"\t");
			
		}
		
	}
}


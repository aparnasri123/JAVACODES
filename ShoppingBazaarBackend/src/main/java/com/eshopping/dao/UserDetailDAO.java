package com.eshopping.dao;

import java.util.List;

import com.eshopping.model.UserDetail;

public interface UserDetailDAO {
	
	public boolean addUserDetail(UserDetail userDetail);
	public boolean deleteUserDetail(UserDetail userDetail);
	public boolean updateUserDetail(UserDetail userDetail);
	public UserDetail getUserDetail(String UserName);
	public List<UserDetail> userdetailLists();	
}

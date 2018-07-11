package myf.service.impl;

import java.lang.annotation.Retention;
import java.util.List;

import myf.bean.User;
import myf.mapper.UserMapper;
import myf.service.UserService;

public class UserServiceImpl implements UserService{
	
	private UserMapper userMapper;
	

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper=userMapper;
	}

	public User getUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public boolean delUser(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}

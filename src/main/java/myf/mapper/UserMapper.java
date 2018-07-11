package myf.mapper;

import java.util.List;

import myf.bean.User;


public interface UserMapper {

	public User getUser(String id);

	public List<User> getAllUser();

	public int addUser(User user);

	public int delUser(String id);

	public int updateUser(User user);
}

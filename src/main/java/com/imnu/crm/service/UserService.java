package com.imnu.crm.service;

import java.util.List;

import com.imnu.crm.pojo.User;


public interface UserService {
	public User login(User user);

	public void register(User user);

	public int VerifyName(String usercode);

	public List<User> fildAll();

	public void DelectUserById(int id);

	public void updateUser(int id, User user);

	public void updatepassword(int id, String oldpass, String newpass);

	public List<User> findUserByPage(int page);
	
	public List<User> findUserByPage1(int page);

	public List<User> fildAll1();

	

}

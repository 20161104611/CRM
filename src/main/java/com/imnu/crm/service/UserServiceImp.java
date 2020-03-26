package com.imnu.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imnu.crm.mapper.UserMapper;
import com.imnu.crm.pojo.User;
import com.imnu.crm.pojo.UserExample;
@Service
@Transactional
public class UserServiceImp implements UserService {
	@Autowired
	public UserMapper userMapper;
	@Override
	public User login(User user) {
		UserExample example= new UserExample();
		example.createCriteria().andUsercordEqualTo(user.getUsercord()).andPwdEqualTo(user.getPwd());
		List<User> list=userMapper.selectByExample(example);
		if(list.isEmpty())
		{
			return null;
		}
		else
		{
			return list.get(0);
		}
	}

	//注册
		public void register(User user) {
			userMapper.insertSelective(user); 
		}
		//注册验证
		public int VerifyName(String usercord) {
			UserExample example=new UserExample();
			example.createCriteria().andUsercordEqualTo(usercord);
			List<User> list = userMapper.selectByExample(example);
			if(list.isEmpty())
			{
				return 1;
			}
			else {
				return 0;
			}
		}
		//查询所有用户信息
		public List<User> fildAll() {
			UserExample example= new UserExample();
			example.createCriteria().andFlagEqualTo("2");	
			List<User> list=userMapper.selectByExample(example);
			return list;
		}
		//查询所有员工信息
		public List<User> fildAll1() {
			UserExample example= new UserExample();
			example.createCriteria().andFlagEqualTo("3");	
			List<User> list=userMapper.selectByExample(example);
			return list;
		}
		@Override
		public void DelectUserById(int id) {
			UserExample example= new UserExample();
			example.createCriteria().andIdEqualTo(id);	
			System.out.println(id);
			userMapper.deleteByExample(example);
		}
		@Override
		public void updateUser(int id, User user) {
			UserExample example= new UserExample();
			example.createCriteria().andIdEqualTo(id);	
			userMapper.updateByExampleSelective(user, example);
		}
		@Override
		public void updatepassword(int id, String oldpass, String newpass) {
			UserExample example= new UserExample();
			example.createCriteria().andIdEqualTo(id).andPwdEqualTo(oldpass);
			User user = new User();
			user.setPwd(newpass);
			user.setId(id);
			userMapper.updateByExampleSelective(user, example);
			
		}
		@Override
		public List<User> findUserByPage(int page) {
			UserExample example= new UserExample();
			example.createCriteria().andFlagEqualTo("2");	
			return userMapper.selectByExample(example);
		}
		
		@Override
		public List<User> findUserByPage1(int page) {
			UserExample example= new UserExample();
			example.createCriteria().andFlagEqualTo("3");	
			return userMapper.selectByExample(example);
		}
}

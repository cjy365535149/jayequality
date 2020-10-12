package pers.jay.equality.service.impl;
import pers.jay.equality.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.jay.equality.mapper.UserMapper;
import pers.jay.equality.pojo.User;

@Service ("UserService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void add(int id, String username, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id, String username, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User read(int id) {
		return userMapper.getUserById( id );
	}
	
	@Override
	public User getUserByUsername(String username) {
		return userMapper.getUserByUsername( username );
	}
	@Override
	public List<User> list() {
		return userMapper.getAll();
	}
	
	
}
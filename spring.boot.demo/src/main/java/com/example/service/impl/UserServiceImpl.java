package com.example.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;
    
	@Override
    public User getUserInfo(String id){
        return userMapper.selectByPrimaryKey(id);
//		return object;
    }

	@Override
	public int save() {
		// TODO Auto-generated method stub
		User user = new User(UUID.randomUUID().toString(),"zhaikai","a1ssa","ssss","122332");
		return userMapper.insert(user);
	}

}
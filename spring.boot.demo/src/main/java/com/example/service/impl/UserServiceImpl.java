package com.example.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;

import org.json.JSONObject;

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
	public int save(JSONObject object) {
		// TODO Auto-generated method stub
		User user =  new User();
		user.setEmail(object.getString("email"));
		user.setId(UUID.randomUUID().toString());
		user.setPhone(object.getString("phone"));
		user.setUserName(object.getString("userName"));
		user.setPassWord(object.getString("passWord"));

		return userMapper.insert(user);
	}

}
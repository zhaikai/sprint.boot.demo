package com.example.mapper;
 
import com.example.entity.User;
 
public interface UserMapper extends BaseMapper<User>{
	
    User Sel(int id);
//    int save(User user);
}
package com.example.service;
 
import com.example.entity.User;

public interface UserService {
//    public User Sel(int id);
    public int save();
    public User getUserInfo(String id);
}
package com.example.service;
 
import com.example.entity.User;

import org.json.JSONObject;

public interface UserService {
//    public User Sel(int id);
    public int save(JSONObject object);
    public User getUserInfo(String id);
}
package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {

	@Autowired
	private UserService userService;

//	@RequestMapping("getUser/{id}")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody User GetUser(@PathVariable String id) {
		return userService.getUserInfo(id);
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public int registerUser() {
		return userService.save();
	}
}
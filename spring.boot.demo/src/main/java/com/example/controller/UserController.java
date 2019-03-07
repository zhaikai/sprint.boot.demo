package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;

@RequestMapping("/testBoot")
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("getUser/{id}")
	public String GetUser(@PathVariable int id) {
		return userService.Sel(id).toString();
	}

	@RequestMapping("getUsers/{a}")
	public int GetUser1(@PathVariable int a) {

		return userService.save();
	}
}
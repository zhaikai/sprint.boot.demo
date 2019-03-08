package com.example.controller;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//import net.sf.json.JSONObject;
import com.example.entity.User;
import com.example.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger("ssssss");
	@Autowired
	private UserService userService;

//	@RequestMapping("getUser/{id}")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody User GetUser(@PathVariable String id) {
		return userService.getUserInfo(id);
	}
//	@ResponseBody
//	@RequestMapping(value = "/leaseContract/previewTechnicalAccount", method = RequestMethod.POST, consumes = "application/json")
//	@CrossOrigin
//	public Object previewTechnichalAccount(@RequestBody String body) throws JSONException, ParseException {
//		JSONObject obj =new JSONObject();
//		try {
//			 obj = new JSONObject(body);
//		} catch (Exception e) {
//			logger.error("参数异常:" + body);
//			throw new IllegalArgumentException("参数异常:" + body, e);
//		}
//			return LeaseContractUtil.generatePreviewLeaseTechnicalAccount(obj, ruleSerial).toString();
//	}
	@ResponseBody
	@RequestMapping(value = "/register", method = RequestMethod.POST,consumes = "application/json")
	@CrossOrigin
	public int registerUser(@RequestBody String body) throws Exception{
		try {
			JSONObject obj = new JSONObject(body);
			return userService.save(obj);
		} catch (Exception e) {
			logger.error("参数异常:" + body);
			throw new IllegalArgumentException("参数异常:" + body, e);
		}
	}
}
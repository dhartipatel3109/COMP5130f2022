package com.cms.UML_CMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cms.UML_CMS.model.User;
import com.cms.UML_CMS.service.UserService;

@RestController
@RequestMapping("/user")
public class UserLoginContoller {

	@Autowired
	UserService userService;

	@PostMapping(value = "/")
	public String add(@RequestBody User user) {
		userService.saveUser(user);
		return "New User is added";
	}

//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public String login() {
//		return "login";
//	}
}

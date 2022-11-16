package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
public class HomeController {

	@Autowired
	UserService userService;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@RequestMapping("/")
	public String welcomePage() {
		return "Index";
	}

	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		String pass = user.getPassword();
		String encrypt = passwordEncoder.encode(pass);

		user.setPassword(encrypt);
		userService.saveUser(user);

		return "User has been created";
	}

	/*
	 * @RequestMapping("/userLoginPage") public String userLoginPage() { return
	 * "UserLogin"; }
	 * 
	 * @RequestMapping("/adminLoginPage") public String adminLoginPage() { return
	 * "AdminLogin"; }
	 */

//	@PostMapping(value = "/checkUser")
//	public ModelAndView checkUser(@RequestParam String userEmail, @RequestParam String pass) {
//		if (userService.isValidUser(userEmail, pass))
//			return new ModelAndView("redirect:user/dashboard");
//		else
//			return new ModelAndView("redirect:userLoginPage");
//	}

}

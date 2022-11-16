package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/login")
	public String loginPage() {
		logger.info("<=====  LOGIN PAGE WILL BE RETURNED ===> ");
		return "user/Login";
	}

//	@PostMapping(value = "/checkUser")
//	public void checkUser(@RequestParam String userName, @RequestParam String pass) {
//
//	}

	@PostMapping(value = "/dashboard")
	public String homePage(@RequestParam String userName, @RequestParam String pass, Model model) {
		if (userService.isValidUser(userName, pass)) {
			return "user/Home";
		}
		model.addAttribute("message", "Sorry! Invalid Username or Password!");
		return "redirect:login";

//		ModelAndView mv = null;
//		if (userService.isValidUser(userName, pass)) {
//			mv = new ModelAndView("user/Home");
//			mv.addObject("message", "");
//			return mv;
//		} else {
//			mv = new ModelAndView("user/Login");
//			mv.addObject("message", "Sorry! Username and/or Password is incorrect!");
//			return mv;
//		}
	}
	
	@PostMapping(value = "/add")
	public String addUser(@RequestBody User user) {
		String email = user.getEmail();
		String password = user.getPassword();
		String username = user.getUserName();
		String role = user.getRole();

		userService.saveUser(user);
		return "User has been saved!";
	}

}

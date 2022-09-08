package com.BikkadIT.UserManagementApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.UserManagementApplication.service.UserServiceI;

@RestController
public class ForgotPasswordRestController {

	@Autowired
	private UserServiceI userServiceI;

	@GetMapping("/ForgotPwd/{email}")
	public String ForgotPwd(@PathVariable String email) {

		String forgotPwd = userServiceI.forgotPwd(email);
		return forgotPwd;

	}

}

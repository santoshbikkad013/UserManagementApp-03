package com.BikkadIT.UserManagementApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.UserManagementApplication.binding.UnlockAccountForm;
import com.BikkadIT.UserManagementApplication.service.UserServiceI;

@RestController
public class UnlockAccRestController {

	@Autowired
	private UserServiceI userServiceI;

	@PostMapping("/unlockAcc")
	public String unlockAcc(@RequestBody UnlockAccountForm unlockAccountForm) {

		boolean unlockeAccount = userServiceI.unlockeAccount(unlockAccountForm);

		if (unlockeAccount) {
			return "Account Unlock";
		} else {
			return "Failed To Unlock Account";

		}
	}
}

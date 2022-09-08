package com.BikkadIT.UserManagementApplication.service;

import java.util.List;
import java.util.Map;

import com.BikkadIT.UserManagementApplication.binding.LoginForm;
import com.BikkadIT.UserManagementApplication.binding.UnlockAccountForm;
import com.BikkadIT.UserManagementApplication.binding.UserForm;
import com.BikkadIT.UserManagementApplication.entities.CountryMasterEntity;

public interface UserServiceI {

	public String loginCheck(LoginForm loginForm);

	public Map<Integer, String> getCountries();

	public Map<Integer, String> getStates(Integer countryId);

	public Map<Integer, String> getCities(Integer stateId);

	public boolean saveUser(UserForm userForm);

	public boolean unlockeAccount(UnlockAccountForm unlockAccountForm);
	
	public String forgotPwd(String email);

}

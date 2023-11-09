package com.triveous.service;

import javax.security.auth.login.LoginException;

import com.triveous.model.Login;

public interface LoginService {
	
	
	public String logIntoAccount(Login dto)throws LoginException;

	public String logOutFromAccount(String key)throws LoginException;
	

}

package com.neuedu.service;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;

public interface UserBiz {
	void register(String username, String password, String password2,String name, String email) throws RegisterException;
	void login(String username, String password) throws LoginException;
	
	
	//判断用户名是否存在
	boolean isusernameexists(String username) throws LoginException;
}

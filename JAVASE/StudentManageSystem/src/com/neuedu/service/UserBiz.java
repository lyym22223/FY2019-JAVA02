package com.neuedu.service;



public interface UserBiz {
	void login(String username, String password);
	
	
	//判断用户名是否存在
		boolean isusernameexists(String username);
}

package com.neuedu.service;



public interface UserBiz {
	void login(String username, String password);
	
	
	//�ж��û����Ƿ����
		boolean isusernameexists(String username);
}

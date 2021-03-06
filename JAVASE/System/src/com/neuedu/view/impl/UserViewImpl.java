package com.neuedu.view.impl;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.service.UserBiz;
import com.neuedu.service.impl.UserBizImpl;
import com.neuedu.view.UserView;

/**
 * 负责用户交互，收集输入信息
 * */
public class UserViewImpl implements UserView {

	@Override
	public void login() throws LoginException {
		// TODO Auto-generated method stub
		UserBiz userBiz = new UserBizImpl();
		
		//接收键盘输入获取username  password
		Scanner s = new Scanner(System.in);
		System.out.println("请输入用户名");
		String username = s.next();
		
		boolean usernameexists = userBiz.isusernameexists(username);
		if (usernameexists) {
			System.out.println("请输入密码");
			String password = s.next();	
			userBiz.login(username, password);
		}
		
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}

}

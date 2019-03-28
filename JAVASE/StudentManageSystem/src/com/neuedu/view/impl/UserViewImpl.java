package com.neuedu.view.impl;

import java.util.Scanner;
import com.neuedu.service.UserBiz;
import com.neuedu.service.impl.UserBizImpl;
import com.neuedu.view.UserView;

public class UserViewImpl implements UserView{

	@Override
	public void login() {
		// TODO Auto-generated method stub
		UserBiz userBiz = new UserBizImpl();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名");
		String username = scanner.next();
		boolean usernameexists = userBiz.isusernameexists(username);
		if (usernameexists) {
			System.out.println("请输入密码");
			String password = scanner.next();	
			userBiz.login(username, password);
		}
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}
	
}

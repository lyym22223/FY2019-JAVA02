package com.neudeu;

import java.awt.desktop.UserSessionEvent;

public class ClassUserBiz extends User implements UserBiz {
	String username;
	String password;
	String password2;
	String name;
	String email;
	
	@Override
	public void register(String username, String password, String password2, String name, String email)
			throws RegisterException {
		// TODO Auto-generated method stub
		this.username = username;
		this.password = password;
		this.password2 = password2;
		this.name = name;
		this.email = email;
	}

	@Override
	public void login(String username, String password) throws LoginException {
		// TODO Auto-generated method stub
		this.username = username;
		this.password = password;

	}

	
public ClassUserBiz(User[] users) {
	
	User user1 = new User("admin","admin","Administrator","admin@123.com");
	User user2 = new User("tom","cat","tomcat","tomcat@cat.com");
	users[0] = user1;
	users[1] = user2;
}
}

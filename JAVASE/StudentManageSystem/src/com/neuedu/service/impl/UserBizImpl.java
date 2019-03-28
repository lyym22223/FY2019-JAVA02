package com.neuedu.service.impl;

import com.neuedu.pojo.Manager;
import com.neuedu.pojo.Student;
import com.neuedu.service.UserBiz;

public class UserBizImpl implements UserBiz{
	private Manager[] managers =  new Manager[5];
	private Student[] students = new Student[32];
	public UserBizImpl() {
		Manager manager1 = new Manager("admin","admin");
		Manager manager2 = new Manager("tom","cat");
		this.managers[0] = manager1;
		this.managers[1] = manager2;
		
		
	}
	
	
	
	
	
	@Override
	public void login(String username, String password) {
		// TODO Auto-generated method stub
	boolean usernameexists = false;//默认用户不存在
		
		for(int i = 0;i<managers.length;i++) {
			Manager manager = managers[i];
			if(manager == null) {
				continue;
			}
			
			
			String _username = manager.getUsername();
			String _password = manager.getPassword();
			if(_username.equals(username)) {
				usernameexists = true;
				
				if(password.equals(_password)) {
					System.out.println("欢迎您" + _username);
				}
			}
			
		}
		
	}

	@Override
	public boolean isusernameexists(String username) {
		// TODO Auto-generated method stub
		
		for(int i = 0;i<managers.length;i++) {
			Manager manager = managers[i];
			if(manager == null) {
				continue;
			}
			
			
			String _username = manager.getUsername();
			String _password = manager.getPassword();
			if(_username.equals(username)) {//用户名存在
				
				return true;
				
			}
			
			
		}
		return false;
	}
	
}

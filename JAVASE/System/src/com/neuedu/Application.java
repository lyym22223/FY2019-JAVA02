package com.neuedu;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.view.UserView;
import com.neuedu.view.impl.UserViewImpl;

public class Application {
	public static void main(String[] args) {
		Application application = new Application();
		application.choise();
	}
	public void choise() {
		System.out.println("===»¶Ó­·ÃÎÊ¼Æ·ÑÏµÍ³===");
		Scanner s = new java.util.Scanner(System.in);
		System.out.println("ÇëÊäÈë 1£ºµÇÂ½  2£º×¢²á");
		int num = s.nextInt();
		
		if(num == 1) {
			//µÇÂ½
			
			UserView userView = new UserViewImpl();
			
				try {
					userView.login();
				} catch (LoginException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					String msg = e.getMessage();
					System.out.println(msg);
				}
			
		}else if (num == 2) {
			//×¢²á
		}
	}
}

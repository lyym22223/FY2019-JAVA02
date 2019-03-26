package com.neudeu;
import java.util.Scanner;

public class Login extends ClassUserBiz{

	public Login(User[] users) {
		super(users);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		welcome();
		
		User[] users = new User[4];//局部变量
		initData(users);//数据初始化
		operation(users);
	}
	
	public static void initData(User[] managers){
		User user = new User("admin","admin");
		managers[0] = user;
	}
	
	public static void operation(User[] managers){
		Scanner s=new Scanner(System.in); 
		
		//s.nextLine();
		System.out.println("请选择");
		int operation = s.nextInt();
		if(operation == 1){
			//登陆
			login(managers);
		}else if(operation == 2){
			//退出
			System.exit(0);
		}else{
			System.out.println("您输入的有误，请从新输入。");
			operation(managers);//递归调用
		}
	}
	
	public static void login(User[] managers){
		System.out.println("欢迎登陆");
		
		Scanner s=new Scanner(System.in); 
		System.out.println("请输入用户名：");
		String username = s.nextLine();

		
		System.out.println("请输入密码：");
		String password = s.nextLine();
		
		
		
		//判断密码是否正确
		for(int i = 0;i < managers.length;i++){
			Users user = users[i];
			if(user == null){
				continue;
			}
			
			if(username.equals(user.username) && password.equals(user.password)){
				System.out.println("欢迎您" + username);
				break;
			}
		}
	}
	
	public static void welcome(){
		System.out.println("==========欢迎登陆==========");
		System.out.println("1、登陆   2、退出");
		System.out.println("----------------------------");
	}

}

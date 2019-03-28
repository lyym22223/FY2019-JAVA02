package com.neuedu;

import java.util.Scanner;

import com.neuedu.pojo.Manager;
import com.neuedu.pojo.Student;
import com.neuedu.view.UserView;
import com.neuedu.view.impl.UserViewImpl;


public class Application {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager[] managers = new Manager[4];
		Application application = new Application();
		application.choise();

	}
	
	public void choise() {
		System.out.println("==========");
		System.out.println("请选择 1：登陆  2：退出");
		Scanner scanner = new Scanner(System.in);
		int sc = scanner.nextInt();
		if (sc == 1) {
			//登陆
			UserView userView = new UserViewImpl();
			userView.login();
			System.out.println("请选择要操作的信息对应的数字：");
			System.out.println("1:查看学生信息  2：添加学生信息  3：删除学生信息  4：修改学生信息  5：退出");
			
			int sc1 = scanner.nextInt();
			if (sc1 == 2) {
				Student student = new Student();
				//Scanner scanner1 = new Scanner(System.in);
				System.out.print("请输入学生ID：");
				int id = scanner.nextInt();
				student.setId(id);
				System.out.print("请输入学生名字：");
				String name = scanner.next();
				student.setName(name);
				System.out.print("请输入学生性别：");
				String sex = scanner.next();
				student.setSex(sex);
				System.out.print("请输入学生年龄：");
				int age = scanner.nextInt();
				student.setAge(age);
			
				
				System.out.println("*******************");
				System.out.println("学生ID：" + id);
				System.out.println("学生姓名：" + name);
				System.out.println("学生性别：" + sex);
				System.out.println("学生年龄：" + age);
			}
		}else if(sc == 2) {
			//退出
			
		}
	}

}

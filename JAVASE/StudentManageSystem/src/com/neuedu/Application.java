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
		System.out.println("��ѡ�� 1����½  2���˳�");
		Scanner scanner = new Scanner(System.in);
		int sc = scanner.nextInt();
		if (sc == 1) {
			//��½
			UserView userView = new UserViewImpl();
			userView.login();
			System.out.println("��ѡ��Ҫ��������Ϣ��Ӧ�����֣�");
			System.out.println("1:�鿴ѧ����Ϣ  2�����ѧ����Ϣ  3��ɾ��ѧ����Ϣ  4���޸�ѧ����Ϣ  5���˳�");
			
			int sc1 = scanner.nextInt();
			if (sc1 == 2) {
				Student student = new Student();
				//Scanner scanner1 = new Scanner(System.in);
				System.out.print("������ѧ��ID��");
				int id = scanner.nextInt();
				student.setId(id);
				System.out.print("������ѧ�����֣�");
				String name = scanner.next();
				student.setName(name);
				System.out.print("������ѧ���Ա�");
				String sex = scanner.next();
				student.setSex(sex);
				System.out.print("������ѧ�����䣺");
				int age = scanner.nextInt();
				student.setAge(age);
			
				
				System.out.println("*******************");
				System.out.println("ѧ��ID��" + id);
				System.out.println("ѧ��������" + name);
				System.out.println("ѧ���Ա�" + sex);
				System.out.println("ѧ�����䣺" + age);
			}
		}else if(sc == 2) {
			//�˳�
			
		}
	}

}

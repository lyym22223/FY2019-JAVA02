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
		
		User[] users = new User[4];//�ֲ�����
		initData(users);//���ݳ�ʼ��
		operation(users);
	}
	
	public static void initData(User[] managers){
		User user = new User("admin","admin");
		managers[0] = user;
	}
	
	public static void operation(User[] managers){
		Scanner s=new Scanner(System.in); 
		
		//s.nextLine();
		System.out.println("��ѡ��");
		int operation = s.nextInt();
		if(operation == 1){
			//��½
			login(managers);
		}else if(operation == 2){
			//�˳�
			System.exit(0);
		}else{
			System.out.println("�������������������롣");
			operation(managers);//�ݹ����
		}
	}
	
	public static void login(User[] managers){
		System.out.println("��ӭ��½");
		
		Scanner s=new Scanner(System.in); 
		System.out.println("�������û�����");
		String username = s.nextLine();

		
		System.out.println("���������룺");
		String password = s.nextLine();
		
		
		
		//�ж������Ƿ���ȷ
		for(int i = 0;i < managers.length;i++){
			Users user = users[i];
			if(user == null){
				continue;
			}
			
			if(username.equals(user.username) && password.equals(user.password)){
				System.out.println("��ӭ��" + username);
				break;
			}
		}
	}
	
	public static void welcome(){
		System.out.println("==========��ӭ��½==========");
		System.out.println("1����½   2���˳�");
		System.out.println("----------------------------");
	}

}

package com.neuedu.pojo;

import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private String sex;
	private int age;
	private String _class;
	private String address;
	private String phone;
	private String email;
	
	public Student() {}
	public Student(int id,String name,String sex,int age) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public void getId() {
		System.out.println("������ѧ��id��" + this.id);
	}
	public void setId(int id) {
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("������id:");
		id = scanner.nextInt();*/
		this.id = id;
	}
	public void getName() {
		System.out.println("������ѧ��������" + this.name);
	}
	public void setName(String name) {
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("������������");
		name = scanner.next();*/
		this.name = name;
	}
	public void getSex() {
		System.out.println("������ѧ���Ա�" + this.sex);
	}
	public void setSex(String sex) {
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("�������Ա�");
		sex = scanner.next();*/
		this.sex = sex;
	}
	public void getAge() {
		System.out.println("������ѧ�����䣺" + this.age);
	}
	public void setAge(int age) {
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("�������Ա�");
		age = scanner.nextInt();*/
		this.age = age;
	}
	public String get_class() {
		return _class;
	}
	public void set_class(String _class) {
		this._class = _class;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
}

package practice;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Practice3 practice3 = new Practice3();
		practice3._equal();
	}
	public void _equal() {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������һ�����ַ�����");
		String str1 = scanner.next();
	    char a[] = str1.toCharArray();
		int i;
		
		System.out.println("������ڶ������ַ�����");
		String str2 = scanner.next();
		char b[] = str2.toCharArray();
		for(i= 0;i<str2.length();i++) {
			System.out.println(a[i]);
			
			System.out.println(b[i]);
			if (a[i] == b[i]) {
				System.out.println("���");
			}else {
				System.out.println("�����");
			}
		}
		
	}
}

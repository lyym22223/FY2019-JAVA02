package practice;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Practice3 practice3 = new Practice3();
		practice3._equal();
	}
	public void _equal() {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个的字符串：");
		String str1 = scanner.next();
	    char a[] = str1.toCharArray();
		int i;
		
		System.out.println("请输入第二个的字符串：");
		String str2 = scanner.next();
		char b[] = str2.toCharArray();
		for(i= 0;i<str2.length();i++) {
			System.out.println(a[i]);
			
			System.out.println(b[i]);
			if (a[i] == b[i]) {
				System.out.println("相等");
			}else {
				System.out.println("不相等");
			}
		}
		
	}
}

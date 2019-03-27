package practice;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice2 practice2 = new Practice2();
		practice2.numOfString();
	}
	
	public void numOfString(){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ÇëÊäÈë×Ö·û´®£º");
		String str = scan.nextLine();
		System.out.print("ÇëÊäÈëÒªÅĞ¶ÏµÄ×Ö·û´®£º");
		String strFind = scan.nextLine();
		int count = 0;
		int beginindex = -1;
		while ((beginindex = str.indexOf(strFind)) != -1) {
			str = str.substring(beginindex + strFind.length());
			++count;
		}
		System.out.println(count);
	}


}

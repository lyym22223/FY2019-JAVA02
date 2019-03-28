package practice;

public class Practice7 {
	public static void main(String[] args) {
		String s = "113@ ere qqq yyui";
		String[] a = s.split(" ");
		
		for(int i = 0;i<a.length;i++) {
			a[0] = s.substring(0, 3);
			System.out.println(a[i]);
		}
	
	}
}

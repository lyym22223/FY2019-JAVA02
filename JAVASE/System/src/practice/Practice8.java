package practice;

public class Practice8 {
	public static void main(String[] args) {
		String s = "To be or not to be";
		String[] a = s.split(" ");
		for(int i=0;i<a.length;i++) {
			StringBuffer ss = new StringBuffer(a[i]);
			ss.reverse();
			a[i] = ss.toString();
			
			System.out.println(a[i]);
		}
		
		
	}
}

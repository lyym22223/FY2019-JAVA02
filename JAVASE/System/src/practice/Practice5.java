package practice;

public class Practice5 {
	public static void main(String[] args) {
		String string = new String("test");
		StringBuffer s = new StringBuffer(string);
		s.reverse();
		string = s.toString();
		System.out.println(string);
		
	}
}

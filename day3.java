package practice.com;

public class day3 {
	public static void main(String[] args) {
	String a="100"; 
	String b="100";
	String str=new String(a);
	System.out.println(a==str);
	System.out.println(str.equals(b));
	System.out.println(a==b);
	System.out.println(a.equals(b));
	if(a==b) {
		System.out.println(a);
	}
	}
}

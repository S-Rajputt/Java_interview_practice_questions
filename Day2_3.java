package practice.com;

import java.util.Scanner;

public class Day2_3 {

	public static void main(String[] args) {
		// Palindrome String
		Scanner sc= new Scanner(System.in);
		String s1=sc.nextLine();
		String rev="";
		for(int i=s1.length()-1; i>=0; i--) {
			rev=rev+s1.charAt(i);
		}
			if(rev.equals(s1)) {
				System.out.println("the given String is Palindrome");
			}
			else {
				System.out.println("the given string is not palindrome");
			}
		}
//		System.out.println(rev);
//	}

}

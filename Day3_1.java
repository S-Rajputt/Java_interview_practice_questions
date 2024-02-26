package practice.com;

import java.util.Scanner;

public class Day3_1 {
	public static void palindrome(String s1) {
		String pal = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			pal = pal + s1.charAt(i);
		}
		if (pal.equals(s1)) {
			System.out.println("the given string is palindrome...!!!");
		} else {
			System.out.println("the given is not palindrome...!!");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = sc.nextLine();
		palindrome(s1);
	}
}

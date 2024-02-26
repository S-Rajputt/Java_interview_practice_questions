package practice.com;

import java.util.Scanner;

public class Day2_2 {

	public static void main(String[] args) {
//		fact num of 5
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number for factorial : ");
		int factNum=sc.nextInt(), fact=1;
		for(int i=1; i<=factNum; i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}

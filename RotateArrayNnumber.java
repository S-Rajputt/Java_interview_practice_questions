package practice.com;

import java.util.Scanner;

public class RotateArrayNnumber {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number for rotate array N : " );
		int n=Sc.nextInt();
		int[] arr= {2,4,8,12,14};
		int j;
		for(int i=0; i<n; i++) {
			int arr0=arr[0];
			for(j=0; j<arr.length-1; j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=arr0;
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}

package practice.com;

import java.util.HashSet;

public class RemoveDupli {
	static void removedupli(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Dupli Element is : " + arr[i]);
//					continue;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,4,7,3,2,1,4,3};
//		HashSet<Integer> dupli=new HashSet<>();
//		for( int i: arr) {
//			dupli.add(i);
//		}
//		System.err.println(dupli);
		removedupli(arr);

	}

}

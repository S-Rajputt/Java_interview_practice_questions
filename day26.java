package practice.com;

import java.util.HashSet;
import java.util.Set;

public class day26 {
	public static void main(String[] args) {
		int[] arr= {1,3,2,7,2,1};
		Set hs=new HashSet<>();
		for(int num:arr) {
			System.out.println(hs.contains(num));
			hs.add(num);
		}
		
	}
}

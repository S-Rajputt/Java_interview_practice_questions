package practice.com;

import java.util.HashSet;
import java.util.Iterator;

public class mergedtwoarray {

	public static void main(String[] args) {
		int a[]= {1,2,4,9,12,15};
		int b[]= {3,6,1,15,4,19};
		HashSet<Integer> hs= new HashSet<>();
		for(int elem:a) {
			hs.add(elem);
		}
		for(int elem1:b) {
			hs.add(elem1);
		}
		System.out.println(hs);
		Iterator i=hs.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
	}

}

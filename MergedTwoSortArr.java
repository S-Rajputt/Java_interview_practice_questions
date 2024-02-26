package practice.com;

import java.util.Arrays;

public class MergedTwoSortArr {
	public static int[] mergedarr(int[] a, int[] b) {
		int m=a.length;
		int n=b.length;
		int k=0, i=0,j=0;
		int [] merged=new int[m+n];
		System.out.println(m+n);
		while(i<m && j<n) {
			if(a[i]<=b[j]) {
				merged[k++]=a[i++];
			}
			else {
				merged[k++]=b[j++];
			}
		}
//			copy remaining element in merged array 
			while(i<m) {
				merged[k++]=a[i++];
			}
			while(j<n) {
				merged[k++]=b[j++];
			}
		
		return merged;
	}
	public static void main(String[] args) {
		int[] a= {1,3,5,7};
		int[] b= {2,4,8,12,14};
		 int[] merged = mergedarr(a, b);
		 for (int num : merged) {
	            System.out.print(num + " ");
	        }
	}
}
//for (int i = 0; i < m; i++) {
//	merged[k++]=a[i];
//}
//for(int j=0; j<n; j++) {
//	merged[k++]=b[j];
//}
//for(int i=0; i<merged.length; i++) {
//	for(int j=i+1; j<merged.length; j++) {
//	if(merged[i]>merged[j]) {
//		int temp=merged[i];
//		merged[i]=merged[j];
//		merged[j]=temp;
//	}
//	}	
//}
//return merged;
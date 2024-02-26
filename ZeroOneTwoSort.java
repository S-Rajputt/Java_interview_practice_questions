package practice.com;

public class ZeroOneTwoSort {

	public static void main(String[] args) {
		int[] arr= {1,2,1,0,0,1,0,2,0,1,1,2,0};
		int  count0=0, count1=0, count2=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				count0++;
			}
			else if(arr[i]==1) {
				count1++;
			}
			else {
				count2++;
			}
		}
		System.out.println("Count0 count is : "+ count0);
		System.out.println("count1 count is : "+ count1);
		System.out.println("count2 count is : "+ count2);
		int i=0;
		while(count0>0) {
			arr[i++]=0;
			count0--;
		}
		while(count1>0) {
			arr[i++]=1;
			count1--;
		}
		while(count2>0) {
			arr[i++]=2;
			count2--;
		}
		for (int j : arr) {
			System.out.print(j+" ");
		}
		
	}
}

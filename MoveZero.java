package practice.com;

public class MoveZero {

	public static void main(String[] args) {
		int[] arr= {1,0,3,0,4,0,4,0,6,7,8};
//		int i=0, count0=0, count=0, k=0;
//		int[] arr1=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length-1; j++) {
			if(arr[j]==0) {
				int temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for (int i : arr) {
		System.out.print(i+" ");
	}
	}

}


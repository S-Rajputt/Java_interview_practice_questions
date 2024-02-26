package practice.com;

public class missingNum {

	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4 ,6};
		int n=arr.length;
		int total_sum=((n+1)*(n+2))/2;
		int actual_sum=0, missing_num;
		for(int i=0; i<arr.length; i++) {
			actual_sum=actual_sum+arr[i];
		}
		missing_num=total_sum-actual_sum;
		System.out.println(missing_num);
	}

}

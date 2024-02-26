package practice.com;

public class twoDarraysum {

	public static void main(String[] args) {
		int[][] array= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr= {{1,2},{7,9}};
		int sum=0, n=array.length, m=arr.length;
		for(int i=0; i<m; i++) {
			sum=sum+arr[i][i];
		}
		for(int i=0; i<m; i++) {
			sum=sum+arr[i][i];
		}
		
		System.out.println(n+ " " +sum);
	}
}

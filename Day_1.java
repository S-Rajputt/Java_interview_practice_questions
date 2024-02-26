package practice.com;

public class Day_1 {

	public static void main(String[] args) {
		int x=8374893; //7
		int count=0;
		while(x!=0){
			x=x/10;
		 // sum=sum+x;
			count++;
		}
		System.out.println(count);
	}
}

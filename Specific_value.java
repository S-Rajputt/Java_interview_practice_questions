package practice.com;

public class Specific_value {
	public static boolean checkkey(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if(key==arr[i]) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int [] arr= {2,1,3,4,5,7,6,11,31};
		int key=7;
		System.out.println(checkkey(arr,key));
		}
		
	}

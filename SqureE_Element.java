package practice.com;

public class SqureE_Element {
	static void squareelement(int[] arr) {
		System.out.print("Sqaure : ");
		for (int i : arr) {
			System.out.print(i * i + ",");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 9, 1, 4, 66, 21 };
		System.out.print("Element : ");
		for (int i : arr) {
			System.out.print(i + ",");
			
		}
		System.out.println();
		squareelement(arr);
	}
}

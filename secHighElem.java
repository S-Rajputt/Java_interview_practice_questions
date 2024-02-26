package practice.com;

public class secHighElem {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 19, 4, 6, 9, 12, 15};
		int n=1;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
			if(n==i) {
				System.out.println("Secound highest : " + a[i]);
				break;
			}
		}
		for(int el:a)
		System.out.print(el+" ");
	}

}

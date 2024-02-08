package arrays;

public class AscendingOrder {
	public static void main(String[] args) {
		int a[] = {31,20,56,44,65,76};
		
		java.util.Arrays.sort(a);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
}

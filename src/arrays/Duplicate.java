package arrays;

public class Duplicate {

	public static void main(String[] args) {
		int a[] = {20,20,56,44,65,56};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}

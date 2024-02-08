package controlStatement;

import java.util.Scanner;

public class IfCon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mark = sc.nextInt();
		
		if(mark<40) {
			System.out.println("Fail");
		}

	}

}

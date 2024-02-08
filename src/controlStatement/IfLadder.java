package controlStatement;

import java.util.Scanner;

public class IfLadder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mark = sc.nextInt();
		
		if(mark<40) {
			System.out.println("Fail " +mark);
		}else if(mark>=80 && mark<=90) {
			System.out.println("A Grade " +mark);
		}else if(mark>=90 && mark<=100) {
			System.out.println("A Grade with Distinction " +mark);
		}
		else {
			System.out.println("Pass "+mark);
		}

	}


}

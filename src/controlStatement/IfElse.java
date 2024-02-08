package controlStatement;

import java.util.Scanner;

    public class IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mark = sc.nextInt();
		
		if(mark<40) {
			System.out.println("Fail " +mark);
		}if(mark>=80) {
			System.out.println("A Grade " +mark);
		}
		else {
			System.out.println("Pass "+mark);
		}

	}

}


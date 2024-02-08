package loop;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		switch (s) {
		case "January":
			System.out.println("January 31 Days");
			break;
		case "February":
			System.out.println("February 28 Days in non leap year");
			System.out.println("In Leap year 29 Days");
			break;
		case "March":
			System.out.println("March 31 Days");
			break;
		case "April":
			System.out.println("April 30 Days");
			break;
		case "May":
			System.out.println("May 31 Days");
			break;
			default:
				System.out.println("Invalid Input");
		}
	}

}

package dataTypes;
import java.util.Scanner;
public class DataTypes {
	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);		
		byte b = s.nextByte();
		System.out.println("Byte value ="+ b);
		short t = s.nextShort();
			System.out.println("Short Value ="+ t);
	    int i = s.nextInt();
	    System.out.println("Integer Value ="+ i);	    
	    long l = s.nextLong();
	    		System.out.println("Long Value ="+ l);
	    double d = s.nextDouble();
	    		System.out.println("Double Value ="+ d);
	    float f = s.nextFloat();
	      System.out.println("Float Value ="+ f);
	  //  char c = 'k';
	  //    System.out.println("Char Value ="+ c);
	    String r = s.nextLine();
	      System.out.println("String Value ="+ r);
	  //  boolean o = true;
	   //   System.out.println("Boolean Value ="+ o);
	}

}

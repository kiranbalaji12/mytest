package fileOperation;

import java.io.*;
public class ExampleOne {
	public static void main(String args[]) {
	File f = new File("C:\\TestJavaFolder\\q.txt");
	try {
		FileReader fr = new FileReader(f);
		char c[]= new char[14];
		fr.read(c);
		for (char d : c) {
			System.out.print(d);
		}
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}
}

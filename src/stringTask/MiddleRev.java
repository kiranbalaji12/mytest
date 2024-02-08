package stringTask;

public class MiddleRev {
	public static void main(String[] args) {
		String a = "This is task";
		String[] split = a.split(" ");
		String rev = "";
		String output = "";
		
		for(int i=split[1].length()-1; i>=0; i-- ) {
			char charAt = split[1].charAt(i);
			rev=rev+charAt;
		}
		output = split[0]+" "+rev+" "+split[2];
		System.out.println(output);
	}

}

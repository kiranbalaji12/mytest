package stringTask;

public class Palindrome {
	public static void main(String args[]) {
		String a = "madam";
		String rev = "";
		for (int i=a.length()-1; i>=0; i--){
		char charAt = a.charAt(i);
		rev = rev+charAt;
		
	}
	if(a.equals(rev)) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not Palindrome");
	}

	}
}


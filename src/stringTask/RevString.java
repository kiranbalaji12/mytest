package stringTask;

public class RevString {
	public static void main(String[] args) {
		String a = "This is Task";
		String b = "";
		for(int i=a.length()-1; i>=0; i--) {
			char c = a.charAt(i);
			b = b+c;
		}
		System.out.println(b);
	}

}

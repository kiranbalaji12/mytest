package exceptionHandling;

public class NullPtr {
	public static void main(String[] args) {
		try {
			String s = "K12";
			int parseInt = Integer.parseInt(s);
			System.out.println(s);
		} catch(Exception s) {
			System.err.println(s);
			s.printStackTrace();
		}
		
		System.out.println("Output");
	}

}

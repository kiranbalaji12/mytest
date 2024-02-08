package string;

public class StringFuntions {
	public static void main(String[] args) {
		String s = "Welcome to Hello World";
		int length = s.length();
		System.out.println(length);
		boolean equals = s.equals("Welcome To Hello world");
		System.out.println(equals);
		boolean ignoreequals = s.equalsIgnoreCase("Welcome To Hello world");
		System.out.println(ignoreequals);
		String uppercase = s.toUpperCase();
		System.out.println(uppercase);
		String lowercase = s.toLowerCase();
		System.out.println(lowercase);
		char charAt = s.charAt(0);
		System.out.println(charAt);
		String[] split = s.split(" ");
		System.out.println(split[1]);
		String replace = s.replace("Hello", "Hai");
		System.out.println(replace);
		int indexOf = s.indexOf('c');
		System.out.println(indexOf);
		int lastindexOf = s.lastIndexOf('o');
		System.out.println(lastindexOf);
		String substring = s.substring(0, 9);
		System.out.println(substring);
		int compareto = s.compareTo("Welcome to Hello World");
		System.out.println(compareto);
		boolean contains = s.contains("Earth");
		System.out.println(contains);
	}

}

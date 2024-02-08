package stringTask;

public class Vowels {
	public static void main(String[] args) {
		String a = "This is task";
		
		for(int i=0; i<a.length();i++) {
			char ch = a.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				//System.out.println(ch);
			}else {
				System.out.println(ch);
			}
		}
	}

}

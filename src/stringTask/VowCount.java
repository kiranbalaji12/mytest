package stringTask;

public class VowCount {
		public static void main(String[] args) {
		String a = "This is task";
		int vowcount = 0;
		int nonvowcount = 0;
		
		for(int i=0; i<a.length();i++) {
			char ch = a.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				vowcount++;
			}else {
				nonvowcount++;
			}
			
		}
		System.out.println(vowcount);
		System.out.println(nonvowcount);
		
	}

}



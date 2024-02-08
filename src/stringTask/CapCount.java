package stringTask;

public class CapCount {
	public static void main(String[] args) {
		String a = "This@is123tasK";
		int capcount = 0;
		int smallcount = 0;
		int numcount = 0;
		int spl = 0;
		
		for(int i=0; i<a.length();i++) {
			char ch = a.charAt(i);
			if(ch>='A'&&ch<='Z') {
				capcount++;
			}else if(ch>='a'&&ch<'z') {
				smallcount++;
			}else if(ch>='0'&&ch<='9') {
				numcount++;
			}else {
				spl++;
			}
			
		}
		System.out.println(capcount);
		System.out.println(smallcount);
		System.out.println(numcount);
		System.out.println(spl);

}
}

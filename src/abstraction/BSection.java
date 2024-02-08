package abstraction;

public class BSection extends ASection{
	public void studentInfo(int RegNo) {
	System.out.println("Student Reg No "+ RegNo);
}
	@Override
	public void studentInfo(int RegNo, String Name) {
		System.out.println("Reg No "+ RegNo);
		System.out.println("Name "+ Name);
		
	}
	public static void main (String args[]) {
		BSection b = new BSection();
		b.studentInfo(7895);
		b.studentInfo(55663, "Vioth");;
	}
}


package abstraction;

public class DSection extends ASection implements CSection, ESection {
	@Override
	public void studentInfo(int RollNo) {
		System.out.println("Roll No "+ RollNo);		
	}
	@Override
	public void studentInfo(String Name) {
		System.out.println("Name "+ Name);		
	}
	public static void main(String[] args){
		DSection d = new DSection();
		d.studentInfo(569);
		d.studentInfo("Kiran");
		d.studentInfo(88.8);
		d.studentInfo(897564231);
		d.studentInfo(77663, "Sathya");
	}
	@Override
	public void studentInfo(long PhoneNo) {
		System.out.println("Phone: "+ PhoneNo);		
	}
	@Override
	public void studentInfo(double attendance) {
		System.out.println("Attendance: "+ attendance);		
	}
	@Override
	public void studentInfo(int IDNo, String Name) {
		System.out.println("RollNo: "+ IDNo);
		System.out.println("Name: "+ Name);	
	}	
}

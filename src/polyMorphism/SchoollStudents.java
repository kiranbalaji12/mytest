package polyMorphism;

public class SchoollStudents {
	public void studentInfo(int RegNo) {
		System.out.println("School RegNo "+ RegNo);
	}
	public void studentInfo(String Name) {
		System.out.println("School Name "+ Name);
	}
	public void studentInfo(double mark) {
		System.out.println("Percentage "+ mark);
	}
	public void studentInfo(int RegNo, String Name, double mark) {
		System.out.println("School RegNo "+ RegNo+ " School Name "+ Name+"Percentage"+ mark);
	}
	public static void main(String[] args) {
		SchoollStudents s = new SchoollStudents();
		s.studentInfo(1235);
		s.studentInfo("Kiran");
		s.studentInfo(65.6);
		s.studentInfo(1245, "Siva", 72.1);
	}

}

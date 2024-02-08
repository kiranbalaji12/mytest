package polyMorphism;

public class CollegeStudent extends SchoollStudents {
	public void regName (String name) {
		System.out.println("Reg Name :"+ name);
	}
	public void studentInfo(int RegNo) {
		System.out.println("College RegNo: "+ RegNo);
	}
	public void studentInfo(double mark) {
		System.out.println("Percentage "+ mark);
	}
	public static void main(String[] args) {
		CollegeStudent c = new CollegeStudent();
				c.studentInfo(66789);
		        c.regName("Praveen");
		        c.studentInfo(88.2);
	}

}

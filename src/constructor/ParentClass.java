package constructor;

public class ParentClass extends ChildClass{
	public ParentClass() {
		this(503);
		System.out.println("Default Constructor");
	}
   public ParentClass(int id) {
	   this("Kiran");
		System.out.println("User ID: "+ id);
	}
   public ParentClass(String name) {
	   this('M');
		System.out.println("User Name: "+ name);
	}
   public ParentClass(char gender) {
	   super(25);
		System.out.println("Gender: "+ gender);
	}
   public static void main(String[] args) {
	   ParentClass p = new ParentClass();
    }
	

}

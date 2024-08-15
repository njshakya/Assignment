package string;

public class Student {
	int id =123;
	String name = "Ramesh";
	double salary = 778.90;
	
	void dance() {
		System.out.println("Ramesh can dance");
	}
	void sing() {
		System.out.println("Ramesh can sing");
	}
	void sleep() {
		System.out.println("Ramesh can sleep");
	}
	
	public static void main(String[] args) {
		Student ss = new Student();
		Student ss1 = new Student();
		Student ss2 = new Student();
		
		ss.sing();
		ss.dance();
		ss.sleep();
		System.out.println(ss.salary);
		System.out.println(ss);
		System.out.println(ss1);
		System.out.println(ss2);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
	
	
		
	

}

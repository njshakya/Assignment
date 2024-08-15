package string;

public class StaticDemo {
	static int a =88;
	static void happy() {
		System.out.println("Happpy weeked");
		
	}
	void go() {
		System.out.println("goinnnggggg");
	}
	
	static {
		System.out.println("eeeestatic");
		System.out.println("a :"+a);
		a++;
		System.out.println(a);
	}


	public static void main(String[] args) {
		
		StaticDemo.happy();
		System.out.println(StaticDemo.a);
		

	}

}

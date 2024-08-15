package string;

public class ExceptionDemo {

	public static void main(String[] args) {
		int x =100,y=10,z=0;
		System.out.println(x/y);
		System.out.println("End of x/y");
		
		try {
		System.out.println(x/z);
		System.out.println("End of x/z");
		
		System.out.println("out of loop");
		System.out.println("We are learning");
		}catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
	}

}

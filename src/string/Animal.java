package string;

public class Animal {
	int price = 123;
	String name = "Bruno";
	String color = "Black";
	
	void sleep() {
		System.out.println("It can sleep");
	}
	Animal(int p,String n,String c){
		price =p;
		name= n;
		color =c;
		
	}
	Animal(){
		
	}
	Animal(int p, String n){
		price = p;
		name =n;
	}
	

	public static void main(String[] args) {
		Animal aa = new Animal();
		Animal aa1= new Animal(23,"Mark","Blue");
		Animal aa2 = new Animal(11,"Raaaa");
		aa.sleep();
		System.out.println(aa.name);
		System.out.println(aa);
		System.out.println(aa1);
		System.out.println(aa2);
	}


	@Override
	public String toString() {
		return "Animal [price=" + price + ", name=" + name + ", color=" + color + "]";
	}


	

}

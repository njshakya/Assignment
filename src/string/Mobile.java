package string;

public class Mobile {
	int price=123;
	String name = "Iphone";
	String description ="Sample";
	
	void ring() {
		System.out.println("Tring tring tring");
	}
	Mobile(int p, String n,String d){
		price = p;
		name =n;
		description =d;
	}
	Mobile(){
		
	}

	public static void main(String[] args) {
		Mobile mm= new Mobile();
		Mobile mm2= new Mobile(899,"Samsung","S24");
		mm.ring();
		System.out.println(mm);
		System.out.println(mm2);
		

	}
	@Override
	public String toString() {
		return "Mobile [price=" + price + ", name=" + name + ", description=" + description + "]";
	}

}

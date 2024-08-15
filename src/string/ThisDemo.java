package string;

public class ThisDemo {
	int x = 11;
	void show() {
		int x =12;
		System.out.println(this);
		System.out.println(this.x);
		System.out.println(x);
	}

	public static void main(String[] args) {
		ThisDemo d = new ThisDemo();
		d.show();
		
		
	}

}

package string;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a grade: ");
		int n = sc.nextInt();
		System.out.println(n);
		
		if(n>=90 && n<=100) {
			System.out.println("The grade is A");
		}
		else if (n>=80 && n<=90) {
			System.out.println("The grade is B");
		}
		else if (n>=70 && n<=80) {
			System.out.println("The grade is C");
		}
		else if (n>=70 && n<=80) {
			System.out.println("The grade is D");
		}
		else {
			System.out.println("Fail");
		}
		
	}

}

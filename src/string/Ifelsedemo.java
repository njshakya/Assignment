package string;

import java.util.Scanner;

public class Ifelsedemo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ente marks : ");
		int marks = sc.nextInt();
		char grade;
		if(marks>=90 && marks<=100) {
			grade = 'A';
		}
		else if(marks>=80 && marks<=90) {
			grade = 'B';
		}
		else if(marks>=70 && marks<70) {
			grade = 'C';
		}
		else {
			grade = 'D';
		}
		System.out.println("Grade = "+grade);
		
	
		
	}
	
}

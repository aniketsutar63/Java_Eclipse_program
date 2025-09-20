
//Print grade based on marks (≥90 A, ≥75 B, ≥50 C, else Fail).

package condition_if_Else;

import java.util.Scanner;

public class Program6_if_else {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks : : ");
		double marks=sc.nextDouble();
		
		if(marks>35 && marks<=50) {
			System.out.println("Grade  C ");
		}else if(marks>50 && marks<=75) {
			System.out.println("Grade  B ");
		}else if(marks>75 && marks<=90) {
			System.out.println("Grade  A ");
		}
		else {
			System.out.println("Enter the valid number ");
		}

	}

}

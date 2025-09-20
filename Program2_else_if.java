//Check if a number is even, odd, or zero.

package condition_if_Else;

import java.util.Scanner;

public class Program2_else_if {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number ");
		double number =sc.nextDouble();
		 
		   if (number == 0) {
	            System.out.println("Your number is Zero");
	        } else if (number % 2 == 0) {
	            System.out.println("Your number is Even");
	        } else {
	            System.out.println("Your number is Odd");
	        }

	}

}

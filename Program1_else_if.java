//Check if a number is positive, negative, or zero.

package condition_if_Else;

import java.util.Scanner;

public class Program1_else_if {

	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number:: ");
		double number=sc.nextDouble();
		
		if(number > 0 ) {
			System.out.println("Your  number is postive : :  "+ number);
		}else if(number < 0) {
			System.out.println("Your number is negative : : "+ number);
		}else if(number == 0) {
			System.out.println("Your number is zero : :"+number);
		}else {
			System.out.println("Enter the valide number ");
		}
		

	}

}

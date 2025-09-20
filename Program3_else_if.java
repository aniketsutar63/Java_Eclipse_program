// Find the largest among three numbers.

package condition_if_Else;

import java.util.Scanner;

public class Program3_else_if {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		double number1=sc.nextDouble();
		double number2=sc.nextDouble();
		double number3=sc.nextDouble();
		
		if (number1 >= number2 && number1 >= number3) {
            System.out.println("The largest number is: " + number1);
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println("The largest number is: " + number2);
        } else {
            System.out.println("The largest number is: " + number3);
        }
		
		
	

	}

}

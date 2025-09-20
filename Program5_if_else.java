//Check if a number is divisible by 3, 5, or both
package condition_if_Else;

import java.util.Scanner;

public class Program5_if_else {

	public static void main(String[] args) {

		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number :: ");
		double number =sc.nextDouble();
		 
	 if(number%3==0) {
		 System.out.println("divisible by 3: : 5"+number);
	 }else if(number%5==0) {
		 System.out.println("divisible by 5 : :"+number);
	 }else if(number%3==0 && number%5==0) {
				System.out.println("both divisible 3 and 5"+number); 
			 }else {
				 System.out.println("not divisible by 3 and 5 ");
			 }

	}

}

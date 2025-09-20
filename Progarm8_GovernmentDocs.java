package condition_if_Else;

import java.util.Scanner;

public class Progarm8_GovernmentDocs {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter teh age");
		int age=sc.nextInt();
		
		if(age>0 && age<=15){
			System.out.println("You are under 15. Major government documents are not available yet.");
			System.out.println("You may only apply for: Birth Certificate, Student ID, Ration Card (dependents).");
		}else if(age>=15 && age<18) {
			System.out.println("You are between 15 and 18. You can apply for:");
            System.out.println("1. PAN Card");
            System.out.println("2. Aadhaar Card");
		}else if(age>=18) {
			System.out.println("You are 18 or older. You can apply for following government documents:");
			System.out.println("1. Voter ID");
			System.out.println("2. Driving Licence");
			System.out.println("3. Passport");
			System.out.println("4. Aadhaar Card (if not applied earlier)");
			System.out.println("5. PAN Card");
		}else {
			System.out.println("write the correct number  ");
		}

	}

}

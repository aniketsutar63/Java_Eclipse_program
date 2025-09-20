//write the program for whole marksheet

package condition_if_Else;

import java.util.Scanner;

public class Program7college_if_else {

	public static void main(String[] args) {
		// Take the 3 strem
		Scanner sc=new Scanner(System.in);
		System.out.println("Select one strime  ");
		System.out.println(" 1 : Sciences");
		System.out.println(" 2 : Arts");
		System.out.println(" 3 : Com");
		
		// take the number from user
		int subjectNum=sc.nextInt();
		int marks1,marks2,marks3,marks4;
		double percentage;
		
		
		//write the case of the subject
		switch(subjectNum) {
		case 1 :
			System.out.println("Sciences");
			System.out.println(" marathi,English,phy,chemi");
			
			System.out.println("Enter the marks of marathi  ");
			marks1=sc.nextInt();

			
			System.out.println("Enter the marks  of English");
			marks2=sc.nextInt();


			System.out.println("Enter the marks  of Phy");
			marks3=sc.nextInt();

			
			System.out.println("Enter the marks  of chemi");
			marks4=sc.nextInt();
			
			if(marks1 >35 && marks2 >35 && marks3 >35 && marks4 >35 ) {
			
			System.out.println("You entered marathi :: " + marks1);
			System.out.println("You entered English :: " + marks2);
			System.out.println("You entered Phy  :: " + marks3);
			System.out.println("You entered chemi :: " + marks4);
			
			System.out.println("**************final Percentage********************");
			percentage = (marks1 + marks2 + marks3 + marks4) / 4.0;
            System.out.println("Your Percentage in Science: " + percentage + "%");
            checkResult(percentage);
		}else {
			System.out.println("You are fail ");
		}
			break;
		case 2 :
			System.out.println("Arts");
			System.out.println(" English, History, Political Science,");
		
			System.out.println("Enter the marks of English  ");
			marks1=sc.nextInt();
			System.out.println("Enter the marks  of History");
			marks2=sc.nextInt();
			System.out.println("Enter the marks  of Political");
			marks3=sc.nextInt();
			System.out.println("Enter the marks  of Science");
			marks4=sc.nextInt();
		
			System.out.println("You entered English :: " + marks1);
			System.out.println("You entered History :: " + marks2);
			System.out.println("You entered Political :: " + marks3);
			System.out.println("You entered Science :: " + marks4);
			if(marks1 >35 && marks2 >35 && marks3 >35 && marks4 >35 ) {
			System.out.println("**************final Percentage********************");
			percentage = (marks1 + marks2 + marks3 + marks4) / 4.0;
			System.out.println("Your Percentage in Arts: " + percentage + "%");
			checkResult(percentage);
			}else {
				System.out.println("You are fail ");
			}
			break;
	case 3 :
			System.out.println("Com");
			System.out.println(" Accountancy, Business Studies, Economics");
			System.out.println("Enter the marks of Accountancy  ");
			marks1=sc.nextInt();
			System.out.println("Enter the marks  of Business");
			marks2=sc.nextInt();
			System.out.println("Enter the marks  of Economics");
			marks3=sc.nextInt();
			System.out.println("Enter the marks  of Science");
			marks4=sc.nextInt();
		
			System.out.println("You entered Accountancy :: " + marks1);
			System.out.println("You entered Business :: " + marks2);
			System.out.println("You entered Economics  :: " + marks3);
			System.out.println("You entered Science :: " + marks4);
			if(marks1 >35 && marks2 >35 && marks3 >35 && marks4 >35 ) {
			System.out.println("**************final Percentage********************");
			percentage = (marks1 + marks2 + marks3 + marks4) / 4.0;
			System.out.println("Your Percentage in Commerce: " + percentage + "%");
			checkResult(percentage);
		}else {
			System.out.println("You are fail ");
		}
			break;		
	 default:
         System.out.println("Invalid choice!");
		}
	}

	
		public static void checkResult(double percentage) {
			if (percentage > 0 && percentage <= 35) {
	            System.out.println("Result: FAIL ");
	        } else if (percentage > 35 && percentage <= 75) {
	            System.out.println("Result: PASS ");
	        } else if (percentage > 75 && percentage <= 100) {
	            System.out.println("Result: PASS with DISTINCTION ");
	        } else {
	            System.out.println("Invalid percentage entered!");
	        }
		
	
		
	}

}

package condition_if_Else;

 import java.util.Scanner;
 
public class Program_1 {

	public static void main(String[] args) {
		 int age ; 
        
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the age :  ");
		 int num = sc.nextInt();
		 
		 if(num >= 13 && num <= 17) {
	            System.out.println("You are a teenager");
	        }
	        else if (num >= 18 && num <= 25) {
	            System.out.println("You are ready to vote");
	        }
	        else if (num >= 26 && num <= 80) {
	            System.out.println("You are not fit to vote");
	        }
	        else {
	            System.out.println("Type a valid number");
		}
		

	}

}

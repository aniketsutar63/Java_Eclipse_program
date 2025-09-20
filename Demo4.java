package operater;
import java.util.Scanner;
public class Demo4 {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a number between 1 to 5: ");
	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.println("You selected Case 1");
	                break;
	            case 2:
	                System.out.println("You selected Case 2");
	                break;
	            case 3:
	                System.out.println("You selected Case 3");
	                break;
	            case 4:
	                System.out.println("You selected Case 4");
	                break;
	            case 5:
	                System.out.println("You selected Case 5");
	                break;
	            default:
	                System.out.println("Invalid choice! Please enter 1–5.");
	        }

	        sc.close();
	    }
	}

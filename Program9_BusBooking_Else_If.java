package condition_if_Else;

import java.util.Scanner;

public class Program9_BusBooking_Else_If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int point;
        int set;
        int set1;
        


        System.out.print("Enter the City name (Pune / Mumbai / Kolhapur): ");
        String city1 = sc.nextLine();

        switch (city1.toLowerCase()) {
            case "pune":
                System.out.println("Popular boarding points in Pune:");
                System.out.println("1. Swargate");
                System.out.println("2. Shivaji Nagar");
                System.out.println("3. Pune Station");
                System.out.println("4. Hinjewadi");
                System.out.print("Select Boarding Point (1-4): ");
                point = sc.nextInt();
                sc.nextLine(); // clear 
                switch (point) {
                    case 1: System.out.println("You selected Swargate"); 
                    break;
                    case 2: System.out.println("You selected Shivaji Nagar"); 
                    break;
                    case 3: System.out.println("You selected Pune Station"); 
                    break;
                    case 4: System.out.println("You selected Hinjewadi"); 
                    break;
                    default: System.out.println("Invalid choice!");
                }
                break;

            case "mumbai":
                System.out.println("Popular boarding points in Mumbai:");
                System.out.println("1. Andheri");
                System.out.println("2. Dadar");
                System.out.println("3. Borivali");
                System.out.println("4. Sion");
                System.out.print("Select Boarding Point (1-4): ");
                point = sc.nextInt();
                sc.nextLine(); // clear 
                switch (point) {
                    case 1: System.out.println("You selected Andheri"); 
                    break;
                    case 2: System.out.println("You selected Dadar"); 
                    break;
                    case 3: System.out.println("You selected Borivali"); 
                    break;
                    case 4: System.out.println("You selected Sion"); 
                    break;
                    default: System.out.println("Invalid choice!");
                }
                break;

            case "kolhapur":
                System.out.println("Popular boarding points in Kolhapur:");
                System.out.println("1. Dabholkar Corner");
                System.out.println("2. Kawala Naka");
                System.out.println("3. Shiroli Phata");
                System.out.print("Select Boarding Point (1-3): ");
                point = sc.nextInt();
                sc.nextLine(); // clear 
                switch (point) {
                    case 1: System.out.println("You selected Dabholkar Corner"); 
                    break;
                    case 2: System.out.println("You selected Kawala Naka"); 
                    break;
                    case 3: System.out.println("You selected Shiroli Phata"); 
                    break;
                    default: System.out.println("Invalid choice!");
                }
                break;

            default:
                System.out.println("Invalid city choice for Boarding!");
        }

      
        System.out.print("\nEnter the City name (Ponda / Panjim / Mapusa): ");
        String city2 = sc.nextLine();

        switch (city2.toLowerCase()) {
            case "ponda":
                System.out.println("Popular Dropping points in Ponda:");
                System.out.println("1. Satarda Bridge");
                System.out.println("2. Pernem");
                System.out.println("3. Dhargal");
                System.out.println("4. Mapusa New Bus Stand");
                System.out.print("Select Dropping Point (1-4): ");
                point = sc.nextInt();
                sc.nextLine(); // clear 
                switch (point) {
                    case 1: System.out.println("You selected Satarda Bridge"); 
                    break;
                    case 2: System.out.println("You selected Pernem"); 
                    break;
                    case 3: System.out.println("You selected Dhargal"); 
                    break;
                    case 4: System.out.println("You selected Mapusa New Bus Stand"); 
                    break;
                    default: System.out.println("Invalid choice!");
                }
                break;

            case "panjim":
                System.out.println("Popular Dropping points in Panjim:");
                System.out.println("1. Banda");
                System.out.println("2. Mapusa");
                System.out.println("3. Porvorim");
                System.out.println("4. Verna");
                System.out.print("Select Dropping Point (1-4): ");
                point = sc.nextInt();
                sc.nextLine(); // clear 
                switch (point) {
                    case 1: System.out.println("You selected Banda"); 
                    break;
                    case 2: System.out.println("You selected Mapusa"); 
                    break;
                    case 3: System.out.println("You selected Porvorim"); 
                    break;
                    case 4: System.out.println("You selected Verna"); 
                    break;
                    default: System.out.println("Invalid choice!");
                }
                break;

            case "mapusa":
                System.out.println("Popular Dropping points in Mapusa:");
                System.out.println("1. Banda");
                System.out.println("2. Pernem Malpem");
                System.out.println("3. Porvorim");
                System.out.print("Select Dropping Point (1-3): ");
                point = sc.nextInt();
                sc.nextLine(); // clear 
                switch (point) {
                    case 1: System.out.println("You selected Banda"); 
                    break;
                    case 2: System.out.println("You selected Pernem Malpem"); 
                    break;
                    case 3: System.out.println("You selected Porvorim"); 
                    break;
                    default: System.out.println("Invalid choice!");
                }
                break;

            default:
                System.out.println("Invalid city choice for Dropping!");
        }
         
        System.out.println("\nSelect seats: ");
        System.out.println("1    2      3   4");
        System.out.println("5    6      7   8");
        System.out.println("9    10     11  12");
        System.out.println("13   14     15  16");
        System.out.println("17   18     19  20");

        System.out.print("Enter the seat number: ");
        int seat = sc.nextInt();
        
        switch (seat) {
            case 1: System.out.println("You selected Seat 1");
            System.out.print("Enter the Name: ");
            String Name1 = sc.next();
            System.out.print("Enter Age : ");
            String name1= sc.next();
            System.out.println("Your price is :: Rs 2000 ");
        
            break;
            case 2: System.out.println("You selected Seat 2");    
            System.out.print("Enter the Name: ");
            String Name2 = sc.next();
            System.out.print("Enter Age : ");
            String name2= sc.next();
            System.out.print("Your price is :: Rs 2000 ");
            break;
            case 3: System.out.println("You selected Seat 3"); 
            System.out.print("Enter the Name: ");
            String Name3 = sc.next();
            System.out.print("Enter Age : ");
            String name3= sc.next();
            System.out.print("Your price is :: Rs 2000 ");
            break;
            case 4: System.out.println("You selected Seat 4");
            System.out.print("Enter the Name: ");
            String Name4 = sc.next();
            System.out.print("Enter Age : ");
            String name4= sc.next();
            System.out.print("Your price is :: Rs 2000 ");
            break;
            case 5: System.out.println("You selected Seat 5");
            System.out.print("Enter the Name: ");
            String Name5 = sc.next();
            System.out.print("Enter Age : ");
            String name5= sc.next();
            System.out.print("Your price is :: Rs-2000 ");
            break;
            case 6: System.out.println("You selected Seat 6");
            System.out.print("Enter the Name: ");
            String Name6 = sc.next();
            System.out.print("Enter Age : ");
            String name6= sc.next();
            System.out.println("Your price is :: Rs 2000 ");
            break;
            case 7: System.out.println("You selected Seat 7"); 
            System.out.print("Enter the Name: ");
            String Name7 = sc.next();
            System.out.print("Enter Age : ");
            String name7= sc.next();
            System.out.print("Your price is :: Rs 2000 ");
            break;
            case 8: System.out.println("You selected Seat 8"); 
            System.out.print("Enter the Name: ");
            String Name8 = sc.next();
            System.out.print("Enter Age : ");
            String name8= sc.next();
            System.out.println("Your price is :: Rs 2000 ");
            break;
            case 9: System.out.println("You selected Seat 9"); 
            System.out.print("Enter the Name: ");
            String Name9 = sc.next();
            System.out.print("Enter Age : ");
            String name9= sc.next();
            System.out.println("Your price is :: Rs 2000 ");
            break;
            case 10: System.out.println("You selected Seat 10");
            System.out.print("Enter the Name: ");
            String Name10 = sc.next();
            System.out.print("Enter Age : ");
            String name10= sc.next();
            System.out.println("Your price is :: Rs 2000 ");
            break;
            case 11: System.out.println("You selected Seat 11"); 
            System.out.print("Enter the Name: ");
            String Name11 = sc.next();
            System.out.print("Enter Age : ");
            String name11= sc.next();
            System.out.print("Your price is :: Rs 2000 ");
            break;
            case 12: System.out.println("You selected Seat 12");
            System.out.print("Enter the Name: ");
            String Name12 = sc.next();
            System.out.print("Enter Age : ");
            String name12= sc.next();
            System.out.print("Your price is :: Rs 2000 ");
            break;
            case 13: System.out.println("You selected Seat 13"); 
            System.out.print("Enter the Name: ");
            String Name13 = sc.next();
            System.out.print("Enter Age : ");
            String name13= sc.next();
            System.out.println("Your price is :: Rs 2000 ");
            break;
            case 14: System.out.println("You selected Seat 14");
            System.out.print("Enter the Name: ");
            String Name14 = sc.next();
            System.out.print("Enter Age : ");
            String name14= sc.next();
            System.out.print("Your price is :: Rs 2000 ");
            break;
            case 15: System.out.println("You selected Seat 15"); 
            System.out.print("Enter the Name: ");
            String Name15 = sc.next();
            System.out.print("Enter Age : ");
            String name15= sc.next();
            System.out.println("Your price is :: Rs 2000 ");
            break;
            case 16: System.out.println("You selected Seat 16"); 
            System.out.print("Enter the Name: ");
            String Name16 = sc.next();
            System.out.print("Enter Age : ");
            String name16= sc.next();
            System.out.println("Booking confirmed ");
            System.out.println("Name:"+Name16);
            System.out.println("age : ");
            System.out.println("Your price is :: Rs 2000 ");
            break;
            case 17: System.out.println("You selected Seat 17"); 
            System.out.print("Enter the Name: ");
            String Name17 = sc.next();
            System.out.print("Enter Age : ");
            String name17= sc.next();
            System.out.println("Your price is :: Rs 2000 ");
            break;
            case 18: System.out.println("You selected Seat 18");
            System.out.print("Enter the Name: ");
            String Name18 = sc.next();
            System.out.print("Enter Age : ");
            String name18= sc.next();
            System.out.println("Your price is :: Rs 2000 ");
            break;
            case 19: System.out.println("You selected Seat 19"); 
            System.out.print("Enter the Name: ");
            String Name19 = sc.next();
            System.out.print("Enter Age : ");
            String name19= sc.next();
            System.out.println("Your price is :: Rs 2000 ");
            break;
            case 20: System.out.println("You selected Seat 20"); 
            System.out.print("Enter the Name: ");
            String Name20 = sc.next();
            System.out.print("Enter Age : ");
            String name20= sc.next();
            System.out.println("Your price is :: Rs 2000 ");
            break;
            default: System.out.println("Invalid seat number!");
        }
        
        
        
        System.out.println("Enter the 2nd seat number: ");
        int seat1 = sc.nextInt();
        switch (seat) {
        case 1: 
        	System.out.println("You selected Seat 1");
        	System.out.print("Enter the Name: ");
        	String Name1 = sc.next();
        	System.out.print("Enter Age : ");
        	String name1= sc.next();
        	System.out.print("Your price is :: Rs 2000 ");
    
        break;
        }
    }
}

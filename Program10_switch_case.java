/*
 * 1.	Day of the Week
o	Input: A number (1–7)
o	Output: Print the day (e.g., 1 → Monday).

 */


package condition_if_Else;

import java.util.Scanner;

public class Program10_switch_case {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the month name Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, and Dec");
	        String month = sc.next();

	        switch (month.toLowerCase()) {
	            case "jan":
	                System.out.println("You selected Jan. Weekends: 4, 5, 11, 12, 18, 19, 25, 26");
	                System.out.println("*********************************************************");
	                System.out.println("if you wants to check the even dates");
	                int[] janWeekends = {4, 5, 11, 12, 18, 19, 25, 26};

	                for (int day : janWeekends) {
	                    if (day % 2 == 0) {	                    
	                        System.out.println(day + " → Even");
	                    } else {
	                        System.out.println(day + " → Odd");
	                    }
	                }
	                
	                break;

	            case "feb":
	                System.out.println("You selected Feb. Weekends: 1, 2, 8, 9, 15, 16, 22, 23");
	                System.out.println("*********************************************************");
	                System.out.println("if you wants to check the even dates");
	                int[] febWeekends = { 1, 2, 8, 9, 15, 16, 22, 23};

	                for (int day : febWeekends) {
	                    if (day % 2 == 0) {
	                        System.out.println(day + " → Even");
	                    } else {
	                        System.out.println(day + " → Odd");
	                    }
	                }
	                break;

	            case "mar":
	                System.out.println("You selected Mar. Weekends: 1, 2, 8, 9, 15, 16, 22, 23, 29, 30");
	                System.out.println("*********************************************************");
	                System.out.println("if you wants to check the even dates");
	                int[] marWeekends = {1, 2, 8, 9, 15, 16, 22, 23, 29, 30};

	                for (int day : marWeekends) {
	                    if (day % 2 == 0) {
	                        System.out.println(day + " → Even");
	                    } else {
	                        System.out.println(day + " → Odd");
	                    }
	                }
	                break;

	            case "apr":
	                System.out.println("You selected Apr. Weekends: 5, 6, 12, 13, 19, 20, 26, 27");
	                System.out.println("*********************************************************");
	                System.out.println("if you wants to check the even dates");
	                int[] aprWeekends = {5, 6, 12, 13, 19, 20, 26, 27};

	                for (int day : aprWeekends) {
	                    if (day % 2 == 0) {
	                        System.out.println(day + " → Even");
	                    } else {
	                        System.out.println(day + " → Odd");
	                    }
	                }
	                break;

	            case "may":
	                System.out.println("You selected May. Weekends: 3, 4, 10, 11, 17, 18, 24, 25, 31");
	                System.out.println("*********************************************************");
	                System.out.println("if you wants to check the even dates");
	                int[] mayWeekends = {3, 4, 10, 11, 17, 18, 24, 25, 31};

	                for (int day : mayWeekends ) {
	                    if (day % 2 == 0) {
	                        System.out.println(day + " → Even");
	                    } else {
	                        System.out.println(day + " → Odd");
	                    }
	                }
	                break;

	            case "jun":
	                System.out.println("You selected Jun. Weekends: 1, 7, 8, 14, 15, 21, 22, 28, 29");
	                System.out.println("*********************************************************");
	                System.out.println("if you wants to check the even dates");
	                int[] junWeekends = {1, 7, 8, 14, 15, 21, 22, 28, 29};

	                for (int day : junWeekends) {
	                    if (day % 2 == 0) {
	                        System.out.println(day + " → Even");
	                    } else {
	                        System.out.println(day + " → Odd");
	                    }
	                }
	                break;

	            case "jul":
	                System.out.println("You selected Jul. Weekends: 5, 6, 12, 13, 19, 20, 26, 27");
	                System.out.println("*********************************************************");
	                System.out.println("if you wants to check the even dates");
	                int[] julWeekends = {5, 6, 12, 13, 19, 20, 26, 27};

	                for (int day : julWeekends) {
	                    if (day % 2 == 0) {
	                        System.out.println(day + " → Even");
	                    } else {
	                        System.out.println(day + " → Odd");
	                    }
	                }
	                break;

	            case "aug":
	                System.out.println("You selected Aug. Weekends: 2, 3, 9, 10, 16, 17, 23, 24, 30, 31");
	                System.out.println("*********************************************************");
	                System.out.println("if you wants to check the even dates");
	                int[] augWeekends = {2, 3, 9, 10, 16, 17, 23, 24, 30, 31};

	                for (int day :augWeekends) {
	                    if (day % 2 == 0) {
	                        System.out.println(day + " → Even");
	                    } else {
	                        System.out.println(day + " → Odd");
	                    }
	                }
	                break;

	            case "sep":
	                System.out.println("You selected Sep. Weekends: 6, 7, 13, 14, 20, 21, 27, 28");
	                System.out.println("*********************************************************");
	                System.out.println("if you wants to check the even dates");
	                int[] sepWeekends = {6, 7, 13, 14, 20, 21, 27, 28};

	                for (int day : sepWeekends) {
	                    if (day % 2 == 0) {
	                        System.out.println(day + " → Even");
	                    } else {
	                        System.out.println(day + " → Odd");
	                    }
	                }
	                break;

	            case "oct":
	                System.out.println("You selected Oct. Weekends: 4, 5, 11, 12, 18, 19, 25, 26");
	                System.out.println("*********************************************************");
	                System.out.println("if you wants to check the even dates");
	                int[] octWeekends = {4, 5, 11, 12, 18, 19, 25, 26};

	                for (int day : octWeekends) {
	                    if (day % 2 == 0) {
	                        System.out.println(day + " → Even");
	                    } else {
	                        System.out.println(day + " → Odd");
	                    }
	                }
	                break;

	            case "nov":
	                System.out.println("You selected Nov. Weekends: 1, 2, 8, 9, 15, 16, 22, 23, 29, 30");
	                System.out.println("*********************************************************");
	                System.out.println("if you wants to check the even dates");
	                int[] novWeekends = {1, 2, 8, 9, 15, 16, 22, 23, 29, 30};

	                for (int day : novWeekends) {
	                    if (day % 2 == 0) {
	                        System.out.println(day + " → Even");
	                    } else {
	                        System.out.println(day + " → Odd");
	                    }
	                }
	                break;

	            case "dec":
	                System.out.println("You selected Dec. Weekends: 6, 7, 13, 14, 20, 21, 27, 28");
	                System.out.println("*********************************************************");
	                System.out.println("if you wants to check the even dates");
	                int[] decWeekends = {6, 7, 13, 14, 20, 21, 27, 28};

	                for (int day : decWeekends) {
	                    if (day % 2 == 0) {
	                        System.out.println(day + " → Even");
	                    } else {
	                        System.out.println(day + " → Odd");
	                    }
	                }
	                break;

	            default:
	                System.out.println("Enter the correct month");
	        }
	    }
	}

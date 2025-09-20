package condition_if_Else;

import java.util.Scanner;

public class Prog_Amount_parsentage_ifElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount:: ");
		
		double price = sc.nextDouble();
		
		
		if(price > 0 && price <= 100000) {

			System.out.println(" Your amount allpicabe for 20% tax : "+price);
			System.out.println("10 % tax  on price : :- "+ (price*10)/100 );
		}
		else if(price >100000 && price <=300000) {
			System.out.println(" Your amount allpicabe for 20% tax :  "+price);
			System.out.println("  20 % tax  on price : "+(price*20)/100);
			
		}else if(price >300000 && price <=500000) {

			System.out.println(" Your amount allpicabe for 20% tax "+price);
			System.out.println("30 % tax  on price : "+(price*30)/100);
			
		}else {
			System.out.println("Enter the valid amount ");
		}

	}

}

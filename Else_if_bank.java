package condition_if_Else;

public class Else_if_bank {

	public static void main(String[] args) {

		double amount = 250000 ;
		
		if(amount > 0 && amount <= 100000) {
			System.out.println("Low balance ");
		}
		else if(amount >100000 && amount <=300000) {
			System.out.println("mini balance");
		}else if(amount >300000 && amount <=500000) {
			System.out.println("high balance");
			
		}else if( amount < 500000) {
			System.out.println(" utra mini balance");

	}else {
		System.out.println("work hard");
	}

}
}


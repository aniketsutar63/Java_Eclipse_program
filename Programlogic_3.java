package operater;

public class Programlogic_3 {

	public static void main(String[] args) {
		
		        int num1 = -19, num2 = +20, num3 = 24;

		        boolean cond1 = (num1++ >= num3) && (num3 <= num2);

		       // System.out.println((cond1) || (cond2) && (!cond2));
		        
		        boolean cond2 = (num2 >= num1 || num3 <= num1);

		        System.out.println((cond1) || (cond2) && (!cond2));
	}

}

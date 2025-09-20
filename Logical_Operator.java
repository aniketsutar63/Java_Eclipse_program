package operater;

public class Logical_Operator {

	public static void main(String[] args) {

		boolean x= true;
		boolean y=false;
		
		
		System.out.println("x && y : "+(x && y));
		System.out.println("x || y : "+(x || y));
		System.out.println("!x : "+(!x));
		
		int num = 6;
		int num1 = 4;
		if ((num < 2) || (++num1 < 6)){
			System.out.println("hello");
		}
		System.out.println("Bye" + num1);
		
	}

}

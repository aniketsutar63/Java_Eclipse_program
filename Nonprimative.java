package first;

public class Nonprimative {

	public static void main(String[] args) {

		System.out.println("write the arry For 5 number");
		int[] number= new int[5]; // defined the size of the arry
		number[0]=25;       // put the value of the arr from 0 to 5  ( the formula is arry size- 1)( start with 0)
		number[1]=26;
		number[2]=27;
		number[3]=28;
		number[4]=29;
	
		System.out.println(number[2]);
		
		char[] letter=new char[5];
		letter[0]='A';
		letter[1]='B';
		letter[2]='C';
		letter[3]='D';
		letter[4]='F';
		
		System.out.println(letter[2]);
		
		String name ="Aniket";
		
		System.out.println(name);
		// if the add the some arr and string the look the below
		
		System.out.println(number[2]+name);
		
		String Fullname=" Aniket sutar ";
		
		System.out.println(Fullname);
		
		
		System.out.println(Fullname+letter[0]+number[1]);

		

	}

}

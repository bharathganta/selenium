package learning;

public class DecimalToBinary {

	public static void main(String[] args) {


		// Write a program to convert decimal number to binary format.
		
		
				int number=12;
				 StringBuffer s= new StringBuffer();

				 while(number > 0){

				 s.append( number%2);
				 
				 number = number/2;

				 }

				 System.out.print(s.reverse());

	}

}

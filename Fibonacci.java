package learning;

public class Fibonacci {

	public static void main(String[] args) {
		
		// Write a program to print fibonacci series.
		
		int a=0;
		System.out.println(a);
		int b=1;
		System.out.println(b);
		
		for(int i=0;i<9;i++){
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
					
		}

	}

}

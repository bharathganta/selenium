package learning;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		// Write a program to check the given number is a prime number or not?
		
		int y=0;
		int result=0;
		for(int x=2;x<1000;x++){
			
			
		int flag=0;
		for(int i=2;i<=x/2;i++){
			if(x % i==0){
			//System.out.println(x+"  not prime");
				flag=1;
				break;
				}
				}
				if(flag==0){
					System.out.println(x+"  prime");
					y=x;
					result=result+y;
					
					
				}
			}
			System.out.println(result);

	}

}

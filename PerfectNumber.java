package learning;

public class PerfectNumber {

	public static void main(String[] args) {
		
		
		// Write a program to find perfect number or not.
		
        int n, sum = 0;

         n=28;
         for(int i = 1; i < n; i++)

        {
        	
        	int sum1=n%i;
        	System.out.println(sum1);
            if(n % i == 0)

            {
                sum = sum + i;

            }
 	
           }
        System.out.println(sum);
        if(sum == n)

        {

            System.out.println("Given number is Perfect");

        }
        else

        {

            System.out.println("Given number is not Perfect");

        }    


	}

}

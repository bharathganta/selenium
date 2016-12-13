package learning;

import java.util.ArrayList;

public class arrayTest {

	public static void main(String[] args) {
		
		
// I have an array having 1 to 50000 numbers,but some numbers are missing.how to find the missing numbers?
		
		int[] b={1,4,5,8,11,15};
		int c=b[0];
		for(int k=0;k<b.length;k++){
			
			if(c==b[k]){
				c++;
			}else{
				System.out.println(c);
				k--;
				c++;
			}
		}
		
// Printing on Array
			
			ArrayList<Integer> arr = new ArrayList<Integer>();
			int a[] = {0,3,4,5,6,7,10 };
			int j = a[0];
			for (int i=0;i<a.length;i++)
			{
			    if (j==a[i])
			    {
			        j++;

			    }
			    else
			    {
			        arr.add(j);
			        System.out.println(j);
			       i--;
			       
			    j++;
			    }
			}
			System.out.println("missing numbers are ");
			for(int r : arr)
			{
			    System.out.println(" " + r);
			}
				
			}
			
			
		

	}



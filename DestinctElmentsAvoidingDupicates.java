package learning;

import java.util.HashSet;
import java.util.Set;

public class DestinctElmentsAvoidingDupicates {

	public static void main(String[] args) {
		
		// How to get distinct elements from an array by avoiding duplicate elements?
		
		
		int[] a={1,5,6,5,4,8,9,1,5,3};
		
		
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<a.length;i++){
			set.add(a[i]);
		}
		
		for(Integer b:set){
			System.out.println(b);
		}
	}

}

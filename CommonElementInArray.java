package learning;

public class CommonElementInArray {

	public static void main(String[] args) {
		//  Write a program to find common elements between two arrays.
		
		
		int[] a={1,2,3,5,6};
		int[] b={1,3,4,6,8};
		
		
		for(int i=0;i<a.length;i++){
			
			for(int j=0;j<b.length;j++){
				
				if(a[i]==b[j]){
					System.out.println(a[i]);
				}
			}
		}

	}

}

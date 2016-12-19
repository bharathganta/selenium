package learning;

public class DuplicateCharInString {

	public static void main(String[] args) {
	
		// Wrie a program to find out duplicate characters in a string.
		
		String a="follow";
		
		int count=0;
		
		
			
		for(int i=0;i<a.length();i++){
		char b=a.charAt(i);
			
			for(int j=0;j<a.length();j++){
		char c=a.charAt(j);		
				if(b==c){
					
					count++;
					
				}
			}
			System.out.println(b+"  "+count);
			String d=String.valueOf(b).trim();
			d=d.replaceAll(d,"");
			count=0;
		}

	}

}

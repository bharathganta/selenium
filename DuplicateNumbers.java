package learning;

import java.util.Arrays;

public class DuplicateNumbers {

	public static void main(String[] args) {
		
		//Find out duplicate number between 1 to N numbers.
		
		int[] numbers = { 1, 5, 23,5,23, 2, 1, 6, 3, 1, 8, 12, 3 };
		Arrays.sort(numbers);
		
		for(int i = 1; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		if(numbers[i] == numbers[i - 1]) {
		System.out.println("Duplicate: " + numbers[i]);
		}

	
		}
		

	}

}

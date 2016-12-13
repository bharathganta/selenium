package learning;

import java.util.ArrayList;

public class HighestNumberInArray {

	public static void main(String[] args) {
		
		
	// Highest and second highest numbers in Array. 	
	
	int arr[] = { 14, 46, 99, 86, 92, 52, 48, 36, 66, 85 };
	int largest = arr[0];
	int secondLargest = arr[0];
	
	
	
	for (int i = 0; i < arr.length; i++) {

		if (arr[i] > largest) {
			secondLargest = largest;
			largest = arr[i];

		} else if (arr[i] > secondLargest) {
			secondLargest = arr[i];

		}
	}

	System.out.println("\nSecond largest number is:" + secondLargest);
	
	}
	
	
	}


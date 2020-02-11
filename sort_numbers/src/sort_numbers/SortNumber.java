package sort_numbers;

import java.util.Arrays;

public class SortNumber {
	public static void SortNumbers(int... numbers) {
		
		Arrays.sort(numbers);
		
		System.out.print(" Sorted array in descending order: ");
		
		for (int i = numbers.length-1; 0 <= i; i--) {
		      System.out.printf(numbers[i] + " ");
		}
		System.out.println();
	}
}

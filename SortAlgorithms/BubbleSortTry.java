package SortAlgorithms;

import java.util.Arrays;

/**
 * 
 * @author Gopal What is sorting: It is the process of arranging data in some
 *         logical order. In case od numeric value, logical order may be
 *         ascending or descending order. In case of alphanumeric value it can
 *         be dictaniory order
 *
 */
public class BubbleSortTry {
	/**
	 * 
	 * What is Bubble sort: it referred to as sinking sort is a comparison based
	 * algorithm, i.e comparing each pair of adjacent items and swapping them if
	 * they are in the wrong order. They pass through the repetitive order until no
	 * swap is needed which indicates that list is sorted
	 * 
	 * Number of round/phase = no of item/values -1
	 */
	public static void main(String[] args) {
		int[] arr = { 36, 19, 52, 125, 25, 0, 5 };
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	/**
	 * 
	 * @param arr Array
	 * 
	 * If the array is String we will use comapreTo() methods is used to comapre to methods lexicographically
	 * Each character of both the string is converted into a unicode value for comparison, if both string are
	 * equal it will return 0 or else it will return positive or negative value.The result is positive if the 
	 * first string is lexicographically greater than the second string else it will return  negative
	 */

	public static void bubbleSort(int[] arr) {

		// First for loop for rounds/phase
		int temp;
		for (int i = 0; i < arr.length; i++) {
			boolean isSorted = true;
			for (int j = 0; j < arr.length - 1 - i; j++) { // i here is for, that it will not compare last element once
															// it is sorted
				if (arr[j] > arr[j + 1]) { //for string arr[j].comapareTo(a[j+1]) > 0
					isSorted = false;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			if (isSorted) {
				break;
			}
		}
	}
}

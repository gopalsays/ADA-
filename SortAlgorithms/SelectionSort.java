package SortAlgorithms;

/**
 * 
 * @author Gopal 
 * 
 *     	   The selection sort is a combination of searching and sorting.
 *         It sorts arrays by repeatedly finding the minimun element(considering
 *         ascending order) from unsorted part and putting it at the beginning.
 *         In every iteration of selection sort the minimun element from
 *         unsorted subarray is picked and moved to the sorted array.
 * 
 *         The algorithm maintains two sub array in a given array.
 *         1)The subarray which is already sorted 
 *         2)Remaining subarray which is unsorted
 *
 */
public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 38, 52, 9, 18, 62, 16, 13 };
		selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	/**
	 * 
	 * @param arr For String we will use compareTo() methods
	 */
	private static void selectionSort(int[] arr) {

		// This is used for number of round /phase
		int min;
		int temp = 0; // String temp = "";
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) { // a[j].compareTo(a(min)) < 0
					min = j;
				}
			}

			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;

		}
	}
}

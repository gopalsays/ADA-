package SortAlgorithms;

/**
 * 
 * @author Gopal 
 * 		   Insertion sort is a simple sorting algorithm that works the way
 *         we sort playing cards in our hand we just choose one card and isert
 *         it in thier place(ascending or descending)
 *         
 *         Working: 
 *         1) We start by making the second element of the given array(i.e. element at index 1, the key.
 *         	  The key element here is the new card that we need to add to our existing sorted set of cards.
 *         2) We compare the key element  with the element before it in this case element at indesx 0
 *         		a) If the element is less than the first element we insert it after the first element or vice versa
 *         3) Then we make the thirds element of the array as key and will compare it with elements to its left and insert it its right posistion
 *         4) and we go on repeating this untill array is sorted.
 *
 */
public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 18, 9, 4, 25, 785, 42, 12, 0 };

		insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void insertionSort(int[] arr) {
			
		int temp,j;
		//We start with i=1 instead 0
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j=i;
			while (j > 0  &&  arr[j-1] >temp) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
	}
}

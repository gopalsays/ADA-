package SortAlgorithms;

/**
 * 
 * @author Gopal
 * Merge sort is one of the most popular sorting algorithm and widely used techinque.
 * Its time complexity is T(n) = 2T(n/2) which is better than insertion,bubble,selection sorts.
 * 
 * Working on divide and conquer rule:
 * 1) Divide the unsorted list into n sublist, each containing 1 element.
 * 2) Take adjacent pairs of two singleton list and merge them to form a list of 2 elements.
 * 3) repeat the process
 *
 */
public class MergeSort {

	int[] array;
	int[] tempMergeArray;
	int length;
	public static void main(String[] args) {

		int[] arr = { 18, 9, 4, 25, 785, 42, 12, 0 };
		MergeSort Sort = new MergeSort();
		Sort.mergeSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public void mergeSort(int[] arr) {
		this.array = arr;
		this.length = arr.length;
		this.tempMergeArray = new int[length];
		divideArray(0,length-1);
	}
	private void divideArray(int lowerIndex, int highetIndex) {
		// TODO Auto-generated method stub
		if (lowerIndex <highetIndex) {
			int middle = lowerIndex+( highetIndex-lowerIndex)/2;
			
			//It will sort left part
			divideArray(lowerIndex, middle);
			
			//It will sort right part
			divideArray(middle +1, highetIndex);
			
			mergeArray(lowerIndex,middle,highetIndex);
		}
	}
	private void mergeArray(int lowerIndex, int middle, int highetIndex) {
		// TODO Auto-generated method stub
		for (int i = lowerIndex; i <= highetIndex; i++) {
			tempMergeArray[i] = array[i];
		}
		
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		
		while (i<= middle && j <= highetIndex) {
			
			if (tempMergeArray[i] <= tempMergeArray[j]) {
				array[k] = tempMergeArray[i];
				i++;	
			}else {
				array[k] = tempMergeArray[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergeArray[i];
			k++;
			i++;
		}
	}
}

























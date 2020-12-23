import java.util.*;

public class InsertionSort {

	public static void sort(int[] arr) {
		int length = arr.length;
		for(int i=0;i<length-1;i++) {
			int j=i+1;
			int key = arr[j];
			while(j > 0 && key < arr[j-1]) {
				swap(arr, j, j-1);
				j--;
			}
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = new int[] {64, 34, 25, 12, 22, 11, 90}; 
		System.out.println(Arrays.toString(arr));
		InsertionSort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}

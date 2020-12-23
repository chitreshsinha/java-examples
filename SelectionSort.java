import java.util.*;

public class SelectionSort {

	public static void sort(int[] arr) {
		int length = arr.length;
		for(int i=0;i<length;i++) {
			int minPos = i;
			for(int j=i+1;j<length;j++) {
				if(arr[j] < arr[minPos]) {
					minPos = j;
				}
			}
			swap(arr, minPos, i);
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
		SelectionSort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
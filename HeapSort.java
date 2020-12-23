import java.util.*;

public class HeapSort {

	public static void sort(int[] arr) {
		int n = arr.length;
		for(int i=n/2-1;i>=0;i--) {
			heapify(arr, n, i);
		}

		for(int i=n-1;i>0;i--) {
			swap(arr, i, 0);
			heapify(arr, i, 0);
		}
	}

	public static void heapify(int[] arr, int n, int i) {
		int largest = i;
		int left = 2*i + 1;
		int right = 2*i + 2;

		if(left < n && arr[left] > largest) {
			largest = left;
		} 
		if (right < n && arr[right] > largest) {
			largest = right;
		}

		if(largest!=i) {
			swap(arr, largest, i);
			heapify(arr, n, largest);
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
		MergeSort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
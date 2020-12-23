import java.util.*;

public class MergeSort {

	public static void sort(int[] arr) {
		mergeSort(arr, 0, arr.length-1);
	}

	public static void mergeSort(int[] arr, int start, int end) {
		if(start < end) {
			int mid = start + (end-start)/2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			merge(arr, start, mid, end);		
		}
	}

	public static void merge(int[] arr, int start, int mid, int end) {
		int[] newArr = new int[end-start+1];

		int i = start;
		int j = mid+1;
		int k = 0;

		while(i<=mid && j<=end) {
			if(arr[i] < arr[j]) {
				newArr[k++] = arr[i++];
			} else {
				newArr[k++] = arr[j++];
			}
		}

		while(i<=mid) {
			newArr[k++] = arr[i++];
		}

		while(j<=end) {
			newArr[k++] = arr[j++];
		}

		for(int x=start; x<=end; x++) {
			arr[x] = newArr[x-start];
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] {64, 34, 25, 12, 22, 11, 90}; 
		System.out.println(Arrays.toString(arr));
		MergeSort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
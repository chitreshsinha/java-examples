import java.util.Arrays;

public class BubbleSort {

	public static void sort(int[] arr) {
		int length = arr.length;
		for(int i=0;i<length-1;i++) {
			boolean swapped = false;
			for(int j=0;j<length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
					swapped = true;
				}
			}
			if(!swapped) {
				break;
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
		BubbleSort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}

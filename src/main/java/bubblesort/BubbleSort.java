package bubblesort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {6, 4, 1, 9, 3, 5, 12, 0, 2};
		countSwapsLina(numbers);
		bubbleSort(numbers);
	}
	
	static void bubbleSort(int[] a) {
		//se comparan las dos posiciones adyacentes
		int lower = 0;
		int swaps = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j+1]){
					lower = a[j+1];
					a[j+1] = a[j];
					a[j]  = lower;
					swaps++;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(swaps);
	}
	
	static void countSwapsLina(int[] a) {
		//ascending order   6, 4, 1
		int lower;
		int position = 0;
		int swaps = 0;
		
		for (int i = 0; i < a.length; i++) {
			lower = a[i];
			position = i;
			
			for (int j = i+1; j < a.length; j++) {
				if(lower > a[j]) {
					lower = a[j];
					position = j;
				}
			}
			//change data
			if (position != i) {
				a[position] = a[i];
				a[i] = lower;
				swaps++;
			}
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println(swaps);
    }

}

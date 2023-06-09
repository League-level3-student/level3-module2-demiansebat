package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}

	/*
	 * Bogo sort is a joke sorting algorithm. It is considered the most inefficient
	 * sorting algorithm while still maintaining the possibility of eventually
	 * sorting data.
	 * 
	 * It works by following these steps: STEP 1. Is the array in order? if yes,
	 * finished; if no, go to step 2. STEP 2. Take two random elements in the array
	 * and swap them. STEP 3. Go back to step 1.
	 */
	@Override
	void sort(int[] arr, SortingVisualizer display) {
		boolean inorder = true;
		int n = arr.length;
		Random a = new Random();
		int z = a.nextInt(arr.length);
		Random b = new Random();
		int x = b.nextInt(arr.length);

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				inorder = false;
			}
		}

		if (inorder == false) {
			System.out.println(z);
			System.out.println(x);
			int temp = arr[z];
			arr[z] = arr[x];
			arr[x] = temp;
			display.updateDisplay();
			sort(arr, display);
		}
	}
}

package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
    public BogoSorter() {
        type = "Bogo";
    }

    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    void sort(int[] arr, SortingVisualizer display) {
        boolean inorder;
        int n = arr.length;
    	for (int i = 0; i < n - 1; i++) {
			for (int k = 0; k < n - i - 1; k++) {
				if (arr[k] > arr[k + 1]) {
				inorder=false;
				}
				else{
					inorder=true;
				}
				if(inorder==false) {
					
				}
			}
    }
}}

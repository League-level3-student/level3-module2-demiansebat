package _00_Intro_to_Sorting_Algorithms;

import java.util.Iterator;

class _02_SwappingDigits {

    // 1. Complete the method so that the first two elements of the array are
    //    swapped.
    public static void swapArrayOfTwo(int[] arr) {
int a= arr[0];
int b= arr[1];
int temp=a;
arr[0]=b;
arr[1]=temp;

    }

    // 2. Complete the method so that it sorts the array using a bubble sort.
    //    Iterate through the array and when you find two elements that are out
    //    of order, swap them. Repeat this until the array is in order.
    public static void sortIntArray(int[] arr) {
for (int i = 1; i < arr.length+1; i++) {
	if(arr[i]< arr[i-1]) {
		for(int k=i; k<=0; k--) {
			if(arr[k]> arr[k-1]) {
			break;
			}
			int a= arr[k];
			int b= arr[k-1];
			int temp=a;
			arr[k]=b;
			arr[k-1]=temp;
		}
	}
}

    }

    // 3. Complete the method so that it finds the middle number in the array.
    //    *Hint* it helps to sort it first.
    //    *Double Hint* Use the method you already wrote in step 2 to sort it
    public static int findMiddle(int[] arr) {
        return 0;
    }
}

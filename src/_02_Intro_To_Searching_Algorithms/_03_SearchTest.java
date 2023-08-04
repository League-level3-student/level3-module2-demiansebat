package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import _00_Intro_to_Sorting_Algorithms._02_SwappingDigits;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
        String[] x = {"one", "two", "three", "four", "five", "six"}; 
        assertEquals(5, _01_LinearSearch.linearSearch(x,"six"));
        
        String[] y = {"a", "b", "c", "d", "e", "f"}; 
        assertEquals(5, _01_LinearSearch.linearSearch(y,"f"));
        
        String[] z = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen"}; 
        assertEquals(5, _01_LinearSearch.linearSearch(z,"fifteen"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int[] x= {1,2,3,4,5,6,7,8,9,10};
        assertEquals(5,_02_BinarySearch.binarySearch(x,1,10,6));
    }
}

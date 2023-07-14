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
        
        assertEquals(5, _01_LinearSearch.linearSearch(x,"five"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
        assertEquals(false, true);
    }
}

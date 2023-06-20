//--------------------------------------------
// Title: Selection sort class
// Author: Abdullah Doğanay
// ID: 10549887192
// Section: 2
// Assignment: 2
// Description: This class contains both descendign and ascending Selection sort methods and also the helper methods
//-------------------------------------------
import java.util.Comparator;

public class SelectionSort {

    public static void sort(Comparable[] a)
    //-----------------------------------------------------
    // Summary: This method is the sort method for selection algorithm for ascending order
    // Precondition: method takes the array.
    // Postcondition: array sorted
    //------------------------------------------------------
    {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (less(a[j], a[min])) min = j;
            }
            exch(a, i, min);
            assert isSorted(a, 0, i);
        }
        assert isSorted(a);
    }

    public static void sortDescending(Comparable[] a)
    //-----------------------------------------------------
    // Summary: This method is the sort method for selection algorithm for descending order
    // Precondition: method takes the array.
    // Postcondition: array sorted
    //------------------------------------------------------
    {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (greater(a[j], a[min])) min = j;
            }
            exch(a, i, min);
            assert isSortedDescending(a, 0, i);
        }
        assert isSortedDescending(a);
    }

    private static boolean greater(Comparable v, Comparable w)
    //-----------------------------------------------------
    // Summary: method which returns boolean value about the comparison
    // Precondition: method takes two comparable value.
    // Postcondition: if one of them greater than the other returns true.
    //------------------------------------------------------
    {
        return v.compareTo(w) > 0;
    }

    // is v < w ?
    private static boolean less(Comparable v, Comparable w)
    //-----------------------------------------------------
    // Summary: method which returns boolean value about the comparison
    // Precondition: method takes two comparable value.
    // Postcondition: if one of them smaller than the other returns true.
    //------------------------------------------------------
    {
        return v.compareTo(w) < 0;
    }




    private static void exch(Object[] a, int i, int j)
    //-----------------------------------------------------
    // Summary: this is a helper method for sorting algorithms. this method swap the elemenets of array
    // Precondition: method takes the indexes that we want to swap.
    // Postcondition: elements in the array has swaped
    //------------------------------------------------------
    {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    
     // is the array a[] sorted?
     private static boolean isSorted(Comparable[] a)
     //-----------------------------------------------------
     // Summary: This method returns boolean value according to if array is sorted or not to check for ascending order
     // Precondition: method takes the array.
     // Postcondition: boolean returns
     //------------------------------------------------------
     {
        return isSorted(a, 0, a.length - 1);
    }


    private static boolean isSorted(Comparable[] a, int lo, int hi)
    //-----------------------------------------------------
    // Summary: This method returns boolean value according to if array is sorted or not to check
    // Precondition: method takes the array.
    // Postcondition: boolean returns
    //------------------------------------------------------
    {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }

    private static boolean isSortedDescending(Comparable[] a, int lo, int hi)
    //-----------------------------------------------------
    // Summary: This method returns boolean value according to if array is sorted or not to check for descending order
    // Precondition: method takes the array.
    // Postcondition: boolean returns
    //------------------------------------------------------
    {
        for (int i = lo + 1; i <= hi; i++) {
            if (less(a[i - 1], a[i])) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSortedDescending(Comparable[] a)
    //-----------------------------------------------------
    // Summary: This method returns boolean value according to if array is sorted or not to check for descending order
    // Precondition: method takes the array.
    // Postcondition: boolean returns
    //------------------------------------------------------
    {
        return isSortedDescending(a, 0, a.length - 1);
    }

}

//--------------------------------------------
// Title: Insertion sort class
// Author: Abdullah Doğanay
// ID: 10549887192
// Section: 2
// Assignment: 2
// Description: This class contains both descendign and ascending insertion sort methods and also the helper methods
//-------------------------------------------
import java.util.Comparator;

public class InsertionSort {

    public static <Key extends Comparable<Key>> void sort(Key[] a)
    //-----------------------------------------------------
    // Summary: Method of Instertion sort algorithm (Ascending)
    // Precondition: mehtod takes the array.
    // Postcondition: array sorted
    //------------------------------------------------------
    {
        int n = a.length;
        for (int i = 1; i < n; i++)
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
                exch(a, j, j-1);
    }

    public static <Key extends Comparable<Key>> void sortDescending(Key[] a)
    //-----------------------------------------------------
    // Summary: Method of Instertion sort algorithm (Descending)
    // Precondition: mehtod takes the array.
    // Postcondition: array sorted
    //------------------------------------------------------
    {
        int n = a.length;
        for (int i = 1; i < n; i++)
            for (int j = i; j > 0 && !less(a[j], a[j-1]); j--)
                exch(a, j, j-1);
    }


    // is v < w ?
    private static <Key extends Comparable<Key>> boolean less(Key v, Key w)
    //-----------------------------------------------------
    // Summary: method which returns boolean value about the comparison
    // Precondition: method takes two comparable value.
    // Postcondition: if one of them smaller than the other returns true.
    //------------------------------------------------------
    {
        return v.compareTo(w) < 0;
    }

    // no need for generics here
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
}

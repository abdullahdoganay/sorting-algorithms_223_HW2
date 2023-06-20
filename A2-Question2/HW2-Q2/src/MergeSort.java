//--------------------------------------------
// Title: Merge sort class
// Author: Abdullah Doğanay
// ID: 10549887192
// Section: 2
// Assignment: 2
// Description: This class contains both descendign and ascending merge sort methods and also the helper methods
//-------------------------------------------
public class MergeSort {
    static void mergeAscending(Comparable[] array)
    //-----------------------------------------------------
    // Summary: this method calls merge sort methods for ascending sorting
    // Precondition: mehtod takes the array.
    // Postcondition: methods called
    //------------------------------------------------------
    {
        Comparable[] aux = new Integer[array.length];
        sort(array,aux,0,array.length-1);

    }

    static void mergeDescending(Comparable[] array)
    //-----------------------------------------------------
    // Summary: this method calls merge sort methods for descending sorting
    // Precondition: mehtod takes the array.
    // Postcondition: methods called
    //------------------------------------------------------
    {
        Comparable[] aux = new Integer[array.length];
        sortDescending(array,aux,0,array.length-1);

    }

    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi)
    //-----------------------------------------------------
    // Summary: this recursive method is ascending sorting part of the merge sort.
    // Precondition: mehtod takes the array. and its first and last index
    // Postcondition: methods called
    //------------------------------------------------------
    {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        mergeHelper(a, aux, lo, mid, hi);
    }

    private static void sortDescending(Comparable[] a, Comparable[] aux, int lo, int hi)
    //-----------------------------------------------------
    // Summary: this recursive method is descending sorting part of the merge sort.
    // Precondition: mehtod takes the array. and its first and last index
    // Postcondition: methods called
    //------------------------------------------------------
    {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sortDescending(a, aux, lo, mid);
        sortDescending(a, aux, mid+1, hi);
        mergeHelperDescending(a, aux, lo, mid, hi);
    }


    private static void mergeHelper(Comparable[] a, Comparable[] aux, int lo, int mid, int hi)
    //-----------------------------------------------------
    // Summary: this method exchanges the values according to comparison
    // Precondition: mehtod takes the array. and its first and last index
    // Postcondition: exchanged subarrays
    //------------------------------------------------------
    {
        for (int k = lo; k <= hi; k++)
            aux[k] = a[k];
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++)
        {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }

    private static void mergeHelperDescending(Comparable[] a, Comparable[] aux, int lo, int mid, int hi)
    //-----------------------------------------------------
    // Summary: this method exchanges the values according to comparison for descending orders
    // Precondition: mehtod takes the array. and its first and last index
    // Postcondition: exchanged subarrays
    //------------------------------------------------------
    {
        for (int k = lo; k <= hi; k++)
            aux[k] = a[k];
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++)
        {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (greater(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }



    private static boolean less(Comparable v ,Comparable w)
    //-----------------------------------------------------
    // Summary: method which returns boolean value about the comparison
    // Precondition: method takes two comparable value.
    // Postcondition: if one of them smaller than the other returns true.
    //------------------------------------------------------
    {
        return v.compareTo(w) < 0;
    }
    private static boolean greater(Comparable v , Comparable w)
    //-----------------------------------------------------
    // Summary: method which returns boolean value about the comparison
    // Precondition: method takes two comparable value.
    // Postcondition: if one of them greater than the other returns true.
    //------------------------------------------------------
    {
        return v.compareTo(w) > 0;
    }
}

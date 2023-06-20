//--------------------------------------------
// Title: Quick sort class
// Author: Abdullah Doğanay
// ID: 10549887192
// Section: 2
// Assignment: 2
// Description: This class contains both descendign and ascending quick sort methods and also the helper methods
//-------------------------------------------
public class QuickSort {
    static void quick(Comparable[] array)
    //-----------------------------------------------------
    // Summary: this method calls quick sort methods for ascending sorting
    // Precondition: mehtod takes the array.
    // Postcondition: methods called
    //------------------------------------------------------
    {
        StdRandom.shuffle(array);
        sort(array, 0, array.length - 1);


    }
    static void quickDescending(Comparable[] array)
    //-----------------------------------------------------
    // Summary: this method calls quick sort methods for descending sorting
    // Precondition: mehtod takes the array.
    // Postcondition: methods called
    //------------------------------------------------------
    {
        StdRandom.shuffle(array);
        sortDescending(array, 0, array.length - 1);


    }
    private static int partition(Comparable[] a, int lo, int hi)
    //-----------------------------------------------------
    // Summary: this method partition the array to prepare the comparison for ascending order sorting
    // Precondition: mehtod takes the array and its first and last index.
    // Postcondition: array partitioned
    //------------------------------------------------------
    {
        int i = lo, j = hi+1;
        while (true)
        {
            while (less(a[++i], a[lo]))
                if (i == hi) break;
            while (less(a[lo], a[--j]))
                if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private static int partitionDescending(Comparable[] a, int lo, int hi)

    //-----------------------------------------------------
    // Summary: this method partition the array to prepare the comparison for descending order sorting and also exchanges the elements.
    // Precondition: mehtod takes the array and its first and last index.
    // Postcondition: array partitioned
    //------------------------------------------------------
    {
        int i = lo, j = hi+1;
        while (true)
        {
            while (greater(a[++i], a[lo]))
                if (i == hi) break;
            while (greater(a[lo], a[--j]))
                if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private static void sort(Comparable[] a, int lo, int hi)
    //-----------------------------------------------------
    // Summary: this recursive method calls parts of array for ascending order
    // Precondition: mehtod takes the array and its first and last index.
    // Postcondition:
    //------------------------------------------------------
    {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    private static void sortDescending(Comparable[] a, int lo, int hi)
    //-----------------------------------------------------
    // Summary: this recursive method calls parts of array for descending order
    // Precondition: mehtod takes the array and its first and last index.
    // Postcondition:
    //------------------------------------------------------
    {
        if (hi <= lo) return;
        int j = partitionDescending(a, lo, hi);
        sortDescending(a, lo, j-1);
        sortDescending(a, j+1, hi);
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

    private static void exch(Comparable[] array,int i, int j)
    //-----------------------------------------------------
    // Summary: this is a helper method for sorting algorithms. this method swap the elemenets of array
    // Precondition: method takes the indexes that we want to swap.
    // Postcondition: elements in the array has swaped
    //------------------------------------------------------
    {
        Comparable swap = array[i];
        array[i] = array[j];
        array[j] = swap;

    }
    }

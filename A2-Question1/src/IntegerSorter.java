public class IntegerSorter {

    public static void sortIntegers(int[] a) {
        // Sort a[] into increasing order.
        int N = a.length;
        for (int i = 1; i < N; i++)
        {  // Insert a[i] among a[i-1], a[i-2], a[i-3]... ..
            for (int j = i; j > 0 && lessForIntegers(a[j], a[j-1]); j--)
                exchForIntegers(a, j, j-1);
        }
    }

    public static void ModifiedSortForIntegers(int[] a) {
        // Sort a[] into increasing order.
        int N = a.length;
        for (int i = N-1; i > 0; i--)
        {  // Insert a[i] among a[i-1], a[i-2], a[i-3]... ..
            for (int j = i; j < N && !lessForIntegers(a[j], a[j-1]); j++)
                exchForIntegers(a, j, j-1);
        }
    }

    public static void merge(int[] a, int lo, int mid, int hi)
  {  // Merge a[lo..mid] with a[mid+1..hi].
     int i = lo, j = mid+1;
     for (int k = lo; k <= hi; k++)  // Copy a[lo..hi] to aux[lo..hi].
        aux[k] = a[k];
     for (int k = lo; k <= hi; k++)  // Merge back to a[lo..hi].
        if      (i > mid)              a[k] = aux[j++];
        else if (j > hi )              a[k] = aux[i++];
        else if (aux[j] > aux[i]) a[k] = aux[j++];
        else                           a[k] = aux[i++];
}

    private static int[] aux;      // auxiliary array for merges
     public static void mergeSort(int[] a, int lo, int hi)
     {  // Sort a[lo..hi].
        if (hi <= lo) return;
        int mid = lo + (hi - lo)/2;
        mergeSort(a, lo, mid);       // Sort left half.
        mergeSort(a, mid+1, hi);
        aux = new int[a.length];      // Sort right half.
        merge(a, lo, mid, hi);  // Merge results (code on page 271).
}


    private static boolean lessForIntegers(int v, int w) {
        return v < w;
    }

    private static void exchForIntegers(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}

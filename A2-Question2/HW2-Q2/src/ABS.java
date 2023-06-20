import java.util.Scanner;
import java.lang.Math;

public class ABS {
    public static void main(String[] args) {
        String operation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sort you want to use:");
        operation = scanner.nextLine();
        String inputArray;
        String[] stringArray;
        int[] intArray = new int[10];
        boolean opIns = operation.equalsIgnoreCase("insertion");
        boolean opMerge = operation.equalsIgnoreCase("merge");
        boolean opSel = operation.equalsIgnoreCase("selection");
        boolean opNo = operation.equalsIgnoreCase("noSort");
        boolean opQuick = operation.equalsIgnoreCase("quick");
        if(opSel){
            System.out.println("Enter array:");
            inputArray = scanner.nextLine();
            stringArray = inputArray.split(" ");
            for (int i = 0; i<stringArray.length; i++) {
                intArray[i] = Integer.parseInt(stringArray[i]);
            }
            smallestNumberVSorted(intArray);
        }
        if(opIns){
            System.out.println("Enter array:");
            inputArray = scanner.nextLine();
            stringArray = inputArray.split(" ");
            for (int i = 0; i<stringArray.length; i++) {
                intArray[i] = Integer.parseInt(stringArray[i]);
            }
            insertionSort(intArray);
        }
        if(opMerge){
            System.out.println("Enter array:");
            inputArray = scanner.nextLine();
            stringArray = inputArray.split(" ");
            for (int i = 0; i<stringArray.length; i++) {
                intArray[i] = Integer.parseInt(stringArray[i]);
            }
            mergeSort(intArray, 0,intArray.length-1 );
            printMinABSvSorting(intArray);
        }
        if(opNo){
            System.out.println("Enter array:");
            inputArray = scanner.nextLine();
            stringArray = inputArray.split(" ");
            for (int i = 0; i<stringArray.length; i++) {
                intArray[i] = Integer.parseInt(stringArray[i]);
            }
            printMinABSvOutSorting(intArray);
        }
    }

    public static void printMinABSvSorting(int[] a){
        int fark = (a[1]-a[0]);
        int smallestFarkIndex = 0;
        for(int i = 0; i<a.length-1; i++){
            if(fark > (a[i+1]-a[i])){
                fark = a[i+1]-a[i];
                smallestFarkIndex = i;
            }
        }
        System.out.println("ABS:" + fark + ", " + "Min=" + a[smallestFarkIndex] + ", Max=" + a[smallestFarkIndex+1]);
    }
    public static void printMinABSvOutSorting(int[] a){
        int fark = Math.abs(a[1]-a[0]);
        int smallestFarkIndex1 = 0;
        int smallestFarkIndex2 = 0;
        for(int i = 0; i<a.length-1; i++){
            for(int j = 0; j<a.length; j++){
                if(fark > Math.abs(a[i]-a[j])){
                    if(a[i] == a[j]){
                        break;
                    }
                    fark = Math.abs(a[i]-a[j]);
                    if(a[j]<a[i]){
                        smallestFarkIndex1 = j;
                        smallestFarkIndex2 = i;
                    } else if (a[i]<a[j]) {
                        smallestFarkIndex1 = i;
                        smallestFarkIndex2 = j;
                    }
                }
            }

        }
        System.out.println("ABS:" + fark + ", " + "Min=" + a[smallestFarkIndex1] + ", Max=" + a[smallestFarkIndex2]);
    }

    public static void insertionSort(int[] a)
    {  // Sort a[] into increasing order.
        int N = a.length;
        for (int i = 1; i < N; i++)
        {  // Insert a[i] among a[i-1], a[i-2], a[i-3]... ..
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
                exch(a, j, j-1);
        }
        printMinABSvSorting(a);
    }

    private static boolean less(int v, int w)
    {  return v<w;  }
    private static void exch(int[] a, int i, int j)
    {  int t = a[i]; a[i] = a[j]; a[j] = t;  }

    public static void merge(int[] a, int lo, int mid, int hi)
    {  // Merge a[lo..mid] with a[mid+1..hi].
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++)  // Copy a[lo..hi] to aux[lo..hi].
            aux[k] = a[k];
        for (int k = lo; k <= hi; k++)  // Merge back to a[lo..hi].
            if      (i > mid)              a[k] = aux[j++];
            else if (j > hi )              a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else                           a[k] = aux[i++];


    }

    private static int[] aux;      // auxiliary array for merges

    public static void mergeSort(int[] a, int lo, int hi)
    {  // Sort a[lo..hi].
        if (hi <= lo) return;
        int mid = lo + (hi - lo)/2;
        aux = new int[a.length];
        mergeSort(a, lo, mid);       // Sort left half.
        mergeSort(a, mid+1, hi);     // Sort right half.
        merge(a, lo, mid, hi);  // Merge results (code on page 271).

    }


    private static void sort(Comparable[] a, int lo, int hi)
    {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);  // Partition (see page 291).
        sort(a, lo, j-1);              // Sort left part a[lo .. j-1].
        sort(a, j+1, hi);              // Sort right part a[j+1 .. hi].
    }

    private static int partition(Comparable[] a, int lo, int hi)
    {  // Partition into a[lo..i-1], a[i], a[i+1..hi].
        int i = lo, j = hi+1;            // left and right scan indices
        Comparable v = a[lo];            // partitioning item
        while (true)
        {  // Scan right, scan left, check for scan complete, and exchange.
            while (less(a[++i], v)) if (i == hi) break;
            while (less(v, a[--j])) if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private static boolean less(Comparable v, Comparable w)
    {  return v.compareTo(w) < 0;  }
    private static void exch(Comparable[] a, int i, int j)
    {  Comparable t = a[i]; a[i] = a[j]; a[j] = t;  }

    public static void selectionSort(int[] a){
        int n = a.length;
        for (int i = 1; i < n; ++i) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
    }

    public static void smallestNumberVSorted(int[] a){
        selectionSort(a);
        printMinABSvSorting(a);
    }
}

public class Student implements Comparable<Student>{
    String name;
    long id;
    int semesterNo;


    @Override
    public int compareTo(Student o) {
        if(id > o.id)  return 1;
        if(id < o.id)  return -1;
        if(id == o.id){
            if(semesterNo > o.semesterNo) return 1;
            if(semesterNo < o.semesterNo) return -1;
            if(semesterNo == o.semesterNo) {
                if(name.compareTo(o.name) < 0) return -1;
                if(name.compareTo(o.name) > 0) return 1;
                if(name.compareTo(o.name) == 0) return 0;
            }
        } 
        return 0;
        
    }

    public static void sort(Comparable[] a)
     {
        StdRandom.shuffle(a);          // Eliminate dependence on input.
        sort(a, 0, a.length - 1);
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
        exchForStudents(a, i, j);
}
        exchForStudents(a, lo, j);
        return j;
  }


  private static boolean less(Comparable v, Comparable w) {
    if (v == w) return false;   // optimization when reference equals
    return v.compareTo(w) < 0;
}

  private static void exchForStudents(Comparable[] a, int i, int j) {
    Comparable temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}

public static void modifiedSort(Comparable[] a)
     {
        StdRandom.shuffle(a);          // Eliminate dependence on input.
        modifiedSort(a, 0, a.length - 1);
     }

     private static void modifiedSort(Comparable[] a, int lo, int hi)
     {
        if (hi <= lo) return;
        int j = modifiedPartition(a, lo, hi);  // Partition (see page 291).
        modifiedSort(a, j+1, hi);              // Sort left part a[lo .. j-1].
        modifiedSort(a, lo, j-1);              // Sort right part a[j+1 .. hi].
}

    private static int modifiedPartition(Comparable[] a, int lo, int hi)
  {  // Partition into a[lo..i-1], a[i], a[i+1..hi].
     int i = lo, j = hi+1;            // left and right scan indices
     Comparable v = a[lo];            // partitioning item
     while (true)
     {  // Scan right, scan left, check for scan complete, and exchange.
        while (!less(a[++i], v)) if (i == hi) break;
        while (!less(v, a[--j])) if (j == lo) break;
        if (i >= j) break;
        exchForStudents(a, i, j);
}
        exchForStudents(a, lo, j);
        return j;
  }


// Put v = a[j] into position
// with a[lo..j-1] <= a[j] <= a[j+1..hi].


    // public static void sortStudents(Student[] a){
    //     int N = a.length;
    //     for(int i =0; i<N-1; i++){
    //         for (int j = i; j>0 && lessForLongs(a[j].id,a[j+1].id); j--){
    //             exchForStudents(a,j,j-1);
    //         }
    //     }
    // }
}

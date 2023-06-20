public class DoubleSorter {

    public static void sortDoubles(double[] a) {
        // Sort a[] into increasing order.
        int N = a.length;
        for (int i = 1; i < N; i++)
        {  // Insert a[i] among a[i-1], a[i-2], a[i-3]... ..
            for (int j = i; j > 0 && lessForDoubles(a[j], a[j-1]); j--)
                exchForDoubles(a, j, j-1);
        }
    }

    private static boolean lessForDoubles(double v, double w) {
        return v < w;
    }

    private static void exchForDoubles(double[] a, int i, int j) {
        double temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
}

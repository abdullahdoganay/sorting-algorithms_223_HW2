//----------------------------------
// Title: pairwise abs. value finder class
// Author: Abdullah Doğanay
// ID: 10549887192
// Section: 2
// Assignment: 2
// Description: This class contains the methods of finding abs.
//-----------------------------------

import java.lang.Math;
public class FindABS {
    /*public static void printMinABSvSortin(Comparable[] a){
        int fark = ((int)a[1]-(int)a[0]);
        int smallestFarkIndex = 0;
        for(int i = 0; i<a.length-1; i++){
            if(fark > ((int)a[i+1]-(int)a[i])){
                fark = (int)a[i+1]-(int)a[i];
                smallestFarkIndex = i;
            }
        }
        System.out.println("ABS:" + fark + ", " + "Min=" + a[smallestFarkIndex] + ", Max=" + a[smallestFarkIndex+1]);
    }*/


    /*public static void printMinABSvSortingX(Comparable[] a){
        long fark = Long.MAX_VALUE;
        int smallestFarkIndex1 = 0;
        int smallestFarkIndex2 = 0;
        for(int i = 0; i<a.length-1; i++){
            for(int j = 1; j<a.length; j++){
                if(fark > Math.abs((long)(int)a[i]-(int)a[j]) && i!=j){
                    fark = Math.abs((long)((int)a[i]-(int)a[j]));
                    if((int)a[j]<(int)a[i]){
                        smallestFarkIndex1 = j;
                        smallestFarkIndex2 = i;
                    } else if ((int)a[i]<(int)a[j]) {
                        smallestFarkIndex1 = i;
                        smallestFarkIndex2 = j;
                    }
                }
            }

        }
        System.out.println(fark + " " + "["+a[smallestFarkIndex1] + " " + a[smallestFarkIndex2] + "]");
    }*/

    public static void noSortFind(Comparable[] a){
        int n = a.length;
        long fark = Long.MAX_VALUE;
        int minValue = 0;
        int maxValue = 0;
        for(int i = 0; i<n; i++){
            for(int j = 1+i; j<n; j++){
                if(Math.abs((long)((int)a[i]-(int)a[j])) <= fark && i!=j){
                    fark = Math.abs((int)a[i]-(int)a[j]);
                    if((int)a[i] < (int)a[j]){
                        minValue = (int)a[i];
                        maxValue = (int)a[j];
                    }
                    else {
                        minValue = (int)a[j];
                        maxValue = (int)a[i];
                    }
                }

            }
        }
        System.out.println(fark+" ["+minValue+" "+maxValue+"]");
    }


}

//--------------------------------------------
// Title: Tester - Main class
// Author: Abdullah Doğanay
// ID: 10549887192
// Section: 2
// Assignment: 2
// Description: This class contains main method and prints of project
//-------------------------------------------
import java.util.Scanner;
import java.util.Random;

public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a seed to create random generated values :");
        long seed = scan.nextLong();
        System.out.println("Seed: "+ seed);

        //long time;

        Random random = new Random(seed);
        Integer[] arr;
        for(int x=250; x<=64000; x=x*4){
            arr = new Integer[x];
            for(int i = 0; i<x; i++){
                arr[i] = random.nextInt();
            }

            System.out.println();
            System.out.println("Input size: "+ x);
            System.out.println();

            System.out.println("Sort option: Selection");
            System.out.println("Random");
            for(int i=1; i<=3; i++){
                //time = System.currentTimeMillis();
                FindABS.noSortFind(arr);

                //System.out.println("time: " + (System.currentTimeMillis()-time));
            }

            System.out.println("Ascending");
            for(int i=1; i<=3; i++){
                //time = System.currentTimeMillis();
                SelectionSort.sort(arr);
                FindABS.noSortFind(arr);
                //System.out.println("time: " + (System.currentTimeMillis()-time));
                StdRandom.shuffle(arr);
            }

            System.out.println("Descending");
            for(int i=1; i<=3; i++){
                //time = System.currentTimeMillis();
                SelectionSort.sortDescending(arr);
                FindABS.noSortFind(arr);
                //System.out.println("time: " + (System.currentTimeMillis()-time));
                StdRandom.shuffle(arr);
            }

            System.out.println("Sort option: Insertion");
            System.out.println("Random");
            for(int i=1; i<=3; i++){
                //time = System.currentTimeMillis();
                FindABS.noSortFind(arr);
                //System.out.println("time: " + (System.currentTimeMillis()-time));
                StdRandom.shuffle(arr);
            }

            System.out.println("Ascending");
            for(int i=1; i<=3; i++){
                //time = System.currentTimeMillis();
                InsertionSort.sort(arr);
                FindABS.noSortFind(arr);
                //System.out.println("time: " + (System.currentTimeMillis()-time));
                StdRandom.shuffle(arr);
            }


            System.out.println("Descending");
            for(int i=1; i<=3; i++){
                //time = System.currentTimeMillis();
                InsertionSort.sortDescending(arr);
                FindABS.noSortFind(arr);
                //System.out.println("time: " + (System.currentTimeMillis()-time));
                StdRandom.shuffle(arr);
            }

            System.out.println("Sort option: Merge");
            System.out.println("Random");
            for(int i=1; i<=3; i++){
                //time = System.currentTimeMillis();
                FindABS.noSortFind(arr);
                //System.out.println("time: " + (System.currentTimeMillis()-time));
                StdRandom.shuffle(arr);
            }

            System.out.println("Ascending");
            for(int i=1; i<=3; i++){
                //time = System.currentTimeMillis();
                MergeSort.mergeAscending(arr);
                FindABS.noSortFind(arr);
                //System.out.println("time: " + (System.currentTimeMillis()-time));
                StdRandom.shuffle(arr);
            }

            System.out.println("Descending");
            for(int i=1; i<=3; i++){
                //time = System.currentTimeMillis();
                MergeSort.mergeDescending(arr);
                FindABS.noSortFind(arr);
                //System.out.println("time: " + (System.currentTimeMillis()-time));
                StdRandom.shuffle(arr);
            }

            System.out.println("Sort option: Quick");
            System.out.println("Random");
            for(int i=1; i<=3; i++){
                //time = System.currentTimeMillis();
                FindABS.noSortFind(arr);
                //System.out.println("time: " + (System.currentTimeMillis()-time));
                StdRandom.shuffle(arr);
            }

            System.out.println("Ascending");
            for(int i=1; i<=3; i++){
                //time = System.currentTimeMillis();
                QuickSort.quick(arr);
                FindABS.noSortFind(arr);
                //System.out.println("time: " + (System.currentTimeMillis()-time));
                StdRandom.shuffle(arr);
            }

            System.out.println("Descending");
            for(int i=1; i<=3; i++){
                //time = System.currentTimeMillis();
                QuickSort.quickDescending(arr);
                FindABS.noSortFind(arr);
                //System.out.println("time: " + (System.currentTimeMillis()-time));
                StdRandom.shuffle(arr);
            }


            System.out.println("Sort option: NoSort");
            System.out.println("Random");
            for(int i=1; i<=3; i++){
                //time = System.currentTimeMillis();
                FindABS.noSortFind(arr);
                //System.out.println("time: " + (System.currentTimeMillis()-time));
                StdRandom.shuffle(arr);
            }

            System.out.println("Ascending");
            for(int i=1; i<=3; i++){
                //time = System.currentTimeMillis();
                FindABS.noSortFind(arr);
                //System.out.println("time: " + (System.currentTimeMillis()-time));
                StdRandom.shuffle(arr);
            }

            System.out.println("Descending");
            for(int i=1; i<=3; i++){
                //time = System.currentTimeMillis();
                FindABS.noSortFind(arr);
                //System.out.println("time: " + (System.currentTimeMillis()-time));
                StdRandom.shuffle(arr);
            }

        }

    }
}

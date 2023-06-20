/*
import java.util.Scanner;

public class Main123 {
    public static void main(String[] args) {
        String operation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sorting options:");
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
            SelectionSort.smallestNumberVSorted(intArray);
        }
        if(opIns){
            System.out.println("Enter array:");
            inputArray = scanner.nextLine();
            stringArray = inputArray.split(" ");
            for (int i = 0; i<stringArray.length; i++) {
                intArray[i] = Integer.parseInt(stringArray[i]);
            }
            InsertionSort.insertionSortAscending(intArray);
        }
        if(opMerge){
            System.out.println("Enter array:");
            inputArray = scanner.nextLine();
            stringArray = inputArray.split(" ");
            for (int i = 0; i<stringArray.length; i++) {
                intArray[i] = Integer.parseInt(stringArray[i]);
            }
            MergeSort.mergeSort(intArray, 0,intArray.length-1 );
            FindABS.printMinABSvSorting(intArray);
        }
        if(opNo){
            System.out.println("Enter array:");
            inputArray = scanner.nextLine();
            stringArray = inputArray.split(" ");
            for (int i = 0; i<stringArray.length; i++) {
                intArray[i] = Integer.parseInt(stringArray[i]);
            }
            FindABS.printMinABSvOutSortingQ2(intArray);
        }
    }
}

*/

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String integerFile = "integers.txt";
        Path integerPath = Paths.get(integerFile);
        List<String> integerLines = Files.readAllLines(integerPath, StandardCharsets.UTF_8);

        String studentFile = "student.txt";
        Path studentPath = Paths.get(studentFile);
        List<String> studentLines = Files.readAllLines(studentPath, StandardCharsets.UTF_8);

        String doubleFile = "doubles.txt";
        Path doublePath = Paths.get(doubleFile);
        List<String> doubleLines = Files.readAllLines(doublePath, StandardCharsets.UTF_8);

        Student[] arrayOfStudents = new Student[studentLines.size()];
        for(int i=0; i<=studentLines.size()-1; i++){
            Student s = new Student();
            String[] arr = studentLines.get(i).split(",");
            s.name = arr[0];
            s.id = Long.parseLong(arr[1]);
            s.semesterNo = Integer.parseInt(arr[2]);
            arrayOfStudents[i] = s;
        }

        int[] arrayOfIntegers = new int[integerLines.size()-1];
        for (int i = 1; i <= integerLines.size()-1; i++) {
            arrayOfIntegers[i-1] = Integer.parseInt(integerLines.get(i));
        }

        int[] arrayOfIntegers2 = new int[integerLines.size()-1];
        for (int i = 1; i <= integerLines.size()-1; i++) {
            arrayOfIntegers2[i-1] = Integer.parseInt(integerLines.get(i));
        }

        double[] arrayOfDoubles = new double[doubleLines.size()-1];
        for (int i = 1; i <= doubleLines.size()-1; i++) {
            arrayOfDoubles[i-1] = Double.parseDouble(doubleLines.get(i));
        }

        System.out.println("Integers are reading from the integers.txt file, the array is:");
        for(int i = 0; i<arrayOfIntegers.length; i++){
            System.out.print(arrayOfIntegers[i]+ " ");
        }
        System.out.println();

        IntegerSorter.sortIntegers(arrayOfIntegers);
        System.out.println("The array has been sorted in increasing order by using the insertion sort algorithm:");
        for(int i = 0; i<arrayOfIntegers.length; i++){
            System.out.print(arrayOfIntegers[i]+ " ");
        }
        System.out.println();
        System.out.println("Step 1 has been completed.");
        System.out.println();


        IntegerSorter.ModifiedSortForIntegers(arrayOfIntegers);
        System.out.println("The array of integers that has been sorted in decreasing order by using the insertion sort algorithm:");
        for(int i = 0; i<arrayOfIntegers.length; i++){
            System.out.print(arrayOfIntegers[i]+ " ");
        }
        System.out.println();
        System.out.println("Step 2 has been completed.");
        System.out.println();
        
        System.out.println("Doubles are reading from the doubles.txt file, the array is:");
        for(int i= 0; i< arrayOfDoubles.length; i++){
            System.out.print(arrayOfDoubles[i]+ " ");
        }
        System.out.println();
        System.out.println("The array of double values has been sorted in increasing order by using the insertion sort algorithm:");
        DoubleSorter.sortDoubles(arrayOfDoubles);
        for(int i= 0; i< arrayOfDoubles.length; i++){
            System.out.print(arrayOfDoubles[i]+ " ");
        }
        System.out.println();
        System.out.println("Step 3 has been completed.");
        System.out.println();

        System.out.println("The original array is:");
        for(int i = 0; i< arrayOfIntegers2.length; i++){
            System.out.print(arrayOfIntegers2[i]+" ");
        }
        System.out.println();
        System.out.println("The array of integer values has been sorted in descending order by using the merge sort algorithm is:");
        IntegerSorter.mergeSort(arrayOfIntegers2, 0, arrayOfIntegers2.length-1);
        for(int i = 0; i< arrayOfIntegers2.length; i++){
            System.out.print(arrayOfIntegers2[i]+" ");
        }
        System.out.println();
        System.out.println("Step 4 has been completed.");
        System.out.println();


        Student.sort(arrayOfStudents); 
         for (int i = 0; i<arrayOfStudents.length; i++){
             System.out.println(arrayOfStudents[i].id + ": " + arrayOfStudents[i].name +" " + arrayOfStudents[i].semesterNo);
         }
         System.out.println();
         System.out.println("Step 6 has been completed.");
         System.out.println();

         Student.modifiedSort(arrayOfStudents); 
         for (int i = 0; i<arrayOfStudents.length; i++){
            System.out.println(arrayOfStudents[i].id + ": " + arrayOfStudents[i].name +" " + arrayOfStudents[i].semesterNo);
        }
        System.out.println();
        System.out.println("Step 7 has been completed.");
        System.out.println();

        
        



    }

    
}
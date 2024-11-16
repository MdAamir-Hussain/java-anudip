import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initialize the array
        int[] arr = new int[n];

        //input for array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

       
        Arrays.sort(arr);

        // Displaying
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

       
        scanner.close();
    }
}


// PS F:\java-anudip> javac .\SortArray.java
// PS F:\java-anudip> java .\SortArray.java 
// Enter the number of elements in the array: 5
// Enter the elements of the array:
// 4 12 3 0 8
// Sorted array:
// 0 3 4 8 12 
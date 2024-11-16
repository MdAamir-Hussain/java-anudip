import java.util.Scanner;

public class Lastbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Using bitwise AND operation to isolate the last bit
        int lastBit = num & 1;
        

        System.out.println("The last bit of " + num + " is: " + lastBit);
        sc.close();
    }
}



// PS F:\java-anudip> javac .\Lastbit.java 
// PS F:\java-anudip> java .\Lastbit.java 
// Enter a number: 100111
// The last bit of 100111 is: 1
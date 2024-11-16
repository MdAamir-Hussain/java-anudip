import java.util.Scanner;

public class Greatest_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first no: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second no: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third no: ");
        int num3 = sc.nextInt();

        int greatest;

        //  if-else 
        if (num1 >= num2) {
            if (num1 >= num3) {
                greatest = num1;
            } else {
                greatest = num3;
            }
        } else {
            if (num2 >= num3) {
                greatest = num2;
            } else {
                greatest = num3;
            }
        }

        System.out.println("The greatest number is: " + greatest);


        sc.close();
    }
}



// PS F:\java-anudip> javac .\Greatest_three.java 
// PS F:\java-anudip> java .\Greatest_three.java 
// Enter the first no: 15
// Enter the second no: 19
// Enter the third no: 7
// The greatest number is: 19
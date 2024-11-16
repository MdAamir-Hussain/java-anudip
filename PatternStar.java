public class PatternStar {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pyramid

        for (int i = 1; i <= rows; i++) {
            // Print asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}



// PS F:\java-anudip> javac .\PatternStar.java 
// PS F:\java-anudip> java .\PatternStar.java 
// *
// **
// ***
// ****
// *****
public class Calculator {

    public static void main(String[] a) {

        if (a.length != 3) {
            System.out.println("Usage: java Calculator <operation> <num1> <num2>");
            System.out.println("Operations: +, -, *, /, %");
            return;
        }

        String operation = a[0];
        double num1 = Double.parseDouble(a[1]);
        double num2 = Double.parseDouble(a[2]);
        double result = 0;

        if (operation.equals("+")) {
            result = num1 + num2;
        } else if (operation.equals("-")) {
            result = num1 - num2;
        } else if (operation.equals("*")) {
            result = num1 * num2; 
        } else if (operation.equals("/")) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero");
                return;
            }
        } else if (operation.equals("%")) {
            if (num2 != 0) {
                result = num1 % num2;
            } else {
                System.out.println("Error: Division by zero");
                return;
            }
        } else {
            System.out.println("Error: Unsupported operation");
            return;
        }

        System.out.println("Result: " + result);
    }
}

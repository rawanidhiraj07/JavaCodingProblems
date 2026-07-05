package FirstJavaProgram;

import java.util.Scanner;

public class OperatorCalculator {
    public static void main(String[] args) {
// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Number");
        int num1 = scan.nextInt();

        System.out.println("Enter Second Number");
        int num2 = scan.nextInt();

        System.out.println("Enter operator(+, -, *, /):");
        char operator = scan.next().charAt(0);

        double result = 0;

        if (operator == '+') {

            result = num1 + num2;

        }
        if (operator == '-') {
            result = num1 - num2;

        }
        if (operator == '*') {

            result = num1 * num2;

        }
        if (operator == '/') {

            result = num1 / num2;

            if (num2 != 0) {

                result = (double) num1 / num2;

            } else {
                System.out.println("Division by zero is not allowed");
                return;
            }
        }
        System.out.println("Result: " + result);

        scan.close();
    }
}

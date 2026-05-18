package Arrays;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a first number");
        int num1 = scan.nextInt();

        System.out.println("Enter a second number");
        int num2 = scan.nextInt();

        System.out.println("Enter a third number");
        int num3 = scan.nextInt();


        int result1 = sum(num1, num2);
        int result2 = sum(num1, num2, num3);
        double result3 = sum(num1,num2);

        System.out.println("Sum of two integer: " + result1);
        System.out.println("Sum of three integer: " + result2);
        System.out.println("Sum of two double: " + result3);

    }
    public static int sum(int a, int b) {

        return a + b;
    }
    public static int sum(int a, int b, int c) {

        return a + b + c;
    }
    public static double sum(double a, double b) {

        return a + b;
    }


}

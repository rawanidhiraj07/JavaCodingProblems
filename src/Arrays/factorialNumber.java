package Arrays;

import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter A Given Factorial Number:");

        int number = scan.nextInt();

        int res = factorial(number);

        System.out.println("Factorial Number: " + res);
    }

    public static int factorial(int num) {

        int fact = 1;

        for (int i = 1; i <= num; i++) {

            fact = fact * i;

        }
        return fact;
    }


}


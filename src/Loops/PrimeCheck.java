package Loops;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter A Given Number:");
        int num = scan.nextInt();

        if (primeNumber(num)) {

            System.out.println(num + " is prime number");

        } else {
            System.out.println(num + " is not prime number");
        }

    }

    public static boolean primeNumber(int n) {

        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;

        }
        return true;
    }


}
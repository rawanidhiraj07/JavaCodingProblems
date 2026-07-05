package FirstJavaProgram;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter A Given Number: ");
        int num = scan.nextInt();

        if (num % 2 == 0) {

            System.out.println(num + " is an even number: ");

        } else {
            System.out.println(num + " is an odd number ");
        }
    }
}

package FlowOfProgram;

import java.util.Scanner;

public class PrintTheMultiplicationTable {
    public static void main(String[] args) {
        //  Take a number as input and print the multiplication table for it.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scan.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(number + " * " + i + " = " + (number* i));
        }
    }
}

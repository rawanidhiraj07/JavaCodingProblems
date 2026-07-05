package FirstJavaProgram;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
// To calculate Fibonacci Series up to n numbers
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter n:");
        int num = scan.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci series");

        for (int i = 0; i < num; i++) {

            System.out.print(first +  " ");

            int next = first + second;

            first = second;
            second = next;


        }
          scan.close();
    }
}

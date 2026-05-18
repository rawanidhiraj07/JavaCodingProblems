package Loops;

import java.util.Scanner;

public class SumOfEvenNumbers1ToN {
    public static class test {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter A Given Number:");
            int num = scan.nextInt();

            int sum = 0;

            for (int i = 1; i <= num; i++) {

                if (i % 2 == 0) {

                    sum += i;

                }
            }

                System.out.println("sum of even numbers from 1 to " +num+ " is :" + sum);
            }
        }
}

package FlowOfProgram;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scan.nextInt();

        int res = 0;

        for (int i = 0; i <= num; i++) {

            res += i;
        }
         System.out.println("Sum N Natural Number: " + res);

    }

}

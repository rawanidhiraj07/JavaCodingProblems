package FlowOfProgram;

import java.util.Scanner;

public class SumUntilExit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0;

        while (true) {

            System.out.println("Enter a number or x to stop: ");

            String input = scan.next();

            if (input.equals("x")) {

                break;
            }
            int num = Integer.parseInt(input);

            sum += num;

        }
        System.out.println("Total sum = " + sum);


    }

}

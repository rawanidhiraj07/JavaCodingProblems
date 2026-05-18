package FlowOfProgram;
import java.util.*;
public class SumOfTwoNumbers {
    public static void main(String[] args){
        //Take two numbers and print the sum of both.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a first number");
        int num1 = scan.nextInt();

        System.out.println("Enter a second number");
        int num2 = scan.nextInt();

        int result = num1 + num2;

        System.out.println("Sum Of Two Numbers: " + result);
    }
}

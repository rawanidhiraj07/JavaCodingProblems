package FirstJavaProgram;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        //Write a program to input principal,time, and rate (P, T, R) from the user and find Simple Interest.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Total Amount");
        int amount = scan.nextInt();

        System.out.println("Enter a Interest");
        double interest = scan.nextDouble();

        System.out.println("Enter year");
        int year = scan.nextInt();

        double principle = amount * year * interest / 100;

        System.out.println(principle + " Simple interest:  " + principle );
    }
}

package Loops;
import java.util.Scanner;
public class checkPrimeNumber {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter A Given Number:");
        int n = scan.nextInt();

        if (n % 2 == 1){

            System.out.println("Given Number Is Prime Number");

        }else{
            System.out.println("Given Number Not Prime Number");
        }

    }
}

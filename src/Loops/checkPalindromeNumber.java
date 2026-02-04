package Loops;
import java.util.Scanner;

public class checkPalindromeNumber {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter A Given Number:");

        String  number = scan.next();

        String reverse = "";



        for (int i = number.length() -1 ; i >= 0;  i--){

            reverse = reverse + number.charAt(i);
        }

        if (number.equalsIgnoreCase(reverse)){

            System.out.println("Palindrome Number: " + reverse);

        }else{

            System.out.println(" Not palindrome number");
        }

    }
}

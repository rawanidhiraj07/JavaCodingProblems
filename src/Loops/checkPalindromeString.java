package Loops;

import java.util.Scanner;

public class checkPalindromeString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter A String");

        String name = scan.nextLine();

        String res = "";


        for (int i = name.length() -1; i >= 0; i--) {

            res = res + name.charAt(i);
        }

            if (name.equalsIgnoreCase(res)) {

                System.out.println("The Input String Is a Palindrome");

            } else {
                System.out.println("The Given String Is Not A palindrome");
            }
        }


    }


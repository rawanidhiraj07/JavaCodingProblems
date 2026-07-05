package FirstJavaProgram;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
//Take 2 numbers as input and print the largest number.
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int num1 = scan.nextInt();

        System.out.println("Enter Second Number:");
        int num2 = scan.nextInt();

        if (num1 > num2){

            System.out.println("Largest Number: " + num1);

        }else if(num2 >num1){

            System.out.println("Largest Number: " + num2);

        }else{
               System.out.println("Both number are equal ");
        }

        scan.close();

    }

}


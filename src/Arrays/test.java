package Arrays;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double amount = scan.nextDouble();

        if(amount >= 5000){
            System.out.println("20% Discount");
        }else{
            System.out.println("No Discount");
        }

    }

}


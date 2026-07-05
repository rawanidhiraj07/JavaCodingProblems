package FirstJavaProgram;

import java.util.Scanner;

public class RupeesToUSDConverter {
    public static void main(String[] args) {
// Input currency in rupees and output in USD.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter currency ");
      double rupees = scan.nextDouble();

      double exchangeRate = 85.0; // 1 usd = 85 INR

      double usd = rupees / exchangeRate;

      System.out.printf("USD = %.2f%n" , usd);

      scan.close();
    }
}

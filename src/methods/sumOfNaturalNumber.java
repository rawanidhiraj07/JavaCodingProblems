package methods;
import java.util.Scanner;
public class sumOfNaturalNumber {
    public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);

     System.out.println("Enter A Given Number:");

     int num = scan.nextInt();

     int result = naturalNumber(num);

     System.out.println("Sum Of Natural Number: " + result);

    }

    public static int naturalNumber(int n){

            return n = n * (n + 1) /2 ;
        }

}

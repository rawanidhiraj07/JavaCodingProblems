package FlowOfProgram;
import java.util.Scanner;
public class demo {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Given Number");
        int number = scan.nextInt();

        if(number / 2 == 1){

            System.out.println("Prime number: " + number);

        }else{
            System.out.println("Not a prime number");
        }
    }
}

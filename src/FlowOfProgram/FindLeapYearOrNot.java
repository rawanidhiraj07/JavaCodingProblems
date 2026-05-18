package FlowOfProgram;
import java.util.*;

public class FindLeapYearOrNot {
    public static void main(String[] args){
        //Input a year and find whether it is a leap year or not.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter A Year");
        int year = scan.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 )){

            System.out.println("Leap year: " + year);

        }else{
            System.out.println(year + "is not a leap year");
        }
        scan.close();
        
    }
}

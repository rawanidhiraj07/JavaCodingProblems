package methods;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Day:");
        int day = scan.nextInt();

        String dayname;

        switch(day){
            case 1:
                dayname = "Monday";
                break;
            case 2:
                dayname = "Tuesday";
                break;
            case 3:
                dayname = "Wednesday";
                break;
            default:
                dayname = "Invalid day";
        }
        System.out.println("Day:" + dayname);
    }
}

package FlowOfProgram;

import java.util.Scanner;

public class SalaryIncrement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a salary");
        int salary = scan.nextInt();

        if (salary > 10000) {

            salary += 2000;


        } else {
            salary += 1000;

        }
        System.out.println("Final salary: " + salary);
    }
}

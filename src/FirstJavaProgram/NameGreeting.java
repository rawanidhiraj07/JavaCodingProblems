package FirstJavaProgram;

import java.util.Scanner;

public class NameGreeting {
    public static void main(String[] args) {
        //Take name as input and print a greeting message for that particular name.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a name");
        String name = scan.next();

         System.out.println(" Hello " + name + "!");
    }
}

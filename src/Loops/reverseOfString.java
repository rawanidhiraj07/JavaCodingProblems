package Loops;

public class reverseOfString {
    public static void main(String[] args) {

      String name = "Dhiraj";

      String res = " " ;

      for (int i = name.length() -1; i >= 0;  i--){

          res = res + name.charAt(i);


      }

      System.out.println("Reverse Of String: " + res);

      // reverse a String using String Builder
//        String name = "hello";
//
//        String reverse = new StringBuilder(name).reverse().toString();
//
//        System.out.println(reverse);


    }
}


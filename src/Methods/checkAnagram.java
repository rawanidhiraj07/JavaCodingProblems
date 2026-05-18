package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class checkAnagram {

    // Write a method to check whether two strings are anagrams
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First String:");
        String str1 = scan.nextLine();

        System.out.println("Enter Second String:");
        String str2 = scan.nextLine();

        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are not equal, they cannot be anagrams
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        // Convert strings to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagrams");
        }

        scan.close();
    }
}

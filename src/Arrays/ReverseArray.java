package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Array Size:");
        int size = scan.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {

            arr[i] = scan.nextInt();

        }

        reverse(arr);

    }

    public static void reverse(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.print(arr[i] + " ");

        }
    }
}

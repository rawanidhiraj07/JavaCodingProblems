package arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxMinInArray {
    public static void main(String[] args){

        //Find the maximum and minimum element in an array

        int[] arr = {1,2,4,5,7,9};


        for (int i = 0 ; i  <= arr.length ; i++) {


        }
            OptionalInt result = Arrays.stream(arr).min();
            OptionalInt result1 = Arrays.stream(arr).max();


              System.out.println("Minimum Number Of Array: "  + result);
              System.out.println("Maximum Number Of Array:  "  +  result1);

        }

    }


package Arrays;

public class ArrayAverage {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int sum = 0;

        for (int i = arr.length - 1; i >= 0; i--) {

            sum += arr[i];

        }

        double average = (double) sum / arr.length;

        System.out.println("Sum Of All Element: " + sum);
        System.out.println("Average Of Array: " + average);


    }
}


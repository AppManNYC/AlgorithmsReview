package week1;

import java.util.Scanner;

public class MaxPairwiseProduct{

    private static int slowMaxPairwiseProduct(int[] numbers){
        int product = 0;
        int n = numbers.length;
        // nested for-loop to find the 2 elements that make the largest product
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                product = Math.max(product, numbers[i] * numbers[j]);
            }
        }
        return product;
    }

    private static int fastMaxPairwiseProduct(int[] numbers){
        int max1 = 0;
        int max2 = 0;

        // loop through all elements
        for(int i = 0; i < numbers.length; ++i) {
            // if-statement to find the largest & 2nd-largest integers in the array & set it to max1 & max2
            if(numbers[i] >= numbers[max1]) {
                max2 = max1;
                max1 = i;
            } else if(numbers[i] >= max2) {
                max2 = i;
            }
        }
        // return the product of the array's largest integer & 2nd-largest integer
        return numbers[max1] * numbers[max2];
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // input the number of elements
        int n = scanner.nextInt();
        // declare an array of "n" elements
        int[] numbers = new int[n];
        // array initialization
        for(int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(slowMaxPairwiseProduct(numbers));
    }
}

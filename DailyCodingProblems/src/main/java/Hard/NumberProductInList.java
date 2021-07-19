package Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array of integers, return a new array such that each element at index i of the new array
is the product of all the numbers in the original array except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 */
public class NumberProductInList {
    /*
    This function solves the problem but in O(N^2) time complexity.
     */
    public int[] numberProduct(int[] input) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < input.length; i++) {
            int sum = 1;
            for(int j = 0; j < input.length; j++) {
                if(j!=i){
                    sum = sum * input[j];
                }
            }
            result.add(sum);
        }
        return result.stream().mapToInt(a->a).toArray();
    }

    /*
    This function solves the problem but in O(N) time complexity.
     */
    public int[] optimizedNumberProduct(int[] A) {
        int n = A.length;

        // use two auxiliary arrays
        int[] left = new int[n];
        int[] right = new int[n];

        // `left[i]` stores the product of all elements in subarray[0…i-1]
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = A[i - 1] * left[i - 1];
        }

        // `right[i]` stores the product of all elements in subarray[i+1…n-1]
        right[n - 1] = 1;
        for (int j = n - 2; j >= 0; j--) {
            right[j] = A[j + 1] * right[j + 1];
        }

        // replace each element with the product of its left and right subarray
        for (int i = 0; i < n; i++) {
            A[i] = left[i] * right[i];
        }

        return A;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(new NumberProductInList().numberProduct(input)));
          System.out.println(Arrays.toString(new NumberProductInList().optimizedNumberProduct(input)));
    }
}

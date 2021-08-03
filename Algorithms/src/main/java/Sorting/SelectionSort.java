package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public String selection(int[] array) {
        int size = array.length;

        for(int i=0; i < size ; i++) {
            //Do not try to assign element completely i.e., int smallest = array[i], instead assign index because
            //it will be swapped after every outer iteration hence will result in copying of same element unless
            //condition satisfied, in turn will mess up the array structure.
            int smallest = i;
            for(int j= i+1 ; j < size ; j++) {
                if(smallest > array[j]) {
                    smallest = j;
                }
            }
            int temp = array[i];
            array[i] = array[smallest];
            array[smallest] = temp;
        }
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        int[] input = {2,4,7,1,3,0,-4};
        System.out.println(new SelectionSort().selection(input));
    }
}

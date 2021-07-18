package sorting;

import java.util.Arrays;

public class insertionSort {
    // The insertion sort is equivalent to sorting of play cards in 1 hand
    // compare each element with the elements in the left , swap if satisfy
    // [2,4,7,1,3,0,-4]
    public String insertion(int[] array) {

        for(int i = 1;i< array.length; i++){
            int key = array[i];
            int j = i-1;
            while(j>=0 && array[j] > key){
                array[j+1] = array[j];
                --j;
            }
            // Place key at after the element just smaller than it
            array[j+1] = key;
        }

        return Arrays.toString(array);
    }

    public static void main(String[] args) throws Exception {
        int[] input = {2,4,7,1,3,0,-4};
        System.out.println(new insertionSort().insertion(input));
    }
}

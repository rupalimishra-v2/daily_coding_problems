package Easy;

import java.util.Arrays;

public class ArrayRotation {
    public int[] rotatedArray(int[] array , int rotateBy) {
        int size = array.length;
        for (int i=0; i <= rotateBy; i++) {
            int temp = array[0];
            for (int j = 0; j < size - 1; j++) {
                array[j] = array[j + 1];
            }
            array[size-1] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};
        System.out.println(Arrays.toString(new ArrayRotation().rotatedArray(input, 2)));
    }
}

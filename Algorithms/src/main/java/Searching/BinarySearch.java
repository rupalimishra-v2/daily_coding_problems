package Searching;

public class BinarySearch {
    public int checkIfElementExists(int[] array, int element) {
        return binarySearch(array, 0 , array.length - 1, element);
    }

    public int binarySearch(int[] array, int left, int right, int element) {
        if(right >= left) {
            int middle = (left + right) / 2;
            if (array[middle] == element) {
                return middle;
            } else if (array[middle] < element) {
                left = 0;
                right = middle;
                binarySearch(array, left, right, element);
            } else if (array[middle] > element) {
                left = middle + 1;
                right = array.length - 1;
                binarySearch(array, left, right, element);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input = {};
        BinarySearch object = new BinarySearch();
        System.out.println(object.checkIfElementExists(input, 1));
    }
}

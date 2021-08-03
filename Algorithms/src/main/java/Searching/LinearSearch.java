package Searching;

public class LinearSearch {
    public int checkIfElementExists(int[] array, int element) {
        int length = array.length;
        int right = length - 1;
        int position = -1;
        for(int left =0 ; left <= right;){
            if(array[left] == element){
                position = left;
                return position;
            }
            if(array[right] == element){
                position = right;
                return position;
            }
            left++;
            right--;
        }
        return position;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6};
        LinearSearch object = new LinearSearch();
        System.out.println(object.checkIfElementExists(input, 3));
    }
}

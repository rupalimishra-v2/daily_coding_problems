package Searching;

public class JumpSearch {
    public int checkIfElementExists(int[] array, int element, int interval) {
        for(int i = 0; i < array.length; i += interval) {
            if(array[i] == element) {
                return i;
            } else if(element < array[i]) {
                return search(array, i - interval, i, element);
            }
        }
        return -1;
    }

    public int search(int[] array, int from, int to, int element) {
        for(int i = from; i <= to; i++) {
            if(array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        JumpSearch object = new JumpSearch();
        //If interval is not given, what's the best value we can take for interval.
        //In the worst case, we have to do n/m jumps and if the last checked value is greater than the element to be
        //searched for, we perform m-1 comparisons more for linear search. Therefore the total number of comparisons
        //in the worst case will be ((n/m) + m-1). The value of the function ((n/m) + m-1) will be minimum when m = √n.
        //Therefore, the best step size is m = √n.

        int interval = (int) Math.floor(Math.sqrt(input.length-1));
        System.out.println(object.checkIfElementExists(input, 55, interval));
    }
}

package Easy;

public class SearchElementInSortedArray {
    public int search(int[] array, int element, int high, int low) {
        if(high <= low) return -1;
        int mid = (high + low) / 2;
        if(array[mid] == element) return mid;

        if(array[low] <= array[mid]) {
            if (array[low] <= element && array[mid] >= element)
                return search(array, element, mid - 1, low);
            else
                return search(array, element, high, mid + 1);
        }

        if(array[mid+1] <= element && array[high] >= element)
            return search(array, element, high, mid+1);
        else
            return search(array, element, mid-1, low);
    }

    public static void main(String[] args) {
        int[] input = {3,4,5,1,2};
        System.out.println(new SearchElementInSortedArray().search(input, 1, input.length - 1, 0));
    }
}

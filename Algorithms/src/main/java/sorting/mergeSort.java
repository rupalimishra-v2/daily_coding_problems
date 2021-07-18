package sorting;

import java.util.Arrays;

public class mergeSort {
    public String mergeSort(int[] array) {
        return Arrays.toString(sort(array, 0, array.length - 1));
    }

    public int[] sort(int[] array, int l, int m){
        if(m > l) {
            int r = (l + m) / 2;
            sort(array, l, r);
            sort(array, r+1, m);
            merge(array, l , r, m);
        }
        return array;
    }

    public void merge(int[] array, int l, int r, int m){
        int n1 = r-l+1;
        int n2 = m-r;
        int L[] = new int[n1];
        int M[] = new int[n2];

        for(int i=0;i < n1;i++)
            L[i] = array[l+i];
        for(int j=0;j < n2;j++)
            M[j] = array[r+1+j];

        int i=0;
        int j=0;
        int k = l;

        while(i < n1 && j < n2) {
            if(L[i] > M[j]){
                array[k] = M[j];
                j++;
            }else{
                array[k] = L[i];
                i++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = M[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] input = {2,4,7,1,3,0,-4};
        System.out.println(new mergeSort().mergeSort(input));
    }
}

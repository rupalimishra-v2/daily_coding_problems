package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear
 as many times as it shows in both arrays and you may return the result in any order.
 Input: nums1 = [1,2,2,1], nums2 = [2,2]
 Output: [2,2]
 */
public class IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();

        List<Integer> result = new ArrayList<>();
        for(int i = 0; i< nums1.length; i++) {
            if(a.containsKey(nums1[i])){
                a.put(nums1[i], a.get(nums1[i]) + 1);
            }else{a.put(nums1[i], 1);}

        }

        for(int i = 0; i< nums2.length; i++) {
            if(a.containsKey(nums2[i]) && a.get(nums2[i]) > 0) {
                result.add(nums2[i]);
                a.put(nums2[i], a.get(nums2[i]) - 1);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] a = new int[]{4,9,5};
        int[] b = new int[]{9,4,9,8,4};
        System.out.println(Arrays.toString(new IntersectionOfTwoArrays().intersect(a, b)));
    }
}

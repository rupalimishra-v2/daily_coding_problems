package Easy;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> h = new HashMap<Integer,Integer>();
        for(int i=0;i< nums.length;i++){
            h.put(nums[i],i);
        }
        for(int i=0;i< nums.length;i++){
            int inter_target = target - nums[i];
            if(h.containsKey(inter_target) && h.get(inter_target) !=i) {
                result[0] =i;
                result[1] = h.get(inter_target);
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,7,11,15};
        System.out.println(Arrays.toString(new TwoSum().twoSum(a, 9)));
    }
}

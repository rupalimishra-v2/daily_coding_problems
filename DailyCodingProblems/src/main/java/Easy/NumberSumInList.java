package Easy;
import java.util.HashSet;

/*
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 */
public class NumberSumInList {
    public boolean numberSumInList(int[] list, int number){
        boolean result = false;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<list.length;i++){
           if(set.contains(list[i]) || set.contains(number-list[i])) {
                  result = true;
           }else{
               set.add(list[i]);
           }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {10, 15, 3, 7};
        System.out.println(new NumberSumInList().numberSumInList(input, 17));
    }
}

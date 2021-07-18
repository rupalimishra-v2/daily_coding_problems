package Medium;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        Queue<Character> queue=new LinkedList<>();

        for(int i=0;i<s.length();i++)
        {
            while(queue.contains(s.charAt(i)))
                queue.poll();

            if(!queue.contains(s.charAt(i))){
                queue.add(s.charAt(i));
                max= Math.max(max,queue.size());
            }
        }
        return max;
    }


    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s));
    }
}

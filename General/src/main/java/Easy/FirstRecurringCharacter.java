package Easy;

import java.util.HashSet;

/*
Given a string return the first recurring character.
 */
public class FirstRecurringCharacter {
    public Character getFirstRecurringChar(String data){
        HashSet<Character> set = new HashSet<>();
        for(int i =0; i<= data.length()-1;i++) {
            if(set.contains(data.charAt(i))){
                return data.charAt(i);
            }else {
                set.add(data.charAt(i));
            }
        }
        return null;
    }

    public static void main(String[] args) {
        FirstRecurringCharacter object = new FirstRecurringCharacter();
        System.out.println(object.getFirstRecurringChar("ABCA"));
        System.out.println(object.getFirstRecurringChar("BCABA"));
        System.out.println(object.getFirstRecurringChar("ABC"));
    }
}

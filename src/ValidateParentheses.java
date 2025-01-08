

import java.util.*;
public class ValidateParentheses {
   
    
// <<<<<<<<<<<<<<  ✨ Codeium Command ⭐  >>>>>>>>>>>>>>>>
    /**
     * Determines whether a given string of parentheses is valid, i.e. whether it forms a valid sequence of properly nested parentheses.
     * @param s the string of parentheses to check
     * @return true if the string is valid, false otherwise
     */
// <<<<<<<  3bc145e8-c0d7-4109-9454-588d38e7c58e  >>>>>>>
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();

        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        for(int i=0;i<s.length();i++){
            
        }
        return false;
    }
}


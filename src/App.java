import java.util.*;

import arrays.ValidAnagram;

public class App {
    public static void main(String[] args) throws Exception {
     
       ValidAnagram   validAnagram = new   ValidAnagram();

        System.out.println(validAnagram.isAnagram( "z","z"));
// String s = "a man, a plan, a canal: Panama";
// s.charAt(0);
//         System.out.println( s.charAt(0)-'a');
        

    }

}

class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, Integer> mp = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            if (mp.containsKey(sortedStr)) {
                ans.get(mp.get(sortedStr)).add(str);
            } else {
                mp.put(sortedStr, ans.size());
                ans.add(new ArrayList<>(Arrays.asList(str)));
            }
        }

        return ans;
    }

    public boolean isPalindrome(String s) {
        int l =0,r =s.length()-1;
        while (l<r){
                    if(!Character.isLetterOrDigit(s.charAt(l))){
                        l++;
                        continue;
                    }else if(!Character.isLetterOrDigit(s.charAt(r)))
                    {
                        r--;
                        continue;
                        
        }
        if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
            return false;
        }
        l++;
        r--;
        }
        return true;

    }

}

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
     
       ThreeSum  threeSum = new  ThreeSum();
      
        
     System.err.println(threeSum.threeSum(new int[]{-1,0,1,2,-1,-4}));

    }

}

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        // char[] charArray = s.toCharArray();
        // char[] charArray2 = t.toCharArray();

        // Arrays.sort(charArray);
        // Arrays.sort(charArray2);
        // for(int i=0;i<charArray.length;i++){
        // if(charArray[i]!=charArray2[i]){
        // return false;
        // }

        // }
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        return true;

    }

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

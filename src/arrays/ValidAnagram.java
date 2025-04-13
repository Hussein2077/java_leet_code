package arrays;

public class ValidAnagram {
/*************  ✨ Codeium Command ⭐  *************/
    /**
     * Determines whether two strings are anagrams of each other.
     * @param s the first string
     * @param t the second string
     * @return true if the strings are anagrams, false otherwise
     */
/******  e52518b7-0065-4511-9acc-35e6671d42c2  *******/
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int [] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) return false;
        }
        return true;
    }
}

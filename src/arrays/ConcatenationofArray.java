package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ConcatenationofArray {
    
    public  int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }

        return ans;
    }
    public int [] getConcatenation2(int[] nums) {
        
        return IntStream.concat( Arrays.stream(nums), IntStream.of(nums) ).toArray();
    }
      
}

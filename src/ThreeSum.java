import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
        public List<List<Integer>> threeSum(int[] nums) {            
             Arrays.sort(nums);
             List<List<Integer>> list = new ArrayList<>();
             for(int i=0;i<nums.length;i++){
                if(i>0&&nums[i]==nums[i-1] ){continue;}

               int num = nums[i];

               int start = i+1;
               int end = nums.length-1;
                while ( start < end) {
                    if(nums[start]+nums[end]+num==0){
                        list.add(Arrays.asList(num,nums[start],nums[end]));
                        int a = nums[start];
                        int b = nums[end];
                        while(start<end && nums[start]==a){
                            start++;
                        }
                        while(start<end && nums[end]==b){
                            end--;
                        }

                    }
                    else if(nums[start]+nums[end]+num>0){
                        end--;
                    }
                    else{
                        start++;
                    }
                }
                

             }  
//  list = new ArrayList<>(new HashSet<>(list));
          return list   ;
    }

}

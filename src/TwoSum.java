public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int l=0,r=numbers.length-1;
        while(l<r){
            int sum=numbers[l]+numbers[r];
            if(sum==target){
                System.out.println(l+" "+(r));
                return new int[]{l+1,r+1};
            }else if(sum>target){
                System.out.println(sum+" huss");
                r--;
            }else{
                System.out.println(sum+" huss2");
                l++;
            }
        }
        return new int[] {  0 };
    }

}

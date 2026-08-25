import java.util.Arrays;
class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            if((i&1)==0){
                if(nums[i]==nums[i+1]) count++;
                else return false;
            }
        }if(count==nums.length/2) return true;
        return false;
    }
}
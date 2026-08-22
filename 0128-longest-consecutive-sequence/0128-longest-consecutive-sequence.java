import java.util.Arrays;
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0; 
        int count=1;
        int a=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]+1) count++;
            if(nums[i+1]==nums[i]) continue;
            if(nums[i]!=nums[i+1]-1) count=1;
            if(count>a) a=count;
        }
        return a;
    }
}
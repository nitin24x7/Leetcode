class Solution {
    public int countHillValley(int[] nums) {
        if(nums.length==1) return 0;
        int count=0;
        for(int i=1;i<nums.length-1;i++){
                if(nums[i]==nums[i-1]){
                    continue;
                }
                int j=i+1; // Next element
                while(j < nums.length && nums[j] == nums[i]){
                j++;
                }
                if (j == nums.length) break;
                if(nums[i]>nums[i-1] && nums[i]>nums[j]){
                    count++;
                }
                if(nums[i]<nums[i-1] && nums[i]<nums[j]){
                    count++;
                }
        }
        return count;
    }
}
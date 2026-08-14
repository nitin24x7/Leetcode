class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) return 0;
        int peak=0;
        int i=1;
        while(i<nums.length-1){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
               return i;
            }
            i++;
        }
        if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }   
        else return 0;
    }
}
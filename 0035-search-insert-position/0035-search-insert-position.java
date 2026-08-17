class Solution {
    public int searchInsert(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid =left+(right-left)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>target){
                right=mid-1;
            }
            if(nums[mid]<target){
                left=mid+1;
            }
        }

        return left; // obviously after all iterations....if *target* is not found *left* ends up exactly where the *target* should be placed
    }
}
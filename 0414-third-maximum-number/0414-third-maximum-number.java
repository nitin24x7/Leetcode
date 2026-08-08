import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if (nums.length < 3) return nums[nums.length - 1];
        int i = nums.length - 1;
        while(i>0 && nums[i]==nums[i-1]){
            i--;
        }
        i--;
        while(i>0 && nums[i]==nums[i-1]){
            i--;
        }
        i--;
        if(i>=0) return nums[i];
        return nums[nums.length-1];
    }
}
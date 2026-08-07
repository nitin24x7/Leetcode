import java.util.Arrays;
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int negative, positive ;
        negative = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        positive = nums[0]*nums[1]*nums[nums.length-1];
        if(negative>positive) return negative;
        return positive;
    }
}
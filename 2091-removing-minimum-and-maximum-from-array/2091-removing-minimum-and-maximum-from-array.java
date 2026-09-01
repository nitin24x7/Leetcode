import java.lang.Math;
class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1) return 1;
        int min=0;
        int max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[max]) max=i;
            if(nums[i]<nums[min]) min=i;
        }
        int a=Math.max(min,max)+1; // if we delete both from left side
        int b=nums.length-Math.min(min,max); // if we delete both from right side
        int c=Math.min(min,max)+1+(nums.length-Math.max(min,max));// if we delete simultaneously
        return Math.min(a,Math.min(b,c));
    }
}
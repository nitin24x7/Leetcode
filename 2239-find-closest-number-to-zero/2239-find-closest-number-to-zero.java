import java.lang.Math;
class Solution {
    public int findClosestNumber(int[] nums){
        if(nums.length==1) return nums[0];
        int a=nums[0];
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i])<Math.abs(a)){
                a=nums[i];
            }
            if(Math.abs(nums[i])==Math.abs(a)){
                if(nums[i]>a) a=nums[i];
            }
        }
        return a;
    }
}
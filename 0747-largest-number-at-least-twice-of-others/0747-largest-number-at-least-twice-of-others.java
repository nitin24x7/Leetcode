class Solution {
    public int dominantIndex(int[] nums){
        int a=0,b=0;
        // 'a' is the biggest integer &'b' is the second largest integer
        for(int i=1;i<nums.length;i++){
           if(nums[i]>=nums[a]){
               b=nums[a];
               a=i;
            }
            if(nums[i]<nums[a] && nums[i]>b){
                b=nums[i];
            }
        }
        if(nums[a]>=b*2){
            return a;
        }
        else return -1;
    }
}
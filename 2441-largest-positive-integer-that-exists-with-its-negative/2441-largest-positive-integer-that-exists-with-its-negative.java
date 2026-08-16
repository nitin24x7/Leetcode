import java.util.Arrays;
class Solution {
    public int findMaxK(int[] nums){
    Arrays.sort(nums);
    int store=0;
    for(int i=nums.length-1;i>=0;i--){
        for(int j=0;j<nums.length;j++){
            if(nums[i] == nums[j]*-1){
                if(nums[i]>store){
                    store=nums[i];
                }   
                return store;
            }
            
        }
    }
    return -1;


    }
}
import java.util.Arrays;
class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int a=0; //duplicate no.
        int b=0; //missing no.
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])   a=nums[i];                
            if(nums[i]>nums[i-1]+1){
                b=nums[i-1]+1;
            }
            if(b==0){
                if(nums[0]!=1) b=1;
                else b=nums.length; 
            }
        } return new int[]{a,b};
    }
}
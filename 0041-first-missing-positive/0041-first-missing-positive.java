import java.util.Arrays;
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int a=1;
        if(nums.length==1 & nums[0]==1) return 2;
        if(nums.length==1 & nums[0]!=1) return 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0) continue;
            if(nums[i]==a){
                a++;
                continue;
            }
            if(nums[i]>a) return a;
        }
        return a;
    }
}
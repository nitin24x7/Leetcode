class Solution {
    public int missingMultiple(int[] nums, int k) {
        for(int i=1;i<=nums.length+1;i++){
            int num=i*k;
            int found=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==num){
                    found=1;
                    break;
                }
            }
            if(found==0) return num;
        }
        return -1;
    }
}
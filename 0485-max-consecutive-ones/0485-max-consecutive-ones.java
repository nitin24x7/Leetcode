class Solution {
    public int findMaxConsecutiveOnes(int[] nums){
    int i=0;
    int count=0;
    int max=0;
    while(i<nums.length){
        while(i<nums.length && nums[i]==0){
          i++;
          }
        while(i<nums.length && nums[i]==1){
            count++;
            i++;
            }
        if(count>max){
           max=count;
        }
        count=0;
        
    } return max;

    }
}
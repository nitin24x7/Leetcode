class Solution {
    public int sumOfDigits(int n){
        int sum=0;
        if(n<10) return n;
        while(n>=10){
            sum=sum+(n%10);
            n/=10;
        }
        sum+=n;
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(sumOfDigits(nums[i])==i){
                return i;
            }
        }
        return -1;
    }
}
class Solution {
    public int[] resultArray(int[] nums) {
        int[] result = new int [nums.length];
        int[] arr1 = new int [nums.length];
        int[] arr2 = new int [nums.length];
        int top1=0;
        int top2=0;
        arr1[top1]=nums[0];
        arr2[top2]=nums[1];
        for(int i=2;i<nums.length;i++){
            if(arr1[top1]>arr2[top2]){
                top1++;
                arr1[top1]=nums[i];
            }
            else{
                top2++;
                arr2[top2]=nums[i];
            }
        }
        for(int i=0;i<=top1;i++){
            result[i]=arr1[i];
        }
        for(int i=0;i<=top2;i++){
            result[top1+1+i]=arr2[i];
        }
        return result;
    }
}
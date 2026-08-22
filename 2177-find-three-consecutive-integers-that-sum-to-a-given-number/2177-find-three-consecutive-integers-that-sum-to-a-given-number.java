class Solution {
    public long[] sumOfThree(long num) {
        long[] arr = new long[3];
        if((num-3)%3!=0) return  new long[0];
        long a=(num-3)/3;
        for(int i=0;i<3;i++){
            arr[i]=a+i;
        }
        return arr;
    }
}
class Solution {
    public int digitProduct(int n){
        int prdct=1;
        while(n>=10){
            prdct*=(n%10);
            n/=10;
        }
        prdct*=n;
        return prdct;
    }
    public int smallestNumber(int n, int t) {
     for(int i=n;;i++){
        if((digitProduct(i)%t)==0){
            return i;
            }
       }   
    }
}
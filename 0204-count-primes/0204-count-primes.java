class Solution {
    public int countPrimes(int n) {
        if(n<2) return 0;
        boolean[] isprime = new boolean[n];
        // Assuming all number in range as prime !
        for(int i=2;i<n;i++){
            isprime[i]=true;
        }
        // eliminating multiples of prime number  , checking only till sqrt(n)
        // every composite number n has atleast one factor in range 1 to sqrt(n)
        for(int i=2;i*i<n;i++){
            if(isprime[i]){
                for(int j=i*i;j<n;j+=i){ // removing multiples of prime numbers
                  isprime[j]=false;
                }
            }
        }
        int count=0;
        for(int num=2;num<n;num++){
            if(isprime[num]){
                count++;
            }
        }
        return count;
    }
}
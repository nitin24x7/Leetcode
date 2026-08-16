import java.lang.Math;
class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int sum=0;
        sum+=requests[0];
        if(requests.length==1) return sum;
        for(int i=1;i<requests.length;i++){
            sum+=Math.abs(requests[i]-requests[i-1]);

        }
        return sum;
    }
}
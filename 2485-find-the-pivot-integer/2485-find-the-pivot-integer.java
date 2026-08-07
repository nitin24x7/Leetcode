import java.lang.Math;
class Solution {
    public int pivotInteger(int n) {
    if(n==1) return 1;
    if(n<8) return -1;
    double x;
    x=n*n;
    x+=n;
    x/=2;
    x=Math.sqrt(x);
    if (x%1==0) return (int)x;
    else return -1;
    

    }
}
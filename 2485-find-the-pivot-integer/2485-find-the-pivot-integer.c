#include<math.h>
int pivotInteger(int n) {
    if(n==1) return 1;
    if(n<8) return -1;
    double x;
    x=n*n;
    x+=n;
    x/=2;
    x=sqrt(x);
    if (floor(x) == x)
        return (int)x;
    else return -1;
    
}
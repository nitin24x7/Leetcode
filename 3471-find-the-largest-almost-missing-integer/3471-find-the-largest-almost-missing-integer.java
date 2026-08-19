class Solution{
    public int largestInteger(int[] nums,int k){
        int n=nums.length;
        if(k==n){
        int ans=nums[0];
        for(int i=1;i<n;i++){
            ans=Math.max(ans,nums[i]);
        }
            return ans;
        }
        if(k==1){ // *Special Case * For k = 1, every subarray contains exactly one element
            int ans=-1;
            for(int i=0;i<n;i++){
                int c=0;
                for(int j=0;j<n;j++){
                    if(nums[i]==nums[j])c++;
                }
                if(c==1)ans=Math.max(ans,nums[i]);
            }
            return ans;
        }
        int a=nums[0];
        int b=nums[n-1];
        if(a==b)return -1;
        int x=0,y=0;
        for(int i=1;i<=n-2;i++){
            if(nums[i]==a)x=1;
            if(nums[i]==b)y=1;
        }
        if(x==0&&y==0)return Math.max(a,b);
        if(x==0)return a;
        if(y==0)return b;
        return -1;
    }
}
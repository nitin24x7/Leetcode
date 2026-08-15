import java.util.Arrays;
import java.lang.Math;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] arr= new int[Math.min(nums1.length,nums2.length)];
        int a=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    boolean alreadyExists = false;
                    for(int k=0;k<a;k++){
                        if (arr[k]==nums1[i]) {
                            alreadyExists=true;
                            break;
                        }
                    }
                    if(!alreadyExists){
                        arr[a]=nums1[i];
                        a++;
                    }
                    break; 
                }
            }
        }
        return Arrays.copyOf(arr,a);
    }
}
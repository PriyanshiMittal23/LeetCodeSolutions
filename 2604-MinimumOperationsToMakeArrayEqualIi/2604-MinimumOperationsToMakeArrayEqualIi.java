// Last updated: 6/8/2025, 11:06:49 pm
class Solution {
    public long minOperations(int[] nums1, int[] nums2, int k) {
        long a=0;
        long b=0;
        long c=0;
        for(int i=0;i<nums1.length;i++){
            c=nums1[i]-nums2[i];
            if(k==0 && nums1[i]!=nums2[i]) return -1;
            else if(k!=0){
                if(c%k!=0) return -1;
                else if(c>0){
                    a=a+c/k;
                }
                else{
                    b=b+(-c)/k;
                }
            }
        }
        if(a!=b){
            return -1;
        }
        else{
            return a;
        }
    }
}
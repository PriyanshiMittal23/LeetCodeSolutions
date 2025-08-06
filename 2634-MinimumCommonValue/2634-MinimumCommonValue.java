// Last updated: 6/8/2025, 11:06:41 pm
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int a=0;
        int b=0;
        int c=nums1.length;
        int d=nums2.length;
        if(nums1[c-1]<nums2[0] || nums2[d-1]<nums1[0]) return -1;
        while(a<c && b<d){
            if(nums1[a]==nums2[b]){
                return nums1[a];
            }
            else if(nums1[a]<nums2[b]){
                a++;
            }
            else{
                b++;
            }
        }
        return -1;
    }
}
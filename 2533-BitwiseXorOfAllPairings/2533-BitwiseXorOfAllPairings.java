// Last updated: 6/8/2025, 11:07:04 pm
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int ans = 0;
        if(nums2.length%2!=0){
            for(int a:nums1){
                ans^=a;
            }
        }

        if(nums1.length%2!=0){
            for(int a:nums2){
                ans^=a;
            }
        }

        return ans;
    }
}
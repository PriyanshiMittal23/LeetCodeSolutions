// Last updated: 6/8/2025, 11:09:36 pm
class Solution {
    public int longestOnes(int[] nums, int k) {
        return binary(nums,k,0);
    }
    public static int binary(int[]nums,int k,int n){
        int ei=0;
        int si=0;
        int ans=0;
        int a=0;
        while(ei<nums.length){
            if(nums[ei]==n){
                a++;
            }
            while(a>k){
                if(nums[si]==n){
                    a--;
                }
                si++;
            }
            ans=Math.max(ans,ei-si+1);
            ei++;

        }
        return ans;
    }
}
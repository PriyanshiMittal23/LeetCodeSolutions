// Last updated: 6/8/2025, 11:07:07 pm
class Solution {
    public int longestSubarray(int[] nums) {
        int ans=0;
        int an=0;
        int c=0;
        for(int a:nums){
            if(a==an){
                c++;
            }else if(a>an){
                an=a;
                ans=1;
                c=1;
            }else{
                c=0;
            }
            ans=Math.max(ans,c);
        }
        return ans;
    }
}
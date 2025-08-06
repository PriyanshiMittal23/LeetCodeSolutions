// Last updated: 6/8/2025, 11:07:30 pm
class Solution {
    public int minSwaps(int[] nums) {
        int o=0;
        for(int a:nums){
            o+=a;
        }
        int sum=0;
        for(int i=0;i<o;i++){
            sum+=nums[i];
        }
        int ans=sum;
        for(int i=o;i<nums.length+o;i++){
            if(ans==o){
                return 0;
            }
            sum-=nums[i-o]-nums[i%nums.length];
            ans=Math.max(ans,sum);
        }
        return o-ans;
    }
}
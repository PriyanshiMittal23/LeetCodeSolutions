// Last updated: 6/8/2025, 11:08:58 pm
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int lo=1;
        int hi=nums[nums.length-1];
        int ans=0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(isPossible(nums,mid,threshold)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }

    public boolean isPossible(int[]nums, int d,int t){
        int sum=0;
        for(int a:nums){
            sum+= Math.ceil(a/(d*1.0));
            if(sum>t){
                return false;
            }
        }
        return true;
    }

}
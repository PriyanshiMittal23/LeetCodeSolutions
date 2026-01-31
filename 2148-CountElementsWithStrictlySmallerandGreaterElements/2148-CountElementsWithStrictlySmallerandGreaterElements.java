// Last updated: 31/1/2026, 7:54:00 pm
1class Solution {
2    public int countElements(int[] nums) {
3        Arrays.sort(nums);
4        int s = nums[0];
5        int l = nums[nums.length-1];
6        int ans = 0;
7        for(int a:nums){
8            if(a<l && a>s){
9                ans++;
10            }
11        }
12
13        return ans;
14    }
15}
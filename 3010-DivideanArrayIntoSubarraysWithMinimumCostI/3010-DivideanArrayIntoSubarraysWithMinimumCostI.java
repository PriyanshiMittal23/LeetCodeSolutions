// Last updated: 1/2/2026, 10:30:59 pm
1class Solution {
2    public int minimumCost(int[] nums) {
3        int ans = nums[0];
4        int[]arr = new int[nums.length-1];
5        for(int i=1;i<nums.length;i++){
6            arr[i-1]=nums[i];
7        }
8        Arrays.sort(arr);
9        ans+=arr[0]+arr[1];
10        return ans;
11    }
12}
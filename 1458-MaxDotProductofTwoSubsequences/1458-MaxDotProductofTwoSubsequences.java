// Last updated: 11/1/2026, 4:31:03 pm
1class Solution {
2    public int maxDotProduct(int[] nums1, int[] nums2) {
3        int [][]dp  = new int[nums1.length][nums2.length];
4        for(int i=0;i<nums1.length;i++){
5            for(int j=0;j<nums2.length;j++){
6                int prev = 0;
7                if(i-1>=0 && j-1>=0){
8                    prev = dp[i-1][j-1];
9                }
10                int curr = nums1[i]*nums2[j];
11                int xp = Integer.MIN_VALUE;
12                int yp = Integer.MIN_VALUE;
13                if(i-1>=0){
14                    xp = dp[i-1][j];
15                }
16                if(j-1>=0){
17                    yp = dp[i][j-1];
18                }
19                
20                dp[i][j] = Math.max( Math.max(curr, Math.max(xp, yp)),curr+prev );
21                System.out.println(dp[i][j]);
22            }
23        }
24
25        return dp[nums1.length-1][nums2.length-1];
26    }
27}
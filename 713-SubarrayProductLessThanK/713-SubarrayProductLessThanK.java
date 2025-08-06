// Last updated: 6/8/2025, 11:10:30 pm
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0;
		int si = 0;
		int ei = 0;
		int p = 1;
		while (ei < nums.length) {
			// grow
			p *= nums[ei];
			// shrink
			while (p >= k && si<=ei) {
				p = p/nums[si];
				si++;
			}
			// ans calculate
			ans = ans + (ei - si + 1);
			ei++;
		}
		return ans;
        
    }
}
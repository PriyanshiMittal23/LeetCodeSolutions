// Last updated: 6/8/2025, 11:11:07 pm
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>st = new Stack<>();
        int n = nums.length;
        int[]ans = new int[n];
        Arrays.fill(ans,-1);
        for(int i=0;i<2*n;i++){
            while(!st.isEmpty() && nums[i%n]>nums[st.peek()]){
                ans[st.pop()] = nums[i%n];
            }
            st.push(i%n);
        }
        return ans;
    }
}
// Last updated: 6/8/2025, 11:05:14 pm
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int ans=0;
        Arrays.sort(capacity);
        int sum=0;
        for(int a:apple){
            sum+=a;
        }
        for(int i=capacity.length-1;i>=0;i--){
            sum-=capacity[i];
            ans++;
            if(sum<=0){
                return ans;
            }
        }
        return ans;
    }
}
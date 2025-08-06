// Last updated: 6/8/2025, 11:13:39 pm
class Solution {
    public int maxProfit(int[] prices) {
        int a=0;
        int ans=0;
        // Stack<Integer>st=new Stack<>();
        for(int i=1;i<prices.length;i++){
            if(prices[i]<prices[a]){
                a=i;
            }
            else{
                int b=prices[i]-prices[a];
                ans=Math.max(ans,b);
            }
        }
        return ans;
    }
}
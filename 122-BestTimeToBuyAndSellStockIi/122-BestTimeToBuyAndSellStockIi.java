// Last updated: 6/8/2025, 11:13:38 pm
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1){
            return 0;
        }
        int ans=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-prices[i-1]>0){
                ans=ans+prices[i]-prices[i-1];
            }
        }
        return ans;
    }
}
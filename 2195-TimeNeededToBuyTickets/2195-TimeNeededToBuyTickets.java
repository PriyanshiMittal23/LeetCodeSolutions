// Last updated: 6/8/2025, 11:07:37 pm
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int ans=0;
        for(int i=0;i<tickets.length;i++){
            if(i<=k){
                ans=ans+Math.min(tickets[i],tickets[k]);

            }
            else{
                ans+=Math.min(tickets[k]-1,tickets[i]);
            }
        }
        return ans;
    }
}
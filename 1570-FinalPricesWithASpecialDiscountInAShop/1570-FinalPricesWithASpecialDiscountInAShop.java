// Last updated: 6/8/2025, 11:08:47 pm
class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<prices.length;i++){
            while(!st.isEmpty() && prices[st.peek()]>=prices[i]){
                int idx = st.pop();
                prices[idx]-=prices[i];
            }
            st.push(i);
        }
        return prices;
    }
}